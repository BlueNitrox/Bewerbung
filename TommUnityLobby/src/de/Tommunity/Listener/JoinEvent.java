package de.Tommunity.Listener;

import com.connorlinfoot.actionbarapi.ActionBarAPI;
import com.connorlinfoot.titleapi.TitleAPI;
import net.md_5.bungee.BungeeCord;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import de.Tommunity.Main.Main;
import de.Tommunity.Utils.ItemManager;
import de.Tommunity.Utils.Scoremanager;
import de.Tommunity.Utils.TitleManager;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;


public class JoinEvent implements Listener{

    @EventHandler
    public void onJoin1(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        TitleAPI.sendTitle(e.getPlayer(), 20, 20, 20, "§c§lWillkommen auf");
        TitleAPI.sendSubtitle(e.getPlayer(), 20, 20, 20,"§6§lTommunity.de");


    }

    @EventHandler
    public void onJoin2(final PlayerJoinEvent e){
        Player p = (Player)e.getPlayer();
        ActionBarAPI.sendActionBar(p, "§7» §c§lUnser Discord §7× §6§l/dc", 20*60*60*24);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.setSneaking(true);
        p.setSneaking(false);
        if(p.hasPlayedBefore()){
            e.setJoinMessage(null);
            p.setHealth(20);
            p.setFoodLevel(20);
            p.getInventory().setBoots(ItemManager.createItem(Material.DIAMOND_BOOTS, 1,0,"§cKeine Boots"));
            p.getInventory().clear();
            p.setGameMode(GameMode.ADVENTURE);

            TitleManager.sendTabTitle(p,"\n §7•• §e§lTommunity.de §8| §7Server-Netzwerk §7•• \n  §7 •• YouTube: §aPalkuchen §7••\n" , "\n§7•• Teamspeak: §aTommunity.de §7••\n §7•• Website: §aTommunity.de §7••\n");

            if(p.hasPermission("Tom.more")){
                p.getInventory().setItem(1,ItemManager.createItem(Material.SLIME_BALL, 1, 0, "§cSpieler verstecken"));
                p.getInventory().setItem(4,ItemManager.createItem(Material.COMPASS, 1, 0, "§cNavigator"));
                p.getInventory().setItem(2, ItemManager.createItem(Material.TNT,1, 0, "§cSilentLobby"));
                p.getInventory().setItem(0,ItemManager.createItem(Material.ENDER_CHEST, 1, 0, "§cExtras"));
                p.getInventory().setItem(7, ItemManager.createItem(Material.SLIME_BLOCK, 1, 0, "§cJump and Run"));
                p.getInventory().setItem(8,createSkull(p.getName() , "§c" + p.getDisplayName()));
            } else {
                p.getInventory().setItem(1,ItemManager.createItem(Material.SLIME_BALL, 1, 0, "§cSpieler verstecken"));
                p.getInventory().setItem(4,ItemManager.createItem(Material.COMPASS, 1, 0, "§cNavigator"));
                p.getInventory().setItem(0,ItemManager.createItem(Material.ENDER_CHEST, 1, 0, "§cExtras"));
                p.getInventory().setItem(7, ItemManager.createItem(Material.SLIME_BLOCK, 1, 0, "§cJump and Run"));
                p.getInventory().setItem(8,createSkull(p.getName() , "§c" + p.getDisplayName()));
            }
        } else {
            e.setJoinMessage(null);
            p.setHealth(20);
            p.setFoodLevel(20);
            p.getInventory().setBoots(ItemManager.createItem(Material.DIAMOND_BOOTS, 1,0,"§cKeine Boots"));
            p.getInventory().clear();
            p.setGameMode(GameMode.ADVENTURE);


            TitleManager.sendTabTitle(p, null , null);

            if(p.hasPermission("Tom.more")){
                p.getInventory().setItem(1,ItemManager.createItem(Material.SLIME_BALL, 1, 0, "§cSpieler verstecken"));
                p.getInventory().setItem(4,ItemManager.createItem(Material.COMPASS, 1, 0, "§cNavigator"));
                p.getInventory().setItem(2, ItemManager.createItem(Material.TNT,1, 0, "§cSilentLobby"));
                p.getInventory().setItem(7, ItemManager.createItem(Material.SLIME_BLOCK, 1, 0, "§cJump and Run"));
                p.getInventory().setItem(0,ItemManager.createItem(Material.ENDER_CHEST, 1, 0, "§cExtras"));
                p.getInventory().setItem(8,createSkull(p.getName() , "§c" + p.getDisplayName()));
            } else {
                p.getInventory().setItem(1,ItemManager.createItem(Material.SLIME_BALL, 1, 0, "§cSpieler verstecken"));
                p.getInventory().setItem(4,ItemManager.createItem(Material.COMPASS, 1, 0, "§cNavigator"));
                p.getInventory().setItem(0,ItemManager.createItem(Material.ENDER_CHEST, 1, 0, "§cExtras"));
                p.getInventory().setItem(7, ItemManager.createItem(Material.SLIME_BLOCK, 1, 0, "§cJump and Run"));
                p.getInventory().setItem(8,createSkull(p.getName() , "§c" + p.getDisplayName()));
            }
        }
    	
        for(Player all : Bukkit.getOnlinePlayers()) {
        Scoremanager.sendTabAndScoreboard(all);
        }
    	
    }

    public static ItemStack createSkull(String owner, String displayName) {
        final ItemStack is = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
        final SkullMeta sm = (SkullMeta)is.getItemMeta();
        sm.setOwner(owner);
        sm.setDisplayName(displayName);
        is.setItemMeta((ItemMeta)sm);
        return is;
    }


    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        e.setQuitMessage(null);
        for(Player all : Bukkit.getOnlinePlayers()){
            Scoremanager.sendTabAndScoreboard(all);
        }
    }

    @EventHandler
    public void onMove(final PlayerToggleSneakEvent e){
        Player p = (Player)e.getPlayer();
        Scoremanager.sendTabAndScoreboard(p);
    }


}
