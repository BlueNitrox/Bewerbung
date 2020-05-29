package me.bluenitrox.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;

public class itemDrag_Listener implements Listener {

    @EventHandler
    public void onDrag(final InventoryDragEvent e){
        Player p = (Player) e.getWhoClicked();
        if(e.getCursor().getType() == Material.CHEST){
            e.setCancelled(true);
        }
    }

}
