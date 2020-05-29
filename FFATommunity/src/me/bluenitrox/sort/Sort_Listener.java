package me.bluenitrox.sort;

import me.bluenitrox.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Sort_Listener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();

        if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR){
            if(e.getPlayer().getInventory().getItemInHand().getItemMeta().getDisplayName().equals("§a§l➜Inventarsortierung")) {
                e.setCancelled(true);
                Inventory inv = Bukkit.createInventory(null, 9, "§7Inventarsortierung");
                p.getInventory().clear();
                if(InventoryManager.checkOrdner(p.getUniqueId())) {
                    Inventory openinv = InventorySort.getBank(p.getUniqueId().toString());

                    for(int i = 0; i < openinv.getSize(); i++) {
                        if(openinv.getItem(i) != null) {
                            ItemStack itemstack = openinv.getItem(i);
                            ItemMeta meta = itemstack.getItemMeta();
                            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', itemstack.getItemMeta().getDisplayName()));
                            itemstack.setItemMeta(meta);
                        }
                    }

                    p.openInventory(openinv);

                } else {
                    p.sendMessage(Main.pre + "§cBitte lege keine Items in dein Inventar.");
                    p.sendMessage(Main.pre + "§4§lDein Inventar wurde nicht gespeichert.");

                    inv.setItem(0, createEnchantedItem(Material.STONE_SWORD, 1, "§6Schwert", Enchantment.DAMAGE_ALL, 1));
                    inv.setItem(1, createEnchantedItem(Material.STICK, 1, "§cKnockBack Stick", Enchantment.KNOCKBACK, 1));
                    inv.setItem(2, createItem(Material.SANDSTONE, 64, "§eBlöcke"));
                    inv.setItem(3, createItem(Material.SANDSTONE, 64, "§eBlöcke"));
                    inv.setItem(4, createItem(Material.SANDSTONE, 64, "§eBlöcke"));
                    inv.setItem(5, createItem(Material.SANDSTONE, 64, "§eBlöcke"));
                    inv.setItem(8, createItem(Material.CHEST, 1, "§1Shop"));
                    InventorySort.saveBank(p.getUniqueId().toString(), inv);

                    for(int i = 0; i < inv.getSize(); i++) {
                        if(inv.getItem(i) != null) {
                            ItemStack itemstack = inv.getItem(i);
                            ItemMeta meta = itemstack.getItemMeta();
                            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', itemstack.getItemMeta().getDisplayName()));
                            itemstack.setItemMeta(meta);
                        }
                    }

                    p.openInventory(inv);
                }
            }
        }
    }

    @EventHandler
    public void onClose(InventoryCloseEvent e) {
        Player p = (Player) e.getPlayer();
        if(e.getInventory().getName().equalsIgnoreCase("§7Inventarsortierung")) {

            Inventory inv = e.getInventory();
            boolean bol = false;

            for(int i = 0; i < p.getInventory().getSize(); i++) {
                if(p.getInventory().getItem(i) != null) {
                    p.sendMessage(Main.pre + "§cBitte lege keine Items in dein Inventar.");
                    p.sendMessage(Main.pre + "§4§lDein Inventar wurde nicht gespeichert.");

                    inv.setItem(0, createEnchantedItem(Material.STONE_SWORD, 1, "§6Schwert", Enchantment.DAMAGE_ALL, 1));
                    inv.setItem(1, createEnchantedItem(Material.STICK, 1, "§cKnockBack Stick", Enchantment.KNOCKBACK, 1));
                    inv.setItem(2, createItem(Material.SANDSTONE, 64, "§eBlöcke"));
                    inv.setItem(3, createItem(Material.SANDSTONE, 64, "§eBlöcke"));
                    inv.setItem(4, createItem(Material.SANDSTONE, 64, "§eBlöcke"));
                    inv.setItem(5, createItem(Material.SANDSTONE, 64, "§eBlöcke"));
                    inv.setItem(8, createItem(Material.CHEST, 1, "§1Shop"));
                    InventorySort.saveBank(p.getUniqueId().toString(), inv);

                    InventorySort.saveBank(p.getUniqueId().toString(), inv);
                    bol = true;
                    return;
                }
            }

            if(bol == true ) {
                return;
            }

            InventorySort.saveBank(p.getUniqueId().toString(), inv);

            p.getInventory().clear();

            Bukkit.getScheduler().runTaskLater(Main.getPlugin(), new Runnable() {

                @Override
                public void run() {

                    p.getInventory().setContents(InventorySort.getBank(p.getUniqueId().toString()).getContents());

                    for(int i = 0; i < p.getInventory().getSize(); i++) {
                        if(p.getInventory().getItem(i) != null) {
                            ItemStack itemstack = p.getInventory().getItem(i);
                            ItemMeta meta = itemstack.getItemMeta();
                            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', itemstack.getItemMeta().getDisplayName()));
                            itemstack.setItemMeta(meta);
                        }
                    }

                    p.updateInventory();


                }
            }, 1);

            p.sendMessage(Main.pre + "§7Du hast dein Inventar §egespeichert");

        }
    }

    public static ItemStack createItem(Material mat, int anzahl, String name) {
        ItemStack i = new ItemStack(mat, anzahl);
        ItemMeta m = i.getItemMeta();
        m.setDisplayName(name);
        i.setItemMeta(m);
        return i;
    }

    public static ItemStack createEnchantedItem(Material mat, int anzahl, String name, Enchantment en, int power) {
        ItemStack i = new ItemStack(mat, anzahl);
        ItemMeta m = i.getItemMeta();
        m.setDisplayName(name);
        m.addEnchant(en, power, true);
        i.setItemMeta(m);
        return i;
    }
//
//	public static void saveInventory(Inventory inv, File file, Player p, String name, boolean override) {
//		if (inv == null || file == null)
//			return;
//		if (file.exists() && override)
//			file.delete();
//		FileConfiguration inventory= YamlConfiguration.loadConfiguration(file);
//		inventory.set("Kits." + p.getUniqueId().toString() + "." + name, null);
//		ItemStack[] contents = inv.getContents();
//		for (int i = 0; i < contents.length; i++) {
//			ItemStack item = contents[i];
//			if (item != null)
//				if (item.getType() != Material.AIR)
//					inventory.set("Kits." + p.getUniqueId().toString() + "." + name + ".Slot." + i, item);
//		}
//		try {
//			inventory.save(file);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static List<ItemStack> getContents(File file, String name, Player p) {
//		ItemStack[] items = new ItemStack[] {};
//		FileConfiguration conf = YamlConfiguration.loadConfiguration(file);
//		if (conf.isSet("Kits." + p.getUniqueId().toString() + "." + name + ".Slot")) {
//			int size = conf.getInt("Kits." + p.getUniqueId().toString() + "." + name + ".Slot", 27);
//			items = new ItemStack[size];
//			for (int i = 0; i < size; i++) {
//				if (conf.contains("Kits." + p.getUniqueId().toString() + "." + name + ".Slot." + i))
//					items[i] = conf.getItemStack("Kits." + p.getUniqueId().toString() + "." + name + ".Slot." + i);
//				else
//					items[i] = new ItemStack(Material.AIR);
//			}
//		}
//		List<ItemStack> kit = new ArrayList<ItemStack>();
//		for (ItemStack i : items) {
//			if (i != null) {
//				kit.add(i);
//			}
//		}
//		kit.removeAll(Collections.singleton(null));
//		return kit;
//	}

}