package de.Tommunity.MySQL;

import de.Tommunity.MySQL.Economysystem;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;

public class Economysystem_CMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player p = (Player) cs;
        if (args.length == 0) {
            p.sendMessage(Main.pre + "§3Dein Kontostand: " + Economysystem.getMoney(p.getUniqueId()));
        } else if (args.length == 1) {
            OfflinePlayer t = Bukkit.getOfflinePlayer(args[0]);
            if (p.hasPermission("Tom.Money")) {
                p.sendMessage(Main.pre + "§3Kontostand von §e" + t.getPlayer().getName() + ":§3 " + Economysystem.getMoney(t.getPlayer().getUniqueId()));
            } else {
                p.sendMessage(Main.pre + "§3Dein Kontostand: " + Economysystem.getMoney(p.getUniqueId()));
            }
        } else if (args.length == 3) {

            if (p.hasPermission("Tom.Money")) {
                if (args[0].equalsIgnoreCase("add")) {
                    @SuppressWarnings("deprecation")
                    OfflinePlayer target = Bukkit.getOfflinePlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        Economysystem.update(target.getUniqueId(), amount, false, target.getPlayer().getName());
                        p.sendMessage(Main.pre + "§3Du hast §e" + target.getPlayer().getName() + " §a" + amount + "$ §3gegeben");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                } else if (args[0].equalsIgnoreCase("remove")) {
                    @SuppressWarnings("deprecation")
                    OfflinePlayer target = Bukkit.getOfflinePlayer(args[1]);
                    if (target != null) {
                        Integer amount = Integer.valueOf(args[2]);
                        Economysystem.update(target.getUniqueId(), amount, true, target.getPlayer().getName());
                        p.sendMessage(Main.pre + "§cDu hast §e" + target.getPlayer().getName() + "§a " + amount + "$ §cabgezogen");
                    } else {
                        p.sendMessage("§cDieser Spieler ist nicht online");
                    }
                }

            } else {
                p.sendMessage(Main.pre + " §cDazu hast du keine Rechte!");
            }
        } else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/money <add/remove> <Spieler> <Betrag>!");
            return true;
        }
        return false;

    }

}