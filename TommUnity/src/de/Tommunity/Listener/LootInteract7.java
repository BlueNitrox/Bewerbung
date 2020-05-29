package de.Tommunity.Listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;

public class LootInteract7 implements Listener{

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
		if(!(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK))return;
		if(!(e.getItem().getItemMeta().getDisplayName().equals("§61.000 Dollar für alle")))return;
		e.setCancelled(true);
		ItemStack i = p.getItemInHand();
		
        if(i.getAmount() > 1) {
	        p.getItemInHand().setAmount(i.getAmount() -1);
	    }else if(i.getAmount() == 1) {
	    	ItemStack air = new ItemStack(Material.AIR);
	    	p.setItemInHand(air);
	    }
        
        for (Player all : Bukkit.getOnlinePlayers()) {
			all.sendMessage(Main.pre + "§6" + p.getName()
			+ " §ahat aus der §dMaster-Chest §e1.000$ §afür alle gewonnen");
			EconomySystem es = new EconomySystem();
			es.addMoney(all.getUniqueId(), 1000);
		}
    }
}
