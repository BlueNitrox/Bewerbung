package de.Tommunity.utils;

import java.util.ArrayList;

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
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Commands.EXpSystem;
import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Commands.TokenSystem;
import de.Tommunity.Main.Main;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class DailyReward implements CommandExecutor, Listener{

	public static ArrayList<String> tagcooldown = new ArrayList<>();
	public static ArrayList<String> tagcooldownmaster = new ArrayList<>();
	public static ArrayList<String> tagcooldownhero = new ArrayList<>();
	
	long sched = 24*60*60*10;
	long schedmaster = 24*60*60*10;
	long schedhero = 24*60*60*10;
	
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		Player p = (Player) cs;
		if(cs instanceof Player) {
			if(args.length == 0) {
				Inventory inv = Bukkit.getServer().createInventory(null, 9*3, "§6Daily Reward");
				ItemStack glas = new ItemBuilder(Material.STAINED_GLASS_PANE, (short) 15).setDisplayname("").build();
				for(int i = 0; i != 9; i++) {
					inv.setItem(i, glas);
				}
				for(int i = 18; i != 27; i++) {
					inv.setItem(i, glas);
				}
				inv.setItem(9, glas);
				inv.setItem(10, glas);
				inv.setItem(12, glas);
				inv.setItem(14, glas);
				inv.setItem(16, glas);
				inv.setItem(17, glas);
				
				ItemStack spieler = new ItemBuilder(Material.STORAGE_MINECART).setDisplayname("§7Daily Reward").setLore("§aKlicken zum abholen").build();
				ItemStack masterperms = new ItemBuilder(Material.STORAGE_MINECART).setDisplayname("§dMaster Reward").setLore("§aKlicken zum abholen").build();
				ItemStack masternoperms = new ItemBuilder(Material.OBSIDIAN).setDisplayname("§cDu benötigst den §dMaster-Rang").setLore("§cNicht möglich").build();
				ItemStack heroperms = new ItemBuilder(Material.STORAGE_MINECART).setDisplayname("§9Hero Reward").setLore("§aKlicken zum abholen").build();
				ItemStack heronoperms = new ItemBuilder(Material.OBSIDIAN).setDisplayname("§cDu benötigst den §9Hero-Rang").setLore("§cNich möglich").build();
				ItemStack spielerabgeholt = new ItemBuilder(Material.MINECART).setDisplayname("§7Daily Reward §cabheolt").setLore("§cDu musst noch etwas warten bis du dir den §6Daily Reward §cwieder abholen kannst").build();
				ItemStack masterabgeholt = new ItemBuilder(Material.MINECART).setDisplayname("§dMaster Reward §cabheolt").setLore("§cDu musst noch etwas warten bis du dir den §dMaster Reward §cwieder abholen kannst").build();
				ItemStack heroabgeholt = new ItemBuilder(Material.MINECART).setDisplayname("§9Hero Reward §cabheolt").setLore("§cDu musst noch etwas warten bis du dir den §9Hero Reward §cwieder abholen kannst").build();
				
				if(tagcooldown.contains(p.getName())) {
					inv.setItem(11, spielerabgeholt);
				}else {
					inv.setItem(11, spieler);
				}
				
				if(PermissionsEx.getUser(p).inGroup("Spieler") || PermissionsEx.getUser(p).inGroup("Business")) {
						inv.setItem(13, masternoperms);	
					
				}else {
					if(tagcooldownmaster.contains(p.getName())) {
						inv.setItem(13, masterabgeholt);
					}else {
					inv.setItem(13, masterperms);
					}
				}
				
				
				if(PermissionsEx.getUser(p).inGroup("Spieler") || PermissionsEx.getUser(p).inGroup("Business") || PermissionsEx.getUser(p).inGroup("Master")) {
					inv.setItem(15, heronoperms);
				}else {
					if(tagcooldownhero.contains(p.getName())) {
						inv.setItem(15, heroabgeholt);
					}else {
					inv.setItem(15, heroperms);
					}
				}
				p.openInventory(inv);
				
			}else {
				p.sendMessage(Main.pre + "§cBitte benutze §6/dailyReward");
			}
		}else {
			cs.sendMessage(Main.pre + "§cDuzu musst du ein Spieler sein");
		}
		return false;
	}
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getClickedInventory().getTitle().equals("§6Daily Reward") && e.getCurrentItem() != null) {
			e.setCancelled(true);
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Daily Reward")){
				
				EconomySystem es = new EconomySystem();
				es.addMoney(p.getUniqueId(), 500);
				TokenSystem ts = new TokenSystem();
				ts.addToken(p.getUniqueId(), 1);
				p.sendMessage(Main.pre + "§aDu hast dir den §6Daily Reward §aabgeholt");
				p.sendMessage(Main.pre + "§6Money: §a+500$");
				p.sendMessage(Main.pre + "§6Tokens: §a +1");
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
				
				tagcooldown.add(p.getName());
				p.closeInventory();
				
//				new BukkitRunnable() {
//					long t = 864000;
//				
//					
//					int seconds = 0;
//					int minutes = 0;
//					int houers = 0;
//					
//				
//					@Override
//					public void run() {
//						t--;
//						long current = System.currentTimeMillis();
//						long millis = t - current;
//						while(millis > 1000) {
//							millis -=1000;
//							seconds++;
//						}
//						while(seconds > 60) {
//							seconds -=60;
//							minutes++;
//						}
//						while(minutes > 60) {
//							minutes -=60;
//							houers++;
//						}
//						String rest = "§cDu musst noch §4" + houers + (houers == 1 ? " Stunde " : " Stunden ") + minutes + (minutes == 1 ? " Minute " : " Minuten ");
//						
//					}
//				}.runTaskTimer(Main.getPlugin(), 0, 20);
				
				Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
					
					@Override
					public void run() {
						tagcooldown.remove(p.getName());
							
					}
				}, sched );
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Daily Reward §cabheolt")) {
				p.sendMessage(Main.pre + "§cDu musst noch etwas waten bis du dir den §6Daily Reward §cwieder abholen kannst");
				p.closeInventory();
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§cDu benötigst den §dMaster-Rang")){
				p.sendMessage(Main.pre + "§cUm dir den §dMaster Reward §cabzuholen benötigst du den §dMaster-Rang");
				p.closeInventory();
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§cDu benötigst den §9Hero-Rang")) {
				p.sendMessage(Main.pre + "§cUm dir den §9Hero Reward §cabzuholen benötigst du den §9Hero-Rang");
				p.closeInventory();
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§dMaster Reward")) {
				
				EconomySystem es = new EconomySystem();
				es.addMoney(p.getUniqueId(), 1000);
				EXpSystem exp = new EXpSystem();
				exp.addEXP(p.getUniqueId(), 100);
				p.sendMessage(Main.pre + "§aDu hast dir den §dMaster Reward §aabgeholt:");
				p.sendMessage(Main.pre + "§6Money: §a+1000$");
				p.sendMessage(Main.pre + "§6Exp: §a+100");
				
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
				
				tagcooldownmaster.add(p.getName());
					Bukkit.getScheduler().runTaskLater(Main.getPlugin(), new Runnable() {
					
					@Override
					public void run() {
						tagcooldownmaster.remove(p.getName());
							
					}
				}, schedmaster);
				
				p.closeInventory();
				
					
				}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§9Hero Reward")) {
					
					
					EconomySystem es = new EconomySystem();
					es.addMoney(p.getUniqueId(), 1500);
					EXpSystem exp = new EXpSystem();
					exp.addEXP(p.getUniqueId(), 200);
					p.sendMessage(Main.pre + "§aDu hast dir den §9Hero Reward §aabgeholt:");
					p.sendMessage(Main.pre + "§6Money: §a+1500$");
					p.sendMessage(Main.pre + "§6Exp: §a+200");
					
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);

					p.closeInventory();

					tagcooldownhero.add(p.getName());
					
					Bukkit.getScheduler().runTaskLater(Main.getPlugin(), new Runnable() {
						
						@Override
						public void run() {
							tagcooldownhero.remove(p.getName());
								
						}
					}, schedhero);
					p.closeInventory();
				}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§9Hero Reward §cabheolt")) {
					p.sendMessage(Main.pre + "§cDu musst noch etwas warten bis du dir den §9Hero Reward §cwieder abholen kannst");
					p.closeInventory();
				}else if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§dMaster Reward §cabheolt")) {
					p.sendMessage(Main.pre + "§cDu musst noch etwas warten bis du dir den §dMaster Reward §cwieder abholen kannst");
					p.closeInventory();
				}
			}
		}
	}
