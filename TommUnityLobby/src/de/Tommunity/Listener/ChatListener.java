package de.Tommunity.Listener;

import de.Tommunity.Main.Main;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener{

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        Player p = e.getPlayer();

        if(e.getMessage().contains("%")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDu kannst keine %-Zeichen schreiben");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }

        if(p.hasPermission("Tom.Owner")){
            e.setFormat("§4§lOwner | " + p.getName() + " §8 » §a" + e.getMessage());
        }else if(p.hasPermission("Tom.Admin")){
            e.setFormat("§4§lAdmin | " + p.getName() + " §8 » §a" + e.getMessage());
        }else if(p.hasPermission("Tom.Dev")){
            e.setFormat("§b§lDeveloper | " + p.getName() + " §8 » §a" + e.getMessage());
        }else if(p.hasPermission("Tom.Mod")){
            e.setFormat("§2Moderator | " + p.getName() + " §8 » §a" + e.getMessage());
        }else if(p.hasPermission("Tom.Sup")){
            e.setFormat("§aSupporter | " + p.getName() + " §8 » §a" + e.getMessage());
        }else if(p.hasPermission("Tom.Builder")){
            e.setFormat("§eBuilder | " + p.getName() + " §8 » §a" + e.getMessage());
        }else if(p.hasPermission("Tom.YT")){
            e.setFormat("§5YouTuber | " + p.getName() + " §8 » §7" + e.getMessage());
        }else if(p.hasPermission("Tom.Hero")){
            e.setFormat("§9Hero | " + p.getName() + " §8 » §7" + e.getMessage());
        }else if(p.hasPermission("Tom.Master")){
            e.setFormat("§dMaster | " + p.getName() + " §8 » §7" + e.getMessage());
        }else if(p.hasPermission("Tom.Business")){
            e.setFormat("§6Business | " + p.getName() + " §8 » §7" + e.getMessage());
        }else {
            e.setFormat("§7Spieler | " + p.getName() + " §8 » §7" + e.getMessage());
        }




        if(ItemUse.SilentLobby){
            p.sendMessage(Main.pre + "In der SilentLobby ist der Chat nicht verfügbar");
            e.setCancelled(true);
        }
    }

}
