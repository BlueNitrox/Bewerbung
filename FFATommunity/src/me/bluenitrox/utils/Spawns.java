package me.bluenitrox.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class Spawns {
    public Spawns() {
    }

    public static void createNavigator() {
        File ordner = new File("plugins//TommUnity");
        File file = new File("plugins//TommUnity//spawn.yml");
        if (!ordner.exists()) {
            ordner.mkdirs();
        }

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException var3) {
                var3.printStackTrace();
            }
        }

        YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        cfg.set("Spawn.X", "null");
        cfg.set("Spawn.Y", "null");
        cfg.set("Spawn.Z", "null");
        cfg.set("Spawn.World", "null");
        cfg.set("Spawn.Yaw", "null");
        cfg.set("Spawn.Pitch", "null");
        cfg.set("high.X", "null");
        cfg.set("high.Y", "null");
        cfg.set("high.Z", "null");
        cfg.set("high.World", "null");
        cfg.set("high.Yaw", "null");
        cfg.set("high.Pitch", "null");
    }

    public static boolean getNavigator() {
        File file = new File("plugins//TommUnity//spawn.yml");
        return file.exists();
    }

    public static void setspawn(Player p) {
        File file = new File("plugins//TommUnity//spawn.yml");
        Location loc = p.getLocation();
        YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        cfg.set("Spawn.X", loc.getX());
        cfg.set("Spawn.Y", loc.getY());
        cfg.set("Spawn.Z", loc.getZ());
        cfg.set("Spawn.World", loc.getWorld().getName());
        cfg.set("Spawn.Yaw", loc.getYaw());
        cfg.set("Spawn.Pitch", loc.getPitch());

        try {
            cfg.save(file);
        } catch (IOException var5) {
            var5.printStackTrace();
        }

    }

    public static void sethigh(Player p) {
        File file = new File("plugins//TommUnity//spawn.yml");
        Location loc = p.getLocation();
        YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        cfg.set("high.X", loc.getX());
        cfg.set("high.Y", loc.getY());
        cfg.set("high.Z", loc.getZ());
        cfg.set("high.World", loc.getWorld().getName());
        cfg.set("high.Yaw", loc.getYaw());
        cfg.set("high.Pitch", loc.getPitch());

        try {
            cfg.save(file);
        } catch (IOException var5) {
            var5.printStackTrace();
        }

    }

    public static Location getSpawn(Player p) {
        File file = new File("plugins//TommUnity//spawn.yml");
        Location loc = p.getLocation();
        YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        loc.setX(cfg.getDouble("Spawn.X"));
        loc.setY(cfg.getDouble("Spawn.Y"));
        loc.setZ(cfg.getDouble("Spawn.Z"));
        loc.setYaw((float)cfg.getDouble("Spawn.Yaw"));
        loc.setPitch((float)cfg.getDouble("Spawn.Pitch"));
        loc.setWorld(Bukkit.getWorld(cfg.getString("Spawn.World")));
        return loc;
    }

    public static Location gethigh(Player p) {
        File file = new File("plugins//BuildFFA//spawn.yml");
        Location loc = p.getLocation();
        YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        loc.setX(cfg.getDouble("high.X"));
        loc.setY(cfg.getDouble("high.Y"));
        loc.setZ(cfg.getDouble("high.Z"));
        loc.setYaw((float)cfg.getDouble("high.Yaw"));
        loc.setPitch((float)cfg.getDouble("high.Pitch"));
        loc.setWorld(Bukkit.getWorld(cfg.getString("high.World")));
        return loc;
    }
}
