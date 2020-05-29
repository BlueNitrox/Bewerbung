package de.Tommunity.Villager;
 
import java.util.ArrayList;
import java.util.Arrays;

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

import de.Tommunity.Booster.Moneybooster;
import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;
 
public class Framer implements CommandExecutor, Listener{
 
    private final String GUI_NAME = "§5§lFarmer";
   
    EconomySystem es = new EconomySystem();
 
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;
       
        if(!p.hasPermission("Tom.farmer")) {
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
           
            ItemStack item2 = new ItemStack(Material.PAPER);
            ItemMeta im1 = item2.getItemMeta();
            im1.setDisplayName("§7Hier ist das Farmer-Menü");
            im1.setLore(Arrays.asList("§cVerkaufen kannst du mit Rechtsklick", "§cDu musst das Item dazu in der Hand halten!"));
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
           
           
           
               
           
            ItemStack Braustand1 = new ItemStack(Material.POTATO_ITEM);
            ItemMeta Braustand2 = Braustand1.getItemMeta();
            Braustand2.setDisplayName("§bKartoffel");
            Braustand2.setLore(Arrays.asList("§7Preis: §a20$", "§7Verkaufpreis: §c6$"));
            Braustand1.setItemMeta(Braustand2);
           
            inventory.setItem(10, Braustand1);
           
           
           
            ItemStack Kessel1 = new ItemStack(Material.CARROT_ITEM);
            ItemMeta Kessel3 = Kessel1.getItemMeta();
            Kessel3.setDisplayName("§bKarrotte");
            Kessel3.setLore(Arrays.asList("§7Preis: §a20$", "§7Verkaufpreis: §c6$"));
            Kessel1.setItemMeta(Kessel3);
           
            inventory.setItem(11, Kessel1);
           
           
            ItemStack Ec1 = new ItemStack(Material.MELON);
            ItemMeta Ec4 = Ec1.getItemMeta();
            Ec4.setDisplayName("§bMelone");
            Ec4.setLore(Arrays.asList("§7Preis: §a20$", "§7Verkaufpreis: §c1$"));
            Ec1.setItemMeta(Ec4);
           
            inventory.setItem(12, Ec1);
           
           
            ArrayList<String> Zaubertisch = new ArrayList<String>();
            ItemStack Zaubertisch1 = new ItemStack(Material.MELON_SEEDS);
            ItemMeta Zaubertisch5 = Zaubertisch1.getItemMeta();
            Zaubertisch5.setDisplayName("§bMelonensamen");
            Zaubertisch.add("§7Preis: §a30$");
            Zaubertisch5.setLore(Zaubertisch);
            Zaubertisch1.setItemMeta(Zaubertisch5);
           
            inventory.setItem(13, Zaubertisch1);
           
           
            ArrayList<String> Bücherregal = new ArrayList<String>();
            ItemStack Bücherregal1 = new ItemStack(Material.PUMPKIN_SEEDS);
            ItemMeta Bücherregal6 = Bücherregal1.getItemMeta();
            Bücherregal6.setDisplayName("§bKürbissamen");
            Bücherregal.add("§7Preis: §a100$");
            Bücherregal6.setLore(Bücherregal);
            Bücherregal1.setItemMeta(Bücherregal6);
           
            inventory.setItem(14, Bücherregal1);
           
           
            ItemStack Enderperle1 = new ItemStack(Material.SUGAR_CANE);
            ItemMeta Enderperle7 = Enderperle1.getItemMeta();
            Enderperle7.setDisplayName("§bZuckerrohr");
            Enderperle7.setLore(Arrays.asList("§7Preis: §a50$", "§7Verkaufpreis: §c1$"));
            Enderperle1.setItemMeta(Enderperle7);
           
            inventory.setItem(15, Enderperle1);
           
           
            ItemStack Bottle1 = new ItemStack(Material.WHEAT);
            ItemMeta Bottle8 = Bottle1.getItemMeta();
            Bottle8.setDisplayName("§bWeizen");
            Bottle8.setLore(Arrays.asList("§7Preis: §a20$", "§7Verkaufpreis: §c7$"));
            Bottle1.setItemMeta(Bottle8);
           
            inventory.setItem(16, Bottle1);
           
           
            ArrayList<String> Hase = new ArrayList<String>();
            ItemStack Hase1 = new ItemStack(Material.DIRT);
            ItemMeta Hase9 = Hase1.getItemMeta();
            Hase9.setDisplayName("§bErde");
            Hase.add("§7Preis: §a1$");
            Hase9.setLore(Hase);
            Hase1.setItemMeta(Hase9);
           
            inventory.setItem(19, Hase1);
           
            ArrayList<String> Carrot = new ArrayList<String>();
            ItemStack Carrot1 = new ItemStack(Material.GRASS);
            ItemMeta Carrot14 = Carrot1.getItemMeta();
            Carrot14.setDisplayName("§bGras");
            Carrot.add("§7Preis: §a4$");
            Carrot14.setLore(Carrot);
            Carrot1.setItemMeta(Carrot14);
           
            inventory.setItem(20, Carrot1);
           
            ArrayList<String> GHAST = new ArrayList<String>();
            ItemStack GHAST1 = new ItemStack(Material.MYCEL);
            ItemMeta GHAST10 = GHAST1.getItemMeta();
            GHAST10.setDisplayName("§bMyzel");
            GHAST.add("§7Preis: §a50$");
            GHAST10.setLore(GHAST);
            GHAST1.setItemMeta(GHAST10);
           
            inventory.setItem(21, GHAST1);
           
            ArrayList<String> Magma = new ArrayList<String>();
            ItemStack Magma1 = new ItemStack(Material.BROWN_MUSHROOM);
            ItemMeta Magma11 = Magma1.getItemMeta();
            Magma11.setDisplayName("§bBrauner Pilz");
            Magma.add("§7Preis: §a40$");
            Magma11.setLore(Magma);
            Magma1.setItemMeta(Magma11);
           
            inventory.setItem(22, Magma1);
           
           
           
            ArrayList<String> Spinne = new ArrayList<String>();
            ItemStack Spinne1 = new ItemStack(Material.RED_MUSHROOM);
            ItemMeta Spinne12 = Spinne1.getItemMeta();
            Spinne12.setDisplayName("§bRoter Pilz");
            Spinne.add("§7Preis: §a40$");
            Spinne12.setLore(Spinne);
            Spinne1.setItemMeta(Spinne12);
           
            inventory.setItem(23, Spinne1);
            
            ArrayList<String> Spinne111 = new ArrayList<String>();
            ItemStack Spinne11 = new ItemStack(Material.SEEDS);
            ItemMeta Spinne121 = Spinne11.getItemMeta();
            Spinne121.setDisplayName("§bWeizensamen");
            Spinne111.add("§7Preis: §a30$");
            Spinne121.setLore(Spinne111);
            Spinne11.setItemMeta(Spinne121);
           
            inventory.setItem(24, Spinne11);
            
            ArrayList<String> Spinne1111 = new ArrayList<String>();
            ItemStack Spimme = new ItemStack(Material.CACTUS);
            ItemMeta Spinne1211 = Spimme.getItemMeta();
            Spinne1211.setDisplayName("§bKaktus");
            Spinne1111.add("§7Preis: §a100$");
            Spinne1211.setLore(Spinne1111);
            Spimme.setItemMeta(Spinne1211);
           
            inventory.setItem(25, Spimme);
            
           
            p.openInventory(inventory);
               
            p.sendMessage(Main.pre + "§3Du hast den §e§lFarmer §3geöffnet");
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
            case POTATO_ITEM:
            	Moneybooster money = new Moneybooster();
            	if(e.getClick().isRightClick()) {
            		
            		ItemStack i = p.getItemInHand();
            		if(!(i.getType() == Material.POTATO_ITEM)) return; 
            			
                    if(i.getAmount() > 1) {
                        p.getItemInHand().setAmount(i.getAmount() -1);
                    }else if(i.getAmount() == 1) {
                    	ItemStack air = new ItemStack(Material.AIR);
                    	p.setItemInHand(air);
                    }
                    if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money.getName())))) {
                    	es.addMoney(p.getUniqueId(), 6);
                    	p.sendMessage(Main.pre + "§3Du hast eine Kartoffel verkauft und §e6$ §3bekommen!");
                    }else { es.addMoney(p.getUniqueId(), 8);
                	p.sendMessage(Main.pre + "§dMoney-Booster -> §3Du hast eine Kartoffel verkauft und §e8$ §3bekommen!");
                    }
            	}else if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 20)) {
                   
                    ItemStack item = new ItemStack(Material.POTATO_ITEM);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 20);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
               
           
             case CARROT_ITEM:
            	if(e.getClick().isRightClick()) {
            		Moneybooster money1 = new Moneybooster();
            		ItemStack i = p.getItemInHand();
            		if(!(i.getType() == Material.CARROT_ITEM)) return; 
            			
                    if(i.getAmount() > 1) {
                        p.getItemInHand().setAmount(i.getAmount() -1);
                    }else if(i.getAmount() == 1) {
                    	ItemStack air = new ItemStack(Material.AIR);
                    	p.setItemInHand(air);
                    }
                    if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money1.getName())))) {
                    	es.addMoney(p.getUniqueId(), 6);
                    	p.sendMessage(Main.pre + "§3Du hast eine Karrotte verkauft und §e6$ §3bekommen!");
                    }else {
                	es.addMoney(p.getUniqueId(), 8);
                	p.sendMessage(Main.pre + "§dMoney-Booster -> §3Du hast eine Karrotte verkauft und §e8$ §3bekommen!");
                    }
            	}else if(e.getClick().isLeftClick()) {
                        if(es.hasEnoughMoney(p.getUniqueId(), 20)) {
                       
                        ItemStack item = new ItemStack(Material.CARROT_ITEM);
                       
                        p.getInventory().addItem(item);
                        es.removeMoney(p.getUniqueId(), 20);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    }else {
                        p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                    }
                    break;
                 }
             case MELON_SEEDS:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 30)) {
                   
                    ItemStack item = new ItemStack(Material.MELON_SEEDS);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 30);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case MELON:
            	if(e.getClick().isRightClick()) {
            		Moneybooster money1 = new Moneybooster();
            		ItemStack i = p.getItemInHand();
            		if(!(i.getType() == Material.MELON)) return; 
            			
                    if(i.getAmount() > 1) {
                        p.getItemInHand().setAmount(i.getAmount() -1);
                    }else if(i.getAmount() == 1) {
                    	ItemStack air = new ItemStack(Material.AIR);
                    	p.setItemInHand(air);
                    }
                    if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money1.getName())))) {
                    	es.addMoney(p.getUniqueId(), 1);
                    	p.sendMessage(Main.pre + "§3Du hast eine Melone verkauft und §e1$ §3bekommen!");
                    }else {
                	es.addMoney(p.getUniqueId(), 3);
                	p.sendMessage(Main.pre + "§dMoney-Booster -> §3Du hast eine Melone verkauft und §e3$ §3bekommen!");
                    }
            	}else  
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 20)) {
                   
                    ItemStack item = new ItemStack(Material.MELON);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 20);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case PUMPKIN_SEEDS:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.PUMPKIN_SEEDS);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case SUGAR_CANE:
            	if(e.getClick().isRightClick()) {
            		Moneybooster money1 = new Moneybooster();
            		ItemStack i = p.getItemInHand();
            		if(!(i.getType() == Material.SUGAR_CANE)) return; 
            			
                    if(i.getAmount() > 1) {
                        p.getItemInHand().setAmount(i.getAmount() -1);
                    }else if(i.getAmount() == 1) {
                    	ItemStack air = new ItemStack(Material.AIR);
                    	p.setItemInHand(air);
                    }
                    if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money1.getName())))) {
                    	es.addMoney(p.getUniqueId(), 1);
                    	p.sendMessage(Main.pre + "§3Du hast eine Zuckerrohr verkauft und §e1$ §3bekommen!");
                    }else {
                	es.addMoney(p.getUniqueId(), 3);
                	p.sendMessage(Main.pre + "§dMoney-Booster -> §3Du hast eine Zuckerrohr verkauft und §e3$ §3bekommen!");
                    }
            	}else 
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 50)) {
                   
                    ItemStack item = new ItemStack(Material.SUGAR_CANE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 50);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case WHEAT:
            	if(e.getClick().isRightClick()) {
            		Moneybooster money1 = new Moneybooster();
            		ItemStack i = p.getItemInHand();
            		if(!(i.getType() == Material.WHEAT)) return; 
            			
                    if(i.getAmount() > 1) {
                        p.getItemInHand().setAmount(i.getAmount() -1);
                    }else if(i.getAmount() == 1) {
                    	ItemStack air = new ItemStack(Material.AIR);
                    	p.setItemInHand(air);
                    }
                    if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money1.getName())))) {
                    	es.addMoney(p.getUniqueId(), 7);
                    	p.sendMessage(Main.pre + "§3Du hast eine Weizen verkauft und §e7$ §3bekommen!");
                    }else {
                	es.addMoney(p.getUniqueId(), 9);
                	p.sendMessage(Main.pre + "§dMoney-Booster -> §3Du hast eine Weizen verkauft und §e9$ §3bekommen!");
                    }
            	}else   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 10)) {
                   
                    ItemStack item = new ItemStack(Material.WHEAT);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 10);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case DIRT:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 1)) {
                   
                    ItemStack item = new ItemStack(Material.DIRT);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 1);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case GRASS:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 4)) {
                   
                    ItemStack item = new ItemStack(Material.GRASS);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 4);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case MYCEL:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 50)) {
                   
                    ItemStack item = new ItemStack(Material.MYCEL);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 50);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case BROWN_MUSHROOM:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 40)) {
                   
                    ItemStack item = new ItemStack(Material.BROWN_MUSHROOM);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 40);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case RED_MUSHROOM:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 40)) {
                   
                    ItemStack item = new ItemStack(Material.RED_MUSHROOM);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 40);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
                
            } case SEEDS:
                
              if(e.getClick().isLeftClick()) {
                 if(es.hasEnoughMoney(p.getUniqueId(), 30)) {
                
                 ItemStack item = new ItemStack(Material.SEEDS);
                
                 p.getInventory().addItem(item);
                 es.removeMoney(p.getUniqueId(), 30);
                 p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
             }else {
                 p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
             }
             break;
              }
              
            case CACTUS:
                
                if(e.getClick().isLeftClick()) {
                   if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                  
                   ItemStack item = new ItemStack(Material.CACTUS);
                  
                   p.getInventory().addItem(item);
                   es.removeMoney(p.getUniqueId(), 100);
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