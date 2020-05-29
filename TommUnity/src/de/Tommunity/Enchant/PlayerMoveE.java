package de.Tommunity.Enchant;

import java.util.HashMap;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Score;

import de.Tommunity.utils.ScoreboardManager;

public class PlayerMoveE implements Listener {

	/*
	 * Java-Class by 1BlueNitrox ©CopyRight
	 */

	private HashMap<String, Long> cooldowns = new HashMap<String, Long>();
	private HashMap<OfflinePlayer, Score> scores = new HashMap<OfflinePlayer, Score>();

	@EventHandler
	public void onSneak(PlayerToggleSneakEvent e) {
		Player p = e.getPlayer();
		if (e.getPlayer().isSneaking()) {
			Long time = System.currentTimeMillis();
			if (this.cooldowns.containsKey(p.getName())) {
				Long lastUsage = this.cooldowns.get(p.getName());
				if (lastUsage + 5 * 1000 > time) {
					return;

				}
			}
			ScoreboardManager.sendTabAndScoreboard(p);
			cooldowns.put(p.getName(), time);
		}

	}

	
	@SuppressWarnings("unlikely-arg-type")
	@EventHandler
	public void onHitÜberladung(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		ItemStack item1 = p.getInventory().getHelmet();
		ItemStack item2 = p.getInventory().getChestplate();
		ItemStack item3 = p.getInventory().getLeggings();
		ItemStack item4 = p.getInventory().getBoots();
		if(p.isSprinting() || !p.isSprinting()) {

			int addÜberladung = 0;
			
			if (item1 != null) {
				if (item1.getItemMeta().getLore().contains("§a§lLebensretter I")) {
					addÜberladung += 0.5;
				}
				if (item1.getItemMeta().getLore().contains("§a§lLebensretter II")) {
					addÜberladung += 1;
				}
				if (item1.getItemMeta().getLore().contains("§a§lLebensretter III")) {
					addÜberladung += 1.5;
				}
				if (item1.getItemMeta().getLore().contains("§a§lLebensretter IV")) {
					addÜberladung += 2;
				}
				if (item1.getItemMeta().getLore().contains("§a§lLebensretter V")) {
					addÜberladung += 2.5;
				}


			}
			if (item2 != null) {
				if (item2.getItemMeta().getLore().contains("§a§lLebensretter I")) {
					addÜberladung += 0.5;
				}
				if (item2.getItemMeta().getLore().contains("§a§lLebensretter II")) {
					addÜberladung += 1;
				}
				if (item2.getItemMeta().getLore().contains("§a§lLebensretter III")) {
					addÜberladung += 1.5;
				}
				if (item2.getItemMeta().getLore().contains("§a§lLebensretter IV")) {
					addÜberladung += 2;
				}
				if (item2.getItemMeta().getLore().contains("§a§lLebensretter V")) {
					addÜberladung += 2.5;
				}


			}
			if (item3 != null) {
				if (item3.getItemMeta().getLore().contains("§a§lLebensretter I")) {
					addÜberladung += 0.5;
				}
				if (item3.getItemMeta().getLore().contains("§a§lLebensretter II")) {
					addÜberladung += 1;
				}
				if (item3.getItemMeta().getLore().contains("§a§lLebensretter III")) {
					addÜberladung += 1.5;
				}
				if (item3.getItemMeta().getLore().contains("§a§lLebensretter IV")) {
					addÜberladung += 2;
				}
				if (item3.getItemMeta().getLore().contains("§a§lLebensretter V")) {
					addÜberladung += 2.5;
				}


			}
			if (item4 != null) {
				if (item4.getItemMeta().getLore().contains("§a§lLebensretter I")) {
					addÜberladung += 0.5;
				}
				if (item4.getItemMeta().getLore().contains("§a§lLebensretter II")) {
					addÜberladung += 1;
				}
				if (item4.getItemMeta().getLore().contains("§a§lLebensretter III")) {
					addÜberladung += 1.5;
				}
				if (item4.getItemMeta().getLore().contains("§a§lLebensretter IV")) {
					addÜberladung += 2;
				}
				if (item4.getItemMeta().getLore().contains("§a§lLebensretter V")) {
					addÜberladung += 2.5;
				}

				if(p.getHealth() <= 5) {
					
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 17, addÜberladung));
				}
			}
		}
	}

	@EventHandler
	public void onJoinTank(PlayerChangedWorldEvent e) {
		Player p = e.getPlayer();
		ItemStack item1 = p.getInventory().getHelmet();
		ItemStack item2 = p.getInventory().getChestplate();
		ItemStack item3 = p.getInventory().getLeggings();
		ItemStack item4 = p.getInventory().getBoots();

		int addHealthScale = 0;

		if (item1 != null) {
			addHealthScale += getTankLevel(item1.getItemMeta().getLore().get(0));
		}
		if (item2 != null) {
			addHealthScale += getTankLevel(item2.getItemMeta().getLore().get(0));
		}
		if (item3 != null) {
			addHealthScale += getTankLevel(item3.getItemMeta().getLore().get(0));
		}
		if (item4 != null) {
			addHealthScale += getTankLevel(item4.getItemMeta().getLore().get(0));
		}
		p.setHealthScale(20 + addHealthScale);
	}

	@EventHandler
	private int getTankLevel(String s) {
		String number = s.split(" ")[1];
		if (number.equals("I")) {
			return 1;
		} else if (number.equals("II")) {
			return 2;
		} else if (number.equals("III")) {
			return 3;
		} else if (number.equals("IV")) {
			return 4;
		} else if (number.equals("V")) {
			return 5;
		} else {
			return 0;
		}
	}
}