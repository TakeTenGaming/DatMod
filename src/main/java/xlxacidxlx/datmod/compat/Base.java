package xlxacidxlx.datmod.compat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xlxacidxlx.datmod.DatMod;

/**
 * Created by Acid on 1/2/2017.
 */
public class Base
{
	Logger logger;
	private String recipesFile;

	public static String MODID;

	Base ( String modId )
	{
		this.setModId ( modId );
		this.setupLogger ();
	}

	String getModId ()
	{
		return MODID;
	}

	private void setModId ( String modId )
	{
		MODID = modId;
	}

	private void setupLogger ()
	{
		this.logger = LogManager.getLogger ( DatMod.NAME + "/Compat/" + this.getModId () );
	}
}
