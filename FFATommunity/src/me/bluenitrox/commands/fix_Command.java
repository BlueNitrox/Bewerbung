package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import me.bluenitrox.sort.InventorySort;
import me.bluenitrox.sort.Sort_Listener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class fix_Command implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String s, String[] args) {
        Player p = (Player)cs;
        if(!(cs instanceof Player)){
            cs.sendMessage(Main.keinP);
            return true;
        }
        if(args.length == 0){
            Inventory inv = p.getInventory();

            p.getInventory().clear();
            inv.setItem(0, Sort_Listener.createEnchantedItem(Material.STONE_SWORD, 1, "§6Schwert", Enchantment.DAMAGE_ALL, 1));
            inv.setItem(1, Sort_Listener.createEnchantedItem(Material.STICK, 1, "§cKnockBack Stick", Enchantment.KNOCKBACK, 1));
            inv.setItem(2, Sort_Listener.createItem(Material.SANDSTONE, 64, "§eBlöcke"));
            inv.setItem(3, Sort_Listener.createItem(Material.SANDSTONE, 64, "§eBlöcke"));
            inv.setItem(4, Sort_Listener.createItem(Material.SANDSTONE, 64, "§eBlöcke"));
            inv.setItem(5, Sort_Listener.createItem(Material.SANDSTONE, 64, "§eBlöcke"));
            inv.setItem(8, Sort_Listener.createItem(Material.CHEST, 1, "§1Shop"));

            p.sendMessage(Main.pre +"§cBugfixed!");

        }else {
            p.sendMessage("§cBenutze: §6/fix§c!");
        }
        return false;
    }
}
