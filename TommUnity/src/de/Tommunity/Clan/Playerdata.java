package de.Tommunity.Clan;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Playerdata {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static File Playerfile = new File("plugins/Clan", "Player.yml");
	public static FileConfiguration Player = YamlConfiguration.loadConfiguration(Playerfile);
	public static void savePlayerFile() {
		try {
			Player.save(Playerfile);
		}catch(IOException f) {
			f.printStackTrace();
		}
	}
}
