package taketengaming.datmod.item;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import taketengaming.datmod.ConfigHandler;
import taketengaming.datmod.creativetab.CreativeTabs;
import taketengaming.tencore.item.Item;
import taketengaming.tencore.util.Energy;

import java.util.List;

/**
 * Created by Acid on 10/26/2016.
 */
public class ItemMagnet extends Item
{
	private boolean active;
	private boolean requiresEnergy = ConfigHandler.magnetRequiresEnergy;

	public ItemMagnet ()
	{
		super ( "Magnet" );

		this.setCreativeTab ( CreativeTabs.items );

		if ( this.requiresEnergy () )
		{
			this.setMaxDamage ( Energy.CAPACITY );
		}
		else
		{
			this.setMaxDamage ( 0 );
		}

		this.setMaxStackSize ( 1 );
	}

	@Override
	@SideOnly( Side.CLIENT )
	public void addInformation ( ItemStack stack, EntityPlayer playerIn, List< String > tooltip, boolean advanced )
	{
		tooltip.add ( "It's very.. attractive" );

		if ( this.requiresEnergy () && stack.getTagCompound () != null && stack.getTagCompound ().hasKey ( "energyStored" ) )
		{
			tooltip.add ( ChatFormatting.DARK_GRAY + "Requires " + Energy.REQUIREMENT + "RF per item stack pulled" );
			tooltip.add ( ChatFormatting.DARK_GRAY + "Energy: " + stack.getTagCompound ().getInteger ( "energyStored" ) + "/" + Energy.CAPACITY );
		}

		super.addInformation ( stack, playerIn, tooltip, advanced );
	}

	@Override
	public boolean hasEffect ( ItemStack stack )
	{
		return this.isActive ( stack );
	}

	private boolean hasEnergy ( ItemStack itemStack )
	{
		return ( itemStack.getTagCompound () != null && itemStack.getTagCompound ().getInteger ( "energyStored" ) > 0 );
	}

	private boolean isActive ( ItemStack stack )
	{
		NBTTagCompound tags = stack.getTagCompound ();
		if ( tags == null )
		{
			NBTTagCompound compound = new NBTTagCompound ();
			compound.setBoolean ( "active", false );
			compound.setInteger ( "energyStored", 0 );

			stack.setTagCompound ( new NBTTagCompound () );
			tags = stack.getTagCompound ();
		}

		boolean activeNbt = tags.getBoolean ( "active" );
		int energyStoredNbt = tags.getInteger ( "energyStored" );
		boolean isActive = false;

		if ( activeNbt && energyStoredNbt > 0 )
		{
			isActive = true;
		}

		if ( isActive && !this.active )
		{
			this.active = true;
		}

		return this.active;
	}

	@Override
	public boolean isDamageable ()
	{
		return this.requiresEnergy ();
	}

	@Override
	public ActionResult< ItemStack > onItemRightClick ( ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand )
	{
		if ( worldIn.isRemote )
		{
			return ActionResult.newResult ( EnumActionResult.FAIL, itemStackIn );
		}

		if ( !playerIn.isSneaking () )
		{
			playerIn.addChatComponentMessage ( new TextComponentString ( "You must be sneaking to toggle the magnet!" ) );
			return ActionResult.newResult ( EnumActionResult.FAIL, itemStackIn );
		}

		this.toggle ( this.isActive ( itemStackIn ), itemStackIn, playerIn );
		return super.onItemRightClick ( itemStackIn, worldIn, playerIn, hand );
	}

	@Override
	public void onUpdate ( ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected )
	{
		if ( entityIn instanceof EntityPlayer && entityIn.isSneaking () )
		{
			return;
		}

		if ( this.isActive ( stack ) )
		{
			if ( this.requiresEnergy () && !this.hasEnergy ( stack ) )
			{
				return;
			}

			double radius = ConfigHandler.magnetRadius;
			List< EntityItem > items = entityIn.worldObj.getEntitiesWithinAABB ( EntityItem.class, entityIn.getEntityBoundingBox ().expand ( radius, radius, radius ) );
			List< EntityXPOrb > xps = entityIn.worldObj.getEntitiesWithinAABB ( EntityXPOrb.class, entityIn.getEntityBoundingBox ().expand ( radius, radius, radius ) );

			for ( EntityItem item : items )
			{
				this.teleportToPlayer ( stack, item, ( EntityPlayer ) entityIn );
			}

			for ( EntityXPOrb xp : xps )
			{
				this.teleportToPlayer ( stack, xp, ( EntityPlayer ) entityIn );
			}
		}
	}

	private boolean requiresEnergy ()
	{
		return this.requiresEnergy;
	}

	private void teleportToPlayer ( ItemStack itemStack, Entity item, EntityPlayer player )
	{
		double x = player.posX;
		double y = player.posY;
		double z = player.posZ;
		double factor = 1;

		item.addVelocity ( ( x - item.posX ) * factor, ( y - item.posY ) * factor, ( z - item.posZ ) * factor );

		itemStack.getTagCompound ().setInteger ( "energyStored", itemStack.getTagCompound ().getInteger ( "energyStored" ) - Energy.REQUIREMENT );
	}

	private void toggle ( boolean active, ItemStack itemStackIn, EntityPlayer playerIn )
	{
		boolean state = false;
		NBTTagCompound itemTagCompound = itemStackIn.getTagCompound ();
		if ( !active )
		{
			state = true;
		}

		itemTagCompound.setBoolean ( "active", state );

		if ( this.requiresEnergy () )
		{
			itemTagCompound.setInteger ( "energyStored", 0 );
		}

		this.active = state;

		Style chatStyle = new Style ().setColor ( TextFormatting.GRAY );
		Style statusStyle = new Style ().setColor ( TextFormatting.WHITE );
		ITextComponent message = new TextComponentString ( "Magnet has been" ).setStyle ( chatStyle );
		ITextComponent replacement = new TextComponentString ( ( !active ) ? " activated" : " deactivated" ).setStyle ( statusStyle );
		playerIn.addChatMessage ( message.appendSibling ( replacement ) );
	}
}
