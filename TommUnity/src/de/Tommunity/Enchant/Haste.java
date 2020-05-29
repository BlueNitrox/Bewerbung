package de.Tommunity.Enchant;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;

public class Haste implements Listener {

    public static HashMap<Player, Integer> blocks = new HashMap<>();

    @EventHandler
    public void onBreak(final BlockBreakEvent e) {
        Player p = (Player) e.getPlayer();
        if (!e.isCancelled()) {
            if (p.getItemInHand().getItemMeta().getLore().contains("§6§lHaste I")) {
                blocks.put(p, blocks.size() + 1);
                if (blocks.get(p) >= 100) {
                    blocks.clear();
                    p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 5*20, 0));
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                }
            } else if (p.getItemInHand().getItemMeta().getLore().contains("§6§lHaste II")) {
                blocks.put(p, blocks.size() + 1);
                if (blocks.get(p) >= 100) {
                    blocks.clear();
                    p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 5*20, 1));
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                }
            } else if (p.getItemInHand().getItemMeta().getLore().contains("§6§lHaste III")) {
                blocks.put(p, blocks.size() + 1);
                if (blocks.get(p) >= 100) {
                    blocks.clear();
                    p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 5*20, 2));
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
                }
            }
        }
    }

}
