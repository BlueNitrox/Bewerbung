package de.Tommunity.Commands;
 
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
 
public class Pay implements CommandExecutor{

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
        if(args.length == 2) {
            Player t = Bukkit.getPlayer(args[0]);
            if(t != null) {
           
                Integer amount = Integer.valueOf(args[1]);
                if(amount > 0) {
                   
                   
                    if(es.hasEnoughMoney(p.getUniqueId(), amount)) {
                        es.removeMoney(p.getUniqueId(), amount);
                        es.addMoney(t.getUniqueId(), amount);
                       
                        p.sendMessage(Main.pre + "§3Du hast §e" + t.getName()+ " §a" + amount + "$ §3überwiesen");
                        t.sendMessage(Main.pre + "§e" + p.getName() + " §3hat dir §a" + amount + "$ §3überwiesen");
                       
                       
                    
                    }else {
                        p.sendMessage(Main.pre + "§cDu kannst niemandem mehr Geld geben als du selber hast");
                    }
                }else p.sendMessage(Main.pre + "§cDu kannst niemandem Minus Geld Geben!");
                   
                   
               
            }else {
                p.sendMessage(Main.pre + "§cDieser Spieler ist nicht online");
            }
        }else {
            p.sendMessage(Main.pre + "§cBitte benutze §6/pay <Spieler> <Betrag>");
        }
        return false;
    }
}