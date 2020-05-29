package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class BuildMap implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static int BuildMap;
	public static int BuildMap1;

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if (!(cs instanceof Player)) {
			cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
			return true;
		}
		if (args.length == 1) {
			if (args[0].equalsIgnoreCase("confirm")) {
				if (p.hasPermission("Tom.Builder") || p.hasPermission("Tom.Sup") || p.hasPermission("Tom.Mod")) {
					p.setGameMode(GameMode.CREATIVE);
					p.getInventory().clear();
					p.sendMessage(Main.pre + "§eDu bist nun in der BauMap");
	                FileConfiguration config = Main.getPlugin().getConfig();
	                World world = Bukkit.getWorld(config.getString("Build.World"));
	                double x = config.getDouble("Build.X");
	                double y = config.getDouble("Build.Y");
	                double z = config.getDouble("Build.Z");
	                float yaw = (float) config.getDouble("Build.Yaw");
	                float pitch = (float) config.getDouble("Build.Pitch");
	                Location location = new Location(world, x, y, z, yaw, pitch);
	                p.teleport(location);
					BuildMap1 =+ 10;
					BuildMap =+ 10;
				} else {
					p.sendMessage(Main.err);
				}
			}else if (args[0].equalsIgnoreCase("leave")) {
				p.setGameMode(GameMode.SURVIVAL);
				p.getInventory().clear();
				p.sendMessage(Main.pre + "§eDu bist nun §cnichtmehr in der BauMap");
				FileConfiguration config = Main.getPlugin().getConfig();
				World world = Bukkit.getWorld(config.getString("Spawn.World"));
				double x = config.getDouble("Spawn.X");
				double y = config.getDouble("Spawn.Y");
				double z = config.getDouble("Spawn.Z");
				float yaw = (float) config.getDouble("Spawn.Yaw");
				float pitch = (float) config.getDouble("Spawn.Pitch");
				Location location = new Location(world, x, y, z, yaw, pitch);
				p.teleport(location);
				BuildMap =- 10;
				BuildMap1 =- 10;

		}
	}else {
		p.sendMessage(Main.pre + "§cLege alle deine Items auf dein Plot da diese gelöscht werden!!");
		p.sendMessage(Main.pre + "§3Dannach mach §6/BuildMap confirm");
	}
		return false;
}
}
