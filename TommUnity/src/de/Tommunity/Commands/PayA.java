package de.Tommunity.Commands;
 
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
 
public class PayA implements CommandExecutor{

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    EconomySystem es = new EconomySystem();
   
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
       
        if(!(sender instanceof Player)) {
           
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
            return true;
        }
        Player p =(Player) sender;
        if(p.hasPermission("Tom.payA"))
        if(args.length == 2) {
           
                Integer amount = Integer.valueOf(args[1]);
                if(amount > 0 && amount < 50000) {
                   
                for(Player all : Bukkit.getOnlinePlayers()) {
                    if(es.hasEnoughMoney(p.getUniqueId(), amount)) {
                        es.removeMoney(p.getUniqueId(), amount);
                        es.addMoney(all.getUniqueId(), amount);
                       
                        p.sendMessage(Main.pre + "§3Du hast §e" + all.getName()+ " §a" + amount + "$ §3überwiesen");
                        all.sendMessage(Main.pre + "§e" + p.getName() + " §3hat dir §a" + amount + "$ §3überwiesen");
                       
                       
                       
                    }else {
                        p.sendMessage(Main.pre + "§cDu kannst niemandem mehr Geld geben als du selber hast");
                    }
                }
                   
                }else p.sendMessage(Main.pre + "§cDu kannst keinem Minusgeld geben!");

        }else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/paya * <Betrag>");
        }
        return false;
    }
}