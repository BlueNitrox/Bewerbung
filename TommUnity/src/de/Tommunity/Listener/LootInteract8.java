package de.Tommunity.Listener;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Commands.TokenSystem;
import de.Tommunity.Main.Main;

public class LootInteract8 implements Listener{

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if(!(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK))return;
        if(!(e.getItem().getItemMeta().getDisplayName().equals("§a1Token")))return;
        e.setCancelled(true);
        ItemStack i = p.getItemInHand();

        if(i.getAmount() > 1) {
            p.getItemInHand().setAmount(i.getAmount() -1);
        }else if(i.getAmount() == 1) {
            ItemStack air = new ItemStack(Material.AIR);
            p.setItemInHand(air);
        }

            TokenSystem t = new TokenSystem();
            t.addToken(p.getUniqueId(), 1);
            p.sendMessage(Main.pre + "§3Du hast 1 Token bekommen!");
            p.playSound(p.getLocation(), Sound.LEVEL_UP ,1L ,1L);
    }
}
