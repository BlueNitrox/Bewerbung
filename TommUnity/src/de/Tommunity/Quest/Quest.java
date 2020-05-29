package de.Tommunity.Quest;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Quest implements CommandExecutor, Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static String GUI_NAME = "§6Quest";

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		Warzone w = new Warzone();
		Timo t = new Timo();
		if (!(cs instanceof Player)) {
			cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
			return true;
		}
		if (args.length == 0) {
			Inventory inv = Bukkit.createInventory(null, 3 * 9, GUI_NAME);
			ItemStack Warzone = new ItemBuilder(Material.DIAMOND_SWORD).setDisplayname("§6Warzone")
					.setLore("Diese Quest startet bei Tim", "§cNicht gemacht").build();
			ItemStack Timo = new ItemBuilder(Material.EXP_BOTTLE).setDisplayname("§3Levelup")
					.setLore("Diese Quest startet bei Timo!", "§cNicht gemacht").build();
			ItemStack Jäger = new ItemBuilder(Material.BOW).setDisplayname("§aJäger")
					.setLore("Diese Quest startet beim Jäger!", "§cNicht gemacht").build();

			ItemStack Warzone1 = new ItemBuilder(Material.DIAMOND_SWORD).addEnchant(Enchantment.ARROW_DAMAGE, 1, false)
					.setDisplayname("§6Warzone").setLore("Diese Quest startet bei Tim", "§aGemacht").build();
			ItemStack Timo1 = new ItemBuilder(Material.EXP_BOTTLE).addEnchant(Enchantment.ARROW_DAMAGE, 1, false)
					.setDisplayname("§3Levelup").setLore("Diese Quest startet bei Timo!", "§aGemacht").build();
			ItemStack Jäger1 = new ItemBuilder(Material.BOW).addEnchant(Enchantment.ARROW_DAMAGE, 1, false)
					.setDisplayname("§aJäger").setLore("Diese Quest startet beim Jäger!", "§aGemacht").build();

			if (PermissionsEx.getUser(p).inGroup("Tom.Zone.2")) {
				inv.setItem(15, Jäger1);
			} else {
				inv.setItem(15, Jäger);
			}
			if (t.isTimo(p.getUniqueId(), 4)) {
				inv.setItem(13, Timo1);
			} else {
				inv.setItem(13, Timo);
			}
			if (w.isWarzone(p.getUniqueId(), 3)) {
				inv.setItem(11, Warzone1);
			} else {
				inv.setItem(11, Warzone);
			}
			
			p.openInventory(inv);
			
		} else {
			p.sendMessage(Main.pre + "§cBenutzung: §6/quest§c!");
		}
		return false;
	}
	
	@EventHandler
	public void onClick(final InventoryClickEvent e) {
		if(e.getClickedInventory().getName().equals(GUI_NAME)) {
			e.setCancelled(true);
		}
	}

}
