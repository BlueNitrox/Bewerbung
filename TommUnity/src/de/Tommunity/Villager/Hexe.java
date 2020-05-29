package de.Tommunity.Villager;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
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
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;

public class Hexe implements CommandExecutor, Listener {

	private final String GUI_NAME = "§d§lHexe";

	EconomySystem es = new EconomySystem();

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
		}
		Player p = (Player) sender;

		if (!p.hasPermission("Tom.Hexe")) {
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

			ItemStack item2 = new ItemStack(Material.PAPER);
			ItemMeta im1 = item2.getItemMeta();
			im1.setDisplayName("§7Hier ist das Hexe-Menü");
			im1.setLore(Arrays.asList("§7Du kannst hier keine Items Verkaufen!"));
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

			ItemStack Tank = new ItemStack(Material.BOOK);
			ItemMeta Tank1 = Tank.getItemMeta();
			Tank1.setDisplayName("§7Verzaubertes Buch");
			Tank1.setLore(Arrays.asList("§a§lTank I", "§7Preis: §a500.000$", "§bRüstung"));
			Tank.setItemMeta(Tank1);

			inventory.setItem(10, Tank);

			ItemStack Lebensretter = new ItemStack(Material.BOOK);
			ItemMeta Lebensretter1 = Lebensretter.getItemMeta();
			Lebensretter1.setDisplayName("§7Verzaubertes Buch");
			Lebensretter1.setLore(Arrays.asList("§a§lLebensretter I", "§7Preis: §a500.000$", "§bRüstung"));
			Lebensretter.setItemMeta(Lebensretter1);

			inventory.setItem(11, Lebensretter);

			ItemStack Level = new ItemStack(Material.BOOK);
			ItemMeta Level1 = Level.getItemMeta();
			Level1.setDisplayName("§7Verzaubertes Buch");
			Level1.setLore(Arrays.asList("§6§lLevel I", "§7Preis: §a400.000$", "§bSpitzhacke"));
			Level.setItemMeta(Level1);

			inventory.setItem(12, Level);

			ItemStack Rauch = new ItemStack(Material.BOOK);
			ItemMeta Rauch1 = Rauch.getItemMeta();
			Rauch1.setDisplayName("§7Verzaubertes Buch");
			Rauch1.setLore(Arrays.asList("§c§lRauch I", "§7Preis: §a400.000$", "§bSchwert"));
			Rauch.setItemMeta(Rauch1);

			inventory.setItem(13, Rauch);

			ItemStack Segen = new ItemStack(Material.BOOK);
			ItemMeta Segen1 = Segen.getItemMeta();
			Segen1.setDisplayName("§7Verzaubertes Buch");
			Segen1.setLore(Arrays.asList("§c§lSegen I", "§7Preis: §a400.000$", "§bSchwert"));
			Segen.setItemMeta(Segen1);

			inventory.setItem(14, Segen);

			ItemStack Vampir = new ItemStack(Material.BOOK);
			ItemMeta Vampir1 = Vampir.getItemMeta();
			Vampir1.setDisplayName("§7Verzaubertes Buch");
			Vampir1.setLore(Arrays.asList("§c§lVampir I", "§7Preis: §a400.000$", "§bSchwert"));
			Vampir.setItemMeta(Vampir1);

			inventory.setItem(15, Vampir);

			ItemStack Schaden = new ItemStack(Material.BOOK);
			ItemMeta Schaden1 = Schaden.getItemMeta();
			Schaden1.setDisplayName("§7Verzaubertes Buch");
			Schaden1.setLore(Arrays.asList("§c§lSchaden I", "§7Preis: §a400.000$", "§bSchwert"));
			Schaden.setItemMeta(Schaden1);

			inventory.setItem(16, Schaden);

			ItemStack Haste = new ItemStack(Material.BOOK);
			ItemMeta Haste1 = Schaden.getItemMeta();
			Haste1.setDisplayName("§7Verzaubertes Buch");
			Haste1.setLore(Arrays.asList("§6§lHaste I", "§7Preis: §a350.000$", "§bSpitzhacke"));
			Haste.setItemMeta(Haste1);

			inventory.setItem(19, Haste);

			ItemStack Mining = new ItemStack(Material.BOOK);
			ItemMeta Mining1 = Mining.getItemMeta();
			Mining1.setDisplayName("§7Verzaubertes Buch");
			Mining1.setLore(Arrays.asList("§6§lMining I", "§7Preis: §a100.000$", "§bSpitzhacke"));
			Mining.setItemMeta(Mining1);

			inventory.setItem(20, Mining);

			ItemStack schärfe = new ItemStack(Material.ENCHANTED_BOOK);
			ItemMeta schärfe1 = schärfe.getItemMeta();
			schärfe1.setDisplayName("§bSchärfe I");
			schärfe1.setLore(Arrays.asList("§6Schärfe I", "§7Preis: §a25.000$", "§bSchwert"));
			schärfe.setItemMeta(schärfe1);

			inventory.setItem(21, schärfe);

			ItemStack schutz = new ItemStack(Material.ENCHANTED_BOOK);
			ItemMeta schutz1 = schutz.getItemMeta();
			schutz1.setDisplayName("§bSchutz I");
			schutz1.setLore(Arrays.asList("§6Schutz I", "§7Preis: §a25.000$", "§bRüstung"));
			schutz.setItemMeta(schutz1);

			inventory.setItem(22, schutz);

			ItemStack stärke = new ItemStack(Material.ENCHANTED_BOOK);
			ItemMeta stärke1 = stärke.getItemMeta();
			stärke1.setDisplayName("§bStärke I");
			stärke1.setLore(Arrays.asList("§6Stärke I", "§7Preis: §a20.000$", "§bBogen"));
			stärke.setItemMeta(stärke1);

			inventory.setItem(23, stärke);

			ItemStack effi = new ItemStack(Material.ENCHANTED_BOOK);
			ItemMeta effi1 = effi.getItemMeta();
			effi1.setDisplayName("§bEffizienz I");
			effi1.setLore(Arrays.asList("§6Effizienz I", "§7Preis: §a25.000$", "§bSpitzhacke"));
			effi.setItemMeta(effi1);

			inventory.setItem(24, effi);

			ItemStack halt = new ItemStack(Material.ENCHANTED_BOOK);
			ItemMeta halt1 = halt.getItemMeta();
			halt1.setDisplayName("§bHaltbarkeit I");
			halt1.setLore(Arrays.asList("§6Haltbarkeit I", "§7Preis: §a25.000$", "§bAlles"));
			halt.setItemMeta(halt1);

			inventory.setItem(25, halt);

			ItemStack plü = new ItemStack(Material.ENCHANTED_BOOK);
			ItemMeta plü1 = plü.getItemMeta();
			plü1.setDisplayName("§bPlünderung I");
			plü1.setLore(Arrays.asList("§6Plünderung I", "§7Preis: §a250.000$", "§bSchwert"));
			plü.setItemMeta(plü1);

			inventory.setItem(28, plü);

			ItemStack glück = new ItemStack(Material.ENCHANTED_BOOK);
			ItemMeta glück1 = glück.getItemMeta();
			glück1.setDisplayName("§bGlück I");
			glück1.setLore(Arrays.asList("§6Glück I", "§7Preis: §c200.000$", "§bSpitzhacke"));
			glück.setItemMeta(glück1);

			inventory.setItem(29, glück);

			p.openInventory(inventory);

			p.sendMessage(Main.pre + "§3Du hast die §d§lHexe §3geöffnet");
		}
		return true;
	}

	@EventHandler
	public void handleKochMenuClick(InventoryClickEvent e) {
		if (!(e.getWhoClicked() instanceof Player))
			return;
		Player p = (Player) e.getWhoClicked();
		if (e.getClickedInventory().getTitle().equals(GUI_NAME)) {
			e.setCancelled(true);
			if (e.getCurrentItem().getItemMeta().getLore().contains("§a§lTank I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 500000)) {

						ItemStack item = new ItemStack(Material.BOOK);
						ItemMeta im = item.getItemMeta();
						im.setDisplayName("§7Verzaubertes Buch");
						im.setLore(Arrays.asList("§a§lTank I"));
						item.setItemMeta(im);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 500000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}

			if (e.getCurrentItem().getItemMeta().getLore().contains("§a§lLebensretter I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 500000)) {

						ItemStack item = new ItemStack(Material.BOOK);
						ItemMeta im = item.getItemMeta();
						im.setDisplayName("§7Verzaubertes Buch");
						im.setLore(Arrays.asList("§a§lLebensretter I"));
						item.setItemMeta(im);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 500000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}

			if (e.getCurrentItem().getItemMeta().getLore().contains("§6§lLevel I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 400000)) {

						ItemStack item = new ItemStack(Material.BOOK);
						ItemMeta im = item.getItemMeta();
						im.setDisplayName("§7Verzaubertes Buch");
						im.setLore(Arrays.asList("§6§lLevel I"));
						item.setItemMeta(im);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 400000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}

			if (e.getCurrentItem().getItemMeta().getLore().contains("§c§lRauch I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 400000)) {

						ItemStack item = new ItemStack(Material.BOOK);
						ItemMeta im = item.getItemMeta();
						im.setDisplayName("§7Verzaubertes Buch");
						im.setLore(Arrays.asList("§c§lRauch I"));
						item.setItemMeta(im);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 400000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getLore().contains("§6§lHaste I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 350000)) {

						ItemStack item = new ItemStack(Material.BOOK);
						ItemMeta im = item.getItemMeta();
						im.setDisplayName("§7Verzaubertes Buch");
						im.setLore(Arrays.asList("§6§lHaste I"));
						item.setItemMeta(im);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 350000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getLore().contains("§6§lMining I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 100000)) {

						ItemStack item = new ItemStack(Material.BOOK);
						ItemMeta im = item.getItemMeta();
						im.setDisplayName("§7Verzaubertes Buch");
						im.setLore(Arrays.asList("§6§lMining I"));
						item.setItemMeta(im);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 100000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getLore().contains("§c§lSegen I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 400000)) {

						ItemStack item = new ItemStack(Material.BOOK);
						ItemMeta im = item.getItemMeta();
						im.setDisplayName("§7Verzaubertes Buch");
						im.setLore(Arrays.asList("§c§lSegen I"));
						item.setItemMeta(im);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 400000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getLore().contains("§c§lVampir I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 400000)) {

						ItemStack item = new ItemStack(Material.BOOK);
						ItemMeta im = item.getItemMeta();
						im.setDisplayName("§7Verzaubertes Buch");
						im.setLore(Arrays.asList("§c§lVampir I"));
						item.setItemMeta(im);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 400000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getLore().contains("§c§lSchaden I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 400000)) {

						ItemStack item = new ItemStack(Material.BOOK);
						ItemMeta im = item.getItemMeta();
						im.setDisplayName("§7Verzaubertes Buch");
						im.setLore(Arrays.asList("§c§lSchaden I"));
						item.setItemMeta(im);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 400000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§bSchärfe I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 25000)) {

						ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
						EnchantmentStorageMeta esm = (EnchantmentStorageMeta) item.getItemMeta();
						esm.addStoredEnchant(Enchantment.DAMAGE_ALL, 1, true);
						item.setItemMeta(esm);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 25000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§bSchutz I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 25000)) {

						ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
						EnchantmentStorageMeta esm = (EnchantmentStorageMeta) item.getItemMeta();
						esm.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
						item.setItemMeta(esm);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 25000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§bEffizienz I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 25000)) {

						ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
						EnchantmentStorageMeta esm = (EnchantmentStorageMeta) item.getItemMeta();
						esm.addStoredEnchant(Enchantment.DIG_SPEED, 1, true);
						item.setItemMeta(esm);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 25000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§bStärke I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 20000)) {

						ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
						EnchantmentStorageMeta esm = (EnchantmentStorageMeta) item.getItemMeta();
						esm.addStoredEnchant(Enchantment.ARROW_DAMAGE, 1, true);
						item.setItemMeta(esm);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 20000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§bHaltbarkeit I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 25000)) {

						ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
						EnchantmentStorageMeta esm = (EnchantmentStorageMeta) item.getItemMeta();
						esm.addStoredEnchant(Enchantment.DURABILITY, 1, true);
						item.setItemMeta(esm);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 25000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§bPlünderung I")) {

				if (e.getClick().isLeftClick()) {
					if (es.hasEnoughMoney(p.getUniqueId(), 250000)) {

						ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
						EnchantmentStorageMeta esm = (EnchantmentStorageMeta) item.getItemMeta();
						esm.addStoredEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);
						item.setItemMeta(esm);

						p.getInventory().addItem(item);
						es.removeMoney(p.getUniqueId(), 250000);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					} else {
						p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
					}
				}
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§bGlück I")) {

				if (e.getClick().isRightClick()) {
					if(p.getItemInHand().getType() == Material.ENCHANTED_BOOK) {
						if(p.getItemInHand().getEnchantments().equals(Enchantment.LOOT_BONUS_BLOCKS)){
							p.getInventory().remove(p.getItemInHand());
							es.addMoney(p.getUniqueId(), 200000);
							p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
						}else {
							p.sendMessage(Main.pre +"§cDu hast kein Item zum verkaufen!");
						}
					}else {
						p.sendMessage(Main.pre +"§cDu hast kein Item zum verkaufen!");
					}
				}
			}
		}
	}
}