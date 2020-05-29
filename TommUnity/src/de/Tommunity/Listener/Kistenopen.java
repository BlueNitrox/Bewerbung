package de.Tommunity.Listener;

import java.util.Arrays;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Stats.Kisten;

public class Kistenopen implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static String GUI_NAME = "§eWarzone-Chest";
	public static ItemStack buch;

	@EventHandler
	public static void onKlickEnd(PlayerInteractEvent e) {
		Player p = e.getPlayer();

		if (e.getAction() == Action.RIGHT_CLICK_BLOCK
				&& e.getClickedBlock().getType().equals(Material.ENDER_PORTAL_FRAME)) {

			e.getClickedBlock().breakNaturally();

			p.playSound(p.getLocation(), Sound.BAT_DEATH, 1L, 1L);
			Kisten k = new Kisten();
			k.addopenchest(p.getUniqueId(), 1);

			// Item register
			ItemStack Diamond1 = new ItemStack(Material.DIAMOND);
			Diamond1.setAmount(1);
			ItemStack Diamond2 = new ItemStack(Material.DIAMOND);
			Diamond2.setAmount(2);
			ItemStack Diamond3 = new ItemStack(Material.DIAMOND);
			Diamond3.setAmount(3);
			ItemStack Diamond4 = new ItemStack(Material.DIAMOND);
			Diamond4.setAmount(4);
			ItemStack Diamond5 = new ItemStack(Material.DIAMOND);
			Diamond5.setAmount(5);

			ItemStack Emerald1 = new ItemStack(Material.EMERALD);
			Emerald1.setAmount(1);
			ItemStack Emerald2 = new ItemStack(Material.EMERALD);
			Emerald2.setAmount(2);
			ItemStack Emerald3 = new ItemStack(Material.EMERALD);
			Emerald3.setAmount(3);

			ItemStack Iron1 = new ItemStack(Material.IRON_INGOT);
			Iron1.setAmount(1);
			ItemStack Iron2 = new ItemStack(Material.IRON_INGOT);
			Iron2.setAmount(2);
			ItemStack Iron3 = new ItemStack(Material.IRON_INGOT);
			Iron3.setAmount(3);
			ItemStack Iron4 = new ItemStack(Material.IRON_INGOT);
			Iron4.setAmount(4);
			ItemStack Iron5 = new ItemStack(Material.IRON_INGOT);
			Iron5.setAmount(5);

			ItemStack gold1 = new ItemStack(Material.GOLD_INGOT);
			gold1.setAmount(1);
			ItemStack gold2 = new ItemStack(Material.GOLD_INGOT);
			gold2.setAmount(2);
			ItemStack gold3 = new ItemStack(Material.GOLD_INGOT);
			gold3.setAmount(3);
			ItemStack gold4 = new ItemStack(Material.GOLD_INGOT);
			gold4.setAmount(4);
			ItemStack gold5 = new ItemStack(Material.GOLD_INGOT);
			gold5.setAmount(5);


			ItemStack TommunityXP = new ItemStack(Material.EXP_BOTTLE);
			ItemMeta im = TommunityXP.getItemMeta();
			im.setDisplayName("§6§l1000 Tommunity XP");
			TommunityXP.setItemMeta(im);

			TommunityXP.setAmount(1);
			ItemStack TommunityXP1 = new ItemStack(Material.EXP_BOTTLE);
			ItemMeta im1 = TommunityXP.getItemMeta();
			im1.setDisplayName("§6§l1000 Tommunity XP");
			TommunityXP1.setItemMeta(im);
			TommunityXP1.setAmount(1);

			ItemStack Apfel = new ItemStack(Material.APPLE);
			Apfel.setAmount(16);
			ItemStack Apfel1 = new ItemStack(Material.APPLE);
			Apfel1.setAmount(32);

			ItemStack Brot = new ItemStack(Material.BREAD);
			Brot.setAmount(16);
			ItemStack Brot1 = new ItemStack(Material.BREAD);
			Brot1.setAmount(32);

			ItemStack Stärke = new ItemStack(Material.POTION, 1, (short) 8201);
			Stärke.setAmount(1);
			ItemStack BlazeRod = new ItemStack(Material.BLAZE_ROD);
			BlazeRod.setAmount(2);

			ItemStack ticket = new ItemStack(Material.PAPER);
			ItemMeta im2 = ticket.getItemMeta();
			im2.setDisplayName("§a120$");
			im2.addEnchant(Enchantment.DURABILITY, 10, false);
			im2.setLore(Arrays.asList("§7Rechtsklicken zum Geld abholen"));
			ticket.setItemMeta(im2);

			ItemStack ticket1 = new ItemStack(Material.PAPER);
			ItemMeta im21 = ticket1.getItemMeta();
			im21.setDisplayName("§a400$");
			im21.addEnchant(Enchantment.DURABILITY, 10, false);
			im21.setLore(Arrays.asList("§7Rechtsklicken zum Geld abholen"));
			ticket1.setItemMeta(im21);
			
			ItemStack ticket2 = new ItemStack(Material.PAPER);
			ItemMeta im211 = ticket2.getItemMeta();
			im211.setDisplayName("§a1Token");
			im211.addEnchant(Enchantment.DURABILITY, 10, false);
			im211.setLore(Arrays.asList("§7Rechtsklicken zum Token abholen"));
			ticket2.setItemMeta(im211);

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


			ItemStack sharp = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm = (EnchantmentStorageMeta) sharp.getItemMeta();
			esm.addStoredEnchant(Enchantment.DAMAGE_ALL, 1, true);
			sharp.setItemMeta(esm);

			ItemStack Effi = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm1 = (EnchantmentStorageMeta) Effi.getItemMeta();
			esm1.addStoredEnchant(Enchantment.DIG_SPEED, 1, true);
			Effi.setItemMeta(esm1);

			ItemStack prot = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm2 = (EnchantmentStorageMeta) prot.getItemMeta();
			esm2.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			prot.setItemMeta(esm2);

			ItemStack halt = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm3 = (EnchantmentStorageMeta) halt.getItemMeta();
			esm3.addStoredEnchant(Enchantment.DURABILITY, 1, true);
			halt.setItemMeta(esm3);

			ItemStack stärke = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm4 = (EnchantmentStorageMeta) stärke.getItemMeta();
			esm4.addStoredEnchant(Enchantment.ARROW_DAMAGE, 1, true);
			stärke.setItemMeta(esm4);

			ItemStack fireprot = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm5 = (EnchantmentStorageMeta) fireprot.getItemMeta();
			esm5.addStoredEnchant(Enchantment.PROTECTION_FIRE, 1, true);
			fireprot.setItemMeta(esm5);

			ItemStack fire = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm6 = (EnchantmentStorageMeta) fire.getItemMeta();
			esm6.addStoredEnchant(Enchantment.FIRE_ASPECT, 1, true);
			fire.setItemMeta(esm6);

			ItemStack unend = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm7 = (EnchantmentStorageMeta) unend.getItemMeta();
			esm7.addStoredEnchant(Enchantment.ARROW_INFINITE, 1, true);
			unend.setItemMeta(esm7);

			ItemStack plü = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm8 = (EnchantmentStorageMeta) plü.getItemMeta();
			esm8.addStoredEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);
			plü.setItemMeta(esm8);

			ItemStack feder = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm9 = (EnchantmentStorageMeta) feder.getItemMeta();
			esm9.addStoredEnchant(Enchantment.PROTECTION_FALL, 1, true);
			feder.setItemMeta(esm9);

			ItemStack schuss = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm10 = (EnchantmentStorageMeta) schuss.getItemMeta();
			esm10.addStoredEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
			schuss.setItemMeta(esm10);

			ItemStack rück = new ItemStack(Material.ENCHANTED_BOOK);
			EnchantmentStorageMeta esm11 = (EnchantmentStorageMeta) rück.getItemMeta();
			esm11.addStoredEnchant(Enchantment.KNOCKBACK, 1, true);
			rück.setItemMeta(esm11);


			Random r = new Random();
			int z = r.nextInt(12);

			switch (z) {
				case 1:
					buch = halt;
					break;
				case 2:
					buch = sharp;
					break;
				case 3:
					buch = Effi;
					break;
				case 4:
					buch = prot;
					break;
				case 5:
					buch = fireprot;
					break;
				case 6:
					buch = stärke;
					break;
				case 7:
					buch = fire;
					break;
				case 8:
					buch = unend;
					break;
				case 9:
					buch = plü;
					break;
				case 10:
					buch = schuss;
					break;
				case 11:
					buch = feder;
					break;
				case 12:
					buch = rück;
					break;
			}


			Random r1 = new Random();
			int z1 = r1.nextInt(76);

			switch (z1) {
			case 1:
				Inventory inv = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv.setItem(22, TommunityXP);
				inv.setItem(7, Diamond2);
				inv.setItem(17, Apfel);
				inv.setItem(1, Rare);
				inv.setItem(12, buch);
				p.openInventory(inv);
				break;
			case 2:
				Inventory inv1 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv1.setItem(3, TommunityXP1);
				inv1.setItem(19, Diamond1);
				inv1.setItem(10, Apfel1);
				inv1.setItem(1, Rare);
				inv1.setItem(12, buch);
				p.openInventory(inv1);
				break;
			case 3:
				Inventory inv2 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv2.setItem(18, Diamond5);
				inv2.setItem(6, Apfel1);
				inv2.setItem(11, buch);
				p.openInventory(inv2);
				break;
			case 4:

				Inventory inv3 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv3.setItem(21, Brot1);
				inv3.setItem(9, Diamond4);
				inv3.setItem(11, Apfel);
				inv3.setItem(18, Mystisch);
				inv3.setItem(1, buch);
				p.openInventory(inv3);
				break;
			case 5:

				Inventory inv4 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv4.setItem(1, Brot);
				inv4.setItem(19, Diamond4);
				inv4.setItem(7, Emerald1);
				inv4.setItem(18, buch);
				p.openInventory(inv4);
				break;
			case 6:

				Inventory inv5 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv5.setItem(17, Apfel1);
				inv5.setItem(7, Diamond2);
				inv5.setItem(12, Emerald2);
				inv5.setItem(2, Brot);
				inv5.setItem(1, buch);
				p.openInventory(inv5);
				break;
			case 7:

				Inventory inv6 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv6.setItem(7, Apfel);
				inv6.setItem(12, Emerald3);
				inv6.setItem(18, buch);
				p.openInventory(inv6);
				break;
			case 8:

				Inventory inv7 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv7.setItem(7, Apfel);
				inv7.setItem(19, Emerald3);
				inv7.setItem(18, TommunityXP1);
				inv7.setItem(12, buch);
				p.openInventory(inv7);
				break;
			case 9:
				Inventory inv8 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv8.setItem(4, Diamond4);
				inv8.setItem(22, Emerald3);
				inv8.setItem(7, Apfel);
				inv8.setItem(17, Emerald3);
				inv8.setItem(19, TommunityXP1);
				inv8.setItem(1, Rare);
				inv8.setItem(12, buch);
				p.openInventory(inv8);
				break;
			case 10:
				Inventory inv9 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv9.setItem(6, Stärke);
				inv9.setItem(2, Diamond2);
				inv9.setItem(17, Apfel);
				inv9.setItem(12, buch);
				p.openInventory(inv9);
				break;
			case 11:
				Inventory inv10 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv10.setItem(7, BlazeRod);
				inv10.setItem(13, Diamond4);
				inv10.setItem(21, Brot1);
				inv10.setItem(2, Brot);
				inv10.setItem(12, buch);
				p.openInventory(inv10);
				break;
			case 12:
				Inventory inv11 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv11.setItem(10, BlazeRod);
				inv11.setItem(17, BlazeRod);
				inv11.setItem(1, Apfel);
				inv11.setItem(23, TommunityXP1);
				inv11.setItem(12, buch);
				p.openInventory(inv11);
				break;
			case 13:
				Inventory inv12 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv12.setItem(9, BlazeRod);
				inv12.setItem(17, Stärke);
				inv12.setItem(11, Apfel1);
				inv12.setItem(3, TommunityXP);
				inv12.setItem(12, buch);
				p.openInventory(inv12);
				break;
			case 14:
				Inventory inv13 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv13.setItem(16, Diamond4);
				inv13.setItem(19, buch);
				p.openInventory(inv13);
				break;
			case 15:
				Inventory inv14 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv14.setItem(16, Diamond4);
				inv14.setItem(19, Emerald1);
				inv14.setItem(4, TommunityXP);
				inv14.setItem(1, buch);
				p.openInventory(inv14);
				break;
			case 16:
				Inventory inv15 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv15.setItem(16, Diamond4);
				inv15.setItem(19, Emerald1);
				inv15.setItem(4, TommunityXP);
				inv15.setItem(9, ticket);
				inv15.setItem(1, Rare);
				inv15.setItem(12, buch);
				p.openInventory(inv15);
				break;
			case 17:
				Inventory inv16 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv16.setItem(16, Apfel1);
				inv16.setItem(4, TommunityXP);
				inv16.setItem(9, ticket1);
				inv16.setItem(18, Mystisch);
				inv16.setItem(13, buch);
				p.openInventory(inv16);
				break;
			case 18:
				Inventory inv17 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv17.setItem(19, Brot1);
				inv17.setItem(5, TommunityXP);
				inv17.setItem(21, ticket1);
				inv17.setItem(4, Stärke);
				inv17.setItem(8, Gott);
				inv17.setItem(12, buch);
				p.openInventory(inv17);
				break;
			case 19:
				Inventory inv18 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv18.setItem(19, Brot1);
				inv18.setItem(5, ticket);
				inv18.setItem(21, ticket1);
				inv18.setItem(4, Stärke);
				inv18.setItem(7, Emerald1);
				inv18.setItem(12, buch);
				break;
			case 20:
				Inventory inv19 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv19.setItem(17, Apfel1);
				inv19.setItem(21, ticket1);
				inv19.setItem(9, Stärke);
				inv19.setItem(12, Diamond2);
				inv19.setItem(1, buch);
				p.openInventory(inv19);
				break;
			case 21:
				Inventory inv20 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv20.setItem(11, Brot1);
				inv20.setItem(21, ticket1);
				inv20.setItem(18, Stärke);
				inv20.setItem(4, Diamond5);
				inv20.setItem(16, buch);
				p.openInventory(inv20);
				break;
			case 22:
				Inventory inv21 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv21.setItem(1, Brot);
				inv21.setItem(14, ticket1);
				inv21.setItem(9, Stärke);
				inv21.setItem(21, Diamond5);
				inv21.setItem(1, Rare);
				inv21.setItem(12, buch);
				p.openInventory(inv21);
				break;
			case 23:
				Inventory inv22 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv22.setItem(11, Brot1);
				inv22.setItem(3, BlazeRod);
				inv22.setItem(18, Apfel1);
				inv22.setItem(7, Emerald3);
				inv22.setItem(13, buch);
				p.openInventory(inv22);
				break;
			case 24:
				Inventory inv23 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv23.setItem(19, Brot1);
				inv23.setItem(9, BlazeRod);
				inv23.setItem(15, Apfel1);
				inv23.setItem(5, Emerald2);
				inv23.setItem(4, buch);
				p.openInventory(inv23);
				break;
			case 25:
				Inventory inv24 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv24.setItem(9, Apfel1);
				inv24.setItem(17, Stärke);
				inv24.setItem(13, TommunityXP1);
				inv24.setItem(1, Emerald3);
				inv24.setItem(18, buch);
				p.openInventory(inv24);
				break;
			case 26:
				Inventory inv25 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv25.setItem(20, Apfel1);
				inv25.setItem(6, BlazeRod);
				inv25.setItem(12, TommunityXP1);
				inv25.setItem(16, Emerald2);
				inv25.setItem(1, buch);
				p.openInventory(inv25);
				break;
			case 27:
				Inventory inv26 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv26.setItem(19, Brot);
				inv26.setItem(12, Stärke);
				inv26.setItem(11, TommunityXP);
				inv26.setItem(1, Diamond3);
				inv26.setItem(17, buch);
				p.openInventory(inv26);
				break;
			case 28:
				Inventory inv27 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv27.setItem(19, ticket);
				inv27.setItem(12, ticket);
				inv27.setItem(7, Apfel);
				inv27.setItem(2, Diamond2);
				inv27.setItem(1, Rare);
				inv27.setItem(10, buch);
				p.openInventory(inv27);
				break;
			case 29:
				Inventory inv28 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv28.setItem(19, ticket1);
				inv28.setItem(12, ticket1);
				inv28.setItem(7, Apfel);
				inv28.setItem(2, Diamond2);
				inv28.setItem(15, buch);
				inv28.setItem(11, buch);
				p.openInventory(inv28);
				break;
			case 30:
				Inventory inv29 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv29.setItem(19, ticket1);
				inv29.setItem(12, Iron1);
				inv29.setItem(21, Iron4);
				inv29.setItem(4, Apfel);
				inv29.setItem(9, Diamond2);
				inv29.setItem(20, buch);
				p.openInventory(inv29);
				break;
			case 31:
				Inventory inv30 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv30.setItem(11, ticket);
				inv30.setItem(5, Iron1);
				inv30.setItem(21, Apfel);
				inv30.setItem(16, Diamond2);
				p.openInventory(inv30);
				break;
			case 32:
				Inventory inv31 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv31.setItem(11, ticket);
				inv31.setItem(5, Iron5);
				inv31.setItem(21, Emerald2);
				inv31.setItem(1, Diamond5);
				p.openInventory(inv31);
				break;
			case 33:
				Inventory inv32 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv32.setItem(11, ticket1);
				p.openInventory(inv32);
				break;
			case 34:
				Inventory inv33 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv33.setItem(11, ticket1);
				inv33.setItem(1, Iron1);
				inv33.setItem(19, Brot1);
				inv33.setItem(18, Mystisch);
				inv33.setItem(15, buch);
				p.openInventory(inv33);
				break;
			case 35:
				Inventory inv34 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv34.setItem(11, ticket1);
				inv34.setItem(5, Iron2);
				inv34.setItem(19, Brot1);
				inv34.setItem(20, Iron5);
				p.openInventory(inv34);
				break;
			case 36:
				Inventory inv35 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv35.setItem(1, ticket);
				inv35.setItem(15, Iron2);
				inv35.setItem(12, Brot1);
				inv35.setItem(19, Iron5);
				p.openInventory(inv35);
				break;
			case 37:
				Inventory inv36 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv36.setItem(1, ticket);
				inv36.setItem(15, Iron4);
				inv36.setItem(12, Apfel1);
				inv36.setItem(19, Iron5);
				inv36.setItem(7, Diamond3);
				inv36.setItem(8, Gott);
				p.openInventory(inv36);
				break;
			case 38:
				Inventory inv37 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv37.setItem(11, ticket1);
				inv37.setItem(15, Iron4);
				inv37.setItem(2, Apfel1);
				inv37.setItem(19, Iron5);
				inv37.setItem(1, ticket2);
				inv37.setItem(7, Diamond3);
				inv37.setItem(1, Rare);
				p.openInventory(inv37);
				break;
			case 39:
				Inventory inv38 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv38.setItem(1, ticket);
				inv38.setItem(5, Iron5);
				inv38.setItem(12, Apfel1);
				inv38.setItem(9, Iron2);
				inv38.setItem(17, Diamond5);
				p.openInventory(inv38);
				break;
			case 40:
				Inventory inv39 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv39.setItem(4, Iron4);
				inv39.setItem(18, Diamond3);
				inv39.setItem(14, Apfel1);
				inv39.setItem(1, ticket2);
				p.openInventory(inv39);
				break;
			case 41:
				Inventory inv40 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv40.setItem(7, TommunityXP);
				inv40.setItem(18, ticket);
				inv40.setItem(1, Brot1);
				p.openInventory(inv40);
				break;
			case 51:
				Inventory inv41 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv41.setItem(7, TommunityXP1);
				inv41.setItem(6, ticket1);
				inv41.setItem(10, Apfel1);
				inv41.setItem(19, TommunityXP);
				p.openInventory(inv41);
				break;
			case 52:
				Inventory inv51 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv51.setItem(7, TommunityXP1);
				p.openInventory(inv51);
				break;
			case 44:
				Inventory inv52 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv52.setItem(9, Brot);
				inv52.setItem(1, ticket1);
				inv52.setItem(17, Apfel1);
				inv52.setItem(11, Emerald3);
				p.openInventory(inv52);
				break;
			case 45:
				Inventory inv44 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv44.setItem(4, Brot1);
				inv44.setItem(1, ticket2);
				inv44.setItem(5, ticket);
				inv44.setItem(15, Apfel);
				inv44.setItem(23, Emerald3);
				p.openInventory(inv44);
				break;
			case 46:
				Inventory inv45 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv45.setItem(16, Brot1);
				inv45.setItem(1, ticket1);
				inv45.setItem(17, Apfel1);
				inv45.setItem(26, Emerald3);
				p.openInventory(inv45);
				break;
			case 47:
				Inventory inv46 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv46.setItem(9, Iron3);
				inv46.setItem(1, ticket1);
				inv46.setItem(14, TommunityXP1);
				inv46.setItem(17, Diamond1);
				inv46.setItem(11, Emerald3);
				p.openInventory(inv46);
				break;
			case 48:
				Inventory inv47 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv47.setItem(1, ticket1);
				inv47.setItem(14, TommunityXP1);
				p.openInventory(inv47);
				break;
			case 49:
				Inventory inv48 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv48.setItem(3, Rare);
				inv48.setItem(18, Gott);
				inv48.setItem(24, Mystisch);
				p.openInventory(inv48);
				break;
			case 50:
				Inventory inv49 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv49.setItem(6, ticket1);
				p.openInventory(inv49);
				break;
			case 42:
				Inventory inv50 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv50.setItem(7, TommunityXP1);
				inv50.setItem(6, ticket1);
				inv50.setItem(10, Apfel1);
				inv50.setItem(19, TommunityXP);
				p.openInventory(inv50);
				break;
			case 43:
				Inventory inv511 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv511.setItem(7, TommunityXP1);
				p.openInventory(inv511);
				break;
			case 53:
				Inventory inv521 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv521.setItem(9, Brot);
				inv521.setItem(1, ticket1);
				inv521.setItem(17, Apfel1);
				inv521.setItem(11, Emerald3);
				p.openInventory(inv521);
				break;
			case 54:
				Inventory inv53 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv53.setItem(4, Brot1);
				inv53.setItem(5, ticket);
				inv53.setItem(15, Apfel);
				inv53.setItem(23, Emerald3);
				p.openInventory(inv53);
				break;
			case 55:
				Inventory inv54 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv54.setItem(16, Brot1);
				inv54.setItem(1, ticket1);
				inv54.setItem(17, Apfel1);
				inv54.setItem(26, Emerald3);
				p.openInventory(inv54);
				break;
			case 56:
				Inventory inv55 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv55.setItem(9, Iron3);
				inv55.setItem(1, ticket1);
				inv55.setItem(14, TommunityXP1);
				inv55.setItem(17, Diamond1);
				inv55.setItem(11, Emerald3);
				p.openInventory(inv55);
				break;
			case 57:
				Inventory inv56 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv56.setItem(1, ticket1);
				inv56.setItem(14, TommunityXP1);
				p.openInventory(inv56);
				break;
			case 58:
				Inventory inv57 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv57.setItem(1, ticket2);
				inv57.setItem(14, TommunityXP1);
				inv57.setItem(10, buch);
				p.openInventory(inv57);
				break;
			case 59:
				Inventory inv58 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv58.setItem(1, ticket1);
				inv58.setItem(6, Iron5);
				inv58.setItem(14, TommunityXP1);
				p.openInventory(inv58);
				break;
			case 61:
				Inventory inv59 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv59.setItem(6, ticket);
				inv59.setItem(18, Diamond5);
				inv59.setItem(14, Apfel1);
				inv59.setItem(24, BlazeRod);
				inv59.setItem(12, buch);
				p.openInventory(inv59);
				break;
			case 62:
				Inventory inv60 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv60.setItem(6, Stärke);
				inv60.setItem(11, Diamond5);
				inv60.setItem(16, Apfel1);
				inv60.setItem(8, BlazeRod);
				p.openInventory(inv60);
				break;
			case 63:
				Inventory inv61 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv61.setItem(6, Diamond5);
				inv61.setItem(11, Diamond5);
				inv61.setItem(16, BlazeRod);
				inv61.setItem(8, BlazeRod);
				p.openInventory(inv61);
				break;
			case 64:
				Inventory inv62 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv62.setItem(6, Diamond5);
				inv62.setItem(11, Iron5);
				inv62.setItem(16, Iron4);
				inv62.setItem(8, BlazeRod);
				inv62.setItem(0, buch);
				p.openInventory(inv62);
				break;
			case 65:
				Inventory inv63 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv63.setItem(18, Diamond5);
				inv63.setItem(11, Iron5);
				inv63.setItem(16, Emerald2);
				inv63.setItem(1, BlazeRod);
				p.openInventory(inv63);
				break;
			case 66:
				Inventory inv64 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv64.setItem(21, Diamond5);
				inv64.setItem(13, Iron5);
				inv64.setItem(12, Emerald2);
				inv64.setItem(9, BlazeRod);
				inv64.setItem(0, buch);
				p.openInventory(inv64);
				break;
			case 67:
				Inventory inv65 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv65.setItem(18, ticket2);
				inv65.setItem(11, Iron5);
				inv65.setItem(16, ticket1);
				inv65.setItem(1, Stärke);
				p.openInventory(inv65);
				break;
			case 68:
				Inventory inv66 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv66.setItem(8, ticket2);
				inv66.setItem(1, Iron5);
				inv66.setItem(6, ticket1);
				inv66.setItem(11, Stärke);
				p.openInventory(inv66);
				break;
			case 69:
				Inventory inv67 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv67.setItem(1, Diamond5);
				inv67.setItem(6, ticket1);
				inv67.setItem(11, TommunityXP);
				inv67.setItem(18, buch);
				p.openInventory(inv67);
				break;
				case 70:
					Inventory inv68 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

					inv68.setItem(4, gold5);
					inv68.setItem(7, ticket1);
					inv68.setItem(14, TommunityXP);
					p.openInventory(inv68);
					break;
				case 71:
					Inventory inv69 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

				inv69.setItem(8, Apfel);
				inv69.setItem(19, ticket1);
				inv69.setItem(14, TommunityXP);
				inv69.setItem(9, buch);
				p.openInventory(inv69);
				break;

				case 72:
					Inventory inv71 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

					inv71.setItem(18, Diamond5);
					inv71.setItem(3, ticket2);
					inv71.setItem(14, TommunityXP1);
					inv71.setItem(10, buch);
					p.openInventory(inv71);
					break;
				case 73:
					Inventory inv72 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

					inv72.setItem(1, Iron3);
					inv72.setItem(6, Brot);
					inv72.setItem(11, gold1);
					p.openInventory(inv72);
					break;
				case 74:
					Inventory inv73 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

					inv73.setItem(19, gold5);
					inv73.setItem(3, ticket1);
					inv73.setItem(15, Brot1);
					inv73.setItem(12, buch);
					p.openInventory(inv73);
					break;
				case 75:
					Inventory inv74 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

					inv74.setItem(14, gold1);
					inv74.setItem(7, Apfel1);
					inv74.setItem(21, Emerald3);
					inv74.setItem(12, buch);
					p.openInventory(inv74);
					break;
				case 76:
					Inventory inv75 = Bukkit.createInventory(null, 9 * 3, GUI_NAME);

					inv75.setItem(14, gold1);
					inv75.setItem(2, ticket2);
					inv75.setItem(21, Emerald3);
					p.openInventory(inv75);
					break;


			}

		}

	}

}
