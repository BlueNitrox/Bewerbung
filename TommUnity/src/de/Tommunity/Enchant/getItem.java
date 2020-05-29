package de.Tommunity.Enchant;

import java.util.Arrays;

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

public class getItem implements CommandExecutor {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	private final String GUI_NAME = "§4§lExtra Enchants";
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player)cs;

		if(p.hasPermission("*")) {
			Inventory inv = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

			ItemStack is34 = new ItemStack(Material.BOOK);
			ItemMeta im34 = is34.getItemMeta();
			im34.setDisplayName("§7Verzaubertes Buch");
			im34.setLore(Arrays.asList("§a§lTank I"));
			is34.setItemMeta(im34);

			inv.setItem(0, is34);

			ItemStack is346 = new ItemStack(Material.BOOK);
			ItemMeta im346 = is346.getItemMeta();
			im346.setDisplayName("§7Verzaubertes Buch");
			im346.setLore(Arrays.asList("§a§lLebensretter I"));
			is346.setItemMeta(im346);

			inv.setItem(1, is346);

			ItemStack is3466 = new ItemStack(Material.BOOK);
			ItemMeta im3466 = is3466.getItemMeta();
			im3466.setDisplayName("§7Verzaubertes Buch");
			im3466.setLore(Arrays.asList("§6§lLevel I"));
			is3466.setItemMeta(im3466);

			inv.setItem(2, is3466);

			ItemStack is34661 = new ItemStack(Material.BOOK);
			ItemMeta im34661 = is34661.getItemMeta();
			im34661.setDisplayName("§7Verzaubertes Buch");
			im34661.setLore(Arrays.asList("§6§lUpgrade I"));
			is34661.setItemMeta(im34661);

			inv.setItem(3, is34661);

			ItemStack is34667 = new ItemStack(Material.BOOK);
			ItemMeta im34667 = is34667.getItemMeta();
			im34667.setDisplayName("§7Verzaubertes Buch");
			im34667.setLore(Arrays.asList("§c§lRauch I"));
			is34667.setItemMeta(im34667);

			inv.setItem(4, is34667);

			ItemStack is346671 = new ItemStack(Material.BOOK);
			ItemMeta im346671 = is346671.getItemMeta();
			im346671.setDisplayName("§7Verzaubertes Buch");
			im346671.setLore(Arrays.asList("§c§lSegen I"));
			is346671.setItemMeta(im346671);

			inv.setItem(5, is346671);

			ItemStack is3466711 = new ItemStack(Material.BOOK);
			ItemMeta im3466711 = is3466711.getItemMeta();
			im3466711.setDisplayName("§7Verzaubertes Buch");
			im3466711.setLore(Arrays.asList("§c§lSchaden I"));
			is3466711.setItemMeta(im3466711);

			inv.setItem(6, is3466711);

			ItemStack is2 = new ItemStack(Material.BOOK);
			ItemMeta im2 = is2.getItemMeta();
			im2.setDisplayName("§7Verzaubertes Buch");
			im2.setLore(Arrays.asList("§c§lVampir I"));
			is2.setItemMeta(im2);

			inv.setItem(7, is2);

			ItemStack is34667121 = new ItemStack(Material.DIAMOND_PICKAXE);
			ItemMeta im34667121 = is34667121.getItemMeta();
			im34667121.setDisplayName("§7Verzaubertes Buch");
			im34667121.setLore(Arrays.asList("§6§lDrachenatem I"));
			is34667121.setItemMeta(im34667121);

			inv.setItem(8, is34667121);

			ItemStack test = new ItemStack(Material.BOOK);
			ItemMeta test1 = test.getItemMeta();
			test1.setDisplayName("§7Verzaubertes Buch");
			test1.setLore(Arrays.asList("§6§lMining I"));
			test.setItemMeta(test1);

			inv.setItem(9, test);

			ItemStack test2 = new ItemStack(Material.BOOK);
			ItemMeta test3 = test2.getItemMeta();
			test3.setDisplayName("§7Verzaubertes Buch");
			test3.setLore(Arrays.asList("§6§lHaste I"));
			test2.setItemMeta(test3);

			inv.setItem(10, test2);

			ItemStack Rare = new ItemStack(Material.GOLD_RECORD);
			ItemMeta Rare21 = Rare.getItemMeta();
			Rare21.setDisplayName("§6§lRare-Case");
			Rare21.addEnchant(Enchantment.DURABILITY, -1, false);
			Rare.setItemMeta(Rare21);

			ItemStack Mystisch = new ItemStack(Material.RECORD_10);
			ItemMeta Mystisch211 = Mystisch.getItemMeta();
			Mystisch211.setDisplayName("§9§lMystische-Case");
			Mystisch211.addEnchant(Enchantment.DURABILITY, -1, false);
			Mystisch.setItemMeta(Mystisch211);

			ItemStack Gott = new ItemStack(Material.GREEN_RECORD);
			ItemMeta Gott21 = Gott.getItemMeta();
			Gott21.setDisplayName("§c§lGöttliche-Case");
			Gott21.addEnchant(Enchantment.DURABILITY, -1, false);
			Gott.setItemMeta(Gott21);

			inv.setItem(24, Rare);
			inv.setItem(25, Mystisch);
			inv.setItem(26, Gott);

			p.openInventory(inv);

		}else p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
		return false;
	}
}
