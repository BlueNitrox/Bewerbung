package de.Tommunity.Listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Booster.BoosterAPI;
import de.Tommunity.Main.Main;

public class LootInteract2 implements Listener{

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
		if(!(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK))return;
		if(!(e.getItem().getItemMeta().getDisplayName().equals("§51x Xp-Booster")))return;
		e.setCancelled(true);
		ItemStack i = p.getItemInHand();
		
        if(i.getAmount() > 1) {
	        p.getItemInHand().setAmount(i.getAmount() -1);
	    }else if(i.getAmount() == 1) {
	    	ItemStack air = new ItemStack(Material.AIR);
	    	p.setItemInHand(air);
	    }
        
		BoosterAPI ba = new BoosterAPI();
		ba.addXpBooster(p.getUniqueId(), 1);
		p.sendMessage(Main.pre + "§aDu hast §51x XP-Booster §agewonnen" );
		
    }
}
