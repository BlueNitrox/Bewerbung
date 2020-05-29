package de.Tommunity.Enchant;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;

import de.Tommunity.Commands.EXpSystem;
import de.Tommunity.Main.Main;

public class Level1 implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static ArrayList<Player> Level = new ArrayList<>();

	@EventHandler
	public void onLevel(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (e.getPlayer().getInventory().getItemInHand().getItemMeta().getLore().contains("§6§lLevel I")) {
				EXpSystem ex = new EXpSystem();
				if (!(Level.contains(p))) {
					Level.add(p);
					new BukkitRunnable() {
						@Override
						public void run() {
							ex.addEXP(p.getUniqueId(), 20);
							Level.remove(p);
						}
					}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
				}
			} else if (e.getPlayer().getInventory().getItemInHand().getItemMeta().getLore().contains("§6§lLevel II")) {
				EXpSystem ex = new EXpSystem();
				if (!(Level.contains(p))) {
					Level.add(p);
					new BukkitRunnable() {
						@Override
						public void run() {
							ex.addEXP(p.getUniqueId(), 40);
							Level.remove(p);
						}
					}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
				}
			} else if (e.getPlayer().getInventory().getItemInHand().getItemMeta().getLore().contains("§6§lLevel III")) {
				EXpSystem ex = new EXpSystem();
				if (!(Level.contains(p))) {
					Level.add(p);
					new BukkitRunnable() {
						@Override
						public void run() {
							ex.addEXP(p.getUniqueId(), 60);
							Level.remove(p);
						}
					}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
				}
			} else if (e.getPlayer().getInventory().getItemInHand().getItemMeta().getLore().contains("§6§lLevel IV")) {
				EXpSystem ex = new EXpSystem();
				if (!(Level.contains(p))) {
					Level.add(p);
					new BukkitRunnable() {
						@Override
						public void run() {
							ex.addEXP(p.getUniqueId(), 80);
							Level.remove(p);
						}
					}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
				}
			} else if (e.getPlayer().getInventory().getItemInHand().getItemMeta().getLore().contains("§6§lLevel V")) {
				EXpSystem ex = new EXpSystem();
				if (!(Level.contains(p))) {
					Level.add(p);
					new BukkitRunnable() {
						@Override
						public void run() {
							ex.addEXP(p.getUniqueId(), 120);
							Level.remove(p);
						}
					}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
				}
			}
		}
	}

	/*
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		Player p = (Player) e.getPlayer();
		EXpSystem ex = new EXpSystem();
		
		if (p.getInventory().getItemInHand().getItemMeta().getLore().contains("§6§lLevel I")) {

			Random r = new Random();
			int z = r.nextInt(5);

			switch (z) {
			case 1:
				ex.addEXP(p.getUniqueId(), 1);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
		} else if (p.getInventory().getItemInHand().getItemMeta().getLore().contains("§6§lLevel II")) {

		} else if (p.getInventory().getItemInHand().getItemMeta().getLore().contains("§6§lLevel III")) {

		} else if (p.getInventory().getItemInHand().getItemMeta().getLore().contains("§6§lLevel IV")) {

		} else if (p.getInventory().getItemInHand().getItemMeta().getLore().contains("§6§lLevel V")) {

		}
	}
	*/

}
