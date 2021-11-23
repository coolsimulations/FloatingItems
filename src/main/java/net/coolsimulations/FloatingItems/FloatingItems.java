package net.coolsimulations.FloatingItems;

import java.io.File;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

@Mod(modid = FIReference.MOD_ID, name = FIReference.MOD_NAME, version = FIReference.VERSION, acceptedMinecraftVersions = FIReference.ACCEPTED_VERSIONS, dependencies = FIReference.DEPENDENCIES, acceptableRemoteVersions = "*", guiFactory = "net.coolsimulations.FloatingItems.FIConfigGUI", updateJSON = "https://coolsimulations.net/mcmods/floatingitems/versionchecker.json")
public class FloatingItems {

	@Mod.Instance(FIReference.MOD_ID)
	public static FloatingItems instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Pre Init");
		FIConfig.init(new File(event.getModConfigurationDirectory(), FIReference.FLOATINGITEMS_CONFIG_FILE));
		FIUpdateHandler.init();
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent event)
	{
		if (event.getModID().equals(FIReference.MOD_ID))
		{
			FIConfig.syncConfig(false);
		}
	}
	
	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent event)
	{
		EntityPlayerMP player = (EntityPlayerMP) event.player;

		if(FIUpdateHandler.isOld == true && FIConfig.disableUpdateCheck == false) {
			player.sendMessage(FIUpdateHandler.updateInfo);
			player.sendMessage(FIUpdateHandler.updateVersionInfo);
		}
	}
}
