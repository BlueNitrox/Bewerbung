package de.Tommunity.Extra;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import de.Tommunity.Main.Main;

public class AfterAhManager {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	public static void onItemIn10() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(10, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot10 = false;
					Ah.p1.closeInventory();
				}
			}.runTaskLater(Main.getPlugin(), 20 * 30);
		}
	}
	
	public static void onItemIn11() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(11, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot11 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 30);
		}
	}
	public static void onItemIn12() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(12, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot12 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
	public static void onItemIn13() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(13, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot13 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
	public static void onItemIn14() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(14, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot14 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
	public static void onItemIn15() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(15, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot15 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
	public static void onItemIn16() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(16, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot16 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
	public static void onItemIn19() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(19, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot19 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
	public static void onItemIn20() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(20, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot20 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
	public static void onItemIn21() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(21, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot21 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
	public static void onItemIn22() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(22, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot22 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
	public static void onItemIn23() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(23, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot23 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
	public static void onItemIn24() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(24, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot24 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
	public static void onItemIn25() {
    	ItemStack air = new ItemStack(Material.AIR);
		if (Ah.itemin.contains(Ah.p1)) {
			new BukkitRunnable() {
				@Override
				public void run() {
					Ah.inv1.setItem(25, air);
					Ah.itemin.get(0).getInventory().addItem(Ah.item1);
					Ah.itemin.remove(0);
					Ah.Slot25 = false;
					Ah.p1.openInventory(Ah.inv1);
				}
			}.runTaskLater(Main.getPlugin(), 20 * 60 * 2);
		}
	}
}
