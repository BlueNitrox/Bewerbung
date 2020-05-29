package de.Tommunity.Commands;

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

public class EXpSystem implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if (args.length == 0) {
			p.sendMessage(Main.pre + "§3Deine EXP: " + getEXP(p.getUniqueId()));
		} else if (args.length == 1) {
			Player target = Bukkit.getPlayer(args[0]);
			if (p.hasPermission("Tom.EXP")) {
				p.sendMessage(Main.pre + "§3EXP von §e" + target.getPlayer().getName() + ":§3 " + getEXP(target.getUniqueId()));
			} else {
				p.sendMessage(Main.pre + "§3Deine EXP: " + getEXP(p.getUniqueId()));
			}
		} else if (args.length == 3) {

			if (p.hasPermission("Tom.EXP")) {
				if (args[0].equalsIgnoreCase("add")) {
					Player target = Bukkit.getPlayer(args[1]);
					if (target != null) {
						Integer amount = Integer.valueOf(args[2]);
						addEXP(target.getUniqueId(), amount);
						p.sendMessage(Main.pre + "§3Du hast §e" + target.getPlayer().getName() + " §a" + amount + "  §3gegeben");
					} else {
						p.sendMessage("§cDieser Spieler ist nicht online");
					}
				} else if (args[0].equalsIgnoreCase("remove")) {
					Player target = Bukkit.getPlayer(args[1]);
					if (target != null) {
						Integer amount = Integer.valueOf(args[2]);
						removeEXP(target.getUniqueId(), amount);
						p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + " §cabgezogen");
					} else {
						p.sendMessage("§cDieser Spieler ist nicht online");
					}
				} else if (args[0].equalsIgnoreCase("set")) {
					Player target = Bukkit.getPlayer(args[1]);
					if (target != null) {
						Integer amount = Integer.valueOf(args[2]);
						setEXP(target.getUniqueId(), amount);
						p.sendMessage(Main.pre + "§3Du hast das Geld von §e" + target.getPlayer().getName() + "§3 auf §a" + amount + "§3 gesetzt!");
					} else {
						p.sendMessage("§cDieser Spieler ist nicht online");
					}
				}

			} else {
				p.sendMessage(Main.pre + " §cDazu hast du keine Rechte!");
			}
		} else {
			p.sendMessage(Main.pre + "§cBitte benutze §6/money <add/set/remove> <Spieler> <Betrag>!");
			return true;
		}
		return false;

	}

	public int getEXP(UUID uuid) {
		File file = new File("plugins/TommUnity", "EXP.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int EXP = cfg.getInt(uuid + "EXP");
		return EXP;

	}

	public void addEXP(UUID UUID, int amount) {
		File file = new File("plugins/TommUnity", "EXP.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int EXP = cfg.getInt(UUID + "EXP");
		EXP = EXP + amount;
		cfg.set(UUID + "EXP", EXP);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public void removeEXP(UUID UUID, int amount) {
		File file = new File("plugins/TommUnity", "EXP.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int EXP = cfg.getInt(UUID + "EXP");
		EXP = EXP - amount;
		cfg.set(UUID + "EXP", EXP);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setEXP(UUID UUID, int amount) {
		File file = new File("plugins/TommUnity", "EXP.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		cfg.set(UUID + "EXP", amount);
		int EXP = cfg.getInt(UUID + "EXP");
		EXP = EXP + amount;
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean hasEnoughEXP(UUID UUID, int amount) {
		File file = new File("plugins/TommUnity", "EXP.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int EXP = cfg.getInt(UUID + "EXP");
		if (EXP >= amount) {
			return true;
		} else
			return false;

	}

}
