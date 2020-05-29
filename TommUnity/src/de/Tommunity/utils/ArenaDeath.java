package de.Tommunity.utils;

import de.Tommunity.Main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ArenaDeath implements Listener {

    @EventHandler
    public void onArena(PlayerDeathEvent e) {
        Player a1 = (Player) e.getEntity().getKiller();
        Player b1 = (Player) e.getEntity();
        if (Arena.Arena1.contains(a1) && Arena.Arena1.contains(b1)) {
            Player k1 = Arena.Arena1.get(0);
            Player d1 = Arena.Arena1.get(1);
            k1.sendMessage(Main.pre + "§3Du hast den Kampf Gewonnen!");
            k1.playSound(k1.getLocation(), Sound.FIREWORK_BLAST, 1L, 1L);
            d1.sendMessage(Main.pre + "§cDu hast leider verloren!");
            d1.playSound(d1.getLocation(), Sound.ANVIL_LAND, 1L, 1L);

            FileConfiguration config = Main.getPlugin().getConfig();
            World world = Bukkit.getWorld(config.getString("Spawn.World"));
            double x = config.getDouble("Spawn.X");
            double y = config.getDouble("Spawn.Y");
            double z = config.getDouble("Spawn.Z");
            float yaw = (float) config.getDouble("Spawn.Yaw");
            float pitch = (float) config.getDouble("Spawn.Pitch");
            Location location = new Location(world, x, y, z, yaw, pitch);
            e.getEntity().spigot().respawn();
            d1.teleport(location);
            k1.teleport(location);
            Arena.Arena1.remove(0);
            Arena.Arena1.remove(0);
            Arena.Arena1.remove(1);
            Arena.Arena1.remove(1);

        } else if (Arena.Arena2.contains(a1) && Arena.Arena2.contains(b1)) {
            Player k1 = Arena.Arena2.get(0);
            Player d1 = Arena.Arena2.get(1);
            k1.sendMessage(Main.pre + "§3Du hast den Kampf Gewonnen!");
            k1.playSound(k1.getLocation(), Sound.FIREWORK_BLAST, 1L, 1L);
            d1.sendMessage(Main.pre + "§cDu hast leider verloren!");
            d1.playSound(d1.getLocation(), Sound.ANVIL_LAND, 1L, 1L);

            FileConfiguration config = Main.getPlugin().getConfig();
            World world = Bukkit.getWorld(config.getString("Spawn.World"));
            double x = config.getDouble("Spawn.X");
            double y = config.getDouble("Spawn.Y");
            double z = config.getDouble("Spawn.Z");
            float yaw = (float) config.getDouble("Spawn.Yaw");
            float pitch = (float) config.getDouble("Spawn.Pitch");
            Location location = new Location(world, x, y, z, yaw, pitch);
            d1.teleport(location);
            k1.teleport(location);
            Arena.Arena2.remove(0);
            Arena.Arena2.remove(0);
            Arena.Arena2.remove(1);
            Arena.Arena2.remove(1);

        } else if (Arena.Arena3.contains(a1) && Arena.Arena3.contains(b1)) {
            Player k1 = Arena.Arena3.get(0);
            Player d1 = Arena.Arena3.get(1);
            k1.sendMessage(Main.pre + "§3Du hast den Kampf Gewonnen!");
            k1.playSound(k1.getLocation(), Sound.FIREWORK_BLAST, 1L, 1L);
            d1.sendMessage(Main.pre + "§cDu hast leider verloren!");
            d1.playSound(d1.getLocation(), Sound.ANVIL_LAND, 1L, 1L);

            FileConfiguration config = Main.getPlugin().getConfig();
            World world = Bukkit.getWorld(config.getString("Spawn.World"));
            double x = config.getDouble("Spawn.X");
            double y = config.getDouble("Spawn.Y");
            double z = config.getDouble("Spawn.Z");
            float yaw = (float) config.getDouble("Spawn.Yaw");
            float pitch = (float) config.getDouble("Spawn.Pitch");
            Location location = new Location(world, x, y, z, yaw, pitch);
            d1.teleport(location);
            k1.teleport(location);
            Arena.Arena3.remove(0);
            Arena.Arena3.remove(0);
            Arena.Arena3.remove(1);
            Arena.Arena3.remove(1);
        }
    }


}
