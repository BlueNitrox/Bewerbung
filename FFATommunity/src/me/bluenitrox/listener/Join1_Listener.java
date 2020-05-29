package me.bluenitrox.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class Join1_Listener implements Listener {


    @EventHandler
    public void onJoin4(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();

        ItemStack is = new ItemStack(Material.CHEST);
        ItemMeta im = is.getItemMeta();
        im.setDisplayName("§9Shop");
        im.setLore(Arrays.asList("§7Clicke auf die Kiste um den §6/ffashop §7zu öffnen!"));
        is.setItemMeta(im);

        p.getInventory().setItem(31, is);
    }

}
