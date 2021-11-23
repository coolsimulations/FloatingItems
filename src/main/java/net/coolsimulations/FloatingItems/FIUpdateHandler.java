package net.coolsimulations.FloatingItems;

import java.net.URL;
import java.util.Scanner;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraftforge.common.MinecraftForge;

public class FIUpdateHandler {

	private static String latestVersion;
	private static String latestVersionInfo;
	public static boolean isOld = false;
	public static TextComponentTranslation updateInfo = null;
	public static TextComponentString updateVersionInfo = null;

	public static void init() {

		try {
			URL url = new URL("https://coolsimulations.net/mcmods/floatingitems/versionchecker112.txt");
			Scanner s = new Scanner(url.openStream());
			latestVersion = s.next();
			s.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			URL url = new URL("https://coolsimulations.net/mcmods/floatingitems/updateinfo112.txt");
			Scanner s = new Scanner(url.openStream());
			latestVersionInfo = s.nextLine();
			s.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		if(latestVersion != null) {

			if(latestVersion.equals("ended")) {

				isOld = true;

				TextComponentString fi = new TextComponentString(FIReference.MOD_NAME);
				fi.getStyle().setColor(TextFormatting.BLUE);

				TextComponentString MCVersion = new TextComponentString(MinecraftForge.MC_VERSION);
				MCVersion.getStyle().setColor(TextFormatting.BLUE);

				updateInfo = new TextComponentTranslation(FILang.getTranslations("floatingitems.update.display3"), new Object[] {fi, MCVersion});
				updateInfo.getStyle().setColor(TextFormatting.YELLOW);

				updateInfo.getStyle().setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TextComponentString(FILang.getTranslations("floatingitems.update.display2"))));
				updateInfo.getStyle().setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://curseforge.com/minecraft/mc-mods/floatingitems"));

			}

			if(!latestVersion.equals(FIReference.VERSION) && !latestVersion.equals("ended")) {

				isOld = true;

				TextComponentString fi = new TextComponentString(FIReference.MOD_NAME);
				fi.getStyle().setColor(TextFormatting.BLUE);

				TextComponentString version = new TextComponentString(latestVersion);
				version.getStyle().setColor(TextFormatting.BLUE);

				updateInfo = new TextComponentTranslation(FILang.getTranslations("floatingitems.update.display1"), new Object[] {fi, version});
				updateInfo.getStyle().setColor(TextFormatting.YELLOW);

				updateInfo.getStyle().setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TextComponentString(FILang.getTranslations("floatingitems.update.display2"))));
				updateInfo.getStyle().setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://curseforge.com/minecraft/mc-mods/floatingitems"));

				if(latestVersionInfo != null) {

					updateVersionInfo = new TextComponentString(latestVersionInfo);
					updateVersionInfo.getStyle().setColor(TextFormatting.DARK_AQUA);
					updateVersionInfo.getStyle().setBold(true);

					updateVersionInfo.getStyle().setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TextComponentString(FILang.getTranslations("floatingitems.update.display2"))));
					updateVersionInfo.getStyle().setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://curseforge.com/minecraft/mc-mods/floatingitems"));

				}

			}

		}
	}

}
