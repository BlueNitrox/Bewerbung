package de.Tommunity.Listener;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.utils.ItemBuilder;

public class Kit_Items {

	public static void addStarterItems(Player p){

		ItemStack schwert = new ItemBuilder(Material.STONE_SWORD).build();
		ItemStack picke = new ItemBuilder(Material.STONE_PICKAXE).build();
		ItemStack axt = new ItemBuilder(Material.STONE_AXE).build();
		ItemStack schaufel = new ItemBuilder(Material.STONE_SPADE).build();
		ItemStack hoe = new ItemBuilder(Material.STONE_HOE).build();
		ItemStack brust = new ItemBuilder(Material.LEATHER_CHESTPLATE).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true).addEnchant(Enchantment.DURABILITY, 1, true).build();
		ItemStack helm = new ItemBuilder(Material.LEATHER_HELMET).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true).addEnchant(Enchantment.DURABILITY, 1, true).build();
		ItemStack hose = new ItemBuilder(Material.LEATHER_LEGGINGS).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true).addEnchant(Enchantment.DURABILITY, 1, true).build();
		ItemStack schuhe = new ItemBuilder(Material.LEATHER_BOOTS).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true).addEnchant(Enchantment.DURABILITY, 1, true).build();
		ItemStack essen = new ItemBuilder(Material.APPLE).setAmount(16).build();

		p.getInventory().addItem(schwert);
		p.getInventory().addItem(picke);
		p.getInventory().addItem(axt);
		p.getInventory().addItem(schaufel);
		p.getInventory().addItem(hoe);
		p.getInventory().addItem(brust);
		p.getInventory().addItem(helm);
		p.getInventory().addItem(hose);
		p.getInventory().addItem(schuhe);
		p.getInventory().addItem(essen);


	}

	public static void addHolzfällerItems(Player p){

		ItemStack axt = new ItemBuilder(Material.IRON_AXE).build();
		ItemStack essen = new ItemBuilder(Material.BREAD).setAmount(64).build();

		p.getInventory().addItem(axt);
		p.getInventory().addItem(essen);
	}

	public static void addMagierItems(Player p){

		ItemStack stärke = new ItemBuilder(Material.POTION, (short) 8201).build();
		ItemStack feuer = new ItemBuilder(Material.POTION, (short) 8227).build();
		ItemStack nacht = new ItemBuilder(Material.POTION, (short) 8230).build();
		ItemStack speed = new ItemBuilder(Material.POTION, (short) 8194).build();

		p.getInventory().addItem(stärke);
		p.getInventory().addItem(feuer);
		p.getInventory().addItem(nacht);
		p.getInventory().addItem(speed);

	}

	public static void addWarzoneItems(Player p) {
		ItemStack schwert = new ItemBuilder(Material.STONE_SWORD).addEnchant(Enchantment.DURABILITY, 1, false).build();
		ItemStack apple = new ItemBuilder(Material.GOLDEN_APPLE).setAmount(10).build();
		ItemStack essen = new ItemBuilder(Material.GRILLED_PORK).setAmount(32).build();
		ItemStack helm = new ItemBuilder(Material.GOLD_HELMET).addEnchant(Enchantment.DURABILITY, 1, false).build();
		ItemStack brust = new ItemBuilder(Material.IRON_CHESTPLATE).addEnchant(Enchantment.DURABILITY, 1, false).build();
		ItemStack hose = new ItemBuilder(Material.GOLD_LEGGINGS).addEnchant(Enchantment.DURABILITY, 1, false).build();
		ItemStack schuhe = new ItemBuilder(Material.IRON_BOOTS).addEnchant(Enchantment.DURABILITY, 1, false).build();

		p.getInventory().addItem(schwert);
		p.getInventory().addItem(apple);
		p.getInventory().addItem(essen);
		p.getInventory().addItem(helm);
		p.getInventory().addItem(brust);
		p.getInventory().addItem(hose);
		p.getInventory().addItem(schuhe);
	}

	public static void addMobItems(Player p) {
		ItemStack schwert = new ItemBuilder(Material.WOOD_SWORD).addEnchant(Enchantment.LOOT_BONUS_MOBS, 2, false).addEnchant(Enchantment.DURABILITY, 3, false).build();
		ItemStack apple = new ItemBuilder(Material.GOLDEN_APPLE).build();
		ItemStack essen = new ItemBuilder(Material.COOKED_BEEF).setAmount(10).build();
		ItemStack helm = new ItemBuilder(Material.CHAINMAIL_HELMET).build();
		ItemStack brust = new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).build();
		ItemStack hose = new ItemBuilder(Material.CHAINMAIL_LEGGINGS).build();
		ItemStack schuhe = new ItemBuilder(Material.CHAINMAIL_BOOTS).build();

		p.getInventory().addItem(schwert);
		p.getInventory().addItem(apple);
		p.getInventory().addItem(essen);
		p.getInventory().addItem(helm);
		p.getInventory().addItem(brust);
		p.getInventory().addItem(hose);
		p.getInventory().addItem(schuhe);
	}

	public static void addExpertItems(Player p) {
		ItemStack picke = new ItemBuilder(Material.DIAMOND_PICKAXE).addEnchant(Enchantment.DIG_SPEED, 2, false).setDisplayname("§6Stahlspitzhacke").build();
		ItemStack essen = new ItemBuilder(Material.COOKED_BEEF).setAmount(16).build();
		ItemStack brust = new ItemBuilder(Material.DIAMOND_CHESTPLATE).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false).setDisplayname("§6Stahlbrustplatte").build();

		p.getInventory().addItem(picke);
		p.getInventory().addItem(essen);
		p.getInventory().addItem(brust);
	}

	public static void addKönigItems(Player p) {
		ItemStack schwert = new ItemBuilder(Material.GOLD_SWORD).setDisplayname("§eKönigsschwert").addEnchant(Enchantment.DAMAGE_ALL, 4, false).addEnchant(Enchantment.DURABILITY, 3, false).build();
		ItemStack apple = new ItemBuilder(Material.GOLDEN_APPLE).setAmount(5).build();
		ItemStack money = new ItemBuilder(Material.PAPER).setDisplayname("§a256$").build();
		ItemStack helm = new ItemBuilder(Material.GOLD_HELMET).setDisplayname("§eKönigshelm").addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false).addEnchant(Enchantment.DURABILITY, 3, false).build();
		ItemStack brust = new ItemBuilder(Material.GOLD_CHESTPLATE).setDisplayname("§eKönigsbrust").addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false).addEnchant(Enchantment.DURABILITY, 3, false).build();
		ItemStack hose = new ItemBuilder(Material.GOLD_LEGGINGS).setDisplayname("§eKönigshose").addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false).addEnchant(Enchantment.DURABILITY, 3, false).build();
		ItemStack schuhe = new ItemBuilder(Material.GOLD_BOOTS).setDisplayname("§eKönigsschuhe").addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false).addEnchant(Enchantment.DURABILITY, 3, false).build();

		p.getInventory().addItem(schwert);
		p.getInventory().addItem(apple);
		p.getInventory().addItem(money);
		p.getInventory().addItem(helm);
		p.getInventory().addItem(brust);
		p.getInventory().addItem(hose);
		p.getInventory().addItem(schuhe);
	}

	public static void addHeroItems(Player p) {
		ItemStack schwert = new ItemBuilder(Material.DIAMOND_SWORD).build();
		ItemStack picke = new ItemBuilder(Material.DIAMOND_PICKAXE).build();
		ItemStack helm = new ItemBuilder(Material.DIAMOND_HELMET).build();
		ItemStack brust = new ItemBuilder(Material.DIAMOND_CHESTPLATE).build();
		ItemStack hose = new ItemBuilder(Material.DIAMOND_LEGGINGS).build();
		ItemStack schuhe = new ItemBuilder(Material.DIAMOND_BOOTS).build();

		p.getInventory().addItem(schwert);
		p.getInventory().addItem(picke);
		p.getInventory().addItem(helm);
		p.getInventory().addItem(brust);
		p.getInventory().addItem(hose);
		p.getInventory().addItem(schuhe);
	}

	public static void addMasterItems(Player p) {
		ItemStack schwert = new ItemBuilder(Material.IRON_SWORD).build();
		ItemStack picke = new ItemBuilder(Material.IRON_PICKAXE).build();
		ItemStack helm = new ItemBuilder(Material.IRON_HELMET).build();
		ItemStack brust = new ItemBuilder(Material.IRON_CHESTPLATE).build();
		ItemStack hose = new ItemBuilder(Material.IRON_LEGGINGS).build();
		ItemStack schuhe = new ItemBuilder(Material.IRON_BOOTS).build();

		p.getInventory().addItem(schwert);
		p.getInventory().addItem(picke);
		p.getInventory().addItem(helm);
		p.getInventory().addItem(brust);
		p.getInventory().addItem(hose);
		p.getInventory().addItem(schuhe);
	}

}
