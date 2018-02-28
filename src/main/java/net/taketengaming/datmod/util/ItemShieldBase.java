package net.taketengaming.datmod.util;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.taketengaming.datmod.DatMod;

import javax.annotation.Nullable;

public class ItemShieldBase extends ItemShield
{
	private String name;

	public ItemShieldBase ( String name, ToolMaterial material )
	{
		this.setName ( name );
		this.setCreativeTab ();

		this.setMaxStackSize ( 1 );
		this.setMaxDamage ( material.getMaxUses () );

		this.addPropertyOverride ( new ResourceLocation ( "blocking" ), new IItemPropertyGetter ()
		{
			@SideOnly( Side.CLIENT )
			public float apply ( ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn )
			{
				return entityIn != null && entityIn.isHandActive () && entityIn.getActiveItemStack () == stack ? 1.0F : 0.0F;
			}
		} );
	}


	public String getName ()
	{
		return this.name;
	}

	public void initOreDict ()
	{
		OreDictionary.registerOre ( this.getName (), this );
	}

	public ActionResult< ItemStack > onItemRightClick ( World worldIn, EntityPlayer playerIn, EnumHand handIn )
	{
		ItemStack itemstack = playerIn.getHeldItem ( handIn );
		playerIn.setActiveHand ( handIn );

		return new ActionResult< ItemStack > ( EnumActionResult.SUCCESS, itemstack );
	}

	@Override
	public EnumAction getItemUseAction ( ItemStack stack )
	{
		return EnumAction.BLOCK;
	}

	public void registerItemModel ()
	{
		DatMod.proxy.registerItemRenderer ( this, 0, this.getName () );
	}

	private ItemShieldBase setCreativeTab ()
	{
		super.setCreativeTab ( DatMod.creativeTab );
		return this;
	}

	protected void setName ( String name )
	{
		this.name = name.replace ( " ", "_" ).toLowerCase ();
		this.setRegistryName ( this.name );
		this.setUnlocalizedName ( this.name );
	}
}
