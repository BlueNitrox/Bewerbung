package de.Tommunity.Commands;
 
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
 
import de.Tommunity.Main.Main;
 
public class setFFA implements CommandExecutor {
 
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
            config.set("FFA.World", p.getWorld().getName());
            config.set("FFA.X", p.getLocation().getX());
            config.set("FFA.Y", p.getLocation().getY());
            config.set("FFA.Z", p.getLocation().getZ());
            config.set("FFA.Yaw", p.getLocation().getYaw());
            config.set("FFA.Pitch", p.getLocation().getPitch());
            Main.getPlugin().saveConfig();
            p.sendMessage(Main.pre + "§3Du hast einen neuen FFA Spawn gesetzt!");
        }
        else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/setspawn§c!");
        }
   
        return false;
       
    }
 
}