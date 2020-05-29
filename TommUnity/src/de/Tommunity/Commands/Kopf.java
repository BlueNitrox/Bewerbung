package de.Tommunity.Commands;
 
import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import de.Tommunity.Main.Main;
 
public class Kopf implements CommandExecutor, Listener{
 
   
    private HashMap<String, Long> cooldowns = new HashMap<String, Long>();
   
 
 
 
    @Override
    public  boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;
        if(!p.hasPermission("Tom.Kopf")) {
            p.sendMessage(Main.pre + "§cUm diesen Befehl ausführen zu können benötigst du einen §fRang");
            return true;
        }
       
       
        if(args.length == 1) {
            if(p.hasPermission("Tom.Kopf")) {
            Long time = System.currentTimeMillis();
            if(this.cooldowns.containsKey(p.getName())) {
                Long lastUsage = this.cooldowns.get(p.getName());
                if (lastUsage + 604800*10000000 > time) {
                    p.sendMessage(Main.pre + "§cDu hast dir diese Woche schon einen Kopf geholt");
                    return true;
                   
                }
            }
            ItemStack is = new ItemStack(Material.SKULL_ITEM, 1 , (short) 3);
            SkullMeta im = (SkullMeta)is.getItemMeta();
            im.setOwner(args[0]);
            im.setDisplayName(args[0]);
            is.setItemMeta(im);
            p.getInventory().addItem(new ItemStack[] {is});
            p.updateInventory();
            p.sendMessage(Main.pre + "§3Du hast den Kopf von §6" + im.getDisplayName() + " §3 bekommen, in 1 Tag kannst du dir weider einen Kopf abholen");
            this.cooldowns.put(p.getName(), time);
           
            }else if(p.hasPermission("Tom.Team")){
 
                ItemStack is = new ItemStack(Material.SKULL_ITEM, 1 , (short) 3);
                SkullMeta im = (SkullMeta)is.getItemMeta();
                im.setOwner(args[0]);
                im.setDisplayName(args[0]);
                is.setItemMeta(im);
                p.getInventory().addItem(new ItemStack[] {is});
                p.updateInventory();
                p.sendMessage(Main.pre + "§3Du hast den Kopf von §6" + im.getDisplayName() + " §3 bekommen, in 1 Tag kannst du dir weider einen Kopf abholen");
            }
        }else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/kopf <Spieler>");
        }
        return false;
    }
}