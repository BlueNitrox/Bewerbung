package de.Tommunity.Enchant;

import java.util.Random;

import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Rauch implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@EventHandler
	public void onHit(c e) {
		Entity d = e.getDamager();
		Entity k = e.getEntity();
		if(e.isCancelled()) {
			return;
		}
		if (k instanceof Zombie) {
			return;
		} else if ((d instanceof Spider)) {
			return;
		} else if (!(d instanceof Player)) {
			return;
		} else if (!(k instanceof Player)) {
			return;
		}
		Player p = (Player) d;
		Player p1 = (Player) k;
		if (p.getItemInHand().getItemMeta().getLore().contains("§c§lRauch I")) {

			Random r = new Random();
			int z = r.nextInt(19);

			switch (z) {
				case 1:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				case 13:
					break;
				case 14:
					break;
				case 15:
					break;
				case 16:
					break;
				case 17:
					break;
				case 18:
					break;
				case 19:
					break;
			}

		}
		if (p.getItemInHand().getItemMeta().getLore().contains("§c§lRauch II")) {

			Random r = new Random();
			int z = r.nextInt(19);

			switch (z) {
				case 1:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 2:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				case 13:
					break;
				case 14:
					break;
				case 15:
					break;
				case 16:
					break;
				case 17:
					break;
				case 18:
					break;
				case 19:
					break;
			}

		}
		if (p.getItemInHand().getItemMeta().getLore().contains("§c§lRauch III")) {

			Random r = new Random();
			int z = r.nextInt(19);

			switch (z) {
				case 1:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 2:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 3:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				case 13:
					break;
				case 14:
					break;
				case 15:
					break;
				case 16:
					break;
				case 17:
					break;
				case 18:
					break;
				case 19:
					break;
			}

		}
		if (p.getItemInHand().getItemMeta().getLore().contains("§c§lRauch IV")) {

			Random r = new Random();
			int z = r.nextInt(19);

			switch (z) {
				case 1:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 2:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 3:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 4:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				case 13:
					break;
				case 14:
					break;
				case 15:
					break;
				case 16:
					break;
				case 17:
					break;
				case 18:
					break;
				case 19:
					break;
			}

		}
		if (p.getItemInHand().getItemMeta().getLore().contains("§c§lRauch V")) {

			Random r = new Random();
			int z = r.nextInt(19);

			switch (z) {
				case 1:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 2:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 3:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 4:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 5:
					p1.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3 * 20, 2));
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				case 13:
					break;
				case 14:
					break;
				case 15:
					break;
				case 16:
					break;
				case 17:
					break;
				case 18:
					break;
				case 19:
					break;
			}
		}
	}
}
