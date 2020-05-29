package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class spawn_Command implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if(!(cs instanceof Player)){
            cs.sendMessage(Main.keinP);
            return true;
        }

        if(args.length == 0){
            FileConfiguration config = Main.getPlugin().getConfig();
            World world = Bukkit.getWorld(config.getString("Spawn.World"));
            double x = config.getDouble("Spawn.X");
            double y = config.getDouble("Spawn.Y");
            double z = config.getDouble("Spawn.Z");
            float yaw = (float) config.getDouble("Spawn.Yaw");
            float pitch = (float) config.getDouble("Spawn.Pitch");
            Location location = new Location(world, x, y, z, yaw, pitch);
            p.teleport(location);
        }else {
            p.sendMessage(Main.pre +"§cBenutze: §6/spawn§c!");
        }
        return false;
    }
}
