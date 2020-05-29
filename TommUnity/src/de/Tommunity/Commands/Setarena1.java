package de.Tommunity.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class Setarena1 implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox 咀opyRight
	 */

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(Main.pre + "呃Dazu musst du ein Spieler sein!");
		}
		Player p = (Player) sender;
		if (!p.hasPermission("Tom.setmine")) {
			p.sendMessage(Main.pre + "呃Dazu hast du keine Rechte!");
		} else if (args.length == 1) {

			if (args[0].equalsIgnoreCase("1")) {
				FileConfiguration config = Main.getPlugin().getConfig();
				config.set("A1.World", p.getWorld().getName());
				config.set("A1.X", p.getLocation().getX());
				config.set("A1.Y", p.getLocation().getY());
				config.set("A1.Z", p.getLocation().getZ());
				config.set("A1.Yaw", p.getLocation().getYaw());
				config.set("A1.Pitch", p.getLocation().getPitch());
				Main.getPlugin().saveConfig();
				p.sendMessage(Main.pre + "你3Du hast Mine 1 gesetzt!");
			}

			else if (args[0].equalsIgnoreCase("2")) {
				FileConfiguration configA2 = Main.getPlugin().getConfig();
				configA2.set("A2.World", p.getWorld().getName());
				configA2.set("A2.X", p.getLocation().getX());
				configA2.set("A2.Y", p.getLocation().getY());
				configA2.set("A2.Z", p.getLocation().getZ());
				configA2.set("A2.Yaw", p.getLocation().getYaw());
				configA2.set("A2.Pitch", p.getLocation().getPitch());
				Main.getPlugin().saveConfig();
				p.sendMessage(Main.pre + "你3Du hast Mine 2 gesetzt!");
			}

			else if (args[0].equalsIgnoreCase("3")) {
				FileConfiguration configA3 = Main.getPlugin().getConfig();
				configA3.set("A3.World", p.getWorld().getName());
				configA3.set("A3.X", p.getLocation().getX());
				configA3.set("A3.Y", p.getLocation().getY());
				configA3.set("A3.Z", p.getLocation().getZ());
				configA3.set("A3.Yaw", p.getLocation().getYaw());
				configA3.set("A3.Pitch", p.getLocation().getPitch());
				Main.getPlugin().saveConfig();
				p.sendMessage(Main.pre + "你3Du hast Mine 3 gesetzt!");

			} else if (args[0].equalsIgnoreCase("4")) {
				FileConfiguration configA4 = Main.getPlugin().getConfig();
				configA4.set("A4.World", p.getWorld().getName());
				configA4.set("A4.X", p.getLocation().getX());
				configA4.set("A4.Y", p.getLocation().getY());
				configA4.set("A4.Z", p.getLocation().getZ());
				configA4.set("A4.Yaw", p.getLocation().getYaw());
				configA4.set("A4.Pitch", p.getLocation().getPitch());
				Main.getPlugin().saveConfig();
				p.sendMessage(Main.pre + "你3Du hast Mine 4 gesetzt!");

			} else if (args[0].equalsIgnoreCase("5")) {
				FileConfiguration configA5 = Main.getPlugin().getConfig();
				configA5.set("A5.World", p.getWorld().getName());
				configA5.set("A5.X", p.getLocation().getX());
				configA5.set("A5.Y", p.getLocation().getY());
				configA5.set("A5.Z", p.getLocation().getZ());
				configA5.set("A5.Yaw", p.getLocation().getYaw());
				configA5.set("A5.Pitch", p.getLocation().getPitch());
				Main.getPlugin().saveConfig();
				p.sendMessage(Main.pre + "你3Du hast Mine 5 gesetzt!");

			} else if (args[0].equalsIgnoreCase("6")) {
				FileConfiguration configA6 = Main.getPlugin().getConfig();
				configA6.set("A6.World", p.getWorld().getName());
				configA6.set("A6.X", p.getLocation().getX());
				configA6.set("A6.Y", p.getLocation().getY());
				configA6.set("A6.Z", p.getLocation().getZ());
				configA6.set("A6.Yaw", p.getLocation().getYaw());
				configA6.set("A6.Pitch", p.getLocation().getPitch());
				Main.getPlugin().saveConfig();
				p.sendMessage(Main.pre + "你3Du hast Mine 6 gesetzt!");

			} else if (args[0].equalsIgnoreCase("7")) {
				FileConfiguration configA7 = Main.getPlugin().getConfig();
				configA7.set("A7.World", p.getWorld().getName());
				configA7.set("A7.X", p.getLocation().getX());
				configA7.set("A7.Y", p.getLocation().getY());
				configA7.set("A7.Z", p.getLocation().getZ());
				configA7.set("A7.Yaw", p.getLocation().getYaw());
				configA7.set("A7.Pitch", p.getLocation().getPitch());
				Main.getPlugin().saveConfig();
				p.sendMessage(Main.pre + "你3Du hast Mine 7 gesetzt!");

			} else if (args[0].equalsIgnoreCase("8")) {
				FileConfiguration configA8 = Main.getPlugin().getConfig();
				configA8.set("A8.World", p.getWorld().getName());
				configA8.set("A8.X", p.getLocation().getX());
				configA8.set("A8.Y", p.getLocation().getY());
				configA8.set("A8.Z", p.getLocation().getZ());
				configA8.set("A8.Yaw", p.getLocation().getYaw());
				configA8.set("A8.Pitch", p.getLocation().getPitch());
				Main.getPlugin().saveConfig();
				p.sendMessage(Main.pre + "你3Du hast Mine 8 gesetzt!");

			} else if (args[0].equalsIgnoreCase("9")) {
				FileConfiguration configA9 = Main.getPlugin().getConfig();
				configA9.set("A9.World", p.getWorld().getName());
				configA9.set("A9.X", p.getLocation().getX());
				configA9.set("A9.Y", p.getLocation().getY());
				configA9.set("A9.Z", p.getLocation().getZ());
				configA9.set("A9.Yaw", p.getLocation().getYaw());
				configA9.set("A9.Pitch", p.getLocation().getPitch());
				Main.getPlugin().saveConfig();
				p.sendMessage(Main.pre + "你3Du hast Mine 9 gesetzt!");

			} else if (args[0].equalsIgnoreCase("10")) {
				FileConfiguration configAA10 = Main.getPlugin().getConfig();
				configAA10.set("A10.World", p.getWorld().getName());
				configAA10.set("A10.X", p.getLocation().getX());
				configAA10.set("A10.Y", p.getLocation().getY());
				configAA10.set("A10.Z", p.getLocation().getZ());
				configAA10.set("A10.Yaw", p.getLocation().getYaw());
				configAA10.set("A10.Pitch", p.getLocation().getPitch());
				Main.getPlugin().saveConfig();
				p.sendMessage(Main.pre + "你3Du hast Mine 10 gesetzt!");

			} else {
				p.sendMessage(Main.pre + "呃Bitte benutze 你6/setmine <Mine>呃!");
			}

		}
		return false;
	}
}