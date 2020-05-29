package me.bluenitrox.listener;

import com.connorlinfoot.titleapi.TitleAPI;
import me.bluenitrox.main.Main;
import me.bluenitrox.utils.ScoreboardManager;
import me.bluenitrox.utils.Spawns;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ru.tehkode.permissions.bukkit.PermissionsEx;

import java.util.Arrays;

public class join_Listener implements Listener {

    @EventHandler
    public void onJoin3(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        p.teleport(Spawns.getSpawn(p));
        p.sendMessage(Main.pre +"§cBitte nehme beim Inventarsortieren keine items aus dem vorgesehenem Inventar raus.");
        p.sendMessage("§cSolltest du das machen bleiben diese bis zum Neustart weg. Du kannst sie dir mit /fix wiederhohlen!");
        TitleAPI.sendTitle(e.getPlayer(), 20, 20, 20, "§c§lWillkommen auf");
        TitleAPI.sendSubtitle(e.getPlayer(), 20, 20, 20,"§6§lBuildFFA");
        e.setJoinMessage(" ");
    }

    @EventHandler
    public void onJoin1(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        p.playSound(p.getLocation(), Sound.NOTE_STICKS ,10L,10L);
        ScoreboardManager.update();
        e.setJoinMessage(" ");
    }

    @EventHandler
    public void onJoin2(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        e.setJoinMessage(" ");
        if(!p.hasPlayedBefore()){
            PermissionsEx.getUser(p).addGroup("Spieler");
            PermissionsEx.getUser(p).removeGroup("default");
        }
    }

    @EventHandler
    public void onJoin(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        e.setJoinMessage(" ");
        p.getInventory().clear();

        death_Listener.giveitems(p);

    }

}
