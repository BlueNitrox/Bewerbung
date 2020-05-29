package de.Tommunity.API.SpawnAPI;

import de.Tommunity.Main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class getPoint {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    public static void getPoint(String s) {
        FileConfiguration config = Main.getPlugin().getConfig();
        World world = Bukkit.getWorld(config.getString(s + ".World"));
        double x = config.getDouble(s +".X");
        double y = config.getDouble(s +".Y");
        double z = config.getDouble(s +".Z");
        float yaw = (float) config.getDouble(s +".Yaw");
        float pitch = (float) config.getDouble(s +".Pitch");
        Location location = new Location(world, x, y, z, yaw, pitch);
    }

}
