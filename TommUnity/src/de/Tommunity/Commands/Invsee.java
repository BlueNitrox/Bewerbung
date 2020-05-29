package de.Tommunity.Commands;
 
import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
 
public class Invsee implements CommandExecutor{

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    public static ArrayList<UUID> invsee = new ArrayList();
   
     public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if(!(sender instanceof Player)) {
        sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        return true;
    }
        Player p = (Player) sender;
       
        if(!p.hasPermission("Tom.Invsee")) {
            p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
        }
     else if(args.length == 0) {
                p.sendMessage(Main.pre + "§cBitte Benutze §6/" + label + " <Spieler>§c");
            }
            else if(args.length == 1) {
                if(!p.hasPermission("Tom.invsee.other")) {
                    p.sendMessage(Main.err);
                    return true;
                }
                Player target = Bukkit.getPlayer(args[0]);
                if(target == null ) {
                    p.sendMessage(Main.pre + "§cDieser Spieler ist nicht online!");
                    return true;
                }
                p.openInventory(target.getInventory());
                p.sendMessage(Main.pre + "§3Du schaust nun in das Intentar von" + target.getName() +".");
                invsee.contains(p.getUniqueId());
           
           
            }else {
                p.sendMessage(Main.pre + "§cBitte Benutze §6/" + label + " <Spieler>§c");   
        }
            return false;
    }
}