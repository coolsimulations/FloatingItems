package net.coolsimulations.FloatingItems;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = FIReference.MOD_ID, name = FIReference.MOD_NAME, version = FIReference.VERSION, acceptedMinecraftVersions = FIReference.ACCEPTED_VERSIONS, dependencies = FIReference.DEPENDENCIES, acceptableRemoteVersions = "*", guiFactory = "net.coolsimulations.FloatingItems.FIConfigGUI")
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
		if (event.modID.equals(FIReference.MOD_ID))
		{
			FIConfig.syncConfig(false);
		}
	}
	
	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent event)
	{
		EntityPlayerMP player = (EntityPlayerMP) event.player;

		if(FIUpdateHandler.isOld == true && FIConfig.disableUpdateCheck == false) {
			player.addChatMessage(FIUpdateHandler.updateInfo);
			player.addChatMessage(FIUpdateHandler.updateVersionInfo);
		}
	}
}
