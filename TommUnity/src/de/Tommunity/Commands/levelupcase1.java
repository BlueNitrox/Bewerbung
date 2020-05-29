package de.Tommunity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Main.Main;

public class levelupcase1 implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	private final String GUI_NAME = "§4§lWeihnachts Geschenk";
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player)cs;

		if(p.hasPermission("Tom.*")) {
			Inventory inv = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

			ItemStack item1 = new ItemStack(Material.DIAMOND);
			ItemMeta im = item1.getItemMeta();
			im.setDisplayName("§cWeihnachtsgeschenk");
			item1.setItemMeta(im);

			inv.setItem(13, item1);

			p.openInventory(inv);

		}else {
			p.sendMessage(Main.err);
		}
		return false;
	}
}
