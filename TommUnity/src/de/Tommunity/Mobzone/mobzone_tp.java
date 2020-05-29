package de.Tommunity.Mobzone;

import de.Tommunity.Main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class mobzone_tp {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    public static void setZone(String s, Location l) {
        FileConfiguration config = Main.getPlugin().getConfig();
        config.set(s + ".World", l.getWorld().getName());
        config.set(s + ".X", l.getX());
        config.set(s + ".Y", l.getY());
        config.set(s + ".Z", l.getZ());
        config.set(s + ".Yaw", l.getYaw());
        config.set(s + ".Pitch", l.getPitch());
        Main.getPlugin().saveConfig();
    }

    public static void tpZone(String s, Player p) {
        FileConfiguration config = Main.getPlugin().getConfig();
        World world = Bukkit.getWorld(config.getString(s + ".World"));
        double x = config.getDouble(s +".X");
        double y = config.getDouble(s +".Y");
        double z = config.getDouble(s +".Z");
        float yaw = (float) config.getDouble(s +".Yaw");
        float pitch = (float) config.getDouble(s +".Pitch");
        Location location = new Location(world, x, y, z, yaw, pitch);
        p.teleport(location);
    }

}
