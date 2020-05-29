package de.Tommunity.Listener;

import de.Tommunity.Main.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class tab_complete implements Listener {

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e) {
        for (int i = 0; i < e.getMessage().length(); i++) {
            if (!e.getPlayer().hasPermission("Tom.*")) {
                if (e.getMessage().startsWith("/pl")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("/plugins")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("//calc")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("//calculate")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("/ ")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("/joinme")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("/help")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("/?")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("/!")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("/me")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("/pex")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("//eval")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("//evaluate")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("/bungee")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("/server")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                } else if (e.getMessage().startsWith("/flamecord")) {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(Main.pre + "§cDieser Befehl existiert nicht! Bitte benutze §6/help!");
                    return;
                }
            }
        }
    }
}