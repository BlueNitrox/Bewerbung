package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Main.Main;

public class Geschenk implements CommandExecutor {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

	private final String GUI_NAME = "§cLevelupcase";
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player)cs;
		
		if(p.hasPermission("Tom.*")) {
		Inventory inv = Bukkit.createInventory(null, 9 * 3, GUI_NAME);
		
        ItemStack item1 = new ItemStack(Material.STICK);
        ItemMeta im = item1.getItemMeta();
        im.setDisplayName("§cLevelupcase §fLvl. 1-5");
        im.addEnchant(Enchantment.KNOCKBACK, 2, false);
        item1.setItemMeta(im);
        
        ItemStack item12 = new ItemStack(Material.EMERALD);
        ItemMeta im2 = item12.getItemMeta();
        im2.setDisplayName("§cLevelupcase §fLvl. 5-10");
        im2.addEnchant(Enchantment.KNOCKBACK, 2, false);
        item12.setItemMeta(im2);
        
        ItemStack item13 = new ItemStack(Material.EXP_BOTTLE);
        ItemMeta im3 = item13.getItemMeta();
        im3.setDisplayName("§6§l2000 Tommunity XP");
        im3.addEnchant(Enchantment.KNOCKBACK, 2, false);
        item13.setItemMeta(im3);
        
        inv.setItem(12, item1);
        inv.setItem(10, item13);
        inv.setItem(15, item12);
        
        p.openInventory(inv);
		
	}else {
		    p.sendMessage(Main.err);
        }
		return false;
}
}
