package de.Tommunity.Commands;

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
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Main.Main;

public class ReportSys implements CommandExecutor, Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static String GUI_NAME = "§1Report";
	public static ArrayList<Player> hacking = new ArrayList<>();
	public static ArrayList<Player> beleidigung = new ArrayList<>();
	public static ArrayList<Player> spam = new ArrayList<>();
	public static ArrayList<Player> bugusing = new ArrayList<>();
	public static ArrayList<Player> Sonstiges = new ArrayList<>();
	public static ArrayList<Player> Reportet = new ArrayList<>();
	public static Player t;

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if (!(cs instanceof Player)) {
			cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
			return true;
		}
		if (args.length == 1) {
			t = Bukkit.getPlayer(args[0]);
			if(t == null) {
				p.sendMessage(Main.pre + "§cDieser Spieler ist nicht Online!");
				return true;
			}
			Inventory inv = Bukkit.createInventory(null, 3 * 9, GUI_NAME);
			ItemStack Hacking = new ItemStack(Material.DIAMOND_SWORD);
			ItemStack beleidigung = new ItemStack(Material.PAPER);
			ItemStack SpamYT = new ItemStack(Material.BOOK);
			ItemStack Bug = new ItemStack(Material.BARRIER);
			ItemStack Sonst = new ItemStack(Material.GOLDEN_APPLE);
			
			ItemMeta Hack = Hacking.getItemMeta();
			ItemMeta Bele = beleidigung.getItemMeta();
			ItemMeta Spam = SpamYT.getItemMeta();
			ItemMeta bu = Bug.getItemMeta();
			ItemMeta so = Sonst.getItemMeta();

			Hack.setDisplayName("§c§lHacking");
			Hack.setLore(Arrays.asList("§7Reporte §6" + t.getName() + "§7 für Hacking",
					"§7Das ausnutzen eines Reports kann zu einem Ban führen"));
			Hacking.setItemMeta(Hack);

			Bele.setDisplayName("§b§lBeleidigung");
			Bele.setLore(Arrays.asList("§7Reporte §6" + t.getName() + "§7 für beleidigung",
					"§7Das ausnutzen eines Reports kann zu einem Ban führen"));
			beleidigung.setItemMeta(Bele);

			Spam.setDisplayName("§f§lSpam/Werbung");
			Spam.setLore(Arrays.asList("§7Reporte §6" + t.getName() + "§7 für Spam/Werbung",
					"§7Das ausnutzen eines Reports kann zu einem Ban führen"));
			SpamYT.setItemMeta(Spam);

			bu.setDisplayName("§9§lBug ausnutzung");
			bu.setLore(Arrays.asList("§7Reporte §6" + t.getName() + "§7 für Bug ausnutzung",
					"§7Das ausnutzen eines Reports kann zu einem Ban führen"));
			Bug.setItemMeta(bu);

			so.setDisplayName("§a§lSonstiges/Spielverhalten");
			so.setLore(Arrays.asList("§7Reporte §6" + t.getName() + "§7 für Sonstiges/Spielverhalten",
					"§7Das ausnutzen eines Reports kann zu einem Ban führen"));
			Sonst.setItemMeta(so);
			
			inv.setItem(9, Hacking);
			inv.setItem(11, beleidigung);
			inv.setItem(13, SpamYT);
			inv.setItem(15, Bug);
			inv.setItem(17, Sonst);

			p.openInventory(inv);
		} else {
			p.sendMessage(Main.pre + "§cBenutzung : §6/report <Spieler>§c!");
		}
		return false;
	}

	@EventHandler
	public void onClick(final InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getClickedInventory().getName().equals(GUI_NAME)) {
			e.setCancelled(true);
		}
		if(e.getClickedInventory().getName().equals(GUI_NAME)) {
		if (e.getCurrentItem().getType() == Material.DIAMOND_SWORD) {
			if(!(Reportet.contains(p))) {
			hacking.add(t);
			p.sendMessage(Main.pre + "§3Du hast §6" + t.getName() + "§3 erfolgreich für §cHacking §3reportet!");
			p.playSound(p.getLocation(), Sound.BAT_IDLE, 1L, 1L);
			p.closeInventory();
			for (Player all : Bukkit.getOnlinePlayers()) {
				if (all.hasPermission("Tom.report")) {
					all.sendMessage(Main.pre + "§4§lREPORT!!! §3" + t.getName() + ", Hacking");
					all.playSound(all.getLocation(), Sound.BAT_IDLE, 1L, 1L);
				}
			}
			Reportet.add(p);
			}else {
				p.sendMessage(Main.pre + "§3Rejoine um einen Spieler erneut zu reporten!");
			}
		} else if (e.getCurrentItem().getType() == Material.PAPER) {
			if(!(Reportet.contains(p))) {
			beleidigung.add(t);
			p.sendMessage(Main.pre + "§3Du hast §6" + t.getName() + "§3 erfolgreich für §bBeleidigung §3reportet!");
			p.playSound(p.getLocation(), Sound.BAT_IDLE, 1L, 1L);
			p.closeInventory();
			for (Player all : Bukkit.getOnlinePlayers()) {
				if (all.hasPermission("Tom.report")) {
					all.sendMessage(Main.pre + "§4§lREPORT!!! §3" + t.getName() + ", Beleidigung");
					all.playSound(all.getLocation(), Sound.BAT_IDLE, 1L, 1L);
				}
			}
			Reportet.add(p);
			}else {
				p.sendMessage(Main.pre + "§3Rejoine um einen Spieler erneut zu reporten!");
			}
		} else if (e.getCurrentItem().getType() == Material.BOOK) {
			if(!(Reportet.contains(p))) {
			spam.add(t);
			p.sendMessage(Main.pre + "§3Du hast §6" + t.getName() + "§3 erfolgreich für §fSpam §3reportet!");
			p.playSound(p.getLocation(), Sound.BAT_IDLE, 1L, 1L);
			p.closeInventory();
			for (Player all : Bukkit.getOnlinePlayers()) {
				if (all.hasPermission("Tom.report")) {
					all.sendMessage(Main.pre + "§4§lREPORT!!! §3" + t.getName() + ", Spam");
					all.playSound(all.getLocation(), Sound.BAT_IDLE, 1L, 1L);
				}
			}
			Reportet.add(p);
			}else {
				p.sendMessage(Main.pre + "§3Rejoine um einen Spieler erneut zu reporten!");
			}
		} else if (e.getCurrentItem().getType() == Material.BARRIER) {
			if(!(Reportet.contains(p))) {
			bugusing.add(t);
			p.sendMessage(Main.pre + "§3Du hast §6" + t.getName() + "§3 erfolgreich für §9Bugusing §3reportet!");
			p.playSound(p.getLocation(), Sound.BAT_IDLE, 1L, 1L);
			p.closeInventory();
			for (Player all : Bukkit.getOnlinePlayers()) {
				if (all.hasPermission("Tom.report")) {
					all.sendMessage(Main.pre + "§4§lREPORT!!! §3" + t.getName() + ", Bugusing");
					all.playSound(all.getLocation(), Sound.BAT_IDLE, 1L, 1L);
				}
			}
			Reportet.add(p);
			}else {
				p.sendMessage(Main.pre + "§3Rejoine um einen Spieler erneut zu reporten!");
			}
		} else if (e.getCurrentItem().getType() == Material.GOLDEN_APPLE) {
			if(!(Reportet.contains(p))) {
			Sonstiges.add(t);
			p.sendMessage(Main.pre + "§3Du hast §6" + t.getName() + "§3 erfolgreich für §9Sonstiges/Spielverhalten §3reportet!");
			p.playSound(p.getLocation(), Sound.BAT_IDLE, 1L, 1L);
			p.closeInventory();
			for (Player all : Bukkit.getOnlinePlayers()) {
				if (all.hasPermission("Tom.report")) {
					all.sendMessage(Main.pre + "§4§lREPORT!!! §3" + t.getName() + ", Sonstiges/Spielverhalten");
					all.playSound(all.getLocation(), Sound.BAT_IDLE, 1L, 1L);
				}
			}
			Reportet.add(p);
			}else {
				p.sendMessage(Main.pre + "§3Rejoine um einen Spieler erneut zu reporten!");
			}
		}
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	@EventHandler
	public void onQuit(final PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if (hacking.contains(p.getDisplayName())) {
			hacking.remove(p.getDisplayName());
		}
		if (beleidigung.contains(p.getDisplayName())) {
			beleidigung.remove(p.getDisplayName());
		}
		if (spam.contains(p.getDisplayName())) {
			spam.remove(p.getDisplayName());
		}
		if (bugusing.contains(p.getDisplayName())) {
			bugusing.remove(p.getDisplayName());
		}
		if (Sonstiges.contains(p.getDisplayName())) {
			Sonstiges.remove(p.getDisplayName());
		}
		
		Reportet.remove(p);
		
	}

}
