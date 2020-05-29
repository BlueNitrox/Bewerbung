package de.Tommunity.Listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import de.Tommunity.Commands.Build;
import de.Tommunity.Utils.ItemManager;


public class RespawnListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        Player p = e.getEntity();
        e.setDeathMessage(null);
        if(p.hasPermission("Tom.more")){
            p.getInventory().setItem(1, ItemManager.createItem(Material.SLIME_BALL, 1, 0, "§cSpieler verstecken"));
            p.getInventory().setItem(4,ItemManager.createItem(Material.WATCH, 1, 0, "§cNavigator"));
            p.getInventory().setItem(5, ItemManager.createItem(Material.TNT,1, 0, "§cSilentLobby"));
            p.getInventory().setItem(7,ItemManager.createItem(Material.ENDER_CHEST, 1, 0, "§cExtras"));
            p.getInventory().setBoots(ItemManager.createItem(Material.DIAMOND_BOOTS,1,0,"§cKeine Boots"));
        } else {
            p.getInventory().setItem(1,ItemManager.createItem(Material.SLIME_BALL, 1, 0, "§cSpieler verstecken"));
            p.getInventory().setItem(4,ItemManager.createItem(Material.WATCH, 1, 0, "§cNavigator"));
            p.getInventory().setItem(7,ItemManager.createItem(Material.ENDER_CHEST, 1, 0, "§cExtras"));
            p.getInventory().setBoots(ItemManager.createItem(Material.DIAMOND_BOOTS,1,0,"§cKeine Boots"));
        }
        Build.build.remove(p);
        e.setKeepInventory(true);
    }

}
