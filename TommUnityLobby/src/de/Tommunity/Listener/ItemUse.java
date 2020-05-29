package de.Tommunity.Listener;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

import de.Tommunity.Main.Main;
import de.Tommunity.Utils.ItemManager;
import de.Tommunity.Utils.TitleManager;
import org.bukkit.scheduler.BukkitRunnable;


public class ItemUse implements Listener {

    static ArrayList<String> SpielerVerstecken = new ArrayList<String>();
    public static boolean SilentLobby = false;

    @EventHandler
    public void onUse(PlayerInteractEvent e) {
        Player p = e.getPlayer();

        //Extras
        if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK) || e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            if (p.getItemInHand().getType() == Material.ENDER_CHEST) {
                Inventory inv = Bukkit.createInventory(p, 9, "§cExtras §8| §fAuswahl");

                inv.setItem(2, ItemManager.createItem(Material.DIAMOND_BOOTS, 1, 0, "§cBoots"));

                if (p.hasPermission("Tom.Doppel")) {
                    if (InventoryListener.sprung.contains(p)) {
                        inv.setItem(4, ItemManager.createItem(Material.FEATHER, 1, 0, "§7Doppelsprung §8» §aAktiviert"));
                    } else {
                        inv.setItem(4, ItemManager.createItem(Material.FEATHER, 1, 0, "§7Doppelsprung §Â» §cDeaktiviert"));
                    }
                }
                inv.setItem(6, ItemManager.createItem(Material.PUMPKIN, 1, 0, "§cHüte §8| §fAuswahl"));

                p.openInventory(inv);
            }
        }

        //Navigator
        if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK) || e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            if (p.getItemInHand().getType() == Material.COMPASS) {
                Inventory inv = Bukkit.createInventory(null, 45, "§cSpielmodi §8| §fAuswahl");
                for (int i = 0; i != 3; i++) {
                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                }
                for (int i = 4; i != 5; i++) {
                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                }
                for (int i = 6; i != 20; i++) {
                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                }
                for (int i = 21; i != 22; i++) {
                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                }
                for (int i = 23; i != 24; i++) {
                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                }
                for (int i = 25; i != 39; i++) {
                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                }
                for (int i = 40; i != 41; i++) {
                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                }
                for (int i = 42; i != 45; i++) {
                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE, 1, 15, " "));
                }


                p.openInventory(inv);
                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 10L,10L);
                new BukkitRunnable(){
                    @Override
                    public void run() {
                        Inventory inv = Bukkit.createInventory(null, 45, "§cSpielmodi §8| §fAuswahl");
                        for (int i = 0; i != 3; i++) {
                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                        }
                        for (int i = 4; i != 5; i++) {
                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                        }
                        for (int i = 6; i != 20; i++) {
                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                        }
                        for (int i = 21; i != 22; i++) {
                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                        }
                        for (int i = 23; i != 24; i++) {
                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                        }
                        for (int i = 25; i != 39; i++) {
                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                        }
                        for (int i = 40; i != 41; i++) {
                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                        }
                        for (int i = 42; i != 45; i++) {
                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE, 1, 15, " "));
                        }

                        if (p.hasPermission("Testserver")) {
                            inv.setItem(3, ItemManager.createItem(Material.TNT, 1, 0, "§cTestserver"));
                        }else {
                            inv.setItem(3, ItemManager.createItem(Material.EMERALD,1,0,"§cTrading-Station"));
                        }

                        p.openInventory(inv);
                        p.playSound(p.getLocation(), Sound.NOTE_STICKS, 10L, 10L);

                        new BukkitRunnable(){
                            @Override
                            public void run() {
                                Inventory inv = Bukkit.createInventory(null, 45, "§cSpielmodi §8| §fAuswahl");
                                for (int i = 0; i != 3; i++) {
                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                }
                                for (int i = 4; i != 5; i++) {
                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                }
                                for (int i = 6; i != 20; i++) {
                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                }
                                for (int i = 21; i != 22; i++) {
                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                }
                                for (int i = 23; i != 24; i++) {
                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                }
                                for (int i = 25; i != 39; i++) {
                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                }
                                for (int i = 40; i != 41; i++) {
                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                }
                                for (int i = 42; i != 45; i++) {
                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE, 1, 15, " "));
                                }

                                if (p.hasPermission("Testserver")) {
                                    inv.setItem(3, ItemManager.createItem(Material.TNT, 1, 0, "§cTestserver"));
                                    inv.setItem(5, ItemManager.createItem(Material.EMERALD,1,0,"§cTrading-Station"));
                                }else {
                                    inv.setItem(3, ItemManager.createItem(Material.EMERALD,1,0,"§cTrading-Station"));
                                    inv.setItem(5, ItemManager.createItem(Material.BARRIER,1,0,"§cComing Soon"));
                                }
                                p.openInventory(inv);
                                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 10L, 10L);

                                new BukkitRunnable(){
                                    @Override
                                    public void run() {
                                        Inventory inv = Bukkit.createInventory(null, 45, "§cSpielmodi §8| §fAuswahl");
                                        for (int i = 0; i != 3; i++) {
                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                        }
                                        for (int i = 4; i != 5; i++) {
                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                        }
                                        for (int i = 6; i != 20; i++) {
                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                        }
                                        for (int i = 21; i != 22; i++) {
                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                        }
                                        for (int i = 23; i != 24; i++) {
                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                        }
                                        for (int i = 25; i != 39; i++) {
                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                        }
                                        for (int i = 40; i != 41; i++) {
                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                        }
                                        for (int i = 42; i != 45; i++) {
                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE, 1, 15, " "));
                                        }
                                        inv.setItem(20, ItemManager.createItem(Material.BREWING_STAND_ITEM, 1, 0, "§cScience"));

                                        if (p.hasPermission("Testserver")) {
                                            inv.setItem(3, ItemManager.createItem(Material.TNT, 1, 0, "§cTestserver"));
                                            inv.setItem(5, ItemManager.createItem(Material.EMERALD,1,0,"§cTrading-Station"));
                                        }else {
                                            inv.setItem(3, ItemManager.createItem(Material.EMERALD,1,0,"§cTrading-Station"));
                                            inv.setItem(5, ItemManager.createItem(Material.BARRIER,1,0,"§cComing Soon"));
                                        }

                                        p.openInventory(inv);
                                        p.playSound(p.getLocation(), Sound.NOTE_STICKS, 10L, 10L);
                                        new BukkitRunnable() {
                                            @Override
                                            public void run() {
                                                Inventory inv = Bukkit.createInventory(null, 45, "§cSpielmodi §8| §fAuswahl");
                                                for (int i = 0; i != 3; i++) {
                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                }
                                                for (int i = 4; i != 5; i++) {
                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                }
                                                for (int i = 6; i != 20; i++) {
                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                }
                                                for (int i = 21; i != 22; i++) {
                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                }
                                                for (int i = 23; i != 24; i++) {
                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                }
                                                for (int i = 25; i != 39; i++) {
                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                }
                                                for (int i = 40; i != 41; i++) {
                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                }
                                                for (int i = 42; i != 45; i++) {
                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE, 1, 15, " "));
                                                }
                                                inv.setItem(20, ItemManager.createItem(Material.BREWING_STAND_ITEM, 1, 0, "§cScience"));
                                                inv.setItem(22, ItemManager.createItem(Material.COOKIE, 1, 0, "§cSpawn"));

                                                if (p.hasPermission("Testserver")) {
                                                    inv.setItem(3, ItemManager.createItem(Material.TNT, 1, 0, "§cTestserver"));
                                                    inv.setItem(5, ItemManager.createItem(Material.EMERALD,1,0,"§cTrading-Station"));
                                                }else {
                                                    inv.setItem(3, ItemManager.createItem(Material.EMERALD,1,0,"§cTrading-Station"));
                                                    inv.setItem(5, ItemManager.createItem(Material.BARRIER,1,0,"§cComing Soon"));
                                                }

                                                p.openInventory(inv);
                                                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 10L, 10L);
                                                new BukkitRunnable() {
                                                    @Override
                                                    public void run() {
                                                        Inventory inv = Bukkit.createInventory(null, 45, "§cSpielmodi §8| §fAuswahl");
                                                        for (int i = 0; i != 3; i++) {
                                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                        }
                                                        for (int i = 4; i != 5; i++) {
                                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                        }
                                                        for (int i = 6; i != 20; i++) {
                                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                        }
                                                        for (int i = 21; i != 22; i++) {
                                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                        }
                                                        for (int i = 23; i != 24; i++) {
                                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                        }
                                                        for (int i = 25; i != 39; i++) {
                                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                        }
                                                        for (int i = 40; i != 41; i++) {
                                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                        }
                                                        for (int i = 42; i != 45; i++) {
                                                            inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE, 1, 15, " "));
                                                        }
                                                        inv.setItem(20, ItemManager.createItem(Material.BREWING_STAND_ITEM, 1, 0, "§cScience"));
                                                        inv.setItem(22, ItemManager.createItem(Material.COOKIE, 1, 0, "§cSpawn"));
                                                        inv.setItem(24, ItemManager.createItem(Material.RED_SANDSTONE, 1, 0, "§cBuildFFA"));

                                                        if (p.hasPermission("Testserver")) {
                                                            inv.setItem(3, ItemManager.createItem(Material.TNT, 1, 0, "§cTestserver"));
                                                            inv.setItem(5, ItemManager.createItem(Material.EMERALD,1,0,"§cTrading-Station"));
                                                        }else {
                                                            inv.setItem(3, ItemManager.createItem(Material.EMERALD,1,0,"§cTrading-Station"));
                                                            inv.setItem(5, ItemManager.createItem(Material.BARRIER,1,0,"§cComing Soon"));
                                                        }

                                                        p.openInventory(inv);
                                                        p.playSound(p.getLocation(), Sound.NOTE_STICKS, 10L, 10L);
                                                        new BukkitRunnable() {
                                                            @Override
                                                            public void run() {
                                                                Inventory inv = Bukkit.createInventory(null, 45, "§cSpielmodi §8| §fAuswahl");
                                                                for (int i = 0; i != 3; i++) {
                                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                                }
                                                                for (int i = 4; i != 5; i++) {
                                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                                }
                                                                for (int i = 6; i != 20; i++) {
                                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                                }
                                                                for (int i = 21; i != 22; i++) {
                                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                                }
                                                                for (int i = 23; i != 24; i++) {
                                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                                }
                                                                for (int i = 25; i != 39; i++) {
                                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                                }
                                                                for (int i = 40; i != 41; i++) {
                                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE,1,15," "));
                                                                }
                                                                for (int i = 42; i != 45; i++) {
                                                                    inv.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE, 1, 15, " "));
                                                                }
                                                                inv.setItem(20, ItemManager.createItem(Material.BREWING_STAND_ITEM, 1, 0, "§cScience"));
                                                                inv.setItem(22, ItemManager.createItem(Material.COOKIE, 1, 0, "§cSpawn"));
                                                                inv.setItem(24, ItemManager.createItem(Material.RED_SANDSTONE, 1, 0, "§cBuildFFA"));
                                                                inv.setItem(39, ItemManager.createItem(Material.BARRIER,1,0,"§cComing Soon"));
                                                                inv.setItem(41, ItemManager.createItem(Material.BARRIER,1,0,"§cComing Soon"));
                                                                if (p.hasPermission("Testserver")) {
                                                                    inv.setItem(3, ItemManager.createItem(Material.TNT, 1, 0, "§cTestserver"));
                                                                    inv.setItem(5, ItemManager.createItem(Material.EMERALD,1,0,"§cTrading-Station"));
                                                                }else {
                                                                    inv.setItem(3, ItemManager.createItem(Material.EMERALD,1,0,"§cTrading-Station"));
                                                                    inv.setItem(5, ItemManager.createItem(Material.BARRIER,1,0,"§cComing Soon"));
                                                                }

                                                                p.openInventory(inv);
                                                                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 10L, 10L);
                                                            }
                                                        }.runTaskLater(Main.getPlugin(), 2);
                                                    }
                                                }.runTaskLater(Main.getPlugin(), 2);
                                            }
                                        }.runTaskLater(Main.getPlugin(), 2);
                                    }
                                }.runTaskLater(Main.getPlugin(), 2);
                            }
                        }.runTaskLater(Main.getPlugin(), 2);
                    }
                }.runTaskLater(Main.getPlugin(), 2);
            }
        }

        //Spieler verstecken
        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (p.getItemInHand().getType() == Material.SLIME_BALL) {
                if (SpielerVerstecken.contains(p.getName())) {
                    SpielerVerstecken.remove(p.getName());
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        p.showPlayer(all);
                    }
                    p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
                    TitleManager.sendActionBar(p, "Alle Spieler sind nun §asichtbar");
                } else {
                    SpielerVerstecken.add(p.getName());
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        p.hidePlayer(all);
                    }
                    p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
                    TitleManager.sendActionBar(p, "Alle Spieler sind nun §cunsichtbar");
                }
            }
        }

        //SilentLobby
        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (p.getItemInHand().getType() == Material.TNT) {
                if (SpielerVerstecken.contains(p.getName())) {
                    SpielerVerstecken.remove(p.getName());
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        p.showPlayer(all);
                        all.showPlayer(p);
                    }
                    p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
                    TitleManager.sendActionBar(p, "§cDu bist nun nicht mehr in der SilentLobby");
                    SilentLobby = false;
                } else {
                    SpielerVerstecken.add(p.getName());
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        p.hidePlayer(all);
                        all.hidePlayer(p);
                    }
                    p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
                    TitleManager.sendActionBar(p, "§aDu bist nun in der SilentLobby");
                    SilentLobby = true;
                }
            }
        }
    }

}
