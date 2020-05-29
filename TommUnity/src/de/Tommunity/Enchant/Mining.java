package de.Tommunity.Enchant;

import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class Mining implements Listener {

    public static HashMap<Player, Integer> blocks100 = new HashMap<>();

    @EventHandler
    public void onBreak(final BlockBreakEvent e) {
        Player p = (Player) e.getPlayer();
        if (!e.isCancelled()) {
            if (p.getItemInHand().getItemMeta().getLore().contains("§6§lMining I")) {
                blocks100.put(p, blocks100.size() + 1);
                if (blocks100.get(p) >= 20) {
                    blocks100.clear();
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);

                    Block b = e.getBlock();
                    ItemStack drops = (ItemStack) b.getDrops();
                    p.getInventory().addItem(drops);
                }
            } else if (p.getItemInHand().getItemMeta().getLore().contains("§6§lMining II")) {
                blocks100.put(p, blocks100.size() + 1);
                if (blocks100.get(p) >= 20) {
                    blocks100.clear();
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);

                    Block b = e.getBlock();
                    ItemStack drops = (ItemStack) b.getDrops();
                    p.getInventory().addItem(drops);
                    p.getInventory().addItem(drops);
                }
            } else if (p.getItemInHand().getItemMeta().getLore().contains("§6§lMining III")) {
                blocks100.put(p, blocks100.size() + 1);
                if (blocks100.get(p) >= 20) {
                    blocks100.clear();
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);

                    Block b = e.getBlock();
                    ItemStack drops = (ItemStack) b.getDrops();
                    p.getInventory().addItem(drops);
                    p.getInventory().addItem(drops);
                    p.getInventory().addItem(drops);
                }
            } else if (p.getItemInHand().getItemMeta().getLore().contains("§6§lMining IV")) {
                blocks100.put(p, blocks100.size() + 1);
                if (blocks100.get(p) >= 20) {
                    blocks100.clear();
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);

                    Block b = e.getBlock();
                    ItemStack drops = (ItemStack) b.getDrops();
                    p.getInventory().addItem(drops);
                    p.getInventory().addItem(drops);
                    p.getInventory().addItem(drops);
                    p.getInventory().addItem(drops);
                }
            } else if (p.getItemInHand().getItemMeta().getLore().contains("§6§lMining V")) {
                blocks100.put(p, blocks100.size() + 1);
                if (blocks100.get(p) >= 20) {
                    blocks100.clear();
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);

                    Block b = e.getBlock();
                    ItemStack drops = (ItemStack) b.getDrops();
                    p.getInventory().addItem(drops);
                    p.getInventory().addItem(drops);
                    p.getInventory().addItem(drops);
                    p.getInventory().addItem(drops);
                    p.getInventory().addItem(drops);
                }
            }
        }
    }
}
