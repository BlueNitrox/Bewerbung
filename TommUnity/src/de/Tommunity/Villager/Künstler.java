package de.Tommunity.Villager;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;

public class Künstler implements CommandExecutor, Listener {

	private final String GUI_NAME = "§1§lKünstler";

	EconomySystem es = new EconomySystem();

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		if (!(cs instanceof Player)) {
			cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein");
			return false;
		}

		Player p = (Player) cs;
		if (!p.hasPermission("Tom.Künstler")) {
			p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
			return true;
		}
		if (args.length == 0) {
			Inventory inventory = Bukkit.createInventory(null, 9 * 7, GUI_NAME);

			ItemStack item1 = new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname("§7Glasscheibe").build();

			inventory.setItem(0, item1);
			inventory.setItem(1, item1);
			inventory.setItem(2, item1);
			inventory.setItem(3, item1);

			ArrayList<String> info = new ArrayList<>();
			ItemStack item2 = new ItemStack(Material.PAPER);
			ItemMeta im1 = item2.getItemMeta();
			im1.setDisplayName("§7Hier ist das Künstler-Menü");
			im1.setLore(info);
			item2.setItemMeta(im1);

			inventory.setItem(4, item2);

			inventory.setItem(5, item1);
			inventory.setItem(6, item1);
			inventory.setItem(7, item1);
			inventory.setItem(8, item1);
			inventory.setItem(9, item1);
			inventory.setItem(17, item1);
			inventory.setItem(18, item1);
			inventory.setItem(26, item1);
			inventory.setItem(27, item1);
			inventory.setItem(35, item1);
			inventory.setItem(36, item1);
			inventory.setItem(44, item1);
			inventory.setItem(45, item1);
			inventory.setItem(53, item1);
			inventory.setItem(54, item1);
			inventory.setItem(55, item1);
			inventory.setItem(56, item1);
			inventory.setItem(57, item1);
			inventory.setItem(58, item1);
			inventory.setItem(59, item1);
			inventory.setItem(60, item1);
			inventory.setItem(61, item1);
			inventory.setItem(62, item1);

			ItemStack wolle = new ItemStack(Material.WOOL);
			ItemMeta i = wolle.getItemMeta();
			i.setDisplayName("§bWeiße Wolle");
			i.setLore(Arrays.asList("§7Preis: §a100$"));
			wolle.setItemMeta(i);
			inventory.setItem(10, wolle);

			ItemStack glas = new ItemStack(Material.GLASS);
			ItemMeta im2 = glas.getItemMeta();
			im2.setDisplayName("§bWeißes Glas");
			im2.setLore(Arrays.asList("§7Preis: §a100$"));
			glas.setItemMeta(im2);
			inventory.setItem(11, glas);

			ItemStack ton = new ItemStack(Material.STAINED_CLAY);
			ItemMeta im3 = ton.getItemMeta();
			im3.setDisplayName("§bGebrannter Ton");
			im3.setLore(Arrays.asList("§7Preis: §a100$"));
			ton.setItemMeta(im3);
			inventory.setItem(12, ton);

			ItemStack magenta = new ItemStack(Material.INK_SACK, 1, (short) 13);
			ItemMeta im4 = magenta.getItemMeta();
			im4.setDisplayName("§bMagenta Farbstoff");
			im4.setLore(Arrays.asList("§7Preis: §a20$"));
			magenta.setItemMeta(im4);
			inventory.setItem(13, magenta);

			ItemStack rosa = new ItemStack(Material.INK_SACK, 1, (short) 9);
			ItemMeta im5 = rosa.getItemMeta();
			im5.setDisplayName("§bRosa Farbstoff");
			im5.setLore(Arrays.asList("§7Preis: §a20$"));
			rosa.setItemMeta(im5);
			inventory.setItem(14, rosa);

			ItemStack lila = new ItemStack(Material.INK_SACK, 1, (short) 5);
			ItemMeta im6 = lila.getItemMeta();
			im6.setDisplayName("§bLila Farbstoff");
			im6.setLore(Arrays.asList("§7Preis: §a20$"));
			lila.setItemMeta(im6);
			inventory.setItem(15, lila);

			ItemStack grau = new ItemStack(Material.INK_SACK, 1, (short) 8);
			ItemMeta im7 = grau.getItemMeta();
			im7.setDisplayName("§bGrauer Farbstoff");
			im7.setLore(Arrays.asList("§7Preis: §a20$"));
			grau.setItemMeta(im7);
			inventory.setItem(16, grau);

			ItemStack hblau = new ItemStack(Material.INK_SACK, 1, (short) 12);
			ItemMeta im8 = hblau.getItemMeta();
			im8.setDisplayName("§bHellbaluer Farbstoff");
			im8.setLore(Arrays.asList("§7Preis: §a20$"));
			hblau.setItemMeta(im8);
			inventory.setItem(19, hblau);

			ItemStack hgruen = new ItemStack(Material.INK_SACK, 1, (short) 10);
			ItemMeta im9 = hgruen.getItemMeta();
			im9.setDisplayName("§bHellgrüner Farbstoff");
			im9.setLore(Arrays.asList("§7Preis: §a20$"));
			hgruen.setItemMeta(im9);
			inventory.setItem(20, hgruen);

			ItemStack dblau = new ItemStack(Material.INK_SACK, 1, (short) 4);
			ItemMeta im10 = dblau.getItemMeta();
			im10.setDisplayName("§bDunkelbauer Farbstoff");
			im10.setLore(Arrays.asList("§7Preis: §a20$"));
			dblau.setItemMeta(im10);
			inventory.setItem(21, dblau);

			ItemStack weiÃŸ = new ItemStack(Material.INK_SACK, 1, (short) 15);
			ItemMeta im11 = weiÃŸ.getItemMeta();
			im11.setDisplayName("§bWeißer Farbstoff");
			im11.setLore(Arrays.asList("§7Preis: §a20$"));
			weiÃŸ.setItemMeta(im11);
			inventory.setItem(22, weiÃŸ);

			ItemStack tuerkies = new ItemStack(Material.INK_SACK, 1, (short) 6);
			ItemMeta im12 = tuerkies.getItemMeta();
			im12.setDisplayName("§bTürkieser Farbstoff");
			im12.setLore(Arrays.asList("§7Preis: §a20$"));
			tuerkies.setItemMeta(im12);
			inventory.setItem(23, tuerkies);

			ItemStack rot = new ItemStack(Material.INK_SACK, 1, (short) 1);
			ItemMeta im13 = rot.getItemMeta();
			im13.setDisplayName("§bRoter Farbstoff");
			im13.setLore(Arrays.asList("§7Preis: §a20$"));
			rot.setItemMeta(im13);
			inventory.setItem(24, rot);

			ItemStack gelb = new ItemStack(Material.INK_SACK, 1, (short) 11);
			ItemMeta im14 = gelb.getItemMeta();
			im14.setDisplayName("§bGelber Farbstoff");
			im14.setLore(Arrays.asList("§7Preis: §a20$"));
			gelb.setItemMeta(im14);
			inventory.setItem(25, gelb);

			ItemStack orange = new ItemStack(Material.INK_SACK, 1, (short) 14);
			ItemMeta im15 = orange.getItemMeta();
			im15.setDisplayName("§bOranger Farbstoff");
			im15.setLore(Arrays.asList("§7Preis: §a20$"));
			orange.setItemMeta(im15);
			inventory.setItem(28, orange);

			ItemStack hgrau = new ItemStack(Material.INK_SACK, 1, (short) 7);
			ItemMeta im16 = hgrau.getItemMeta();
			im16.setDisplayName("§bHellgrauer Farbstoff");
			im16.setLore(Arrays.asList("§7Preis: §a20$"));
			hgrau.setItemMeta(im16);
			inventory.setItem(29, hgrau);

			ItemStack dgruen = new ItemStack(Material.INK_SACK, 1, (short) 2);
			ItemMeta im17 = dgruen.getItemMeta();
			im17.setDisplayName("§bDunkelgrüner Farbstoff");
			im17.setLore(Arrays.asList("§7Preis: §a20$"));
			dgruen.setItemMeta(im17);
			inventory.setItem(30, dgruen);

			ItemStack buch = new ItemStack(Material.BOOK);
			ItemMeta im18 = buch.getItemMeta();
			im18.setDisplayName("§bBuch");
			im18.setLore(Arrays.asList("§7Preis: §a60$"));
			buch.setItemMeta(im18);
			inventory.setItem(31, buch);

			p.openInventory(inventory);
			p.sendMessage(Main.pre + "§3Du hast den §1§lKünstler §3geöffnet");
		}
		return true;
	}

	@EventHandler
	public void handleKochMenuClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getClickedInventory().getTitle().equals(GUI_NAME) && e.getCurrentItem() != null) {
			e.setCancelled(true);
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§fWeißes Glas")) {
				e.setCancelled(true);
			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Hier ist das Künstler-Menü")) {
				e.setCancelled(true);
			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bWeiße Wolle")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 100)) {

					ItemStack item = new ItemStack(Material.WOOL);

					p.getInventory().addItem(item);
					es.removeMoney(p.getUniqueId(), 100);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bWeißes Glas")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 100)) {

					ItemStack item = new ItemStack(Material.GLASS);

					p.getInventory().addItem(item);
					es.removeMoney(p.getUniqueId(), 100);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bGebrannter Ton")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 100)) {

					ItemStack item = new ItemStack(Material.STAINED_CLAY);

					p.getInventory().addItem(item);
					es.removeMoney(p.getUniqueId(), 100);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bMagenta Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
					ItemStack magenta = new ItemStack(Material.INK_SACK, 1, (short) 13);

					p.getInventory().addItem(magenta);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bRosa Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
					ItemStack rosa = new ItemStack(Material.INK_SACK, 1, (short) 9);

					p.getInventory().addItem(rosa);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bLila Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
					ItemStack lila = new ItemStack(Material.INK_SACK, 1, (short) 5);

					p.getInventory().addItem(lila);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bGrauer Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
					ItemStack grau = new ItemStack(Material.INK_SACK, 1, (short) 8);

					p.getInventory().addItem(grau);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bHellbaluer Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
					ItemStack hblau = new ItemStack(Material.INK_SACK, 1, (short) 12);
					p.getInventory().addItem(hblau);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bHellgrüner Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
					ItemStack hgruen = new ItemStack(Material.INK_SACK, 1, (short) 10);
					p.getInventory().addItem(hgruen);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "Â§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bDunkelbauer Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
					ItemStack dblau = new ItemStack(Material.INK_SACK, 1, (short) 4);
					p.getInventory().addItem(dblau);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bWeißer Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
					ItemStack weiÃŸ = new ItemStack(Material.INK_SACK, 1, (short) 15);
					p.getInventory().addItem(weiÃŸ);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bTürkieser Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {

					ItemStack tuerkies = new ItemStack(Material.INK_SACK, 1, (short) 6);
					p.getInventory().addItem(tuerkies);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bRoter Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {

					ItemStack rot = new ItemStack(Material.INK_SACK, 1, (short) 1);
					p.getInventory().addItem(rot);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bGelber Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {

					ItemStack gelb = new ItemStack(Material.INK_SACK, 1, (short) 11);
					p.getInventory().addItem(gelb);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bOranger Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {

					ItemStack orange = new ItemStack(Material.INK_SACK, 1, (short) 14);
					p.getInventory().addItem(orange);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bHellgrauer Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {

					ItemStack hgrau = new ItemStack(Material.INK_SACK, 1, (short) 7);
					p.getInventory().addItem(hgrau);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bDunkelgrüner Farbstoff")) {
				if (es.hasEnoughMoney(p.getUniqueId(), 20)) {
					ItemStack dgruen = new ItemStack(Material.INK_SACK, 1, (short) 2);
					p.getInventory().addItem(dgruen);
					es.removeMoney(p.getUniqueId(), 20);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			} else if (e.getCurrentItem().getType() == Material.BOOK) {
				if (es.hasEnoughMoney(p.getUniqueId(), 60)) {

					ItemStack buch = new ItemStack(Material.BOOK);
					p.getInventory().addItem(buch);
					es.removeMoney(p.getUniqueId(), 60);
				} else {
					p.sendMessage(Main.pre + "§cDu hast nich genug Geld");

				}

			}

			p.playSound(p.getLocation(), Sound.EXPLODE, 1L, 1L);

		}
	}

}