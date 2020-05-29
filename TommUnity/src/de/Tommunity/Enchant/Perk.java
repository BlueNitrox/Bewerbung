package de.Tommunity.Enchant;

import java.util.ArrayList;
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
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Perk implements CommandExecutor,Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	private final String GUI_NAME = "§d§lPerks";
	public static ArrayList<Player> Perkno = new ArrayList<>();
	public static ArrayList<Player> Perkst = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player)cs;
		if(!(cs instanceof Player)) {
			cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
			return true;
		}
		if(args.length == 0) {
			
			Inventory inv = Bukkit.createInventory(null, 9 * 3, GUI_NAME);
			ItemStack glas = new ItemBuilder(Material.STAINED_GLASS_PANE, (short) 15).setDisplayname("§7Glasscheibe").build();
			ItemStack Diamond = new ItemBuilder(Material.DIAMOND).setDisplayname("§d§lPerks").build();
			
			ItemStack NoHunger = new ItemBuilder(Material.COOKED_BEEF).setDisplayname("§e§lNoHunger").setLore(Arrays.asList("§eBekomme nie wieder Hunger!","§ePreis: 300.000","§c§lNICHT GEKAUFT")).build();
			ItemStack NoHungergekauft = new ItemBuilder(Material.COOKED_BEEF).setDisplayname("§e§lNoHunger").addEnchant(Enchantment.DAMAGE_ALL, 1, true).setLore(Arrays.asList("§eBekomme nie wieder Hunger!","§ePreis: 300.000","§a§lGEKAUFT")).build();
			ItemStack Stärke = new ItemBuilder(Material.POTION, (short) 8201 ).setDisplayname("§c§lStärke").setLore(Arrays.asList("§eStärke 2 in der MobZone!","§ePreis: 300.000","§c§lNICHT GEKAUFT")).build();
			ItemStack Stärkegekauft = new ItemBuilder(Material.POTION, (short) 8201 ).setDisplayname("§c§lStärke").addEnchant(Enchantment.DAMAGE_ALL, 1, true).setLore(Arrays.asList("§eStärke 2 in der MobZone!","§ePreis: 300.000","§a§lGEKAUFT")).build();
			
			for (int i = 0; i != 9; i++) {
				inv.setItem(i, glas);
			}
			for (int i = 18; i != 27; i++) {
				inv.setItem(i, glas);
			}
			
			inv.setItem(9, glas);
			inv.setItem(10, glas);
			inv.setItem(12, glas);
			inv.setItem(14, glas);
			inv.setItem(16, glas);
			inv.setItem(17, glas);
			inv.setItem(13, Diamond);
			
			if(p.hasPermission("Perk.Nohunger")) {
			inv.setItem(15, NoHungergekauft);
			}else inv.setItem(15, NoHunger);
			if(p.hasPermission("Perk.Stärke")) {
			inv.setItem(11, Stärkegekauft);
			}else inv.setItem(11, Stärke);
			
			p.openInventory(inv);
			
		}else {
			p.sendMessage(Main.pre + "§3Benutze §6/perk§3 !");
		}
		return false;
	}
	@EventHandler
	public void handleAnvilMenuClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		EconomySystem es = new EconomySystem();
		if (e.getClickedInventory().getTitle().equals(GUI_NAME)) {
			e.setCancelled(true);
		}
		
		
		if(e.getCurrentItem().getType() == Material.COOKED_BEEF && e.getCurrentItem().getItemMeta().getDisplayName().equals("§e§lNoHunger")) {
			if(p.hasPermission("Perk.Nohunger")) {
				if(!Perkno.contains(p)) {
				Perkno.add(p);
				p.sendMessage(Main.pre + "§3Du hast das §e§lNo Hunger §3Perk §aangemacht!");
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
				}else {
					Perkno.remove(p);
					p.sendMessage(Main.pre + "§3Du hast das §e§lNo Hunger §3Perk §causgemacht!");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
				}
			}else if(es.hasEnoughMoney(p.getUniqueId(), 300000)) {
				PermissionsEx.getUser(p).addPermission("Perk.Nohunger");
				es.removeMoney(p.getUniqueId(), 300000);
				p.sendMessage(Main.pre + "§3Du hast das §e§lNo Hunger §3Perk gekauft!");
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
			}else {
				p.sendMessage(Main.pre + "§cDazu hast du nicht genug Geld");
				p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
			}
		}
		if(e.getCurrentItem().getType() == Material.POTION && e.getCurrentItem().getItemMeta().getDisplayName().equals("§c§lStärke")) {
			if(p.hasPermission("Perk.Stärke")) {
				if(!Perkst.contains(p)) {
				Perkst.add(p);
				p.sendMessage(Main.pre + "§3Du hast das §c§lStärke §3Perk §aangemacht!");
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
				}else {
					Perkst.remove(p);
					p.sendMessage(Main.pre + "§3Du hast das §c§lStärke §3Perk §causgemacht!");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
				}
			}else if(es.hasEnoughMoney(p.getUniqueId(), 300000)) {
				PermissionsEx.getUser(p).addPermission("Perk.Stärke");
				es.removeMoney(p.getUniqueId(), 300000);
				p.sendMessage(Main.pre + "§3Du hast das §c§lStärke §3Perk gekauft!");
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1L, 1L);
			}else {
				p.sendMessage(Main.pre + "§cDazu hast du nicht genug Geld");
				p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1L, 1L);
			}
		}
		}
	
	
	@EventHandler
	public void onHunger(FoodLevelChangeEvent e) {
		Player p = (Player) e.getEntity();
		if(Perkno.contains(p)) {
			e.setCancelled(true);
			p.setFoodLevel(20);
		}
	}
	
	@EventHandler
	public void onworld(PlayerChangedWorldEvent e) {
		Player p = e.getPlayer();
		if(e.getPlayer().getWorld().getName().equals("mob")) {
			if(Perkst.contains(p)) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20*60*100000 , 1));
			}
		}else {
			p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
		}
		
	}
	

}
