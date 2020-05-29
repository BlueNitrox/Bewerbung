package de.Tommunity.Listener;

import java.util.ArrayList;

import com.connorlinfoot.actionbarapi.ActionBarAPI;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.*;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.scheduler.BukkitRunnable;


import de.Tommunity.Booster.Flybooster;
import de.Tommunity.Main.Main;

public class WorldListener implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static ArrayList<Player> fight = new ArrayList<>();
	public static ArrayList<Player> getkicked = new ArrayList<>();

	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
	public void onHit(final EntityDamageByEntityEvent e) {
		Player p = (Player) e.getEntity();
		Player t = (Player) e.getDamager();
		if (e.isCancelled()) {
			return;
		}else if (p instanceof Player) {
			if(!(p.getWorld().getName().equals("Arena"))) {
				if (!(fight.contains(p)) || !(fight.contains(t))) {
					fight.add(p);
					fight.add(t);
					p.sendMessage(Main.pre + "§cDu bist nun im Kampf! Logge dich nicht aus!");
					t.sendMessage(Main.pre + "§cDu bist nun im Kampf! Logge dich nicht aus!");
					p.playSound(p.getLocation(), Sound.NOTE_PLING, 1L, 1L);
					t.playSound(p.getLocation(), Sound.NOTE_PLING, 1L, 1L);
					new BukkitRunnable() {
						@Override
						public void run() {
							fight.remove(p);
							fight.remove(t);
							p.sendMessage(Main.pre + "§aDu bist nun nicht mehr im Kampf!");
							t.sendMessage(Main.pre + "§aDu bist nun nicht mehr im Kampf!");
						}
					}.runTaskLater(Main.getPlugin(), 20 * 16);
				}
			}
		}
	}


	@EventHandler
	public void onChange(WeatherChangeEvent e) {
		e.setCancelled(true);
	}

	@EventHandler
	public void onWorld(PlayerChangedWorldEvent e) {
		Player p = e.getPlayer();

		if(!(fight.contains(p))){
		if (p.getWorld().getName().equals("world")) {
			p.setAllowFlight(false);
			p.setFlying(false);
		} else if (p.getWorld().getName().equals("plotworld")) {
			p.setAllowFlight(false);
			p.setFlying(false);
		} else if (p.getWorld().getName().equals("test")) {
			p.setAllowFlight(false);
			p.setFlying(false);
		} else if (p.getWorld().getName().equals("PlotWelt")) {
			Flybooster fb = new Flybooster();
			if (Main.getPlugin().getBoostermanager().getAktivboost().stream()
					.anyMatch((b -> b.getName().equals(fb.getName())))) {
				p.setAllowFlight(true);
				p.setFlying(true);
				p.sendMessage(Main.pre + "§aDu kannst nun fliegen, da ein §d§lFly-Booster §aaktiv ist");
			}
		}


		if(p.getWorld().getName().equals("world")) {
			Bukkit.getServer().getWorld("world").setTime(0);
		}
		if(p.getWorld().getName().equals("mob")) {
			Bukkit.getServer().getWorld("mob").setTime(15000);
		}
		if(p.getWorld().getName().equals("PlotWelt")) {
			Bukkit.getServer().getWorld("PlotWelt").setTime(0);
		}

		}else {
			p.setHealth(0);
			p.sendMessage(Main.pre + "§cDu wurdest gekillt da du im Kampf warst!");
		}



		if(p.hasPermission("Tom.Fly.Fly")){
			p.setAllowFlight(true);
			p.setFlying(true);
		}

	}

	@EventHandler
	public void onitemdrop(PlayerDropItemEvent e){
		Player p = (Player)e.getPlayer();
		if(p.getWorld().getName().equals("mob")){
			e.setCancelled(true);
		}
	}


	@EventHandler
	public void onKick(PlayerKickEvent e){
		Player p = (Player)e.getPlayer();
		if(fight.contains(p)){
			getkicked.add(p);
			return;
		}
	}

	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		Player p = (Player)e.getPlayer();

		if(!(getkicked.contains(p))) {
			if (fight.contains(p)) {
				p.damage(100);
				fight.remove(p);
			}
		}
	}

	@EventHandler
	public void onSneak(PlayerMoveEvent e) {
		Player p = (Player) e.getPlayer();
		if (fight.contains(p)) {
			 ActionBarAPI.sendActionBar(p, "§7§l» §bDu bist im §c§lKampf§b!", 14*20);
			new BukkitRunnable() {
				@Override
				public void run() {
					return;
				}
			}.runTaskLater(Main.getPlugin(), 20 * 15);
		}
	}

	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
			if(e.getClickedBlock().getType() == Material.ENCHANTMENT_TABLE){
				e.getPlayer().closeInventory();
				e.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onFly(final PlayerMoveEvent e){
		Player p = (Player)e.getPlayer();
		if(p.getWorld().getName().equals("world")){
			if(p.isFlying()){
				if(!p.hasPermission("Tom.*") || !p.hasPermission("Tom.Spec")) {
					p.setAllowFlight(false);
					p.setFlying(false);
				}
			}
		}
	}

}
