package de.Tommunity.Commands;

import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;

public class Troll implements CommandExecutor {

    public static String GUI_NAME = "§cTroll-Menu";
    public static ArrayList<Player> trollIn = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if(!(cs instanceof Player)){
            cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
            return true;
        }
        if(args.length == 0){
            if(trollIn.contains(p)) {
                trollIn.add(p);
                p.sendMessage(Main.pre + "§cDu bist nun im Troll Modus!");
                p.getInventory().getItemInHand().setType(Material.COMPASS);
            }else {
                trollIn.remove(p);
                p.sendMessage(Main.pre + "§aDu bist nun nichtmehr im Troll Modus!");
                p.getInventory().clear();
                p.setGameMode(GameMode.SURVIVAL);
                p.setFlying(false);
            }
        }else {
            p.sendMessage(Main.pre + "§cBenutze: §6/troll§c!");
        }
        return false;
    }

    @EventHandler
    public void onright(final PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if(p.getItemInHand().getType() == Material.COMPASS){
                if(trollIn.contains(p)){
                    //Inv open!
                    Inventory inv = Bukkit.createInventory(null, 9 * 1, GUI_NAME);

                    ItemStack gamemode1 = new ItemBuilder(Material.DIAMOND_SWORD).setDisplayname("§cGameMode 1").setLore(Arrays.asList("  ","§7Setzt dich in den GameMode 1!"," ")).build();
                    ItemStack gamemode0 = new ItemBuilder(Material.WOOD_SWORD).setDisplayname("§5GameMode 0").setLore(Arrays.asList("  ","§7Setzt dich in den GameMode 0!"," ")).build();
                    ItemStack gamemode3 = new ItemBuilder(Material.IRON_SWORD).setDisplayname("§9GameMode 3").setLore(Arrays.asList("  ","§7Setzt dich in den GameMode 3!"," ")).build();


                    inv.setItem(0, gamemode1);
                    inv.setItem(1, gamemode0);
                    inv.setItem(2, gamemode3);

                    p.openInventory(inv);
                }
            }
        }
    }

    @EventHandler
    public void onClick(final InventoryClickEvent e){
        Player p = (Player)e.getWhoClicked();
        if(e.getClickedInventory().getName().equals(GUI_NAME)){
            e.setCancelled(true);
        }
        if(e.getCurrentItem().getType() == Material.DIAMOND_SWORD){
            p.setGameMode(GameMode.CREATIVE);
            p.sendMessage(Main.pre + "§cDu wurdest in den GameMode 1 gesetzt!");
            p.closeInventory();
            return;
        }
        if(e.getCurrentItem().getType() == Material.WOOD_SWORD){
            p.setGameMode(GameMode.SURVIVAL);
            p.sendMessage(Main.pre + "§cDu wurdest in den GameMode 0 gesetzt!");
            p.closeInventory();
            return;
        }
        if(e.getCurrentItem().getType() == Material.IRON_SWORD){
            p.setGameMode(GameMode.SPECTATOR);
            p.sendMessage(Main.pre + "§cDu wurdest in den GameMode 3 gesetzt!");
            p.closeInventory();
            return;
        }


    }

}
