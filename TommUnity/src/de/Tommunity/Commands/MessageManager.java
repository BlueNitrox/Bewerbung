package de.Tommunity.Commands;
 
import java.util.HashMap;

import org.bukkit.entity.Player;

import de.Tommunity.Main.Main;
 
public class MessageManager {
 
    Main plugin;
   
    HashMap<Player, Player> msg = new HashMap<Player, Player>();
   
    public MessageManager(Main plugin) {
        this.plugin = plugin;
    }
   
    public void setEmpfaenger(Player sender, Player empfaenger) {
        msg.put(sender, empfaenger);
        msg.put(empfaenger, sender);
    }
    public void removeEmpfaenger(Player sender, Player empfaenger) {
        msg.remove(sender);
        msg.remove(empfaenger);
    }
   
    public Player getEmpfaenger(Player sender) {
        return msg.get(sender);
    }
}