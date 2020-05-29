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
 
public class Magier implements CommandExecutor, Listener{
 
    private final String GUI_NAME = "§5§lMagier";
   
    EconomySystem es = new EconomySystem();
 
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;
       
        if(!p.hasPermission("Tom.Magier")) {
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
            im1.setDisplayName("§7Hier ist das Magier-Menü");
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
           
           
           
               
           
            ArrayList<String> Braustand = new ArrayList<String>();
            ItemStack Braustand1 = new ItemStack(Material.BREWING_STAND_ITEM);
            ItemMeta Braustand2 = Braustand1.getItemMeta();
            Braustand2.setDisplayName("§bBraustand");
            Braustand.add("§7Preis: §a2000$");
            Braustand2.setLore(Braustand);
            Braustand1.setItemMeta(Braustand2);
           
            inventory.setItem(10, Braustand1);
           
           
           
            ArrayList<String> Kessel = new ArrayList<String>();
            ItemStack Kessel1 = new ItemStack(Material.CAULDRON_ITEM);
            ItemMeta Kessel3 = Kessel1.getItemMeta();
            Kessel3.setDisplayName("§bKessel");
            Kessel.add("§7Preis: §a2000$");
            Kessel3.setLore(Kessel);
            Kessel1.setItemMeta(Kessel3);
           
            inventory.setItem(11, Kessel1);
           
           
            ArrayList<String> Ec = new ArrayList<String>();
            ItemStack Ec1 = new ItemStack(Material.ENDER_CHEST);
            ItemMeta Ec4 = Ec1.getItemMeta();
            Ec4.setDisplayName("§bEnder Truhe");
            Ec.add("§7Preis: §a3000$");
            Ec4.setLore(Ec);
            Ec1.setItemMeta(Ec4);
           
            inventory.setItem(12, Ec1);
           
           
            ArrayList<String> Zaubertisch = new ArrayList<String>();
            ItemStack Zaubertisch1 = new ItemStack(Material.ENCHANTMENT_TABLE);
            ItemMeta Zaubertisch5 = Zaubertisch1.getItemMeta();
            Zaubertisch5.setDisplayName("§bZaubertisch");
            Zaubertisch.add("§7Preis: §a10000$");
            Zaubertisch5.setLore(Zaubertisch);
            Zaubertisch1.setItemMeta(Zaubertisch5);
           
            inventory.setItem(13, Zaubertisch1);
           
           
            ArrayList<String> Bücherregal = new ArrayList<String>();
            ItemStack Bücherregal1 = new ItemStack(Material.BOOKSHELF);
            ItemMeta Bücherregal6 = Bücherregal1.getItemMeta();
            Bücherregal6.setDisplayName("§bBücherregal");
            Bücherregal.add("§7Preis: §a1000$");
            Bücherregal6.setLore(Bücherregal);
            Bücherregal1.setItemMeta(Bücherregal6);
           
            inventory.setItem(14, Bücherregal1);
           
           
            ArrayList<String> Enderperle = new ArrayList<String>();
            ItemStack Enderperle1 = new ItemStack(Material.ENDER_PEARL);
            ItemMeta Enderperle7 = Enderperle1.getItemMeta();
            Enderperle7.setDisplayName("§bEnder-Perle");
            Enderperle.add("§7Preis: §a500$");
            Enderperle7.setLore(Enderperle);
            Enderperle1.setItemMeta(Enderperle7);
           
            inventory.setItem(15, Enderperle1);
           
           
            ArrayList<String> Bottle = new ArrayList<String>();
            ItemStack Bottle1 = new ItemStack(Material.GLASS_BOTTLE);
            ItemMeta Bottle8 = Bottle1.getItemMeta();
            Bottle8.setDisplayName("§bGlas-Flasche");
            Bottle.add("§7Preis: §a100$");
            Bottle8.setLore(Bottle);
            Bottle1.setItemMeta(Bottle8);
           
            inventory.setItem(16, Bottle1);
           
           
            ArrayList<String> Hase = new ArrayList<String>();
            ItemStack Hase1 = new ItemStack(Material.RABBIT_FOOT);
            ItemMeta Hase9 = Hase1.getItemMeta();
            Hase9.setDisplayName("§bHasen-Pfote");
            Hase.add("§7Preis: §a100$");
            Hase9.setLore(Hase);
            Hase1.setItemMeta(Hase9);
           
            inventory.setItem(19, Hase1);
           
            ArrayList<String> Carrot = new ArrayList<String>();
            ItemStack Carrot1 = new ItemStack(Material.GOLDEN_CARROT);
            ItemMeta Carrot14 = Carrot1.getItemMeta();
            Carrot.add("§7Preis: §a100$");
            Carrot14.setLore(Carrot);
            Carrot1.setItemMeta(Carrot14);
           
            inventory.setItem(20, Carrot1);
           
            ArrayList<String> GHAST = new ArrayList<String>();
            ItemStack GHAST1 = new ItemStack(Material.GHAST_TEAR);
            ItemMeta GHAST10 = GHAST1.getItemMeta();
            GHAST10.setDisplayName("§bGhast-Träne");
            GHAST.add("§7Preis: §a100$");
            GHAST10.setLore(GHAST);
            GHAST1.setItemMeta(GHAST10);
           
            inventory.setItem(21, GHAST1);
           
            ArrayList<String> Magma = new ArrayList<String>();
            ItemStack Magma1 = new ItemStack(Material.MAGMA_CREAM);
            ItemMeta Magma11 = Magma1.getItemMeta();
            Magma11.setDisplayName("§bMagmaball");
            Magma.add("§7Preis: §a100$");
            Magma11.setLore(Magma);
            Magma1.setItemMeta(Magma11);
           
            inventory.setItem(22, Magma1);
           
           
           
            ArrayList<String> Spinne = new ArrayList<String>();
            ItemStack Spinne1 = new ItemStack(Material.SPIDER_EYE);
            ItemMeta Spinne12 = Spinne1.getItemMeta();
            Spinne12.setDisplayName("§bSpinnenauge");
            Spinne.add("§7Preis: §a100$");
            Spinne12.setLore(Spinne);
            Spinne1.setItemMeta(Spinne12);
           
            inventory.setItem(23, Spinne1);
           
           
           
            ArrayList<String> Powder = new ArrayList<String>();
            ItemStack Powder1 = new ItemStack(Material.BLAZE_POWDER);
            ItemMeta Powder13 = Powder1.getItemMeta();
            Powder13.setDisplayName("§bLohenstaub");
            Powder.add("§7Preis: §a100$");
            Powder13.setLore(Powder);
            Powder1.setItemMeta(Powder13);
           
            inventory.setItem(24, Powder1);
           
            ArrayList<String> Melone = new ArrayList<String>();
            ItemStack Melone1 = new ItemStack(Material.SPECKLED_MELON);
            ItemMeta Melone14 = Melone1.getItemMeta();
            Melone.add("§7Preis: §a100$");
            Melone14.setLore(Melone);
            Melone1.setItemMeta(Melone14);
           
            inventory.setItem(25, Melone1);
           
            ArrayList<String> XP = new ArrayList<String>();
            ItemStack XP1 = new ItemStack(Material.EXP_BOTTLE);
            ItemMeta XP2 = XP1.getItemMeta();
            XP2.setDisplayName("§bXP-Bottle");
            XP.add("§7Preis: §a1000$");
            XP2.setLore(XP);
            XP1.setItemMeta(XP2);
           
            inventory.setItem(28, XP1);
            
            ArrayList<String> XP5 = new ArrayList<String>();
            ItemStack XP15 = new ItemStack(Material.BOW);
            ItemMeta XP25 = XP15.getItemMeta();
            XP25.setDisplayName("§bBogen");
            XP5.add("§7Preis: §a2000$");
            XP25.setLore(XP5);
            XP15.setItemMeta(XP25);
           
            inventory.setItem(29, XP15);

            ArrayList<String> XP51 = new ArrayList<String>();
            ItemStack XP151 = new ItemStack(Material.ARROW);
            ItemMeta XP251 = XP151.getItemMeta();
            XP251.setDisplayName("§bPfeil");
            XP51.add("§7Preis: §a200$");
            XP251.setLore(XP51);
            XP151.setItemMeta(XP251);

            inventory.setItem(30, XP151);


            ArrayList<String> wart = new ArrayList<String>();
            ItemStack wart1 = new ItemStack(Material.NETHER_WARTS);
            ItemMeta wart2 = wart1.getItemMeta();
            wart2.setDisplayName("§bNetherwarze");
            wart.add("§7Preis: §a200$");
            wart2.setLore(wart);
            wart1.setItemMeta(wart2);

            inventory.setItem(31, wart1);
            
            p.openInventory(inventory);
               
            p.sendMessage(Main.pre + "§3Du hast den §5§lMagier §3geöffnet");
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
            case BREWING_STAND_ITEM:
               
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 2000)) {
                   
                    ItemStack item = new ItemStack(Material.BREWING_STAND_ITEM);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 2000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
               
           
             case CAULDRON_ITEM:
                       
                     if(e.getClick().isLeftClick()) {
                        if(es.hasEnoughMoney(p.getUniqueId(), 2000)) {
                       
                        ItemStack item = new ItemStack(Material.CAULDRON_ITEM);
                       
                        p.getInventory().addItem(item);
                        es.removeMoney(p.getUniqueId(), 2000);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    }else {
                        p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                    }
                    break;
                 }
             case ENDER_CHEST:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 3000)) {
                   
                    ItemStack item = new ItemStack(Material.ENDER_CHEST);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 3000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case ENCHANTMENT_TABLE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 10000)) {
                   
                    ItemStack item = new ItemStack(Material.ENCHANTMENT_TABLE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 10000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case BOOKSHELF:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 1000)) {
                   
                    ItemStack item = new ItemStack(Material.BOOKSHELF);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 1000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case ENDER_PEARL:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 500)) {
                   
                    ItemStack item = new ItemStack(Material.ENDER_PEARL);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 500);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case GLASS_BOTTLE:

                    if(e.getClick().isLeftClick()) {
                        if(es.hasEnoughMoney(p.getUniqueId(), 100)) {

                            ItemStack item = new ItemStack(Material.GLASS_BOTTLE);

                            p.getInventory().addItem(item);
                            es.removeMoney(p.getUniqueId(), 100);
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                        }else {
                            p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                        }
                        break;
                    }
                case NETHER_WARTS:

                    if(e.getClick().isLeftClick()) {
                        if(es.hasEnoughMoney(p.getUniqueId(), 200)) {

                            ItemStack item = new ItemStack(Material.NETHER_WARTS);

                            p.getInventory().addItem(item);
                            es.removeMoney(p.getUniqueId(), 200);
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                        }else {
                            p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                        }
                        break;
                    }
             case RABBIT_FOOT:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.RABBIT_FOOT);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case GHAST_TEAR:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.GHAST_TEAR);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case MAGMA_CREAM:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.MAGMA_CREAM);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case SPIDER_EYE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.SPIDER_EYE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case BLAZE_POWDER:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.BLAZE_POWDER);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case SPECKLED_MELON:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.SPECKLED_MELON);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case GOLDEN_CARROT:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.GOLDEN_CARROT);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case ARROW:
                 
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 200)) {
                   
                    ItemStack item = new ItemStack(Material.ARROW);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 200);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
                 }
             case EXP_BOTTLE:
                 
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 1000)) {
                   
                    ItemStack item = new ItemStack(Material.EXP_BOTTLE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 1000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
                 }
             case BOW:
                 
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 2000)) {
                   
                    ItemStack item = new ItemStack(Material.BOW);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 2000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
                 }
        }  
    }
}
}