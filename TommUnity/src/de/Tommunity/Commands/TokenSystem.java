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

public class TokenSystem implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		 if (args.length == 3) {

			if (p.hasPermission("Tom.Money")) {
				if (args[0].equalsIgnoreCase("add")) {
					Player target = Bukkit.getPlayer(args[1]);
					if (target != null) {
						Integer amount = Integer.valueOf(args[2]);
						addToken(target.getUniqueId(), amount);
						p.sendMessage(Main.pre + "§3Du hast §e" + target.getPlayer().getName() + " §a" + amount + " §3Tokens gegeben");
					} else {
						p.sendMessage("§cDieser Spieler ist nicht online");
					}
				} else if (args[0].equalsIgnoreCase("remove")) {
					Player target = Bukkit.getPlayer(args[1]);
					if (target != null) {
						Integer amount = Integer.valueOf(args[2]);
						removeToken(target.getUniqueId(), amount);
						p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + " §cTokens abgezogen");
					} else {
						p.sendMessage("§cDieser Spieler ist nicht online");
					}
				} 

			} else {
				p.sendMessage(Main.pre + " §cDazu hast du keine Rechte!");
			}
		} else {
			p.sendMessage(Main.pre + "§cBitte benutze §6/token <add/set/remove> <Spieler> <Betrag>!");
			return true;
		}
		return false;

	}

	public Integer getToken(UUID uuid) {
		File file = new File("plugins//TommUnity", "token.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int token = cfg.getInt(uuid + ".token");
		return token;

	}

	public void addToken(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "token.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int token = cfg.getInt(uuid + ".token");
		token = token + amount;
		cfg.set(uuid + ".token", token);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public void removeToken(UUID uuid, int amount) {
		File file = new File("plugins//TommUnity", "token.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int token = cfg.getInt(uuid + ".token");
		token = token - amount;
		cfg.set(uuid + ".token", token);
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	public boolean hasEnoughToken(UUID uuid, int amount) {
		File file = new File("plugins/TommUnity", "token.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

		int token = cfg.getInt(uuid + ".token");
		if (token >= amount) {
			return true;
		} else
			return false;

	}

}