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
 
public class Koch implements CommandExecutor, Listener{
 
    private final String GUI_NAME = "§1§lKoch";
   
    EconomySystem es = new EconomySystem();
 
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;
       
        if(!p.hasPermission("Tom.Koch")) {
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
            im1.setDisplayName("§7Hier ist das Koch-Menü");
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
           
           
           
           
            ArrayList<String> koch = new ArrayList<String>();
            ItemStack schwein = new ItemStack(Material.GRILLED_PORK);
            ItemMeta im = schwein.getItemMeta();
            im.setDisplayName("§bGebratenes Schweinefleisch");
            koch.add("§7Preis: §a100$");
            im.setLore(koch);
            schwein.setItemMeta(im);
   
            inventory.setItem(10, schwein);
               
           
            ArrayList<String> rind = new ArrayList<String>();
            ItemStack rind1 = new ItemStack(Material.COOKED_BEEF);
            ItemMeta im2 = rind1.getItemMeta();
            im2.setDisplayName("§bGebratenes Rindfleisch");
            rind.add("§7Preis: §a100$");
            im2.setLore(rind);
            rind1.setItemMeta(im2);
           
            inventory.setItem(11, rind1);
           
           
           
            ArrayList<String> steak = new ArrayList<String>();
            ItemStack steak1 = new ItemStack(Material.COOKED_MUTTON);
            ItemMeta im3 = steak1.getItemMeta();
            im.setDisplayName("§bHammelfleisch");
            steak.add("§7Preis: §a100$");
            im3.setLore(steak);
            steak1.setItemMeta(im3);
           
            inventory.setItem(12, steak1);
           
           
            ArrayList<String> huhn = new ArrayList<String>();
            ItemStack huhn1 = new ItemStack(Material.COOKED_CHICKEN);
            ItemMeta im4 = huhn1.getItemMeta();
            im4.setDisplayName("§bGebratenes Hühnchen");
            huhn.add("§7Preis: §a100$");
            im4.setLore(huhn);
            huhn1.setItemMeta(im4);
           
            inventory.setItem(13, huhn1);
           
           
            ArrayList<String> kaninchen = new ArrayList<String>();
            ItemStack kaninchen1 = new ItemStack(Material.COOKED_RABBIT);
            ItemMeta im5 = kaninchen1.getItemMeta();
            im5.setDisplayName("§bGebratenes Kaninchen");
            kaninchen.add("§7Preis: §a100$");
            im5.setLore(kaninchen);
            kaninchen1.setItemMeta(im5);
           
            inventory.setItem(14, kaninchen1);
           
           
            ArrayList<String> kuchen = new ArrayList<String>();
            ItemStack kuchen1 = new ItemStack(Material.CAKE);
            ItemMeta im6 = kuchen1.getItemMeta();
            im6.setDisplayName("§bKuchen");
            kuchen.add("§7Preis: §a100$");
            im6.setLore(kuchen);
            kuchen1.setItemMeta(im6);
           
            inventory.setItem(15, kuchen1);
           
           
            ArrayList<String> ei = new ArrayList<String>();
            ItemStack ei1 = new ItemStack(Material.EGG);
            ItemMeta im7 = ei1.getItemMeta();
            im7.setDisplayName("§bEi");
            ei.add("§7Preis: §a100$");
            im7.setLore(ei);
            ei1.setItemMeta(im7);
           
            inventory.setItem(16, ei1);
           
           
            ArrayList<String> apfel = new ArrayList<String>();
            ItemStack apfel1 = new ItemStack(Material.APPLE);
            ItemMeta im8 = apfel1.getItemMeta();
            im8.setDisplayName("§bApfel");
            apfel.add("§7Preis: §a100$");
            im8.setLore(apfel);
            apfel1.setItemMeta(im8);
           
            inventory.setItem(19, apfel1);
           
           
            ArrayList<String> gapfel = new ArrayList<String>();
            ItemStack gapfel1 = new ItemStack(Material.GOLDEN_APPLE);
            ItemMeta im9 = gapfel1.getItemMeta();
            im9.setDisplayName("§bGoldApfel");
            gapfel.add("§7Preis: §a1000$");
            im9.setLore(gapfel);
            gapfel1.setItemMeta(im9);
           
            inventory.setItem(20, gapfel1);
           
           
            ArrayList<String> melone = new ArrayList<String>();
            ItemStack melone1 = new ItemStack(Material.MELON);
            ItemMeta im10 = melone1.getItemMeta();
            im10.setDisplayName("§bMelone");
            melone.add("§7Preis: §a20$");
            im10.setLore(melone);
            melone1.setItemMeta(im10);
           
            inventory.setItem(21, melone1);
           
            ArrayList<String> keks = new ArrayList<String>();
            ItemStack keks1 = new ItemStack(Material.COOKIE);
            ItemMeta im11 = keks1.getItemMeta();
            im11.setDisplayName("§bKeks");
            keks.add("§7Preis: §a100$");
            im11.setLore(keks);
            keks1.setItemMeta(im11);
           
            inventory.setItem(22, keks1);
           
           
           
            ArrayList<String> kartoffel = new ArrayList<String>();
            ItemStack kartoffel1 = new ItemStack(Material.BAKED_POTATO);
            ItemMeta im12 = kartoffel1.getItemMeta();
            im12.setDisplayName("§bGebackene Kartoffel");
            kartoffel.add("§7Preis: §a100$");
            im12.setLore(kartoffel);
            kartoffel1.setItemMeta(im12);
           
            inventory.setItem(23, kartoffel1);
           
           
           
            ArrayList<String> milch = new ArrayList<String>();
            ItemStack milch1 = new ItemStack(Material.MILK_BUCKET);
            ItemMeta im13 = milch1.getItemMeta();
            im13.setDisplayName("§bMilcheimer");
            milch.add("§7Preis: §a100$");
            im13.setLore(milch);
            milch1.setItemMeta(im13);
           
            inventory.setItem(24, milch1);
           
           
            ArrayList<String> brot = new ArrayList<String>();
            ItemStack brot1 = new ItemStack(Material.BREAD);
            ItemMeta im14 = brot1.getItemMeta();
            im14.setDisplayName("§bBrot");
            brot.add("§7Preis: §a100$");
            im14.setLore(brot);
            brot1.setItemMeta(im14);
           
            inventory.setItem(25, brot1);
           
            p.openInventory(inventory);
               
            p.sendMessage(Main.pre + "§3Du hast den §f§lKoch §3geöffnet");
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
            case GRILLED_PORK:
               
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.GRILLED_PORK);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
               
           
             case COOKED_BEEF:
                       
                     if(e.getClick().isLeftClick()) {
                        if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                       
                        ItemStack item = new ItemStack(Material.COOKED_BEEF);
                       
                        p.getInventory().addItem(item);
                        es.removeMoney(p.getUniqueId(), 100);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    }else {
                        p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                    }
                    break;
                 }
             case COOKED_MUTTON:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.COOKED_MUTTON);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case COOKED_CHICKEN:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.COOKED_CHICKEN);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case COOKED_RABBIT:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.COOKED_RABBIT);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
             }
             case CAKE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.CAKE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case EGG:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.EGG);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case APPLE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.APPLE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case GOLDEN_APPLE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 1000)) {
                   
                    ItemStack item = new ItemStack(Material.GOLDEN_APPLE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 1000);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case MELON:
                   
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
             case COOKIE:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.COOKIE);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case BAKED_POTATO:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.BAKED_POTATO);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case MILK_BUCKET:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.MILK_BUCKET);
                   
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                }else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
                break;
            }
             case BREAD:
                   
                 if(e.getClick().isLeftClick()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack item = new ItemStack(Material.BREAD);
                   
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