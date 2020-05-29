package de.Tommunity.Sell;
 
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Main.Main;
 
 
public class Shopmine9 implements CommandExecutor {
 
        @Override
        public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
       
            Player p = (Player) cs;
            if(!p.hasPermission("Tom.Shopmine")) {
                p.sendMessage(Main.pre + " §cDazu hast du keine Rechte");
            }
            if (args.length == 0) {
               
                Merchant m = new Merchant();
               
                m.setTitle("§aVerkaufe die Erze aus Mine 9");
               
                ItemStack stein = new ItemStack(Material.DIAMOND); // falsches erz hier!!!
                stein.setAmount(64);
               
                ItemStack ticket = new ItemStack(Material.PAPER);
                ItemMeta im = ticket.getItemMeta();
                im.setDisplayName("§a3500$");
                im.addEnchant(Enchantment.DURABILITY, 10, false);
                im.setLore(Arrays.asList("§7Rechtsklicken zum Geld abholen"));
                ticket.setItemMeta(im);
               
                m.addOffer(new MerchantOffer(stein, ticket));
               
                m.setCustomer(p);
                m.openTrading(p);
            }
            return false;
        }
    }