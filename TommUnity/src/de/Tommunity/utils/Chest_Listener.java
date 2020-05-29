package de.Tommunity.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Commands.TokenSystem;
import de.Tommunity.Main.Main;

public class Chest_Listener implements Listener{

	private final Main plugin;
	
	public Chest_Listener(Main plugin) {
		this.plugin = plugin;
	}
	
	public ItemStack[] getMasterContent() {
		ItemStack[] isArr = new ItemStack[54];
		ItemStack is;
		ItemMeta im;
		
			is = new ItemStack(Material.GOLD_INGOT);
		im = is.getItemMeta();
		im.setDisplayName("§61.000 Dollar für alle");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[0] = is;
		
		is = new ItemStack(Material.EXP_BOTTLE);
		im = is.getItemMeta();
		im.setDisplayName("§6100 EXP");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[1] = is;
		
		is = new ItemStack(Material.STICK);
		im = is.getItemMeta();
		im.setDisplayName("§cRotes Lichtschwert");
		im.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		im.setLore(Arrays.asList("§cGehörte einst Darth Vader","§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[2] = is;
		
		is = new ItemStack(Material.FIREBALL);
		im = is.getItemMeta();
		im.setDisplayName("§d§l1x Money-Booster");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[3] = is;
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§a§lTank I","§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[4] = is;
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§a§lLebensretter I","§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[5] = is;
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§6§lLevel I", "§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[6] = is;
		
		
		is = new ItemStack(Material.GOLDEN_APPLE);
		im = is.getItemMeta();
		im.setDisplayName("§bGoldapfel");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setAmount(16);
		is.setItemMeta(im);
		isArr[7] = is;
		
		is = new ItemStack(Material.ENDER_PEARL);
		im = is.getItemMeta();
		im.setDisplayName("§fEnderpearl");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setAmount(16);
		is.setItemMeta(im);
		isArr[8] = is;
		
		is = new ItemStack(Material.GOLD_RECORD);
		im = is.getItemMeta();
		im.setDisplayName("§6§lRare-Case");
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[9] = is;
		
		is = new ItemStack(Material.GREEN_RECORD);
		im = is.getItemMeta();
		im.setDisplayName("§c§lGöttliche-Case");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		is.setItemMeta(im);
		isArr[10] = is;
		
		is = new ItemStack(Material.RECORD_10);
		im = is.getItemMeta();
		im.setDisplayName("§9§lMystische-Case");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		is.setItemMeta(im);
		isArr[11] = is;
		
		is = new ItemStack(Material.EXP_BOTTLE);
		im = is.getItemMeta();
		im.setDisplayName("§6§l2000 Tommunity XP");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[12] = is;
		
		is = new ItemStack(Material.EXP_BOTTLE);
		im = is.getItemMeta();
		im.setDisplayName("§fEXP Bottle");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setAmount(5);
		is.setItemMeta(im);
		isArr[13] = is;

		is = new ItemStack(Material.DIAMOND_AXE);
		im = is.getItemMeta();
		im.setDisplayName("§2Dia-Axt");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		im.addEnchant(Enchantment.DIG_SPEED, 5, false);
		is.setItemMeta(im);
		isArr[14] = is;
		
		return isArr;
	}
	public List<ItemStack> getMasterChestContent(){
		List<ItemStack> masteritems = new ArrayList<>();
		ItemStack is;
		ItemMeta im;

		is = new ItemStack(Material.GREEN_RECORD);
		im = is.getItemMeta();
		im.setDisplayName("§c§lGöttliche-Case");
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		is.setItemMeta(im);
		masteritems.add(is);

		is = new ItemStack(Material.GOLD_INGOT);
		im = is.getItemMeta();
		im.setDisplayName("§61.000 Dollar für alle");
		im.setLore(Arrays.asList("§7Rechtsklicken"));
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.EXP_BOTTLE);
		im = is.getItemMeta();
		im.setDisplayName("§6100 EXP");
		im.setLore(Arrays.asList("§7Rechtsklicken"));
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§a§lTank I"));
		masteritems.add(is);
		
		is = new ItemStack(Material.STICK);
		im = is.getItemMeta();
		im.setDisplayName("§cRotes Lichtschwert");
		im.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		im.setLore(Arrays.asList("§cGehörte einst Darth Vader"));
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.FIREBALL);
		im = is.getItemMeta();
		im.setDisplayName("§d§l1x Money-Booster");
		im.setLore(Arrays.asList("§7Rechtsklicken"));
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§a§lTank I"));
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§a§lLebensretter I"));
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§6§lLevel I"));
		is.setItemMeta(im);
		masteritems.add(is);
		
		
		is = new ItemStack(Material.GOLDEN_APPLE);
		im = is.getItemMeta();
		im.setDisplayName("§bGoldapfel");
		is.setAmount(16);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.ENDER_PEARL);
		im = is.getItemMeta();
		im.setDisplayName("§fEnderpearl");
		is.setAmount(16);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.GOLD_RECORD);
		im = is.getItemMeta();
		im.setDisplayName("§6§lRare-Case");
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.GREEN_RECORD);
		im = is.getItemMeta();
		im.setDisplayName("§c§lGöttliche-Case");
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.RECORD_10);
		im = is.getItemMeta();
		im.setDisplayName("§9§lMystische-Case");
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.EXP_BOTTLE);
		im = is.getItemMeta();
		im.setDisplayName("§6§l2000 Tommunity XP");
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.EXP_BOTTLE);
		im = is.getItemMeta();
		im.setDisplayName("§fEXP Bottle");
		is.setAmount(5);
		is.setItemMeta(im);
		masteritems.add(is);

		is = new ItemStack(Material.DIAMOND_AXE);
		im = is.getItemMeta();
		im.setDisplayName("§2Dia-Axt");
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		im.addEnchant(Enchantment.DIG_SPEED, 5, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		
		return masteritems;
		
	}
	public ItemStack[] getHeroContent() {
		ItemStack[] isArr = new ItemStack[54];
		ItemStack is;
		ItemMeta im;
		
		is = new ItemStack(Material.FIREBALL);
		im = is.getItemMeta();
		im.setDisplayName("§d§l2x Fly-Booster");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[0] = is;
		
		
		is = new ItemStack(Material.DIAMOND_SWORD);
		im = is.getItemMeta();
		im.setDisplayName("§6Klinge der Götter");
		im.addEnchant(Enchantment.DAMAGE_ALL, 7, true);
		im.addEnchant(Enchantment.FIRE_ASPECT, 2, false);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList("§7Von Göttern geschaffen","§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[1] = is;
		
		is = new ItemStack(Material.FIREBALL);
		im = is.getItemMeta();
		im.setDisplayName("§d§l1x Xp-Booster");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[2] = is;
		
		is = new ItemStack(Material.IRON_BOOTS);
		im = is.getItemMeta();
		im.setDisplayName("§5NMDs");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[3] = is;
		
		is = new ItemStack(Material.GOLD_INGOT);
		im = is.getItemMeta();
		im.setDisplayName("§65.000 Dollar für alle");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[4] = is;
		
		is = new ItemStack(Material.DIAMOND_CHESTPLATE);
		im = is.getItemMeta();
		im.setDisplayName("§6Götterbrustplatte");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList(" ", "§7Von Göttern geschaffen", "§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[5] = is;
		
		is = new ItemStack(Material.STONE_PICKAXE);
		im = is.getItemMeta();
		im.setDisplayName("§bBohrer");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		im.addEnchant(Enchantment.DIG_SPEED, 10, true);
		im.addEnchant(Enchantment.DURABILITY, 3, false);
		is.setItemMeta(im);
		isArr[6] = is;
		
		is = new ItemStack(Material.RAW_FISH,1, (short) 3);
		im = is.getItemMeta();
		im.setDisplayName("§bKnock Killer");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		im.addEnchant(Enchantment.KNOCKBACK, 6, true);
		is.setItemMeta(im);
		isArr[7] = is;
		
		is = new ItemStack(Material.GOLD_PICKAXE);
		im = is.getItemMeta();
		im.setDisplayName("§bStarpicke");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		im.addEnchant(Enchantment.DIG_SPEED, 7, true);
		is.setItemMeta(im);
		isArr[8] = is;;
		
		is = new ItemStack(Material.DIAMOND_PICKAXE);
		im = is.getItemMeta();
		im.setDisplayName("§6Götterpicke");
		im.addEnchant(Enchantment.DIG_SPEED, 7, true);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList(" ", "§7Von Göttern geschaffen", "§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[9] = is;
		
		is = new ItemStack(Material.DIAMOND_BOOTS);
		im = is.getItemMeta();
		im.setDisplayName("§6Götterschuhe");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList(" ", "§7Von Göttern geschaffen", "§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[10] = is;
		
		is = new ItemStack(Material.DIAMOND_LEGGINGS);
		im = is.getItemMeta();
		im.setDisplayName("§6Götterhose");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList(" ", "§7Von Göttern geschaffen", "§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[11] = is;
		
		is = new ItemStack(Material.DIAMOND_HELMET);
		im = is.getItemMeta();
		im.setDisplayName("§6Götterhelm");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList(" ", "§7Von Göttern geschaffen", "§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[12] = is;
		
		is = new ItemStack(Material.EXP_BOTTLE);
		im = is.getItemMeta();
		im.setDisplayName("§6400 EXP");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[13] = is;
		
		is = new ItemStack(Material.BEACON);
		im = is.getItemMeta();
		im.setDisplayName("§fBeacon");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		is.setAmount(3);
		isArr[14] = is;
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§a§lTank II", "§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[15] = is;
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§a§lLebensretter II", "§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[16] = is;
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§6§lLevel II", "§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[17] = is;
		
		is = new ItemStack(Material.FIREWORK);
		im = is.getItemMeta();
		im.setDisplayName("§4S§ei§bl§av§ce§fs§1t§6e§dr §7Rakete");
		im.addEnchant(Enchantment.DAMAGE_ALL, 5, false);
		im.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
		im.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
		im.addEnchant(Enchantment.ARROW_DAMAGE, 5, false);
		im.addEnchant(Enchantment.DURABILITY, 3, false);
		im.addEnchant(Enchantment.FIRE_ASPECT, 2, false);
		im.addEnchant(Enchantment.KNOCKBACK, 2, false);
		im.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, false);
		im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
		im.setLore(Arrays.asList("§7Silvester §b2019 §aauf §6Tommunity", "§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[18] = is;


		is = new ItemStack(Material.GOLD_RECORD);
		im = is.getItemMeta();
		im.setDisplayName("§6§lRare-Case");
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		is.setItemMeta(im);
		isArr[19] = is;

		is = new ItemStack(Material.GREEN_RECORD);
		im = is.getItemMeta();
		im.setDisplayName("§c§lGöttliche-Case");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		is.setItemMeta(im);
		isArr[20] = is;

		is = new ItemStack(Material.RECORD_10);
		im = is.getItemMeta();
		im.setDisplayName("§9§lMystische-Case");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		is.setItemMeta(im);
		isArr[21] = is;

		is = new ItemStack(Material.DIAMOND_AXE);
		im = is.getItemMeta();
		im.setDisplayName("§2Dia-Axt");
		im.setLore(Arrays.asList("§7Das kannst du gewinnen"));
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		im.addEnchant(Enchantment.DIG_SPEED, 5, false);
		is.setItemMeta(im);
		isArr[22] = is;

		
		return isArr;
	}
	
	public List<ItemStack> getHeroChestContent(){
		List<ItemStack> heroitems = new ArrayList<>();
		ItemStack is;
		ItemMeta im;
		
		is = new ItemStack(Material.FIREBALL);
		im = is.getItemMeta();
		im.setDisplayName("§62x Fly-Booster");
		im.setLore(Arrays.asList("§7Rechtsklicken"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.DIAMOND_SWORD);
		im = is.getItemMeta();
		im.setDisplayName("§6Klinge der Götter");
		im.addEnchant(Enchantment.DAMAGE_ALL, 7, true);
		im.addEnchant(Enchantment.FIRE_ASPECT, 2, false);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList("§7Von Göttern geschaffen"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.FIREBALL);
		im = is.getItemMeta();
		im.setDisplayName("§51x Xp-Booster");
		im.setLore(Arrays.asList("§7Rechtsklicken"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.IRON_BOOTS);
		im = is.getItemMeta();
		im.setDisplayName("§5NMDs");
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.GOLD_INGOT);
		im = is.getItemMeta();
		im.setDisplayName("§65.000 Dollar für alle");
		im.setLore(Arrays.asList("§7Rechtsklicken"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.DIAMOND_CHESTPLATE);
		im = is.getItemMeta();
		im.setDisplayName("§6Götterbrustplatte");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList(" ", "§7Von Göttern geschaffen"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.STONE_PICKAXE);
		im = is.getItemMeta();
		im.setDisplayName("§bBohrer");
		im.addEnchant(Enchantment.DIG_SPEED, 10, true);
		im.addEnchant(Enchantment.DURABILITY, 3, false);
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.RAW_FISH,1, (short) 3);
		im = is.getItemMeta();
		im.setDisplayName("§bKnock Killer");
		im.addEnchant(Enchantment.KNOCKBACK, 6, true);
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.GOLD_PICKAXE);
		im = is.getItemMeta();
		im.setDisplayName("§bStarpicke");
		im.addEnchant(Enchantment.DIG_SPEED, 7, true);
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.DIAMOND_PICKAXE);
		im = is.getItemMeta();
		im.setDisplayName("§6Götterpicke");
		im.addEnchant(Enchantment.DIG_SPEED, 7, true);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList(" ", "§7Von Göttern geschaffen"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.DIAMOND_BOOTS);
		im = is.getItemMeta();
		im.setDisplayName("§6Götterschuhe");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList(" ", "§7Von Göttern geschaffen"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.DIAMOND_LEGGINGS);
		im = is.getItemMeta();
		im.setDisplayName("§6Götterhose");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList(" ", "§7Von Göttern geschaffen"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.DIAMOND_HELMET);
		im = is.getItemMeta();
		im.setDisplayName("§6Götterhelm");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
		im.addEnchant(Enchantment.DURABILITY, 10, true);
		im.setLore(Arrays.asList(" ", "§7Von Göttern geschaffen"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.EXP_BOTTLE);
		im = is.getItemMeta();
		im.setDisplayName("§6400 EXP");
		im.setLore(Arrays.asList("§7Rechtsklicken"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.BEACON);
		im = is.getItemMeta();
		im.setDisplayName("§fBeacon");
		is.setItemMeta(im);
		is.setAmount(3);
		heroitems.add(is);
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§a§lTank II"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§a§lLebensretter II"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§6§lLevel II"));
		is.setItemMeta(im);
		heroitems.add(is);
		
		is = new ItemStack(Material.FIREWORK);
		im = is.getItemMeta();
		im.setDisplayName("§4S§ei§bl§av§ce§fs§1t§6e§dr §7Rakete");
		im.addEnchant(Enchantment.DAMAGE_ALL, 5, false);
		im.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
		im.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
		im.addEnchant(Enchantment.ARROW_DAMAGE, 5, false);
		im.addEnchant(Enchantment.DURABILITY, 3, false);
		im.addEnchant(Enchantment.FIRE_ASPECT, 2, false);
		im.addEnchant(Enchantment.KNOCKBACK, 2, false);
		im.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, false);
		im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
		im.setLore(Arrays.asList("", "§7Silvester §b2019 §aauf §6Tommunity"));
		is.setItemMeta(im);
		heroitems.add(is);

		is = new ItemStack(Material.GOLD_RECORD);
		im = is.getItemMeta();
		im.setDisplayName("§6§lRare-Case");
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		is.setItemMeta(im);
		heroitems.add(is);

		is = new ItemStack(Material.GREEN_RECORD);
		im = is.getItemMeta();
		im.setDisplayName("§c§lGöttliche-Case");
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		is.setItemMeta(im);
		heroitems.add(is);

		is = new ItemStack(Material.RECORD_10);
		im = is.getItemMeta();
		im.setDisplayName("§9§lMystische-Case");
		im.addEnchant(Enchantment.DURABILITY, -1, false);
		is.setItemMeta(im);
		heroitems.add(is);

		is = new ItemStack(Material.DIAMOND_AXE);
		im = is.getItemMeta();
		im.setDisplayName("§2Dia-Axt");
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		im.addEnchant(Enchantment.DIG_SPEED, 5, false);
		is.setItemMeta(im);
		heroitems.add(is);

		return heroitems;
	}
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		ChestAPI ca = new ChestAPI();
		if(e.getClickedBlock().getType() != Material.TRAPPED_CHEST) return;
			e.setCancelled(true);
			Player p = e.getPlayer();
			Inventory inv = Bukkit.getServer().createInventory(null, 9*3, "§e§lLootChest");
			
			ItemStack i = new ItemStack(Material.CHEST);
			ItemMeta im = i.getItemMeta();
			im.setDisplayName("§dMaster-Chest");
			im.setLore(Arrays.asList("§7Anzahl deiner §dMaster-Chests: §a" + ca.getMasterChest(p.getUniqueId())));
			i.setItemMeta(im);
			inv.setItem(11, i);
			
			ItemStack info = new ItemStack(Material.PAPER);
			ItemMeta infoMeta = info.getItemMeta();
			infoMeta.setDisplayName("§7Hier kannst du dir §dMaster §7und §9Hero-Chests §7kaufen");
			info.setItemMeta(infoMeta);
			inv.setItem(13, info);
			
			ItemStack hero = new ItemStack(Material.ENDER_CHEST);
			ItemMeta im1 = hero.getItemMeta();
			im1.setDisplayName("§9Hero-Chest");
			im1.setLore(Arrays.asList("§7Anzahl deiner §9Hero-Chests: §a" + ca.getHeroChest(p.getUniqueId())));
			hero.setItemMeta(im1);
			inv.setItem(15, hero);
			
			p.openInventory(inv);
		
   }
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		ChestAPI ca = new ChestAPI();
		if(e.getInventory().getTitle().equals("§e§lLootChest") && e.getCurrentItem() != null) {
			e.setCancelled(true);
			if(e.getCurrentItem().getType() == Material.CHEST) {
				if(e.getClick().isRightClick()) {
					
					Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {

						@Override
						public void run() {
							Inventory inv = Bukkit.createInventory(p, 54, "§dMaster-Chest Info");
							inv.setContents(getMasterContent());
							p.openInventory(inv);
						}
						
					}, 1);
				
				}else if(e.getClick().isLeftClick()) {
				if(ca.hasEnoughMasterChests(p.getUniqueId(), 1)) {
					Chest_ManagerMaster cm = new Chest_ManagerMaster(plugin);
					cm.startAnimation(p);
					
					ca.removeMasterChest(p.getUniqueId(), 1);
				}else {
					p.sendMessage(Main.pre + "§cDu hast nicht genug §dMaster-Chests");
					}
				}
			}else if(e.getCurrentItem().getType() == Material.ENDER_CHEST) {
				if(e.getClick().isRightClick()) {
					
					Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {

						@Override
						public void run() {
							Inventory inv = Bukkit.createInventory(p, 54, "§9Hero-Chest Info");
							inv.setContents(getHeroContent());
							p.openInventory(inv);
						}
						
					}, 1);
					
				}else if(e.getClick().isLeftClick()) {
				if(ca.hasEnoughHeroChests(p.getUniqueId(), 1)) {
					Chest_ManagerHero cm = new Chest_ManagerHero(plugin);
					cm.startAnimation(p);
					
					ca.removeHeroChest(p.getUniqueId(), 1);
				}else {
					p.sendMessage(Main.pre + "§cDu hast nicht genug §9Hero-Chests");
				}
			}
			}
		}
		if(p.getOpenInventory().getTitle().equals("§dMaster-Chest Info")) {
			e.setCancelled(true);
		}
		if(p.getOpenInventory().getTitle().equals("§9Hero-Chest Info")) {
			e.setCancelled(true);
		}
		if(p.getOpenInventory().getTitle().equals("§dMaster-Chest")) {
			e.setCancelled(true);
		} 
		if(p.getOpenInventory().getTitle().equals("§9Hero-Chest")) {
			e.setCancelled(true);
		} 
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Hier kannst du dir §dMaster §7und §9Hero-Chests §7kaufen")) {
			e.setCancelled(true);
			Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
		
				@Override
			public void run() {
				Inventory inv = Bukkit.getServer().createInventory(p, 9*3, "§9Chests kaufen");
				TokenSystem ts = new TokenSystem();
				
				ItemStack i = new ItemStack(Material.PAPER);
				ItemMeta im = i.getItemMeta();
				im.setDisplayName("§dMaster-Chest");
				im.setLore(Arrays.asList("§7Du brauchst §a30 §7Tokens um dir eine §dMaster-Chest §7zu kaufen"));
				i.setItemMeta(im);
				inv.setItem(11, i);
				
				ItemStack info = new ItemStack(Material.PAPER);
				ItemMeta infoMeta = info.getItemMeta();
				infoMeta.setDisplayName("§a§lAnzahl deiner Tokens:");
				infoMeta.setLore(Arrays.asList("§7" + ts.getToken(p.getUniqueId())));
				info.setItemMeta(infoMeta);
				inv.setItem(13, info);
				
				ItemStack hero = new ItemStack(Material.PAPER);
				ItemMeta im1 = hero.getItemMeta();
				im1.setDisplayName("§9Hero-Chest");
				im1.setLore(Arrays.asList("§7Du brauchst §a45 §7Tokens um dir eine §9Hero-Chest §7zu kaufen"));
				hero.setItemMeta(im1);
				inv.setItem(15, hero);
				
				p.openInventory(inv);
			}
			
		}, 1);
		
		
		
		}
		if(e.getClickedInventory().getTitle().equals("§9Chests kaufen") && e.getCurrentItem() != null) {
			e.setCancelled(true);
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§dMaster-Chest")) {
				TokenSystem ts = new TokenSystem();
				if(ts.hasEnoughToken(p.getUniqueId(), 30)) {
					ts.removeToken(p.getUniqueId(), 30);
					ca.addMasterChest(p.getUniqueId(), 1);
					p.sendMessage(Main.pre + "§aDu hast dir erfolgreich eine §dMaster-Chest §agekauft");
					p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1L, 1L);
				}else {
					p.sendMessage(Main.pre + "§cDu hast nicht genügend Tokens");
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
				}
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§9Hero-Chest")) {
				TokenSystem ts = new TokenSystem();
				if(ts.hasEnoughToken(p.getUniqueId(), 45)) {
					ts.removeToken(p.getUniqueId(), 45);
					ca.addHeroChest(p.getUniqueId(), 1);
					p.sendMessage(Main.pre + "§aDu hast dir erfolgreich eine §9Hero-Chest §agekauft");
					p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1L, 1L);
				}else {
					p.sendMessage(Main.pre + "§cDu hast nicht genügend Tokens");
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
				}
			}
		}
	}
	
}