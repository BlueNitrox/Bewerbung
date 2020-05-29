package de.Tommunity.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class setJNR implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;
        if (!p.hasPermission("Tom.setmine")) {
            p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
        } else if (args.length == 1) {

            if (args[0].equalsIgnoreCase("1")) {
                FileConfiguration config = Main.getPlugin().getConfig();
                config.set("1.World", p.getWorld().getName());
                config.set("1.X", p.getLocation().getX());
                config.set("1.Y", p.getLocation().getY());
                config.set("1.Z", p.getLocation().getZ());
                config.set("1.Yaw", p.getLocation().getYaw());
                config.set("1.Pitch", p.getLocation().getPitch());
                Main.getPlugin().saveConfig();
                p.sendMessage(Main.pre + "§3Du hast Mine 1 gesetzt!");
            }

            else if (args[0].equalsIgnoreCase("2")) {
                FileConfiguration config2 = Main.getPlugin().getConfig();
                config2.set("2.World", p.getWorld().getName());
                config2.set("2.X", p.getLocation().getX());
                config2.set("2.Y", p.getLocation().getY());
                config2.set("2.Z", p.getLocation().getZ());
                config2.set("2.Yaw", p.getLocation().getYaw());
                config2.set("2.Pitch", p.getLocation().getPitch());
                Main.getPlugin().saveConfig();
                p.sendMessage(Main.pre + "§3Du hast Mine 2 gesetzt!");
            }

            else if (args[0].equalsIgnoreCase("3")) {
                FileConfiguration config3 = Main.getPlugin().getConfig();
                config3.set("3.World", p.getWorld().getName());
                config3.set("3.X", p.getLocation().getX());
                config3.set("3.Y", p.getLocation().getY());
                config3.set("3.Z", p.getLocation().getZ());
                config3.set("3.Yaw", p.getLocation().getYaw());
                config3.set("3.Pitch", p.getLocation().getPitch());
                Main.getPlugin().saveConfig();
                p.sendMessage(Main.pre + "§3Du hast Mine 3 gesetzt!");

            } else if (args[0].equalsIgnoreCase("4")) {
                FileConfiguration config4 = Main.getPlugin().getConfig();
                config4.set("4.World", p.getWorld().getName());
                config4.set("4.X", p.getLocation().getX());
                config4.set("4.Y", p.getLocation().getY());
                config4.set("4.Z", p.getLocation().getZ());
                config4.set("4.Yaw", p.getLocation().getYaw());
                config4.set("4.Pitch", p.getLocation().getPitch());
                Main.getPlugin().saveConfig();
                p.sendMessage(Main.pre + "§3Du hast Mine 4 gesetzt!");

            } else if (args[0].equalsIgnoreCase("5")) {
                FileConfiguration config5 = Main.getPlugin().getConfig();
                config5.set("5.World", p.getWorld().getName());
                config5.set("5.X", p.getLocation().getX());
                config5.set("5.Y", p.getLocation().getY());
                config5.set("5.Z", p.getLocation().getZ());
                config5.set("5.Yaw", p.getLocation().getYaw());
                config5.set("5.Pitch", p.getLocation().getPitch());
                Main.getPlugin().saveConfig();
                p.sendMessage(Main.pre + "§3Du hast Mine 5 gesetzt!");

            } else if (args[0].equalsIgnoreCase("6")) {
                FileConfiguration config6 = Main.getPlugin().getConfig();
                config6.set("6.World", p.getWorld().getName());
                config6.set("6.X", p.getLocation().getX());
                config6.set("6.Y", p.getLocation().getY());
                config6.set("6.Z", p.getLocation().getZ());
                config6.set("6.Yaw", p.getLocation().getYaw());
                config6.set("6.Pitch", p.getLocation().getPitch());
                Main.getPlugin().saveConfig();
                p.sendMessage(Main.pre + "§3Du hast Mine 6 gesetzt!");

            } else if (args[0].equalsIgnoreCase("7")) {
                FileConfiguration config7 = Main.getPlugin().getConfig();
                config7.set("7.World", p.getWorld().getName());
                config7.set("7.X", p.getLocation().getX());
                config7.set("7.Y", p.getLocation().getY());
                config7.set("7.Z", p.getLocation().getZ());
                config7.set("7.Yaw", p.getLocation().getYaw());
                config7.set("7.Pitch", p.getLocation().getPitch());
                Main.getPlugin().saveConfig();
                p.sendMessage(Main.pre + "§3Du hast Mine 7 gesetzt!");

            } else if (args[0].equalsIgnoreCase("8")) {
                FileConfiguration config8 = Main.getPlugin().getConfig();
                config8.set("8.World", p.getWorld().getName());
                config8.set("8.X", p.getLocation().getX());
                config8.set("8.Y", p.getLocation().getY());
                config8.set("8.Z", p.getLocation().getZ());
                config8.set("8.Yaw", p.getLocation().getYaw());
                config8.set("8.Pitch", p.getLocation().getPitch());
                Main.getPlugin().saveConfig();
                p.sendMessage(Main.pre + "§3Du hast Mine 8 gesetzt!");

            } else if (args[0].equalsIgnoreCase("9")) {
                FileConfiguration config9 = Main.getPlugin().getConfig();
                config9.set("9.World", p.getWorld().getName());
                config9.set("9.X", p.getLocation().getX());
                config9.set("9.Y", p.getLocation().getY());
                config9.set("9.Z", p.getLocation().getZ());
                config9.set("9.Yaw", p.getLocation().getYaw());
                config9.set("9.Pitch", p.getLocation().getPitch());
                Main.getPlugin().saveConfig();
                p.sendMessage(Main.pre + "§3Du hast Mine 9 gesetzt!");

            } else {
                p.sendMessage(Main.pre + "§cBitte benutze §6/setjnr <Mine>§c!");
            }

        }
        return false;
    }
}