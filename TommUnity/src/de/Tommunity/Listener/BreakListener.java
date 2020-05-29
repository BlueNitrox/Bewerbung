package de.Tommunity.Listener;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import de.Tommunity.Booster.Xpbooster;
import de.Tommunity.Commands.EXpSystem;
import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import de.Tommunity.Stats.Blöcke;

public class BreakListener implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static HashMap<Integer,Player> inDay = new HashMap<>();
	public static ArrayList<Player> getDay = new ArrayList<>();
	
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		Blöcke b1 = new Blöcke();
		
		inDay.put(1, p);
		if(inDay.containsKey(200000)) {
			if(!(getDay.contains(p))) {
			EconomySystem es = new EconomySystem();
			es.addMoney(p.getUniqueId(), 1000);
			p.sendMessage(Main.pre + "§3Die heutigen Blöcke wurden erreicht deshalb bekommst du 1000");
			getDay.add(p);
			}
		}
//		if(p.getItemInHand().getDurability() >= 30 ) {
//			p.sendMessage(Main.pre + "§c§lACHTUNG DAS ITEM IN DEINER HAND GEHT GLEICH KAPPUT!!!");
//			p.playSound(p.getLocation(), Sound.GHAST_FIREBALL, 10L, 10L);
//		}


		Xpbooster xp = new Xpbooster();

		if (e.getBlock().getType() == Material.STONE) {
			e.setExpToDrop(0);
			EXpSystem Ex = new EXpSystem();
			b1.addbreak(p.getUniqueId(), 1);
			if (Main.getPlugin().getBoostermanager().getAktivboost().stream()
					.anyMatch((b -> b.getName().contains(xp.getName())))) {
				Ex.addEXP(p.getUniqueId(), 2);

			} else
				Ex.addEXP(p.getUniqueId(), 1);
		}
		if (e.getBlock().getType() == Material.ENDER_STONE) {
			e.setExpToDrop(0);
			EXpSystem Ex = new EXpSystem();
			b1.addbreak(p.getUniqueId(), 1);
			if (Main.getPlugin().getBoostermanager().getAktivboost().stream()
					.anyMatch((b -> b.getName().contains(xp.getName())))) {
				Ex.addEXP(p.getUniqueId(), 2);

			} else
				Ex.addEXP(p.getUniqueId(), 1);
		}
		if (e.getBlock().getType() == Material.WOOD) {
			e.setExpToDrop(0);
			EXpSystem Ex = new EXpSystem();
			b1.addbreak(p.getUniqueId(), 1);
			if (Main.getPlugin().getBoostermanager().getAktivboost().stream()
					.anyMatch((b -> b.getName().contains(xp.getName())))) {
				Ex.addEXP(p.getUniqueId(), 2);

			} else
				Ex.addEXP(p.getUniqueId(), 1);
		}
		if (e.getBlock().getType() == Material.NETHER_BRICK) {
			e.setExpToDrop(0);
			EXpSystem Ex = new EXpSystem();
			b1.addbreak(p.getUniqueId(), 1);
			if (Main.getPlugin().getBoostermanager().getAktivboost().stream()
					.anyMatch((b -> b.getName().contains(xp.getName())))) {
				Ex.addEXP(p.getUniqueId(), 2);

			} else
				Ex.addEXP(p.getUniqueId(), 1);
		}
		if (e.getBlock().getType() == Material.QUARTZ_ORE) {
			e.setExpToDrop(0);
			EXpSystem Ex = new EXpSystem();
			b1.addbreak(p.getUniqueId(), 1);
			if (Main.getPlugin().getBoostermanager().getAktivboost().stream()
					.anyMatch((b -> b.getName().contains(xp.getName())))) {
				Ex.addEXP(p.getUniqueId(), 2);

			} else
				Ex.addEXP(p.getUniqueId(), 1);
		}
		if (e.getBlock().getType() == Material.COAL_ORE) {
			e.setExpToDrop(0);
			EXpSystem Ex = new EXpSystem();
			b1.addbreak(p.getUniqueId(), 1);
			if (Main.getPlugin().getBoostermanager().getAktivboost().stream()
					.anyMatch((b -> b.getName().contains(xp.getName())))) {
				Ex.addEXP(p.getUniqueId(), 2);

			} else
				Ex.addEXP(p.getUniqueId(), 1);
		}
		if (e.getBlock().getType() == Material.IRON_ORE) {
			e.setExpToDrop(0);
			EXpSystem Ex = new EXpSystem();
			b1.addbreak(p.getUniqueId(), 1);
			if (Main.getPlugin().getBoostermanager().getAktivboost().stream()
					.anyMatch((b -> b.getName().contains(xp.getName())))) {
				Ex.addEXP(p.getUniqueId(), 2);

			} else
				Ex.addEXP(p.getUniqueId(), 1);
		}
		if (e.getBlock().getType() == Material.GOLD_ORE) {
			e.setExpToDrop(0);
			EXpSystem Ex = new EXpSystem();
			b1.addbreak(p.getUniqueId(), 1);
			if (Main.getPlugin().getBoostermanager().getAktivboost().stream()
					.anyMatch((b -> b.getName().contains(xp.getName())))) {
				Ex.addEXP(p.getUniqueId(), 2);

			} else
				Ex.addEXP(p.getUniqueId(), 1);
		}
		if (e.getBlock().getType() == Material.DIAMOND_ORE) {
			e.setExpToDrop(0);
			EXpSystem Ex = new EXpSystem();
			b1.addbreak(p.getUniqueId(), 1);
			if (Main.getPlugin().getBoostermanager().getAktivboost().stream()
					.anyMatch((b -> b.getName().contains(xp.getName())))) {
				Ex.addEXP(p.getUniqueId(), 2);

			} else
				Ex.addEXP(p.getUniqueId(), 1);
		}
		if (e.getBlock().getType() == Material.EMERALD_ORE) {
			e.setExpToDrop(0);
			EXpSystem Ex = new EXpSystem();
			b1.addbreak(p.getUniqueId(), 1);
			if (Main.getPlugin().getBoostermanager().getAktivboost().stream()
					.anyMatch((b -> b.getName().contains(xp.getName())))) {
				Ex.addEXP(p.getUniqueId(), 2);

			} else
				Ex.addEXP(p.getUniqueId(), 1);
		}

	}

	@EventHandler
	private int getLevel(String s) {
		String number = s.split(" ")[1];
		if (number.contains("I")) {
			return 1;
		} else if (number.contains("II")) {
			return 2;
		} else if (number.contains("III")) {
			return 3;
		} else if (number.contains("IV")) {
			return 4;
		} else if (number.contains("V")) {
			return 5;
		} else {
			return 0;
		}
	}
}