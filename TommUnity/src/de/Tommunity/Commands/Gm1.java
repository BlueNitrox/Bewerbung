package de.Tommunity.Commands;
 
 
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
 
public class Gm1 implements CommandExecutor{
 
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;
       
        if(!p.hasPermission("Tom.gm1")) {
            p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
        }
        else if(args.length == 0) {
            p.setGameMode(GameMode.CREATIVE);
            p.sendMessage(Main.pre + "§3Du wurdest in den Gamemode 1 gesetzt");
        }
         else if(args.length == 1) {
            Player t = Bukkit.getPlayer(args[0]);
            if(t == null) {
                p.sendMessage(Main.pre + "§cDieser Spieler ist nicht online!");
            }
            else {
                t.setGameMode(GameMode.CREATIVE);
                t.sendMessage(Main.pre + "§3Du wurdest in den Gamemode 1 gesetzt!");
                p.sendMessage(Main.pre + "§3Du hast §6" + t.getPlayer().getName() + "§3 in den Gamemode 1 gesetzt!");
           
         }
             
       
    }
        return false;
 
}
}