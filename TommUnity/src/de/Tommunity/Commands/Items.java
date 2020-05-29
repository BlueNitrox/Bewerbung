package de.Tommunity.Commands;
 
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Main.Main;
 
public class Items implements CommandExecutor {
       
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + " §cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;
       
        if(!p.hasPermission("Tom.giveItems")) {
            p.sendMessage(Main.pre + " §cDazu hast du keine Rechte!");
        }
        if(args.length == 1) {
           
            if(args[0].equalsIgnoreCase("spawner")) {
                if(args.length == 2) {
                    if(args[2].equalsIgnoreCase("1")) {
                        ItemStack item = new ItemStack(Material.MOB_SPAWNER);
                        item.setAmount(1);
                        p.getInventory().addItem(item);
                    }
                     if(args[2].equalsIgnoreCase("2")) {
                            ItemStack item = new ItemStack(Material.MOB_SPAWNER);
                            item.setAmount(2);
                            p.getInventory().addItem(item);
                    }  
                     if(args[2].equalsIgnoreCase("3")) {
                            ItemStack item = new ItemStack(Material.MOB_SPAWNER);
                            item.setAmount(3);
                            p.getInventory().addItem(item);
                     }
                }
            }
            else if(args[0].equalsIgnoreCase("beacon")) {
                ItemStack item1 = new ItemStack(Material.BEACON);
                p.getInventory().addItem(item1);
            }  
            else if(args[0].equalsIgnoreCase("GewöhnlicheCase")) {
                ItemStack item2 = new ItemStack(Material.DRAGON_EGG);
                p.getInventory().addItem(item2);
            }
            else if(args[0].equalsIgnoreCase("dragonegg")) {
                ItemStack item3 = new ItemStack(Material.DRAGON_EGG);
                p.getInventory().addItem(item3);
            }
            else if(args[0].equalsIgnoreCase("Diabrecher")) {
                ItemStack item4 = new ItemStack(Material.DIAMOND_PICKAXE);
                ItemMeta im = item4.getItemMeta();
                im.setDisplayName("§6Diabrecher");
                im.addEnchant(Enchantment.DIG_SPEED, 7, true);
                im.addEnchant(Enchantment.DURABILITY, 10, true);
                item4.setItemMeta(im);
                p.getInventory().addItem(item4);
            }
            else if(args[0].equalsIgnoreCase("barrier")) {
                    ItemStack item5 = new ItemStack(Material.BARRIER);
                    p.getInventory().addItem(item5);
            }
            else if(args[0].equalsIgnoreCase("gundstein")) {
                ItemStack item6 = new ItemStack(Material.BEDROCK);
                p.getInventory().addItem(item6);
            }
            else if(args[0].equalsIgnoreCase("endportalrahmen")) {
                ItemStack item5 = new ItemStack(Material.ENDER_PORTAL_FRAME);
                p.getInventory().addItem(item5);
            }
            else {
                p.sendMessage(Main.pre + " §cEs sieht so aus als gibt es dieses Item nicht");
            }
        }
        else if(args.length == 2) {
           
         }
        return false;
    }
   
}