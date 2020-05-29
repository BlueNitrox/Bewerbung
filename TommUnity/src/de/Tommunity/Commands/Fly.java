package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;


public class Fly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) {

            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
            return true;
        }
        Player p =(Player) sender;

        if(!p.hasPermission("Tom.fly")) {
            p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
            return true;
        }




        else if(args.length ==0) {

            if(p.getAllowFlight()) {
                p.setAllowFlight(false);
                p.sendMessage(Main.pre + "§cDu befindest dich nun nicht mehr im Flugmodus!");
                return true;
            }else {
                p.setAllowFlight(true);
                p.sendMessage(Main.pre + "§3Du befindest dich nun im Flugmodus!");
            }


            return true;
        }

        if(args.length == 1) {

            Player t = Bukkit.getPlayer(args[0]);

            if(t == null) {
                p.sendMessage(Main.pre + "§cDieser Spieler ist nicht online!");
                return true;
            }
            if(t.getAllowFlight()) {
                t.setAllowFlight(false);
                p.sendMessage(Main.pre + "§cDu hast §6" + t.getName() + " §caus dem Flugmodus gesetzt!");
                t.sendMessage(Main.pre + "§cDu wurdest aus dem Flugmodus gekickt!");
                return true;
            }else {
                t.setAllowFlight(true);
                p.sendMessage(Main.pre + "§3Du hast §6" + t.getName() + " §3in den Flugmodus gesetzt!");
                t.sendMessage(Main.pre + "§3Du wurdest in den Flugmodus gesetzt!");
            }

            return true;
        }
        return false;
    }

}