package de.Tommunity.Commands;
 
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
 
public class setBuildMap implements CommandExecutor{

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
            config.set("Build.World", p.getWorld().getName());
            config.set("Build.X", p.getLocation().getX());
            config.set("Build.Y", p.getLocation().getY());
            config.set("Build.Z", p.getLocation().getZ());
            config.set("Build.Yaw", p.getLocation().getYaw());
            config.set("Build.Pitch", p.getLocation().getPitch());
            Main.getPlugin().saveConfig();
            p.sendMessage(Main.pre + "§3Du hast den BuildSpawn gesetzt!");
        }
        else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/setbuildspawn§c!");
        }
   
        return false;
       
    }
}