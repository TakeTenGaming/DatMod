package taketengaming.datmod.compat;

import net.minecraftforge.fml.common.event.FMLInterModComms;
import org.apache.commons.io.IOUtils;
import taketengaming.datmod.DatMod;
import taketengaming.tencore.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

/**
 * Created by Acid on 1/2/2017.
 */
public class CompatBase
{
	private String recipes = "";
	private String recipesFile = "";

	public Logger logger;
	public String modId;

	public CompatBase ( String modId, String recipesFile )
	{
		this.setModId ( modId );
		this.setRecipesFile ( recipesFile );

		this.logger = new Logger ( DatMod.NAME + " Compat - " + this.getModId () );
	}

	public CompatBase ( String modId )
	{
		this.setModId ( modId );
		this.logger = new Logger ( DatMod.NAME + " Compat - " + this.getModId () );
	}

	public String getModId ()
	{
		return this.modId;
	}

	public String getRecipes ()
	{
		if ( this.recipes.isEmpty () )
		{
			this.loadRecipes ();
		}

		return this.recipes;
	}

	private String loadRecipes ()
	{
		String result = "";

		if ( this.recipesFile.isEmpty () )
		{
			this.logger.debug ( "No recipe file specified.." );
			return "";
		}

		InputStream recipesFileStream = DatMod.class.getClassLoader ().getResourceAsStream ( this.recipesFile );
		if ( recipesFileStream == null )
		{
			return "";
		}

		try
		{
			result = IOUtils.toString ( URI.create ( recipesFile ) );
		}
		catch ( IOException e )
		{
			e.printStackTrace ();
		}

		return result;
	}

	public boolean sendMessage ( String key, String message )
	{
		return FMLInterModComms.sendMessage ( this.getModId (), key, message );
	}

	private void setModId ( String modId )
	{
		this.modId = modId;
	}

	private void setRecipesFile ( String recipesFile )
	{
		this.recipesFile = recipesFile;
	}
}
