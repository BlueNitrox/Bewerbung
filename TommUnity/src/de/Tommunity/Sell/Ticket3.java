package de.Tommunity.Sell;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;

public class Ticket3 implements Listener {

	
	
	
	
	@EventHandler
	public void OnRightClick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(!(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK))return;
		if(!(e.getItem().getItemMeta().getDisplayName().equals("§a1500$")))return;
		EconomySystem es = new EconomySystem();
				
		ItemStack i = p.getItemInHand();
	    
	    if(i.getAmount() > 1) {
	        p.getItemInHand().setAmount(i.getAmount() -1);
	    }else if(i.getAmount() == 1) {
	    	ItemStack air = new ItemStack(Material.AIR);
	    	p.setItemInHand(air);
	    }
				e.getPlayer().sendMessage(Main.pre + "§3Du hast §a1500$ §3bekommen!");
				e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.LEVEL_UP, 1, 1);
				es.addMoney(e.getPlayer().getUniqueId(), 1500);
	
	
	
	
	}
}
