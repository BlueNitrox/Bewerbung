package de.Tommunity.Listener;

import com.avaje.ebeaninternal.server.util.ArrayStack;
import de.Tommunity.Main.Main;
import de.Tommunity.Utils.ItemManager;
import net.minecraft.server.v1_8_R3.DemoPlayerInteractManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class Interact_Listener2 implements Listener {

    public static String GUI_NAME = "§9Jump and Runds";

    @EventHandler
    public void onInteract(final PlayerInteractEvent e){
        Player p = (Player)e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR){
            if(e.getPlayer().getItemInHand().getType() == Material.SLIME_BLOCK){
                Inventory inv = Bukkit.createInventory(null , 9*1, GUI_NAME);

                ItemStack im = new ItemStack(Material.WOOD);
                ItemMeta im1 = im.getItemMeta();
                im1.setDisplayName("§c1");
                im1.setLore(Arrays.asList("§7Schwierigkeit: §aLeicht"));
                im.setItemMeta(im1);

                ItemStack im2 = new ItemStack(Material.STONE);
                ItemMeta im3 = im2.getItemMeta();
                im3.setDisplayName("§c2");
                im3.setLore(Arrays.asList("§7Schwierigkeit: §aLeicht"));
                im2.setItemMeta(im3);

                ItemStack im4 = new ItemStack(Material.LOG);
                ItemMeta im5 = im4.getItemMeta();
                im5.setDisplayName("§c3");
                im5.setLore(Arrays.asList("§7Schwierigkeit: §aLeicht"));
                im4.setItemMeta(im5);

                ItemStack im6 = new ItemStack(Material.COBBLESTONE);
                ItemMeta im7 = im6.getItemMeta();
                im7.setDisplayName("§c4");
                im7.setLore(Arrays.asList("§7Schwierigkeit: §eMittel"));
                im6.setItemMeta(im7);

                ItemStack im8 = new ItemStack(Material.COAL_ORE);
                ItemMeta im9 = im8.getItemMeta();
                im9.setDisplayName("§c5");
                im9.setLore(Arrays.asList("§7Schwierigkeit: §eMittel"));
                im8.setItemMeta(im9);

                ItemStack im10 = new ItemStack(Material.GOLD_ORE);
                ItemMeta im11 = im10.getItemMeta();
                im11.setDisplayName("§c6");
                im11.setLore(Arrays.asList("§7Schwierigkeit: §eMittel"));
                im10.setItemMeta(im11);

                ItemStack im12 = new ItemStack(Material.DIAMOND_ORE);
                ItemMeta im13 = im12.getItemMeta();
                im13.setDisplayName("§c7");
                im13.setLore(Arrays.asList("§7Schwierigkeit: §cSchwer"));
                im12.setItemMeta(im13);

                ItemStack im14 = new ItemStack(Material.DIAMOND_BLOCK);
                ItemMeta im15 = im14.getItemMeta();
                im15.setDisplayName("§c8");
                im15.setLore(Arrays.asList("§7Schwierigkeit: §cSchwer"));
                im14.setItemMeta(im15);

                ItemStack im16 = new ItemStack(Material.EMERALD_BLOCK);
                ItemMeta im17 = im16.getItemMeta();
                im17.setDisplayName("§c9");
                im17.setLore(Arrays.asList("§7Schwierigkeit: §cSchwer"));
                im16.setItemMeta(im17);

                inv.setItem(0, im);
                inv.setItem(1, im2);
                inv.setItem(2, im4);
                inv.setItem(3, im6);
                inv.setItem(4, im8);
                inv.setItem(5, im10);
                inv.setItem(6, im12);
                inv.setItem(7, im14);
                inv.setItem(8, im16);

                p.openInventory(inv);
            }
        }
    }

    @EventHandler
    public void onClick(final InventoryClickEvent e){
        Player p = (Player)e.getWhoClicked();
        if(e.getClickedInventory().getName().equals(GUI_NAME)){
            e.setCancelled(true);
            if(e.getCurrentItem().getType() == Material.WOOD){
                FileConfiguration config2 = Main.getPlugin().getConfig();
                World world2 = Bukkit.getWorld(config2.getString("1.World"));
                double x2 = config2.getDouble("1.X");
                double y2 = config2.getDouble("1.Y");
                double z2 = config2.getDouble("1.Z");
                float yaw2 = (float) config2.getDouble("1.Yaw");
                float pitch2 = (float) config2.getDouble("1.Pitch");
                Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
                Navigator.teleporthigh(p, location2);
                p.sendMessage(Main.pre +"§cDu wurdest zum Jump and Run teleportiert!");
                InventoryListener.sprung.remove(p);
            }else if(e.getCurrentItem().getType() == Material.STONE){
                FileConfiguration config2 = Main.getPlugin().getConfig();
                World world2 = Bukkit.getWorld(config2.getString("2.World"));
                double x2 = config2.getDouble("2.X");
                double y2 = config2.getDouble("2.Y");
                double z2 = config2.getDouble("2.Z");
                float yaw2 = (float) config2.getDouble("2.Yaw");
                float pitch2 = (float) config2.getDouble("2.Pitch");
                Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
                Navigator.teleporthigh(p, location2);
                p.sendMessage(Main.pre +"§cDu wurdest zum Jump and Run teleportiert!");
                InventoryListener.sprung.remove(p);
            }else if(e.getCurrentItem().getType() == Material.LOG){
                FileConfiguration config2 = Main.getPlugin().getConfig();
                World world2 = Bukkit.getWorld(config2.getString("3.World"));
                double x2 = config2.getDouble("3.X");
                double y2 = config2.getDouble("3.Y");
                double z2 = config2.getDouble("3.Z");
                float yaw2 = (float) config2.getDouble("3.Yaw");
                float pitch2 = (float) config2.getDouble("3.Pitch");
                Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
                Navigator.teleporthigh(p, location2);
                p.sendMessage(Main.pre +"§cDu wurdest zum Jump and Run teleportiert!");
                InventoryListener.sprung.remove(p);
            }else if(e.getCurrentItem().getType() == Material.COBBLESTONE){
                FileConfiguration config2 = Main.getPlugin().getConfig();
                World world2 = Bukkit.getWorld(config2.getString("4.World"));
                double x2 = config2.getDouble("4.X");
                double y2 = config2.getDouble("4.Y");
                double z2 = config2.getDouble("4.Z");
                float yaw2 = (float) config2.getDouble("4.Yaw");
                float pitch2 = (float) config2.getDouble("4.Pitch");
                Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
                Navigator.teleporthigh(p, location2);
                p.sendMessage(Main.pre +"§cDu wurdest zum Jump and Run teleportiert!");
                InventoryListener.sprung.remove(p);
            }else if(e.getCurrentItem().getType() == Material.COAL_ORE){
                FileConfiguration config2 = Main.getPlugin().getConfig();
                World world2 = Bukkit.getWorld(config2.getString("5.World"));
                double x2 = config2.getDouble("5.X");
                double y2 = config2.getDouble("5.Y");
                double z2 = config2.getDouble("5.Z");
                float yaw2 = (float) config2.getDouble("5.Yaw");
                float pitch2 = (float) config2.getDouble("5.Pitch");
                Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
                Navigator.teleporthigh(p, location2);
                p.sendMessage(Main.pre +"§cDu wurdest zum Jump and Run teleportiert!");
                InventoryListener.sprung.remove(p);
            }else if(e.getCurrentItem().getType() == Material.GOLD_ORE){
                FileConfiguration config2 = Main.getPlugin().getConfig();
                World world2 = Bukkit.getWorld(config2.getString("6.World"));
                double x2 = config2.getDouble("6.X");
                double y2 = config2.getDouble("6.Y");
                double z2 = config2.getDouble("6.Z");
                float yaw2 = (float) config2.getDouble("6.Yaw");
                float pitch2 = (float) config2.getDouble("6.Pitch");
                Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
                Navigator.teleporthigh(p, location2);
                p.sendMessage(Main.pre +"§cDu wurdest zum Jump and Run teleportiert!");
                InventoryListener.sprung.remove(p);
            }else if(e.getCurrentItem().getType() == Material.DIAMOND_ORE){
                FileConfiguration config2 = Main.getPlugin().getConfig();
                World world2 = Bukkit.getWorld(config2.getString("7.World"));
                double x2 = config2.getDouble("7.X");
                double y2 = config2.getDouble("7.Y");
                double z2 = config2.getDouble("7.Z");
                float yaw2 = (float) config2.getDouble("7.Yaw");
                float pitch2 = (float) config2.getDouble("7.Pitch");
                Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
                Navigator.teleporthigh(p, location2);
                p.sendMessage(Main.pre +"§cDu wurdest zum Jump and Run teleportiert!");
                InventoryListener.sprung.remove(p);
            }else if(e.getCurrentItem().getType() == Material.DIAMOND_BLOCK){
                FileConfiguration config2 = Main.getPlugin().getConfig();
                World world2 = Bukkit.getWorld(config2.getString("8.World"));
                double x2 = config2.getDouble("8.X");
                double y2 = config2.getDouble("8.Y");
                double z2 = config2.getDouble("8.Z");
                float yaw2 = (float) config2.getDouble("8.Yaw");
                float pitch2 = (float) config2.getDouble("8.Pitch");
                Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
                Navigator.teleporthigh(p, location2);
                p.sendMessage(Main.pre +"§cDu wurdest zum Jump and Run teleportiert!");
                InventoryListener.sprung.remove(p);
            }else if(e.getCurrentItem().getType() == Material.EMERALD_BLOCK){
                FileConfiguration config2 = Main.getPlugin().getConfig();
                World world2 = Bukkit.getWorld(config2.getString("9.World"));
                double x2 = config2.getDouble("9.X");
                double y2 = config2.getDouble("9.Y");
                double z2 = config2.getDouble("9.Z");
                float yaw2 = (float) config2.getDouble("9.Yaw");
                float pitch2 = (float) config2.getDouble("9.Pitch");
                Location location2 = new Location(world2, x2, y2, z2, yaw2, pitch2);
                p.sendMessage(Main.pre +"§cDu wurdest zum Jump and Run teleportiert!");
                InventoryListener.sprung.remove(p);
                Navigator.teleporthigh(p, location2);
            }
        }
    }

}
