package de.Tommunity.Listener;

import de.Tommunity.Main.Main;
import de.Tommunity.Utils.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import ru.tehkode.permissions.bukkit.PermissionsEx;

import java.awt.peer.LightweightPeer;
import java.util.Arrays;

public class Interact_Listener implements Listener {

    public static String GUI_NAME = "§7Spieler-Info";
    public static String GUI_NAME2 = "§7Friend-System";

    @EventHandler
    public void onClick(final PlayerInteractEvent e){
        Player p = (Player)e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if(e.getPlayer().getItemInHand().getType() == Material.SKULL_ITEM){
                Inventory inv = Bukkit.createInventory(null , 9*3, GUI_NAME);
                ItemStack Glas = new ItemStack(Material.STAINED_GLASS_PANE);
                ItemMeta glass = Glas.getItemMeta();
                glass.setDisplayName(" ");
                Glas.setItemMeta(glass);

                ItemStack Glas1 = new ItemStack(Material.BARRIER);
                ItemMeta glass1 = Glas1.getItemMeta();
                glass1.setDisplayName("§cComing Soon");
                Glas1.setItemMeta(glass1);

                ItemStack rang = new ItemStack(Material.DIAMOND);
                ItemMeta rang1 = rang.getItemMeta();
                if(PermissionsEx.getUser(p).inGroup("Owner")){
                    rang1.setLore(Arrays.asList("§4§lOwner"));
                }else if(PermissionsEx.getUser(p).inGroup("Admin")){
                    rang1.setLore(Arrays.asList("§4§lAdmin"));
                }else if(PermissionsEx.getUser(p).inGroup("Developer")){
                    rang1.setLore(Arrays.asList("§d§lDeveloper"));
                }else if(PermissionsEx.getUser(p).inGroup("Moderator")){
                    rang1.setLore(Arrays.asList("§2Moderator"));
                }else if(PermissionsEx.getUser(p).inGroup("Supporter")){
                    rang1.setLore(Arrays.asList("§aSupporter"));
                }else if(PermissionsEx.getUser(p).inGroup("Builder")){
                    rang1.setLore(Arrays.asList("§eBuilder"));
                }else if(PermissionsEx.getUser(p).inGroup("YouTuber")){
                    rang1.setLore(Arrays.asList("§5YouTuber"));
                }else if(PermissionsEx.getUser(p).inGroup("Hero")){
                    rang1.setLore(Arrays.asList("§9Hero"));
                }else if(PermissionsEx.getUser(p).inGroup("Master")){
                    rang1.setLore(Arrays.asList("§dMaster"));
                }else if(PermissionsEx.getUser(p).inGroup("Bussines")){
                    rang1.setLore(Arrays.asList("§6Bussines"));
                }else if(PermissionsEx.getUser(p).inGroup("Spieler")){
                    rang1.setLore(Arrays.asList("§7Spieler"));
                }
                rang1.setDisplayName("§9Dein Rang");
                rang.setItemMeta(rang1);

                for (int i = 0; i != 9; i++) {
                    inv.setItem(i, Glas);
                }
                for (int i = 18; i != 27; i++) {
                    inv.setItem(i, Glas);
                }

                inv.setItem(9, Glas);
                inv.setItem(10, Glas);
                inv.setItem(12, Glas);
                inv.setItem(14, Glas);
                inv.setItem(16, Glas);
                inv.setItem(17, Glas);

                inv.setItem(11, rang);
                inv.setItem(13, Glas1);
                inv.setItem(15, createSkull(p.getName(), "§cFriend-System"));

                p.openInventory(inv);
            }
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
    public void onOpen(final InventoryOpenEvent e){
        Player p = (Player)e.getPlayer();
        p.playSound(p.getLocation(), Sound.NOTE_PLING, 10L, 10L);
    }

    @EventHandler
    public void onClick(final InventoryClickEvent e){
        Player p = (Player)e.getWhoClicked();
        if(e.getClickedInventory().getName().equals(GUI_NAME)){
            e.setCancelled(true);
            if(e.getCurrentItem().getType() == Material.SKULL_ITEM){
                Inventory inv = Bukkit.createInventory(null, 9, GUI_NAME2);

                inv.setItem(0, ItemManager.createItem(Material.WOOD_HOE, 1,0,"§cFriend-List"));
                inv.setItem(1, ItemManager.createItem(Material.STONE_HOE, 1, 0, "§cFriend clear"));
                inv.setItem(2, ItemManager.createItem(Material.GOLD_SWORD,1,0,"§cFriend accept all"));
                inv.setItem(3, ItemManager.createItem(Material.IRON_SWORD, 1,0,"§cFriend deny all"));
                inv.setItem(4, ItemManager.createItem(Material.DIAMOND_SWORD, 1,0,"§cFriend help"));

                p.closeInventory();
                p.openInventory(inv);
            }
        }else if(e.getClickedInventory().getName().equals(GUI_NAME2)){
            e.setCancelled(true);
            if(e.getCurrentItem().getType() == Material.WOOD_SWORD){
                p.sendMessage(Main.pre +"§cBenutze: §6/friend list");
            }else if(e.getCurrentItem().getType() == Material.STONE_SWORD){
                p.sendMessage(Main.pre +"§cBenutze: §6/friend clear");
            }else if(e.getCurrentItem().getType() == Material.GOLD_SWORD){
                p.sendMessage(Main.pre +"§cBenutze: §6/friend acceptall");
            }else if(e.getCurrentItem().getType() == Material.IRON_SWORD){
                p.sendMessage(Main.pre +"§cBenutze: §6/friend denyall");
            }else if(e.getCurrentItem().getType() == Material.DIAMOND_SWORD){
                p.sendMessage(Main.pre +"§cBenutze: §6/friend help");
            }
        }
    }
}
