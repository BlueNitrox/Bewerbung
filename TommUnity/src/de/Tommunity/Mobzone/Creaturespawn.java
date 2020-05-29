package de.Tommunity.Mobzone;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.ItemSpawnEvent;

public class Creaturespawn implements Listener {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @EventHandler
    public void onSpawn(final CreatureSpawnEvent e){
        if(e.getEntity().getWorld().getName().equals("mob")) {
            if (e.getEntity() instanceof Zombie) {
                return;
            } else if (e.getEntity() instanceof Spider) {
                return;
            } else {
                e.setCancelled(true);
            }
        }else if(e.getEntity().getWorld().getName().equals("Arena")) {
                e.setCancelled(true);
        }else if(e.getEntity().getWorld().getName().equals("Arena1")) {
                e.setCancelled(true);
            }
    }

    @SuppressWarnings("unlikely-arg-type")
	@EventHandler
    public void onKill(final ItemSpawnEvent e){
        if(e.getEntity().getType().equals(Material.BONE)){
            e.getEntity().remove();
        }else if(e.getEntity().getType().equals(EntityType.ARROW)){
            e.getEntity().remove();
        }else if(e.getEntity().getType().equals(Material.BOW)){
            e.getEntity().remove();
        }
    }

}
