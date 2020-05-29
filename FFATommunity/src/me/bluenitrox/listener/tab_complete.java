package me.bluenitrox.listener;

import me.bluenitrox.main.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class tab_complete implements Listener {


    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e) {
        for(int i = 0; i < e.getMessage().length(); i++) {
            if (e.getMessage().startsWith("/pl")) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.pre  +"§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                return;
            }else if (e.getMessage().startsWith("/plugins")) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.pre  +"§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                return;
            }else if (e.getMessage().startsWith("//calc")) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.pre  +"§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                return;
            }else if (e.getMessage().startsWith("//calculate")) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.pre  +"§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                return;
            }else if (e.getMessage().startsWith("/ ")) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.pre  +"§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                return;
            }else if (e.getMessage().startsWith("/joinme")) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.pre  +"§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                return;
            }else if (e.getMessage().startsWith("/help")) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.pre  +"§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                return;
            }else if (e.getMessage().startsWith("/?")) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.pre  +"§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                return;
            }else if (e.getMessage().startsWith("/!")) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.pre  +"§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                return;
            } else if (e.getMessage().startsWith("/flamecord")) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                return;
            }
        }
    }

}
