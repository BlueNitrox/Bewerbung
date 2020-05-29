package de.Tommunity.Listener;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Booster.Xpbooster;
import de.Tommunity.Commands.EXpSystem;
import de.Tommunity.Main.Main;

public class Interact_XP implements Listener{

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Xpbooster xp = new Xpbooster();
		if(!(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK))return;
		if(!(e.getItem().getItemMeta().getDisplayName().equals("§6§l2000 Tommunity XP")))return;
		e.setCancelled(true);
		ItemStack i = p.getItemInHand();
		
        if(i.getAmount() > 1) {
	        p.getItemInHand().setAmount(i.getAmount() -1);
	    }else if(i.getAmount() == 1) {
	    	ItemStack air = new ItemStack(Material.AIR);
	    	p.setItemInHand(air);
	    }
        
        if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(xp.getName())))) {
        EXpSystem ex = new EXpSystem();
        ex.addEXP(p.getUniqueId(), 2000);
        p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
        p.sendMessage(Main.pre + "§3Du hast §62000 EXP §3bekommen!");
        }else {
            EXpSystem ex = new EXpSystem();
            ex.addEXP(p.getUniqueId(), 4000);
            p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
            p.sendMessage(Main.pre + "§dXP-Booster -> §3Du hast §64000 EXP §3bekommen!");
        }
    }
}
