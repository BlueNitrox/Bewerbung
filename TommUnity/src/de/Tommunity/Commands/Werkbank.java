package de.Tommunity.Commands;
 
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
 
public class Werkbank implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;
       
        if(!p.hasPermission("Tom.wb")) {
            p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
            return false;
        }
        if(args.length == 0) {
            Location loc = p.getLocation();
            p.openWorkbench(loc, true);
        }else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/wb");
        }
       
        return false;
    }
}