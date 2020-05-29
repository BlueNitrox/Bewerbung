package de.Tommunity.Listener;

import de.Tommunity.Main.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.help.HelpTopic;

public class Process implements Listener {

    @EventHandler(priority = EventPriority.NORMAL)
    public void handlefalseCommand(PlayerCommandPreprocessEvent e) {

        if(!(e.isCancelled())) {
            Player p = e.getPlayer();
            String msg = e.getMessage().split(" ")[0];
            HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
            if(topic == null) {
                p.sendMessage(Main.pre + "§cDieser Befehl existiert nicht!");
                e.setCancelled(true);
            }
        }
    }

}
