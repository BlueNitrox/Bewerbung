package de.Tommunity.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Main.Main;

public class MystischCaseItem implements Listener{

	private final Main plugin;
	
	public MystischCaseItem(Main plugin) {
		this.plugin = plugin;
	}
	
	public List<ItemStack> getMystCaseContent(){
		List<ItemStack> masteritems = new ArrayList<>();
		ItemStack is;
		ItemMeta im;
		
		
		//Reptilien Set
		is = new ItemStack(Material.IRON_CHESTPLATE);
		im = is.getItemMeta();
		im.setDisplayName("§2Reptilien Chestplate");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.IRON_HELMET);
		im = is.getItemMeta();
		im.setDisplayName("§2Reptilien Helm");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.IRON_LEGGINGS);
		im = is.getItemMeta();
		im.setDisplayName("§2Reptilien Hose");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.IRON_BOOTS);
		im = is.getItemMeta();
		im.setDisplayName("§2Reptilien Schuhe");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.IRON_PICKAXE);
		im = is.getItemMeta();
		im.setDisplayName("§2Reptilien Spitzhacke");
		im.addEnchant(Enchantment.DIG_SPEED, 3, false);
		im.addEnchant(Enchantment.DURABILITY, 5, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.IRON_SWORD);
		im = is.getItemMeta();
		im.setDisplayName("§2Reptilien Schwert");
		im.addEnchant(Enchantment.DAMAGE_ALL, 3, false);
		im.addEnchant(Enchantment.DURABILITY, 3, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.BOW);
		im = is.getItemMeta();
		im.setDisplayName("§2Reptilien Bogen");
		im.addEnchant(Enchantment.ARROW_DAMAGE, 4, false);
		im.addEnchant(Enchantment.DURABILITY, 5, false);
		is.setItemMeta(im);
		masteritems.add(is);

		is = new ItemStack(Material.DIAMOND_PICKAXE);
		im = is.getItemMeta();
		im.setDisplayName("§5Spitzhacke des Wüstenkönigs");
		im.addEnchant(Enchantment.DIG_SPEED, 4, false);
		im.addEnchant(Enchantment.DURABILITY, 3, false);
		is.setItemMeta(im);
		masteritems.add(is);

		is = new ItemStack(Material.BOW);
		im = is.getItemMeta();
		im.setDisplayName("§5Bogen des Wüstenkönigs");
		im.addEnchant(Enchantment.ARROW_DAMAGE, 5, false);
		im.addEnchant(Enchantment.DURABILITY, 2, false);
		is.setItemMeta(im);
		masteritems.add(is);

		is = new ItemStack(Material.DIAMOND_LEGGINGS);
		im = is.getItemMeta();
		im.setDisplayName("§9Phantomhose");
		im.setLore(Arrays.asList("§a§lTank II"));
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
		im.addEnchant(Enchantment.DURABILITY, 2, false);
		is.setItemMeta(im);
		masteritems.add(is);

		is = new ItemStack(Material.DIAMOND_BOOTS);
		im = is.getItemMeta();
		im.setDisplayName("§9Phantomhose");
		im.setLore(Arrays.asList("§a§lTank II"));
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
		im.addEnchant(Enchantment.DURABILITY, 6, false);
		is.setItemMeta(im);
		masteritems.add(is);

		is = new ItemStack(Material.DIAMOND_AXE);
		im = is.getItemMeta();
		im.setDisplayName("§2Dia-Axt");
		im.addEnchant(Enchantment.DIG_SPEED, 4, false);
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		is.setItemMeta(im);
		masteritems.add(is);

		//Drachenset
		is = new ItemStack(Material.DIAMOND_CHESTPLATE);
		im = is.getItemMeta();
		im.setDisplayName("§2Drachen Chestplate");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, false);
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.DIAMOND_HELMET);
		im = is.getItemMeta();
		im.setDisplayName("§2Drachen Helm");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, false);
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.DIAMOND_LEGGINGS);
		im = is.getItemMeta();
		im.setDisplayName("§2Drachen Hose");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, false);
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.DIAMOND_BOOTS);
		im = is.getItemMeta();
		im.setDisplayName("§2Drachen Schuhe");
		im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, false);
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.DIAMOND_PICKAXE);
		im = is.getItemMeta();
		im.setDisplayName("§2Drachen Spitzhacke");
		im.addEnchant(Enchantment.DIG_SPEED, 4, false);
		im.addEnchant(Enchantment.DURABILITY, 5, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.DIAMOND_SWORD);
		im = is.getItemMeta();
		im.setDisplayName("§2Drachen Schwert");
		im.addEnchant(Enchantment.DAMAGE_ALL, 3, false);
		im.addEnchant(Enchantment.DURABILITY, 4, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.BOW);
		im = is.getItemMeta();
		im.setDisplayName("§2Drachen Bogen");
		im.addEnchant(Enchantment.ARROW_DAMAGE, 4, false);
		im.addEnchant(Enchantment.DURABILITY, 5, false);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.GOLDEN_APPLE);
		im = is.getItemMeta();
		im.setDisplayName("§fGoldapfel");
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
		
		is = new ItemStack(Material.POTION, 1, (short) 8201);
		im = is.getItemMeta();
		im.setDisplayName("§fStärketrank");
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.POTION, 1, (short) 8229);
		im = is.getItemMeta();
		im.setDisplayName("§fHeiltrank");
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.PAPER);
		im = is.getItemMeta();
        im.setDisplayName("§a256$");
        im.setLore(Arrays.asList("§7Rechtsklicken zum Geld abholen"));
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.PAPER);
		im = is.getItemMeta();
        im.setDisplayName("§a2000$");
        im.setLore(Arrays.asList("§7Rechtsklicken zum Geld abholen"));
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.PAPER);
		im = is.getItemMeta();
        im.setDisplayName("§a2000$");
        im.setLore(Arrays.asList("§7Rechtsklicken zum Geld abholen"));
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.BEACON);
		im = is.getItemMeta();
		im.setDisplayName("§fBeacon");
		is.setAmount(1);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.GOLDEN_APPLE, 1, (short) 1);
		im = is.getItemMeta();
		im.setDisplayName("§fGoldapfel");
		is.setAmount(1);
		is.setItemMeta(im);
		masteritems.add(is);
		
		is = new ItemStack(Material.BOOK);
		im = is.getItemMeta();
		im.setDisplayName("§7Verzaubertes Buch");
		im.setLore(Arrays.asList("§a§lLebensretter I"));
		is.setItemMeta(im);
		masteritems.add(is);
		
		
		return masteritems;
		
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		ChestAPI ca = new ChestAPI();
		Player p = e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK ) {
			if(e.getPlayer().getInventory().getItemInHand().getType() == Material.RECORD_10 && e.getPlayer().getInventory().getItemInHand().getItemMeta().getDisplayName().equals("§9§lMystische-Case")) {
					MystischCase rc = new MystischCase(plugin);
					rc.startAnimation(e.getPlayer());
					ItemStack i = p.getItemInHand();

					if (i.getAmount() > 1) {
						p.getItemInHand().setAmount(i.getAmount() - 1);
					} else if (i.getAmount() == 1) {
						ItemStack air = new ItemStack(Material.AIR);
						p.setItemInHand(air);
					}
			}
		}
		if(e.getClickedBlock().getType() != Material.TRAPPED_CHEST) return;
			e.setCancelled(true);
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
	public void onKlick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(p.getOpenInventory().getTitle().equals("§9§lMystische-Case")) {
			e.setCancelled(true);
		}
		
	}
	
	
}