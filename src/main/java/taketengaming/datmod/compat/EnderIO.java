package taketengaming.datmod.compat;

import net.minecraftforge.fml.common.Loader;

/**
 * Created by Acid on 1/2/2017.
 */
public class EnderIo extends CompatBase
{
	public EnderIo ()
	{
		super ( "EnderIO", "compat/EnderIo/Recipes.xml" );
	}

	public void init ()
	{
		if ( Loader.isModLoaded ( "EnderIO" ) )
		{
			this.logger.debug ( "Registering recipes.." );
		}

		// General Recipes
		String recipes = this.getRecipes ();
		if ( recipes.isEmpty () )
		{
			this.logger.debug ( "No recipes to set.." );
		}
		else
		{
			boolean result = this.sendMessage ( "recipe:sagmill", recipes );

			if ( result )
			{
				this.logger.debug ( "Recipes successfully set!" );
			}
			else
			{
				this.logger.debug ( "Failed to set recipes.." );
			}
		}
	}
}
