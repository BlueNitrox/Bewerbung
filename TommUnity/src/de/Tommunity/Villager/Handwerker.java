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
 
public class Handwerker implements CommandExecutor, Listener {
 
private final String GUI_NAME = "§e§lHandwerker";
   
        EconomySystem es = new EconomySystem();
 
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;
       
        if(!p.hasPermission("Tom.Handwerker")) {
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
            im1.setDisplayName("§7Hier ist das Handwerker Menü");
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
           
           
           
           
            ArrayList<String> Eichenholz = new ArrayList<String>();
            ItemStack Eichenholz1 = new ItemStack(Material.LOG, 1, (short) 0);
            ItemMeta Eichenholz2 = Eichenholz1.getItemMeta();
            Eichenholz2.setDisplayName("§bEichenholz");
            Eichenholz.add("§7Preis: §a100$");
            Eichenholz2.setLore(Eichenholz);
            Eichenholz1.setItemMeta(Eichenholz2);
 
            inventory.setItem(10, Eichenholz1);
            
            ArrayList<String> Eichenholz17 = new ArrayList<String>();
            ItemStack Eichenholz11 = new ItemStack(Material.LOG, 1, (short) 1);
            ItemMeta Eichenholz21 = Eichenholz11.getItemMeta();
            Eichenholz21.setDisplayName("§bFichtenholz");
            Eichenholz17.add("§7Preis: §a25$");
            Eichenholz21.setLore(Eichenholz17);
            Eichenholz11.setItemMeta(Eichenholz21);
 
            inventory.setItem(11, Eichenholz11);
            
            ArrayList<String> Eichenholz15 = new ArrayList<String>();
            ItemStack Eichenholz115 = new ItemStack(Material.LOG, 1, (short) 2);
            ItemMeta Eichenholz215 = Eichenholz115.getItemMeta();
            Eichenholz215.setDisplayName("§bBirkenholz");
            Eichenholz15.add("§7Preis: §a25$");
            Eichenholz215.setLore(Eichenholz15);
            Eichenholz115.setItemMeta(Eichenholz215);
 
            inventory.setItem(12, Eichenholz115);
            
            ArrayList<String> Eichenholz28 = new ArrayList<String>();
            ItemStack Eichenholz128 = new ItemStack(Material.LOG, 1, (short) 3);
            ItemMeta Eichenholz228 = Eichenholz128.getItemMeta();
            Eichenholz228.setDisplayName("§bTropenholz");
            Eichenholz28.add("§7Preis: §a25$");
            Eichenholz228.setLore(Eichenholz28);
            Eichenholz128.setItemMeta(Eichenholz228);
 
            inventory.setItem(13, Eichenholz128);
               
            ArrayList<String> Akazienholz = new ArrayList<String>();
            ItemStack Akazienholz1 = new ItemStack(Material.LOG_2, 1 , (short) 0);
            ItemMeta im2 = Akazienholz1.getItemMeta();
            im2.setDisplayName("§bAkazienholz");
            Akazienholz.add("§7Preis: §a25$");
            im2.setLore(Akazienholz);
            Akazienholz1.setItemMeta(im2);
            inventory.setItem(14, Akazienholz1);
            
            ArrayList<String> Akazienholz5 = new ArrayList<String>();
            ItemStack Akazienholz15 = new ItemStack(Material.LOG_2, 1 , (short) 1);
            ItemMeta im25 = Akazienholz15.getItemMeta();
            im25.setDisplayName("§bSchwarzeichenholz");
            Akazienholz5.add("§7Preis: §a25$");
            im25.setLore(Akazienholz5);
            Akazienholz15.setItemMeta(im25);
            inventory.setItem(15, Akazienholz15);
           
            ArrayList<String> gras = new ArrayList<String>();
            ItemStack gras1 = new ItemStack(Material.GRASS);
            ItemMeta im7 = gras1.getItemMeta();
            im7.setDisplayName("§bGras");
            gras.add("§7Preis: §a4$");
            im7.setLore(gras);
            gras1.setItemMeta(im7);
            inventory.setItem(16, gras1);
           
            ArrayList<String> ziegel = new ArrayList<String>();
            ItemStack ziegel1 = new ItemStack(Material.BRICK);
            ItemMeta im11 = ziegel1.getItemMeta();
            im11.setDisplayName("§bZiegelstein");
            ziegel.add("§7Preis: §a20$");
            im11.setLore(ziegel);
            ziegel1.setItemMeta(im11);
            inventory.setItem(19, ziegel1);
           
            ArrayList<String> ob = new ArrayList<String>();
            ItemStack ob1 = new ItemStack(Material.OBSIDIAN);
            ItemMeta im12 = ob1.getItemMeta();
            im12.setDisplayName("§bObsidian");
            ob.add("§7Preis: §a500$");
            im12.setLore(ob);
            ob1.setItemMeta(im12);
            inventory.setItem(20, ob1);
           
            ArrayList<String> endst = new ArrayList<String>();
            ItemStack endst1 = new ItemStack(Material.ENDER_STONE);
            ItemMeta im13 = endst1.getItemMeta();
            im13.setDisplayName("§bEndstein");
            endst.add("§7Preis: §a600$");
            im13.setLore(endst);
            endst1.setItemMeta(im13);
            inventory.setItem(21, endst1);
           
            ArrayList<String> sand = new ArrayList<String>();
            ItemStack sand1 = new ItemStack(Material.SAND);
            ItemMeta im14 = sand1.getItemMeta();
            im14.setDisplayName("§bSand");
            sand.add("§7Preis: §a20$");
            im14.setLore(sand);
            sand1.setItemMeta(im14);
            inventory.setItem(22, sand1);
           
            ArrayList<String> kies = new ArrayList<String>();
            ItemStack kies1 = new ItemStack(Material.GRAVEL);
            ItemMeta im15 = kies1.getItemMeta();
            im15.setDisplayName("§bKies");
            kies.add("§7Preis: §a20$");
            im15.setLore(kies);
            kies1.setItemMeta(im15);
            inventory.setItem(23, kies1);
           
            ArrayList<String> rsand = new ArrayList<String>();
            ItemStack rsand1 = new ItemStack(Material.RED_SANDSTONE);
            ItemMeta im16 = rsand1.getItemMeta();
            im16.setDisplayName("§bRoter Sandstein");
            rsand.add("§7Preis: §a30$");
            im16.setLore(rsand);
            rsand1.setItemMeta(im16);
            inventory.setItem(24, rsand1);
            
            ArrayList<String> rsand12 = new ArrayList<String>();
            ItemStack rsand11 = new ItemStack(Material.SANDSTONE);
            ItemMeta im161 = rsand11.getItemMeta();
            im161.setDisplayName("§bSandstein");
            rsand12.add("§7Preis: §a30$");
            im161.setLore(rsand12);
            rsand11.setItemMeta(im161);
            inventory.setItem(25, rsand11);
            
            ArrayList<String> rsand123 = new ArrayList<String>();
            ItemStack rsand113 = new ItemStack(Material.CHEST);
            ItemMeta im1613 = rsand113.getItemMeta();
            im1613.setDisplayName("§bKiste");
            rsand123.add("§7Preis: §a100$");
            im1613.setLore(rsand123);
            rsand113.setItemMeta(im1613);
            inventory.setItem(28, rsand113);
            
            ArrayList<String> rsand1234 = new ArrayList<String>();
            ItemStack rsand1134 = new ItemStack(Material.CLAY);
            ItemMeta im16134 = rsand1134.getItemMeta();
            im16134.setDisplayName("§bClay");
            rsand1234.add("§7Preis: §a20$");
            im16134.setLore(rsand1234);
            rsand1134.setItemMeta(im16134);
            inventory.setItem(29, rsand1134);
  
            ArrayList<String> rsand12345 = new ArrayList<String>();
            ItemStack rsand11345 = new ItemStack(Material.MOSSY_COBBLESTONE);
            ItemMeta im161345 = rsand11345.getItemMeta();
            im161345.setDisplayName("§bBemoster Bruchstein");
            rsand12345.add("§7Preis: §a20$");
            im161345.setLore(rsand12345);
            rsand11345.setItemMeta(im161345);
            inventory.setItem(30, rsand11345);
            
            ArrayList<String> rsand123457 = new ArrayList<String>();
            ItemStack rsand113457 = new ItemStack(Material.STONE, 1, (short) 5);
            ItemMeta im1613457 = rsand113457.getItemMeta();
            im1613457.setDisplayName("§bAndesit");
            rsand123457.add("§7Preis: §a20$");
            im1613457.setLore(rsand123457);
            rsand113457.setItemMeta(im1613457);
            inventory.setItem(31, rsand113457);
            
            ArrayList<String> rsand1234578 = new ArrayList<String>();
            ItemStack rsand1134578 = new ItemStack(Material.WATER_BUCKET);
            ItemMeta im16134578 = rsand1134578.getItemMeta();
            im16134578.setDisplayName("§bWassereimer");
            rsand1234578.add("§7Preis: §a2000$");
            im16134578.setLore(rsand1234578);
            rsand1134578.setItemMeta(im16134578);
            inventory.setItem(32, rsand1134578);
            
            ArrayList<String> rsand1234579 = new ArrayList<String>();
            ItemStack rsand1134579 = new ItemStack(Material.LAVA_BUCKET);
            ItemMeta im16134579 = rsand1134579.getItemMeta();
            im16134579.setDisplayName("§bLavaeimer");
            rsand1234579.add("§7Preis: §a2000$");
            im16134579.setLore(rsand1234579);
            rsand1134579.setItemMeta(im16134579);
            inventory.setItem(33, rsand1134579);
            
            ArrayList<String> rsand1244579 = new ArrayList<String>();
            ItemStack rsand1144579 = new ItemStack(Material.DIRT, 1,(short) 2);
            ItemMeta im16144579 = rsand1144579.getItemMeta();
            im16144579.setDisplayName("§bPodsol");
            rsand1244579.add("§7Preis: §a5$");
            im16144579.setLore(rsand1244579);
            rsand1144579.setItemMeta(im16144579);
            inventory.setItem(34, rsand1144579);
            
            ArrayList<String> rsand1244578 = new ArrayList<String>();
            ItemStack rsand1144578 = new ItemStack(Material.DIRT);
            ItemMeta im16144578 = rsand1144578.getItemMeta();
            im16144578.setDisplayName("§bErde");
            rsand1244578.add("§7Preis: §a1$");
            im16144578.setLore(rsand1244578);
            rsand1144578.setItemMeta(im16144578);
            inventory.setItem(37, rsand1144578);
            
            ArrayList<String> rsand1244577 = new ArrayList<String>();
            ItemStack rsand1144577 = new ItemStack(Material.DIRT, 1,(short)1);
            ItemMeta im16144577 = rsand1144577.getItemMeta();
            im16144577.setDisplayName("§bGrobe-Erde");
            rsand1244577.add("§7Preis: §a2$");
            im16144577.setLore(rsand1244577);
            rsand1144577.setItemMeta(im16144577);
            inventory.setItem(38, rsand1144577);
            
            p.openInventory(inventory);
               
            p.sendMessage(Main.pre + "§3Du hast den §e§lHandwerker §3geöffnet");
        }
        return true;
    }
           
   
   
    @EventHandler
    public void handleMagierMenuClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getClickedInventory().getTitle().equals(GUI_NAME) && e.getCurrentItem() != null) {
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§fWeißes Glas")) {
                e.setCancelled(true);
            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Hier ist das Handwerker-Menü")) {
                e.setCancelled(true);
            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bEichenholz")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 100)) {
 
                    ItemStack item = new ItemStack(Material.LOG);
 
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 100);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bFichtenholz")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 25)) {
 
                    ItemStack item = new ItemStack(Material.LOG, 1, (short) 1);
 
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 25);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bBirkenholz")){
            	 if (es.hasEnoughMoney(p.getUniqueId(), 25)) {
                	ItemStack item = new ItemStack(Material.LOG, 1, (short) 2);
 
                    p.getInventory().addItem(item);
                    es.removeMoney(p.getUniqueId(), 25);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bTropenholz")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 25)) {
                    ItemStack magenta = new ItemStack(Material.LOG, 1, (short) 3);
 
                    p.getInventory().addItem(magenta);
                    es.removeMoney(p.getUniqueId(), 25);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bAkazienholz")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 25)) {
                    ItemStack rosa = new ItemStack(Material.LOG_2);
 
                    p.getInventory().addItem(rosa);
                    es.removeMoney(p.getUniqueId(), 25);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bSchwarzeichenholz")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 25)) {
                    ItemStack lila = new ItemStack(Material.LOG_2, 1, (short) 1);
                   
                    p.getInventory().addItem(lila);
                    es.removeMoney(p.getUniqueId(), 25);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bGras")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 4)) {
                    ItemStack grau = new ItemStack(Material.GRASS);
                   
                    p.getInventory().addItem(grau);
                    es.removeMoney(p.getUniqueId(), 4);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bZiegelstein")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
                    ItemStack hblau = new ItemStack(Material.BRICK);
                    p.getInventory().addItem(hblau);
                    es.removeMoney(p.getUniqueId(), 20);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bObsidian")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 500)) {
                    ItemStack hgruen = new ItemStack(Material.OBSIDIAN);
                    p.getInventory().addItem(hgruen);
                    es.removeMoney(p.getUniqueId(), 500);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bEndstein")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 600)) {
                    ItemStack dblau = new ItemStack(Material.ENDER_STONE);
                    p.getInventory().addItem(dblau);
                    es.removeMoney(p.getUniqueId(), 600);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bSand")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
                    ItemStack weiß = new ItemStack(Material.SAND);
                    p.getInventory().addItem(weiß);
                    es.removeMoney(p.getUniqueId(), 20);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bKies")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
                   
                    ItemStack tuerkies = new ItemStack(Material.GRAVEL);
                    p.getInventory().addItem(tuerkies);
                    es.removeMoney(p.getUniqueId(), 20);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bRoter Sandstein")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 30)) {
                   
                    ItemStack rot = new ItemStack(Material.RED_SANDSTONE);
                    p.getInventory().addItem(rot);
                    es.removeMoney(p.getUniqueId(), 30);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bSandstein")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 30)) {
                   
                    ItemStack gelb = new ItemStack(Material.SANDSTONE);
                    p.getInventory().addItem(gelb);
                    es.removeMoney(p.getUniqueId(), 30);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bKiste")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 100)) {
                   
                    ItemStack orange = new ItemStack(Material.CHEST);
                    p.getInventory().addItem(orange);
                    es.removeMoney(p.getUniqueId(), 100);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bClay")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
               
                    ItemStack hgrau = new ItemStack(Material.CLAY);
                    p.getInventory().addItem(hgrau);
                    es.removeMoney(p.getUniqueId(), 20);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bBemoster Bruchstein")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
                    ItemStack dgruen = new ItemStack(Material.MOSSY_COBBLESTONE);
                    p.getInventory().addItem(dgruen);
                    es.removeMoney(p.getUniqueId(), 20);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bAndesit")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
                    ItemStack dgruen = new ItemStack(Material.STONE, 1, (short) 5);
                    p.getInventory().addItem(dgruen);
                    es.removeMoney(p.getUniqueId(), 20);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
 
                }
              
 
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bWassereimer")) {
                if (es.hasEnoughMoney(p.getUniqueId(), 2000)) {
                    ItemStack dgruen = new ItemStack(Material.WATER_BUCKET);
                    p.getInventory().addItem(dgruen);
                    es.removeMoney(p.getUniqueId(), 2000);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bLavaeimer")) {
                if (es.hasEnoughMoney(p.getUniqueId(),2000)) {
                    ItemStack dgruen = new ItemStack(Material.LAVA_BUCKET);
                    p.getInventory().addItem(dgruen);
                    es.removeMoney(p.getUniqueId(), 2000);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bPodsol")) {
                if (es.hasEnoughMoney(p.getUniqueId(),5)) {
                    ItemStack dgruen = new ItemStack(Material.DIRT, 1,(short) 2);
                    p.getInventory().addItem(dgruen);
                    es.removeMoney(p.getUniqueId(), 5);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bGrobe-Erde")) {
                if (es.hasEnoughMoney(p.getUniqueId(),2)) {
                    ItemStack dgruen = new ItemStack(Material.DIRT, 1,(short)1);
                    p.getInventory().addItem(dgruen);
                    es.removeMoney(p.getUniqueId(), 2);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
            }else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bErde")) {
                if (es.hasEnoughMoney(p.getUniqueId(),1)) {
                    ItemStack dgruen = new ItemStack(Material.DIRT);
                    p.getInventory().addItem(dgruen);
                    es.removeMoney(p.getUniqueId(), 1);
                } else {
                    p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                }
            }
            p.playSound(p.getLocation(), Sound.EXPLODE, 1L,1L);
        }
    }
 
}