package de.Tommunity.Enchant;

import java.util.Random;

import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffectType;


public class Segen implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	@EventHandler
	public void onHit(EntityDamageByEntityEvent e) {
		Entity d = e.getDamager();
		Entity k = e.getEntity();
		if(!(e.isCancelled())) {
			if (!(d instanceof Player)) {
				return;
			}
			if (!(k instanceof Player)) {
				return;
			}
			Player p = (Player) d;
			Player p1 = (Player) k;
			if (p.getItemInHand().getItemMeta().getLore().contains("§c§lSegen I")) {

				Random r = new Random();
				int z = r.nextInt(19);

				switch (z) {
					case 1:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
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
			if (p.getItemInHand().getItemMeta().getLore().contains("§c§lSegen II")) {

				Random r = new Random();
				int z = r.nextInt(19);

				switch (z) {
					case 1:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
						break;
					case 2:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
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
			if (p.getItemInHand().getItemMeta().getLore().contains("§c§lSegen III")) {

				Random r = new Random();
				int z = r.nextInt(19);

				switch (z) {
					case 1:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
						break;
					case 2:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
						break;
					case 3:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
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
			if (p.getItemInHand().getItemMeta().getLore().contains("§c§lSegen IV")) {

				Random r = new Random();
				int z = r.nextInt(19);

				switch (z) {
					case 1:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
						break;
					case 2:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
						break;
					case 3:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
						break;
					case 4:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
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
			if (p.getItemInHand().getItemMeta().getLore().contains("§c§lSegen V")) {

				Random r = new Random();
				int z = r.nextInt(19);

				switch (z) {
					case 1:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
						break;
					case 2:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
						break;
					case 3:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
						break;
					case 4:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
						break;
					case 5:
						p.removePotionEffect(PotionEffectType.BLINDNESS);
						p.removePotionEffect(PotionEffectType.WEAKNESS);
						p.removePotionEffect(PotionEffectType.SLOW);
						p.removePotionEffect(PotionEffectType.CONFUSION);
						p.removePotionEffect(PotionEffectType.WITHER);
						p.removePotionEffect(PotionEffectType.POISON);
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

}
