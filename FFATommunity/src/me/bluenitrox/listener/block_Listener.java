package me.bluenitrox.listener;

import me.bluenitrox.main.Main;
import me.bluenitrox.utils.Spawns;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class block_Listener implements Listener {

    @EventHandler
    public void onbreak(final BlockBreakEvent e){
        if(Main.build.contains(e.getPlayer())){

        }else {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onPlace(final BlockPlaceEvent e) {
        boolean cancled = true;
        if (Main.build.contains(e.getPlayer())) {
            cancled = false;
            e.setCancelled(cancled);
        }
        if (!Main.build.contains(e.getPlayer()) && e.getBlockPlaced().getType() == Material.SANDSTONE || e.getBlockPlaced().getType() == Material.WEB) {
            new BukkitRunnable() {
                public void run() {
                    if (e.getBlockPlaced().getType() == Material.SANDSTONE) {
                        e.getBlockPlaced().setType(Material.RED_SANDSTONE);
                    }else if (e.getBlockPlaced().getType() == Material.RED_SANDSTONE) {
                        e.getBlockPlaced().setType(Material.AIR);
                        this.cancel();
                    }else if(e.getBlockPlaced().getType() == Material.WEB){
                        e.getBlockPlaced().setType(Material.AIR);
                    }
                }
            }.runTaskTimer((Plugin)Main.getPlugin((Class)Main.class), 40L, 40L);
        }
    }

}
