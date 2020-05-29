package de.Tommunity.Listener;

import de.Tommunity.Main.Main;
import de.Tommunity.Utils.Scoremanager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Join implements Listener {

    @EventHandler
    public void onJoin(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        FileConfiguration config2 = Main.getPlugin().getConfig();
        World world2 = Bukkit.getWorld(config2.getString("Spawn1.World"));
        double x2 = config2.getDouble("Spawn1.X");
        double y2 = config2.getDouble("Spawn1.Y");
        double z2 = config2.getDouble("Spawn1.Z");
        float yaw2 = (float) config2.getDouble("Spawn1.Yaw");
        float pitch2 = (float) config2.getDouble("Spawn1.Pitch");
        Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
        p.teleport(location2);
        p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 2);

        p.setLevel(2020);
    }

    @EventHandler
    public void Join(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        Scoremanager.sendTabAndScoreboard(p);
        if(p.hasPermission("Tom.more")){
            InventoryListener.sprung.add(p);
        }
    }

    @EventHandler
    public void onQuit(final PlayerQuitEvent e){
        Player p = (Player)e.getPlayer();
        if(InventoryListener.sprung.contains(p)){
            InventoryListener.sprung.remove(p);
        }
    }


}
