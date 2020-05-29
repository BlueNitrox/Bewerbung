package de.Tommunity.utils;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class ChestAPI implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if (args.length == 4) {

			if (p.hasPermission("Tom.Chests")) {
				if (args[0].equalsIgnoreCase("add")) {
					Player target = Bukkit.getPlayer(args[1]);
					String name = args[2];
					if (target != null) {
						Integer amount = Integer.valueOf(args[3]);
						if(name.equalsIgnoreCase("master")) {
							addMasterChest(target.getUniqueId(), amount);
							p.sendMessage(Main.pre + "§aDu hast §e" + target.getPlayer().getName() + " §a " + amount + "x §dMaster-Chest §agegeben");
						}else if(name.equalsIgnoreCase("hero")) {
							addHeroChest(target.getUniqueId(), amount);
							p.sendMessage(Main.pre + "§aDu hast §e" + target.getPlayer().getName() + " §a " + amount + "x §9Hero-Chest §agegeben");
						}else {
							p.sendMessage(Main.pre + "§cUngültige Angabe: §6Bitte benutze §dmaster oder §9hero");
						}
					} else {
						p.sendMessage("§cDieser Spieler ist nicht online");
					}
				} else if (args[0].equalsIgnoreCase("remove")) {
					Player target = Bukkit.getPlayer(args[1]);
					String name = args[2];
					if (target != null) {
						Integer amount = Integer.valueOf(args[3]);
						if(name.equalsIgnoreCase("master")) {
							removeMasterChest(target.getUniqueId(), amount);
							p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + " §a " + amount + "x §dMaster-Chest §cweggenommen");
						}else if(name.equalsIgnoreCase("hero")) {
							removeHeroChest(target.getUniqueId(), amount);
							p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + " §a " + amount + "x §9Hero-Chest §cweggenommen");
						}
					} else {
						p.sendMessage("§cDieser Spieler ist nicht online");
					}
				} else {
					p.sendMessage(Main.pre + "§cBitte benutze §6/chest <add/remove> <Spieler> <Chest> <Betrag>!");
				}
		} else {
			p.sendMessage(Main.pre + " §cDazu hast du keine Rechte!");
		}
	 } else {
		p.sendMessage(Main.pre + "§cBitte benutze §6/chest <add/remove> <Spieler> <Chest> <Betrag>!");	
	}

		return false;
		 
	}
	public Integer getMasterChest(UUID uuid) {
		File file = new File("plugins//TommUnity", "chest.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int chest = cfg.getInt(uuid + ".Master-Chest");
		return chest;

	}

	public void addMasterChest(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "chest.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int chest = cfg.getInt(uuid + ".Master-Chest");
		chest = chest + amount;
		cfg.set(uuid + ".Master-Chest", chest);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public void removeMasterChest(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "chest.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int chest = cfg.getInt(uuid + ".Master-Chest");
		chest = chest - amount;
		cfg.set(uuid + ".Master-Chest", chest);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	

	public boolean hasEnoughMasterChests(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "chest.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int chest = cfg.getInt(uuid + ".Master-Chest");
		if (chest >= amount) {
			return true;
		} else
			return false;

	}
	
	public Integer getHeroChest(UUID uuid) {
		File file = new File("plugins//TommUnity", "chest.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int chest = cfg.getInt(uuid + ".Hero-Chest");
		return chest;

	}

	public void addHeroChest(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "chest.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int chest = cfg.getInt(uuid + ".Hero-Chest");
		chest = chest + amount;
		cfg.set(uuid + ".Hero-Chest", chest);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public void removeHeroChest(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "chest.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int chest = cfg.getInt(uuid + ".Hero-Chest");
		chest = chest - amount;
		cfg.set(uuid + ".Hero-Chest", chest);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	

	public boolean hasEnoughHeroChests(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "chest.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int chest = cfg.getInt(uuid + ".Hero-Chest");
		if (chest >= amount) {
			return true;
		} else
			return false;

	}
}