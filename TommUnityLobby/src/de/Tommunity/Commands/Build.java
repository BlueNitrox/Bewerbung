package de.Tommunity.Commands;

import de.Tommunity.Main.Main;
import de.Tommunity.Utils.ItemManager;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Build implements CommandExecutor{

    public static ArrayList<Player> build = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player p = (Player) sender;
        if(p.hasPermission("lobby.build")){
            if(build.contains(p)){
                build.remove(p);
                p.sendMessage(Main.pre + "Der Baumodus wurde §cdeaktiviert");
                p.setGameMode(GameMode.ADVENTURE);
                p.getInventory().clear();
                if(p.hasPermission("lobby.more")){
                    p.getInventory().setItem(2,ItemManager.createItem(Material.SLIME_BALL, 1, 0, "§cSpieler verstecken"));
                    p.getInventory().setItem(4,ItemManager.createItem(Material.COMPASS, 1, 0, "§cNavigator"));
                    p.getInventory().setItem(30, ItemManager.createItem(Material.TNT,1, 0, "§cSilentLobby"));
                    p.getInventory().setItem(32,ItemManager.createItem(Material.ENDER_CHEST, 1, 0, "§cExtras"));
                    p.getInventory().setItem(6,ItemManager.createItem(Material.SKULL_ITEM, 1, 0, "§aFriends"));
                } else {
                    p.getInventory().setItem(2,ItemManager.createItem(Material.SLIME_BALL, 1, 0, "§cSpieler verstecken"));
                    p.getInventory().setItem(4,ItemManager.createItem(Material.COMPASS, 1, 0, "§cNavigator"));
                    p.getInventory().setItem(30, ItemManager.createItem(Material.TNT,1, 0, "§cSilentLobby"));
                    p.getInventory().setItem(32,ItemManager.createItem(Material.ENDER_CHEST, 1, 0, "§cExtras"));
                    p.getInventory().setItem(6,ItemManager.createItem(Material.SKULL_ITEM, 1, 0, "§aFriends"));
                }
            } else {
               build.add(p);
                p.sendMessage(Main.pre + "Der Baumodus wurde §aaktiviert");
                p.setGameMode(GameMode.CREATIVE);
                p.getInventory().clear();
            }
        } else {
            p.sendMessage(Main.err_noperms);
        }
        return false;
    }

}
