package net.coolsimulations.FloatingItems;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Level;

import cpw.mods.fml.client.config.IConfigElement;
import cpw.mods.fml.relauncher.FMLRelaunchLog;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class FIConfig {

	static Configuration config;

	public static FIConfigItem[] blacklistItems;
	
	public static int[] blacklistRegistryItems;
	
	public static String[] blacklistOreDict;

	public static String serverLang;

	public static boolean disableUpdateCheck;

	public static void init(File file) {
		config = new Configuration(file);
		syncConfig(true);
	}

	public static void forceSave() {
		config.save();
	}

	public static void syncConfig(boolean load)
	{
		List<String> propOrder = new ArrayList<String>();

		try
		{
			Property prop;

			if (!config.isChild)
			{
				if (load)
				{
					config.load();
				}
			}

			prop = config.get(FIReference.CONFIG_CATEGORY_UTIL, "Blacklist of Items that should not Float", new String[]{});
			prop.comment = "Format: {Item ID}(Metadata). Example of Spruce Log: {17}(1)";

			List<FIConfigItem> blacklist = new ArrayList<FIConfigItem>();
			for(String entry : prop.getStringList()) {
				blacklist.add(new FIConfigItem(entry));
			}

			if(blacklist != null)
				blacklistItems = blacklist.toArray(new FIConfigItem[] {});

			propOrder.add(prop.getName());
			
			prop = config.get(FIReference.CONFIG_CATEGORY_UTIL, "Blacklist of All Items regardless of Metadata that should not Float", new int[]{});
			prop.comment = "Format: Item ID. Example of Cobblestone: 4";
			blacklistRegistryItems = prop.getIntList();
			propOrder.add(prop.getName());
			
			prop = config.get(FIReference.CONFIG_CATEGORY_UTIL, "Blacklist of OreDict Entries that should not Float", new String[]{});
			prop.comment = "Format: OreDict. Example of Copper Ingot: ingotCopper";
			blacklistOreDict = prop.getStringList();
			propOrder.add(prop.getName());

			prop = config.get(FIReference.CONFIG_CATEGORY_UTIL, "Default Server language", "en_us");
			prop.comment = "Server language codes are based off the Minecraft .lang files. See https://minecraft.gamepedia.com/Language for list.";
			serverLang = prop.getString();
			propOrder.add(prop.getName());

			prop = config.get(FIReference.CONFIG_CATEGORY_UTIL, "Disable FloatingItems Update Checker Message", false);
			disableUpdateCheck = prop.getBoolean(false);
			propOrder.add(prop.getName());

			if (config.hasChanged())
			{
				config.save();
			}

		}
		catch (final Exception e)
		{
			FMLRelaunchLog.log(FIReference.MOD_NAME, Level.ERROR, ("Problem loading FloatingItems config (\"FloatingItems.conf\")"));
			e.printStackTrace();
		}
	}

	public static List<IConfigElement> getConfigElements() {
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		list.addAll(new ConfigElement(config.getCategory(FIReference.CONFIG_CATEGORY_UTIL)).getChildElements());
		return list;
	}

	public static class FIConfigItem {

		private int registry;
		private int meta;
		private Item item;

		FIConfigItem(ItemStack stack) {

			this.item = stack.getItem();
			this.meta = stack.getMetadata();
			this.registry = Item.getIdFromItem(this.item);
		}

		FIConfigItem(String entry) {
			
			entry = entry.replaceAll(" ", "");

			this.meta = Integer.parseInt(StringUtils.substringBetween(entry, "(", ")"));
			this.registry = Integer.parseInt(StringUtils.substringBetween(entry, "{", "}"));
			this.item = (Item) Item.itemRegistry.getObjectById(this.registry);
		}

		public Item getItem() {

			return this.item;
		}

		public int getMeta() {

			return this.meta;
		}

		public ItemStack getStack() {

			return getStack(1);
		}

		public ItemStack getStack(int count) {

			return new ItemStack(this.item, count, this.meta);
		}

		public int getRegistry() {

			return this.registry;
		}

		@Override
		public String toString() {

			return "{" + this.registry + "}(" + this.meta + ")";
		}

		@Override
		public boolean equals(Object obj) {

			if (obj == this) {
				return true;
			}

			if (!(obj instanceof FIConfigItem)) {
				return false;
			}

			FIConfigItem other = (FIConfigItem) obj;
			
			/**if(this.registry == other.registry) {
				
				if(this.meta == other.meta) {
					
					if(this.item == other.item) {
						return true;
					} else {
						return false;
					}
					
				} else {
					return false;
				}
				
			} else {
				return false;
			}**/
			
			return this.registry == other.registry && this.meta == other.meta && this.item == other.item;
		}
	}

}
