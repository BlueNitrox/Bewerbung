package de.Tommunity.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import de.Tommunity.Commands.Vanish;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.Arena;

public class PlayerQuitEvent_Vanish implements Listener {

  Main plugin;
  
  public void R(Main plugin) {
      this.plugin = plugin;
  }
  
    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
       Player p = e.getPlayer();
    	
       if(Arena.warte.contains(p)) {
       	Arena.warte.clear();
       }
       if(Arena.warteno.contains(p)) {
       	Arena.warteno.clear();
       }
       
       e.setQuitMessage("");
       if(Vanish.vanished.contains(e.getPlayer())) Vanish.vanished.remove(e.getPlayer());
    	Player t = plugin.mM.getEmpfaenger(p);
        plugin.mM.removeEmpfaenger(p, t);

        
    }

}