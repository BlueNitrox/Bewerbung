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

public class Spawn implements CommandExecutor{

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu mustt du ein Spieler sein!");
        }

        if(WorldListener.fight.contains(p)){
            p.sendMessage(Main.pre + "§cDas kannst du im Kampf leider nicht machen!");
            return true;
        }

        if(args.length == 0) {

            FileConfiguration config = Main.getPlugin().getConfig();
            World world = Bukkit.getWorld(config.getString("Spawn.World"));
            double x = config.getDouble("Spawn.X");
            double y = config.getDouble("Spawn.Y");
            double z = config.getDouble("Spawn.Z");
            float yaw = (float) config.getDouble("Spawn.Yaw");
            float pitch = (float) config.getDouble("Spawn.Pitch");
            Location location = new Location(world, x, y, z, yaw, pitch);
            p.teleport(location);
            p.setAllowFlight(false);
            p.setFlying(false);
            p.setFlying(false);



            if(Arena.warte.contains(p)) {
                Arena.warte.clear();
            }
            if(Arena.warteno.contains(p)) {
                Arena.warteno.clear();
            }


        } else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/setSpawn§c!");
        }

        return false;
    }

}