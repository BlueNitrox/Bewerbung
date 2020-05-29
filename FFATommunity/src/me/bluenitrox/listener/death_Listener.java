package me.bluenitrox.listener;

import com.connorlinfoot.actionbarapi.ActionBarAPI;
import me.bluenitrox.main.Main;
import me.bluenitrox.stats.Deaths;
import me.bluenitrox.stats.Kills;
import me.bluenitrox.utils.Coins;
import me.bluenitrox.utils.PunkteSys;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

public class death_Listener implements Listener {

    @EventHandler
    public void onDeath(final PlayerDeathEvent e){
        Player p = (Player)e.getEntity();
        if(p instanceof Player){
            e.setDeathMessage(null);
            death(e.getEntity().getKiller(), e.getEntity());
        }
    }

    public void death(Player killer, Player p){
        Deaths d = new Deaths();
        Kills k = new Kills();
        PunkteSys ps = new PunkteSys();
        Coins c = new Coins();
        Player k1 = killer;
        c.addCoins(k1.getUniqueId(), 5);
        c.addCoins(p.getUniqueId(), 1);
        killer.setHealth(20);
        d.addDeath(p.getUniqueId(), 1);
        k.addKill(k1.getUniqueId(), 1);
        ps.addpunkte(p.getUniqueId(), 1);
        ps.addpunkte(k1.getUniqueId(), 5);
        ActionBarAPI.sendActionBar(p, "§7 » §cDu wurdest von " + k1.getName() + " getötet", 20*5);
        ActionBarAPI.sendActionBar(k1, "§7 » §aDu hast §e" + p.getName() + "§a getötet", 20*5);
    }

    @EventHandler
    public void onrespawn(final PlayerRespawnEvent e){
        Player p = (Player)e.getPlayer();
        p.playSound(p.getLocation(), Sound.BAT_DEATH, 10L, 10L);
        p.getInventory().clear();

        giveitems(p);
    }


    public static void giveitems(Player p){
        p.getInventory().setItem(0,Main.Schwert());
        p.getInventory().setItem(1,Main.Stick());
        p.getInventory().setItem(5,Main.Blöcke());
        p.getInventory().setItem(4,Main.Blöcke());
        p.getInventory().setItem(3,Main.Blöcke());
        p.getInventory().setItem(2,Main.Blöcke());
        p.getInventory().setItem(31,Main.Chest());

        p.getInventory().setHelmet(Main.Helm());
        p.getInventory().setChestplate(Main.chestplate());
        p.getInventory().setLeggings(Main.leggings());
        p.getInventory().setBoots(Main.boots());
    }

}
