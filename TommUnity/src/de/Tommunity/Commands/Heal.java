package de.Tommunity.Commands;
 
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
 
public class Heal implements CommandExecutor{
 
   
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            if(p.hasPermission("Tom.heal")) {
                if(args.length == 0) {
                    p.setHealth(20);
                    p.setFoodLevel(20);
                    p.sendMessage(Main.pre + "§3Du wurdest geheilt!");
                } else if(args.length ==1) {
                    Player target =Bukkit.getPlayer(args[0]);
                    if(target != null) {
                        target.setHealth(20);
                        target.setFoodLevel(20);
                        target.sendMessage(Main.pre + "§3Du wurstest geheilt!");
                        p.sendMessage(Main.pre + "§aDu hast den Spieler §6" + target.getName() + "§a geheilt.");
                    } else
                            p.sendMessage(Main.pre + "§cDer Spieler §6" + args[0] + "§c ist nicht online");
                } else
                    p.sendMessage(Main.pre + "§cBitte benutze §6/heal <Spieler>§c!");
                   
            } else
                p.sendMessage(Main.err);
        }else
            sender.sendMessage(Main.pre + "§cDiesen Command darf nur ein Spieler benutzen");
       
       
        return false;
    }
 
}