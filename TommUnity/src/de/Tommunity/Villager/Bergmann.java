package de.Tommunity.Villager;
 
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;
 
public class Bergmann implements CommandExecutor, Listener{
 
    private final String GUI_NAME = "§e§lBergmann";
   
    EconomySystem es = new EconomySystem();
 
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;
       
        if(!p.hasPermission("Tom.Bergmann")) {
            p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
            return true;
        }
        if(args.length == 0) {
            Inventory inventory = Bukkit.createInventory(null, 9 * 7, GUI_NAME);
           
            ItemStack item1 = new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname("§7Glasscheibe").build();
           
            inventory.setItem(0, item1);
            inventory.setItem(1, item1);
            inventory.setItem(2, item1);
            inventory.setItem(3, item1);
           
            ArrayList<String> info = new ArrayList<>();
            ItemStack item2 = new ItemStack(Material.PAPER);
            ItemMeta im1 = item2.getItemMeta();
            im1.setDisplayName("§7Hier ist das Bergmann-Menü");
            info.add("§7Hier kannst du nicht verkaufen");
            im1.setLore(info);
            item2.setItemMeta(im1);
           
            inventory.setItem(4, item2);
           
            inventory.setItem(5, item1);
            inventory.setItem(6, item1);
            inventory.setItem(7, item1);
            inventory.setItem(8, item1);
            inventory.setItem(9, item1);
            inventory.setItem(17, item1);
            inventory.setItem(18, item1);
            inventory.setItem(26, item1);
            inventory.setItem(27, item1);
            inventory.setItem(35, item1);
            inventory.setItem(36, item1);
            inventory.setItem(44, item1);
            inventory.setItem(45, item1);
            inventory.setItem(53, item1);
            inventory.setItem(54, item1);
            inventory.setItem(55, item1);
            inventory.setItem(56, item1);
            inventory.setItem(57, item1);
            inventory.setItem(58, item1);
            inventory.setItem(59, item1);
            inventory.setItem(60, item1);
            inventory.setItem(61, item1);
            inventory.setItem(62, item1);
           
           
           
           
            ArrayList<String> Emerald = new ArrayList<String>();
            ItemStack Emerald1 = new ItemStack(Material.EMERALD);
            ItemMeta im = Emerald1.getItemMeta();
            im.setDisplayName("§bEmerald");
            Emerald.add("§7Preis: §a3000$");
            im.setLore(Emerald);
            Emerald1.setItemMeta(im);
   
            inventory.setItem(10, Emerald1);
               
           
            ArrayList<String> Dia = new ArrayList<String>();
            ItemStack Dia1 = new ItemStack(Material.DIAMOND);
            ItemMeta im2 = Dia1.getItemMeta();
            im2.setDisplayName("§bDiamant");
            Dia.add("§7Preis: §a1000$");
            im2.setLore(Dia);
            Dia1.setItemMeta(im2);
           
            inventory.setItem(11, Dia1);
           
           
           
            ArrayList<String> Eisen = new ArrayList<String>();
            ItemStack Eisen1 = new ItemStack(Material.IRON_INGOT);
            ItemMeta im3 = Eisen1.getItemMeta();
            im.setDisplayName("§bIron Ingot");
            Eisen.add("§7Preis: §a500$");
            im3.setLore(Eisen);
            Eisen1.setItemMeta(im3);
           
            inventory.setItem(12, Eisen1);
           
           
            ArrayList<String> Gold = new ArrayList<String>();
            ItemStack Gold1 = new ItemStack(Material.GOLD_INGOT);
            ItemMeta im4 = Gold1.getItemMeta();
            im4.setDisplayName("§bGold Ingot");
            Gold.add("§7Preis: §a500$");
            im4.setLore(Gold);
            Gold1.setItemMeta(im4);
           
            inventory.setItem(13, Gold1);
           
           
            ArrayList<String> Kohle = new ArrayList<String>();
            ItemStack Kohle1 = new ItemStack(Material.COAL);
            ItemMeta im5 = Kohle1.getItemMeta();
            im5.setDisplayName("§bKohle");
            Kohle.add("§7Preis: §a500$");
            im5.setLore(Kohle);
            Kohle1.setItemMeta(im5);
           
            inventory.setItem(14, Kohle1);
           
           
            ArrayList<String> STONE = new ArrayList<String>();
            ItemStack STONE1 = new ItemStack(Material.STONE);
            ItemMeta im6 = STONE1.getItemMeta();
            im6.setDisplayName("§bStein");
            STONE.add("§7Preis: §a30$");
            im6.setLore(STONE);
            STONE1.setItemMeta(im6);
           
            inventory.setItem(15, STONE1);
           
           
            ArrayList<String> COBBLESTONE = new ArrayList<String>();
            ItemStack COBBLESTONE1 = new ItemStack(Material.COBBLESTONE);
            ItemMeta im7 = COBBLESTONE1.getItemMeta();
            im7.setDisplayName("§bBruchstein");
            COBBLESTONE.add("§7Preis: §a30$");
            im7.setLore(COBBLESTONE);
            COBBLESTONE1.setItemMeta(im7);
           
            inventory.setItem(16, COBBLESTONE1);
           
           
            ArrayList<String> EMERALD_ORE = new ArrayList<String>();
            ItemStack EMERALD_ORE1 = new ItemStack(Material.EMERALD_ORE);
            ItemMeta im8 = EMERALD_ORE1.getItemMeta();
            im8.setDisplayName("§bEmerald Erz");
            EMERALD_ORE.add("§7Preis: §a8000$");
            im8.setLore(EMERALD_ORE);
            EMERALD_ORE1.setItemMeta(im8);
           
            inventory.setItem(19, EMERALD_ORE1);
           
           
            ArrayList<String> DIAMOND_ORE = new ArrayList<String>();
            ItemStack DIAMOND_ORE1 = new ItemStack(Material.DIAMOND_ORE);
            ItemMeta im9 = DIAMOND_ORE1.getItemMeta();
            im9.setDisplayName("§bDiamant Erz");
            DIAMOND_ORE.add("§7Preis: §a5000$");
            im9.setLore(DIAMOND_ORE);
            DIAMOND_ORE1.setItemMeta(im9);
           
            inventory.setItem(20, DIAMOND_ORE1);
           
           
            ArrayList<String> IRON_INGOT = new ArrayList<String>();
            ItemStack IRON_INGOT1 = new ItemStack(Material.IRON_ORE);
            ItemMeta im10 = IRON_INGOT1.getItemMeta();
            im10.setDisplayName("§bIron Erz");
            IRON_INGOT.add("§7Preis: §a4000$");
            im10.setLore(IRON_INGOT);
            IRON_INGOT1.setItemMeta(im10);
           
            inventory.setItem(21, IRON_INGOT1);
           
            ArrayList<String> GOLD_ORE = new ArrayList<String>();
            ItemStack GOLD_ORE1 = new ItemStack(Material.GOLD_ORE);
            ItemMeta im11 = GOLD_ORE1.getItemMeta();
            im11.setDisplayName("§bGold Erz");
            GOLD_ORE.add("§7Preis: §a4000$");
            im11.setLore(GOLD_ORE);
            GOLD_ORE1.setItemMeta(im11);
           
            inventory.setItem(22, GOLD_ORE1);
           
           
           
            ArrayList<String> COAL_ORE = new ArrayList<String>();
            ItemStack COAL_ORE1 = new ItemStack(Material.COAL_ORE);
            ItemMeta im12 = COAL_ORE1.getItemMeta();
            im12.setDisplayName("§bKohle Erz");
            COAL_ORE.add("§7Preis: §a1000$");
            im12.setLore(COAL_ORE);
            COAL_ORE1.setItemMeta(im12);
           
            inventory.setItem(23, COAL_ORE1);
           
           
           
            ArrayList<String> LAPIS_ORE = new ArrayList<String>();
            ItemStack LAPIS_ORE1 = new ItemStack(Material.LAPIS_ORE);
            ItemMeta im13 = LAPIS_ORE1.getItemMeta();
            im13.setDisplayName("§bLapis Erz");
            LAPIS_ORE.add("§7Preis: §a1000$");
            im13.setLore(LAPIS_ORE);
            LAPIS_ORE1.setItemMeta(im13);
           
            inventory.setItem(24, LAPIS_ORE1);
           
           
            ArrayList<String> brot = new ArrayList<String>();
            ItemStack brot1 = new ItemStack(Material.REDSTONE_ORE);
            ItemMeta im14 = brot1.getItemMeta();
            im14.setDisplayName("§bRedstone Erz");
            brot.add("§7Preis: §a1000$");
            im14.setLore(brot);
            brot1.setItemMeta(im14);
           
            inventory.setItem(25, brot1);
            
            ArrayList<String> blau12 = new ArrayList<String>();
            ItemStack blau1 = new ItemStack(Material.SEA_LANTERN);
            ItemMeta blau14 = blau1.getItemMeta();
            blau14.setDisplayName("§bSeelaterne");
            blau12.add("§7Preis: §a100$");
            blau14.setLore(blau12);
            blau1.setItemMeta(blau14);
           
            inventory.setItem(28, blau1);
            
            ArrayList<String> red1 = new ArrayList<String>();
            ItemStack red11 = new ItemStack(Material.HAY_BLOCK);
            ItemMeta red14 = brot1.getItemMeta();
            red14.setDisplayName("§bHeublock");
            red1.add("§7Preis: §a200$");
            red14.setLore(red1);
            red11.setItemMeta(red14);
           
            inventory.setItem(29, red11);
            
            ArrayList<String> brot11 = new ArrayList<String>();
            ItemStack brot1111 = new ItemStack(Material.WEB);
            ItemMeta im141 = brot1111.getItemMeta();
            im141.setDisplayName("§bSpinnennetz");
            brot11.add("§7Preis: §a100$");
            im141.setLore(brot);
            brot1111.setItemMeta(im141);
           
            inventory.setItem(30, brot1111);
           
            p.openInventory(inventory);
               
            p.sendMessage(Main.pre + "§3Du hast den §e§lBergmann §3geöffnet");
        }
        return true;
    }
           
   
   
    @EventHandler
    public void handleKochMenuClick(InventoryClickEvent e) {
        if (!(e.getWhoClicked() instanceof Player))
            return;
        Player p = (Player) e.getWhoClicked();
        if (e.getClickedInventory().getTitle().equals(GUI_NAME)) {
            e.setCancelled(true);
            switch (e.getCurrentItem().getType()) {
            case COAL_ORE:
               
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 1000)) {
                   
                    ItemStack item = new ItemStack(Material.COAL_ORE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 1000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
               
           
             case EMERALD:
                       
                     if(e.getClick().isLeftClick()) {
                        if(es.hasEnoughMoney(p.getUniqueId(), 3000)) {
                       
                        ItemStack item = new ItemStack(Material.EMERALD);
                       
                        p.getInventory().addItem(item);
                        es.removeMoney(p.getUniqueId(), 3000);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    }else {
                        p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                    }
                    break;
                 }
             case DIAMOND:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 1000)) {
                   
                    ItemStack item = new ItemStack(Material.DIAMOND);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 1000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case IRON_INGOT:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 500)) {
                   
                    ItemStack item = new ItemStack(Material.IRON_INGOT);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 500);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case GOLD_INGOT:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 500)) {
                   
                    ItemStack item = new ItemStack(Material.GOLD_INGOT);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 500);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case COAL:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 500)) {
                   
                    ItemStack item = new ItemStack(Material.COAL);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 500);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case STONE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 30)) {
                   
                    ItemStack item = new ItemStack(Material.STONE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 30);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case COBBLESTONE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 30)) {
                   
                    ItemStack item = new ItemStack(Material.COBBLESTONE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 30);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case EMERALD_ORE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 8000)) {
                   
                    ItemStack item = new ItemStack(Material.EMERALD_ORE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 8000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case DIAMOND_ORE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 5000)) {
                   
                    ItemStack item = new ItemStack(Material.DIAMOND_ORE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 5000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case IRON_ORE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 4000)) {
                   
                    ItemStack item = new ItemStack(Material.IRON_ORE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 4000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case GOLD_ORE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 4000)) {
                   
                    ItemStack item = new ItemStack(Material.GOLD_ORE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 4000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case LAPIS_ORE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 1000)) {
                   
                    ItemStack item = new ItemStack(Material.LAPIS_ORE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 1000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                 }
                break;
            
             case REDSTONE_ORE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 1000)) {
                   
                    ItemStack item = new ItemStack(Material.REDSTONE_ORE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 1000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                 }
                break;

             case WEB:
                 
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.WEB);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                 }
                break;
            
                 case HAY_BLOCK:
                     
                     if(e.getClick().isLeftClick()) {
                        if(es.hasEnoughMoney(p.getUniqueId(), 200)) {
                       
                        ItemStack item = new ItemStack(Material.HAY_BLOCK);
                       
                        p.getInventory().addItem(item);
                        es.removeMoney(p.getUniqueId(), 200);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    }else {
                        p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                    }
                     }
                    break;
                 case SEA_LANTERN:
                     
                     if(e.getClick().isLeftClick()) {
                        if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                       
                        ItemStack item = new ItemStack(Material.SEA_LANTERN);
                       
                        p.getInventory().addItem(item);
                        es.removeMoney(p.getUniqueId(), 100);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    }else {
                        p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                    }
                     }
                    break;
        }  
    }
}
}