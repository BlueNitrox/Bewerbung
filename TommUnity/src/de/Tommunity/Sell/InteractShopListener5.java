package de.Tommunity.Sell;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Booster.Moneybooster;
import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;

public class InteractShopListener5 implements Listener {

	
	
	
	
	@EventHandler
	public void OnRightClick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Moneybooster money = new Moneybooster();
		if(!(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK))return;
		if(!(e.getItem().getItemMeta().getDisplayName().equals("§a700$")))return;
		EconomySystem es = new EconomySystem();
				
		ItemStack i = p.getItemInHand();

		if(i.getAmount() > 1 && i.getAmount() <= 63) {
			p.getItemInHand().setAmount(i.getAmount() -1);
		}else if(i.getAmount() == 1) {
			ItemStack air = new ItemStack(Material.AIR);
			p.setItemInHand(air);
		}else if(i.getAmount() == 64){
			ItemStack air = new ItemStack(Material.AIR);
			p.setItemInHand(air);

			if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money.getName())))) {
				e.getPlayer().sendMessage(Main.pre + "§3Du hast §a43000$ §3bekommen!");
				e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.LEVEL_UP, 1, 1);
				es.addMoney(e.getPlayer().getUniqueId(), 43000);
			}else {
				e.getPlayer().sendMessage(Main.pre + "§dMoney-Booster -> §3Du hast §a54000$ §3bekommen!");
				e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.LEVEL_UP, 1, 1);
				es.addMoney(e.getPlayer().getUniqueId(), 54000);
			}

			return;
		}
	    if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money.getName())))) {
	    	e.getPlayer().sendMessage(Main.pre + "§3Du hast §a700$ §3bekommen!");
	    	e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.LEVEL_UP, 1, 1);
	    	es.addMoney(e.getPlayer().getUniqueId(), 700);
	        }else {
	    		e.getPlayer().sendMessage(Main.pre + "§dMoney-Booster -> §3Du hast §a860$ §3bekommen!");
	    		e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.LEVEL_UP, 1, 1);
	    		es.addMoney(e.getPlayer().getUniqueId(), 860);
	
	
	        }
	
	}
}
