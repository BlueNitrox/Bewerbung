package de.Tommunity.Commands;
 
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Listener.WorldListener;
import de.Tommunity.Main.Main;
 
public class Vanish implements CommandExecutor {
   
    public static List<Player> vanished = new ArrayList<>();
 
   
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
            return true;
        }
            Player p = (Player) sender;

        if(WorldListener.fight.contains(p)){
            p.sendMessage(Main.pre + "§cDas kannst du im Kampf leider nicht machen!");
            return true;
        }

            if(!p.hasPermission("Tom.vanish")) {
                p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
                return true;
            }
           
            if(args.length == 0) {
                if(vanished.contains(p)) {
                    vanished.remove(p);
                    p.sendMessage(Main.pre + "§cDu hast den Vanishmodus verlassen!");
                    for(Player all : Bukkit.getOnlinePlayers()) {
                        all.showPlayer(p);
                    }
                }else {
                    vanished.add(p);
                    p.sendMessage(Main.pre + "§3Du hast den Vanishmodus betreten!");
                    for(Player all : Bukkit.getOnlinePlayers()) {
                        if(!all.hasPermission("Tom.vanish.see")) {
                            all.hidePlayer(p);
                        }
                    }
                }
            }
           
           
           
           
       
       
            return false;
           
    }
}