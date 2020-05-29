package de.Tommunity.Commands;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class EnderChest implements CommandExecutor {

	public static ArrayList<UUID> enderchest = new ArrayList<UUID>();

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if(!(sender instanceof Player)) {
                sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
                return true;
            }
                Player p = (Player) sender;
               
                if(!p.hasPermission("Tom.Ec")) {
                    p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
                }
             else if(args.length == 0) {
            	 if(BuildMap.BuildMap1 >= 10) {
            		 if(PermissionsEx.getUser(p).inGroup("Builder") || PermissionsEx.getUser(p).inGroup("Supporter") || PermissionsEx.getUser(p).inGroup("Moderator")) {
                        return true;
            		 }
            	 }  
                 p.openInventory(p.getEnderChest());
                 p.sendMessage(Main.pre + "§3Deine Enderchest wurde geöffnet!");
                    
             }
                    else if(args.length == 1) {
                        if(!p.hasPermission("Tom.Ec.other")) {
                            p.sendMessage(Main.pre + "§cDazu hast du kiene Rechte!");
                            return true;
                        }
                        Player target = Bukkit.getPlayer(args[0]);
                        if(target == null ) {
                            p.sendMessage(Main.pre + "§cDieser Spieler ist nicht online!");
                            return true;
                        }
                        p.openInventory(target.getEnderChest());
                        p.sendMessage(Main.pre + "§3Du schaust nun in die Enderchest von " + target.getName() +".");
                        enderchest.contains(p.getUniqueId());
                   
                   
                    }else {
                        p.sendMessage(Main.pre + "§cBitte Benutze §6/" + label + " <Spieler>§c");   
                }
                    return false;
            }

}