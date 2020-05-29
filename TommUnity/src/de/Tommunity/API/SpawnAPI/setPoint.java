package de.Tommunity.API.SpawnAPI;

import de.Tommunity.Main.Main;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

public class setPoint {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    public static void setPoint(String s, Location l) {
        FileConfiguration config = Main.getPlugin().getConfig();
        config.set(s + ".World", l.getWorld().getName());
        config.set(s + ".X", l.getX());
        config.set(s + ".Y", l.getY());
        config.set(s + ".Z", l.getZ());
        config.set(s + ".Yaw", l.getYaw());
        config.set(s + ".Pitch", l.getPitch());
        Main.getPlugin().saveConfig();
    }

}
