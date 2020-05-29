package de.Tommunity.Clan;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Clandata {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static File Clanfile = new File("plugins/Clan", "Clan.yml");
	public static FileConfiguration Clan = YamlConfiguration.loadConfiguration(Clanfile);
	public static void saveClanFile() {
		try {
			Clan.save(Clanfile);
		}catch(IOException f) {
			f.printStackTrace();
		}
	}
}
