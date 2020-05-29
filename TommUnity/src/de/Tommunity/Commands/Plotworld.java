package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.Tommunity.Listener.WorldListener;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.Arena;

public class Plotworld implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu mustt du ein Spieler sein!");
        }
            Player p = (Player) sender;

        if(WorldListener.fight.contains(p)){
            p.sendMessage(Main.pre + "§cDas kannst du im Kampf leider nicht machen!");
            return true;
        }

            if(args.length == 0) {
            	

                FileConfiguration config = Main.getPlugin().getConfig();
                World world = Bukkit.getWorld(config.getString("Plotworld.World"));
                double x = config.getDouble("Plotworld.X");
                double y = config.getDouble("Plotworld.Y");
                double z = config.getDouble("Plotworld.Z");
                float yaw = (float) config.getDouble("Plotworld.Yaw");
                float pitch = (float) config.getDouble("Plotworld.Pitch");
                Location location = new Location(world, x, y, z, yaw, pitch);
                p.teleport(location);

                if(Arena.warte.contains(p)) {
                	Arena.warte.clear();
                }
                if(Arena.warteno.contains(p)) {
                	Arena.warteno.clear();
                }
                
            } else {
                p.sendMessage(Main.pre + "§cBitte benutze §6/plotworld§c!");
            }

        return false;
    }

}