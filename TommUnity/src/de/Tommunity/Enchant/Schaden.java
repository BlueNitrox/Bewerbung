package de.Tommunity.Enchant;

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

import java.util.Random;

public class Schaden implements Listener {

    @EventHandler
    public void onHit(EntityDamageByEntityEvent e) {
        Entity d = e.getDamager();
        Entity k = e.getEntity();
        if (!(e.isCancelled())) {
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
            if (p.getItemInHand().getItemMeta().getLore().contains("§c§lSchaden I")) {
                Random r = new Random();
                int z = r.nextInt(19);

                switch (z) {
                    case 1:
                        p1.setHealth(p.getHealth() - 1);
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
            }else if (p.getItemInHand().getItemMeta().getLore().contains("§c§lSchaden II")) {
                Random r = new Random();
                int z = r.nextInt(19);

                switch (z) {
                    case 1:
                        p1.setHealth(p.getHealth() - 1);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                        break;
                    case 2:
                        p1.setHealth(p.getHealth() - 1);
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
            }else if (p.getItemInHand().getItemMeta().getLore().contains("§c§lSchaden III")) {
                Random r = new Random();
                int z = r.nextInt(19);

                switch (z) {
                    case 1:
                        p1.setHealth(p.getHealth() - 1);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                        break;
                    case 2:
                        p1.setHealth(p.getHealth() - 1);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                        break;
                    case 3:
                        p1.setHealth(p.getHealth() - 1);
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
            }else if (p.getItemInHand().getItemMeta().getLore().contains("§c§lSchaden IV")) {
                Random r = new Random();
                int z = r.nextInt(19);

                switch (z) {
                    case 1:
                        p1.setHealth(p.getHealth() - 1);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                        break;
                    case 2:
                        p1.setHealth(p.getHealth() - 1);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                        break;
                    case 3:
                        p1.setHealth(p.getHealth() - 1);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                        break;
                    case 4:
                        p1.setHealth(p.getHealth() - 1);
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
            }else if (p.getItemInHand().getItemMeta().getLore().contains("§c§lSchaden V")) {
                Random r = new Random();
                int z = r.nextInt(19);

                switch (z) {
                    case 1:
                        p1.setHealth(p.getHealth() - 1);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                        break;
                    case 2:
                        p1.setHealth(p.getHealth() - 1);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                        break;
                    case 3:
                        p1.setHealth(p.getHealth() - 1);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                        break;
                    case 4:
                        p1.setHealth(p.getHealth() - 1);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                        break;
                    case 5:
                        p1.setHealth(p.getHealth() - 1);
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
