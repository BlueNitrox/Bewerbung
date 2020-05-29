package de.Tommunity.Commands;
 
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
 
public class Setspawn implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;
        if(!p.hasPermission("Tom.setspawn")) {
            p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
        }
        else if(args.length == 0) {
           
            FileConfiguration config = Main.getPlugin().getConfig();
            config.set("Spawn.World", p.getWorld().getName());
            config.set("Spawn.X", p.getLocation().getX());
            config.set("Spawn.Y", p.getLocation().getY());
            config.set("Spawn.Z", p.getLocation().getZ());
            config.set("Spawn.Yaw", p.getLocation().getYaw());
            config.set("Spawn.Pitch", p.getLocation().getPitch());
            Main.getPlugin().saveConfig();
            p.sendMessage(Main.pre + "§3Du hast einen neuen Spawn gesetzt!");
        }
        else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/setspawn§c!");
        }
   
        return false;
       
    }
 
}