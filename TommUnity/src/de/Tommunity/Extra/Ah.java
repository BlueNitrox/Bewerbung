package de.Tommunity.Extra;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
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

import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;

public class Ah implements CommandExecutor, Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public String GUI_NAME = "§e§lMarktplatz";
	public static ArrayList<Player> itemin = new ArrayList<>();
	public static Player p1;
	public static boolean Ah;
	public static ItemStack item1;
	public static Inventory inv1;

	public static boolean Slot10;
	public static boolean Slot11;
	public static boolean Slot12;
	public static boolean Slot13;
	public static boolean Slot14;
	public static boolean Slot15;
	public static boolean Slot16;
	public static boolean Slot19;
	public static boolean Slot20;
	public static boolean Slot21;
	public static boolean Slot22;
	public static boolean Slot23;
	public static boolean Slot24;
	public static boolean Slot25;

	public static ItemStack s10;
	public static ItemStack s11;
	public static ItemStack s12;
	public static ItemStack s13;
	public static ItemStack s14;
	public static ItemStack s15;
	public static ItemStack s16;
	public static ItemStack s19;
	public static ItemStack s20;
	public static ItemStack s21;
	public static ItemStack s22;
	public static ItemStack s23;
	public static ItemStack s24;
	public static ItemStack s25;

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		p1 = p;
		if (!(cs instanceof Player)) {
			cs.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
			return true;
		}
		if(p.hasPermission("Tom.AhOnOff")) {
		Bukkit.getScheduler().scheduleAsyncRepeatingTask(Main.getPlugin(), new Runnable() {
			public void run() {
				for(Player all : Bukkit.getOnlinePlayers()) {
				all.updateInventory();
				}
			}
		},0,20 );
		
		Inventory inv = Bukkit.createInventory(null, 4 * 9, GUI_NAME);
		inv1 = inv;
		if (Ah == true) {
			if (args.length == 0) {

				ItemStack glas = new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname("§7Glasscheibe").build();
				inv.setItem(0, glas);
				inv.setItem(1, glas);
				inv.setItem(2, glas);
				inv.setItem(3, glas);
				inv.setItem(4, glas);
				inv.setItem(5, glas);
				inv.setItem(6, glas);
				inv.setItem(7, glas);
				inv.setItem(8, glas);
				inv.setItem(9, glas);
				inv.setItem(18, glas);
				inv.setItem(27, glas);
				inv.setItem(28, glas);
				inv.setItem(29, glas);
				inv.setItem(30, glas);
				inv.setItem(31, glas);
				inv.setItem(32, glas);
				inv.setItem(33, glas);
				inv.setItem(34, glas);
				inv.setItem(35, glas);
				inv.setItem(26, glas);
				inv.setItem(17, glas);
				inv1.setItem(0, glas);
				inv1.setItem(1, glas);
				inv1.setItem(2, glas);
				inv1.setItem(3, glas);
				inv1.setItem(4, glas);
				inv1.setItem(5, glas);
				inv1.setItem(6, glas);
				inv1.setItem(7, glas);
				inv1.setItem(8, glas);
				inv1.setItem(9, glas);
				inv1.setItem(18, glas);
				inv1.setItem(27, glas);
				inv1.setItem(28, glas);
				inv1.setItem(29, glas);
				inv1.setItem(30, glas);
				inv1.setItem(31, glas);
				inv1.setItem(32, glas);
				inv1.setItem(33, glas);
				inv1.setItem(34, glas);
				inv1.setItem(35, glas);
				inv1.setItem(26, glas);
				inv1.setItem(17, glas);

				if (Slot25 == true) {
					inv.setItem(25, s25);
				} else if (Slot24 == true) {
					inv.setItem(24, s24);
				} else if (Slot23 == true) {
					inv.setItem(23, s23);
				} else if (Slot22 == true) {
					inv.setItem(22, s22);
				} else if (Slot21 == true) {
					inv.setItem(21, s21);
				} else if (Slot20 == true) {
					inv.setItem(20, s20);
				} else if (Slot19 == true) {
					inv.setItem(19, s19);
				} else if (Slot16 == true) {
					inv.setItem(16, s16);
				} else if (Slot15 == true) {
					inv.setItem(15, s15);
				} else if (Slot14 == true) {
					inv.setItem(14, s14);
				} else if (Slot13 == true) {
					inv.setItem(13, s13);
				} else if (Slot12 == true) {
					inv.setItem(12, s12);
				} else if (Slot11 == true) {
					inv.setItem(11, s11);
				} else if (Slot10 == true) {
					inv.setItem(10, s10);
				}

				inv = inv1;
				p.openInventory(inv);

			} else if (args.length == 1) {
				p.sendMessage(Main.pre + "§cBenutzung :§6 /markt §coder §6/markt sell <Betrag>");
			} else if (args.length == 2) {
				if (p.getInventory().getItemInHand().getType() != Material.AIR) {
					ItemStack item = p.getItemInHand();
					item1 = item;
					ItemMeta im = item.getItemMeta();
					if(p.getItemInHand().getItemMeta().getLore() != null) {
					List<String> imn = im.getLore();
					ArrayList<String> lore = new ArrayList<String>();
					lore.addAll(imn);
					lore.add("Verkäufer: " + p.getName());
					lore.add("§7Preis: " + args[1]);
					im.setLore(lore);
					item.setItemMeta(im);
					}else {
						List<String> imn = im.getLore();
						ArrayList<String> lore = new ArrayList<String>();
						lore.add("Verkäufer: " + p.getName());
						lore.add("§7Preis: " + args[1]);
						im.setLore(lore);
						item.setItemMeta(im);
					}
					ItemStack air = new ItemStack(Material.AIR);
					

					if (inv.getName().equals(GUI_NAME)) {
						if (inv.getItem(10) == null) {
							inv.setItem(10, item);
							inv1.setItem(10, item);
							Slot10 = true;
							s10 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn10();
						} else if (inv.getItem(11) == null) {
							inv.setItem(11, item);
							inv1.setItem(11, item);
							Slot11 = true;
							s11 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn11();
						} else if (inv.getItem(12) == null) {
							inv.setItem(12, item);
							inv1.setItem(12, item);
							Slot12 = true;
							s13 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn12();
						} else if (inv.getItem(13) == null) {
							inv.setItem(13, item);
							inv1.setItem(13, item);
							Slot13 = true;
							s13 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn13();
						} else if (inv.getItem(14) == null) {
							inv.setItem(14, item);
							inv1.setItem(14, item);
							Slot14 = true;
							s14 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn14();
						} else if (inv.getItem(15) == null) {
							inv.setItem(15, item);
							inv1.setItem(15, item);
							Slot15 = true;
							s15 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn15();
						} else if (inv.getItem(16) == null) {
							inv.setItem(16, item);
							inv1.setItem(16, item);
							Slot16 = true;
							s16 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn16();
						} else if (inv.getItem(19) == null) {
							inv.setItem(19, item);
							inv1.setItem(19, item);
							Slot19 = true;
							s19 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn19();
						} else if (inv.getItem(20) == null) {
							inv.setItem(20, item);
							inv1.setItem(20, item);
							Slot20 = true;
							s20 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn20();
						} else if (inv.getItem(21) == null) {
							inv.setItem(21, item);
							inv1.setItem(21, item);
							Slot21 = true;
							s21 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn21();
						} else if (inv.getItem(22) == null) {
							inv.setItem(22, item);
							inv1.setItem(22, item);
							Slot22 = true;
							s22 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn22();
						} else if (inv.getItem(23) == null) {
							inv.setItem(23, item);
							inv1.setItem(23, item);
							Slot23 = true;
							s23 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn23();
						} else if (inv.getItem(24) == null) {
							inv.setItem(24, item);
							inv1.setItem(24, item);
							Slot24 = true;
							s24 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn24();
						} else if (inv.getItem(25) == null) {
							inv.setItem(25, item);
							inv1.setItem(25, item);
							Slot25 = true;
							s25 = item;
							itemin.add(p);
							p.setItemInHand(air);
							AfterAhManager.onItemIn25();
						} else
							p.sendMessage(
									Main.pre + "§cDerzeit ist kein Markt-Slot frei. Bitte versuche es Später erneut!");
					}
				} else {
					p.sendMessage(Main.pre + "§cDu musst ein Item in der Hand halten!");
				}
			} else {
				p.sendMessage(Main.pre + "§cBenutzung :§6 /markt§c!");
			}
		} else {
			p.sendMessage(Main.pre + "§cDer Markt ist Derzeit deaktiviert!");
		}
		}else {
			p.sendMessage(Main.err);
		}
		return false;
	}

	@EventHandler
	public void onClick(final InventoryClickEvent e) {
		Player t = (Player) e.getWhoClicked();
		if (e.getClickedInventory().getName().equals(GUI_NAME)) {
			e.setCancelled(true);
		}

		if (e.getCurrentItem().getType() == item1.getType()) {

		}

	}
}
