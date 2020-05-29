package de.Tommunity.Listener;
 
import java.util.Arrays;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Main.Main;
 
public class Interact_WeihnachtsGeschenk implements Listener{

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
		if(!(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK))return;
		if(!(e.getItem().getItemMeta().getDisplayName().equals("§cWeihnachtsgeschenk")))return;
        	    
		ItemStack i = p.getItemInHand();
		
                if(i.getAmount() > 1) {
        	        p.getItemInHand().setAmount(i.getAmount() -1);
        	    }else if(i.getAmount() == 1) {
        	    	ItemStack air = new ItemStack(Material.AIR);
        	    	p.setItemInHand(air);
        	    }
               
                Random r = new Random();
                int z = r.nextInt(6);
               
                switch (z) {
                case 1:
                    ItemStack stiefel = new ItemStack(Material.DIAMOND_BOOTS);
                    ItemMeta im = stiefel.getItemMeta();
                    im.setDisplayName("§bStiefel");
                    im.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
                    im.setLore(Arrays.asList("","§cHält schön warm!"));
                    stiefel.setItemMeta(im);
                   
                    p.getInventory().addItem(stiefel);
                    p.sendMessage(Main.pre + "§aDu hast 1x §bStiefel §abekommen");
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    break;
                case 2:
                    ItemStack mutze = new ItemStack(Material.IRON_HELMET);
                    ItemMeta im1 = mutze.getItemMeta();
                    im1.setDisplayName("§dMütze");
                    im1.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
                    im1.setLore(Arrays.asList("","§cFür den Winter gut geeignet!"));
                    mutze.setItemMeta(im1);
                   
                    p.getInventory().addItem(mutze);
                    p.sendMessage(Main.pre + "§aDu hast 1x §dMütze §abekommen");
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    break;
                case 3:
                    ItemStack jacke = new ItemStack(Material.LEATHER_CHESTPLATE);
                    ItemMeta im2 = jacke.getItemMeta();
                    im2.setDisplayName("§4Jacke");
                    im2.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
                    im2.setLore(Arrays.asList("","§cFür die kalte Jahreszeit!"));
                    jacke.setItemMeta(im2);
                   
                    p.getInventory().addItem(jacke);
                    p.sendMessage(Main.pre + "§aDu hast 1x §4Jacke §abekommen");
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    break;
                case 4:
                    ItemStack schnnem = new ItemStack(Material.SNOW_BALL);
                    ItemMeta im3 = schnnem.getItemMeta();
                    im3.setDisplayName("§3Schneeballschlacht");
                    im3.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
                    im3.setLore(Arrays.asList("","§cLust auf eine Schneeballschlacht!"));
                    schnnem.setItemMeta(im3);
                   
                    p.getInventory().addItem(schnnem);
                    p.sendMessage(Main.pre + "§aDu hast 1x §3Schneeballschlacht §abekommen");
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    break;
                case 5:
                    ItemStack ski = new ItemStack(Material.GOLD_LEGGINGS);
                    ItemMeta im4 = ski.getItemMeta();
                    im4.setDisplayName("§6Skihose");
                    im4.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
                    im4.setLore(Arrays.asList("","§cKannst du Skifahren?"));
                    ski.setItemMeta(im4);
                   
                    p.getInventory().addItem(ski);
                    p.sendMessage(Main.pre + "§aDu hast 1x §6Skihose §abekommen");
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    break;
                case 6:
                    ItemStack geback = new ItemStack(Material.COOKIE);
                    ItemMeta im5 = geback.getItemMeta();
                    im5.setDisplayName("§eWeihnachtsgebäck");
                    im5.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
                    im5.setLore(Arrays.asList("","§cGuten Hunger"));
                    geback.setItemMeta(im5);
 
                    p.getInventory().addItem(geback);
                    p.sendMessage(Main.pre + "§aDu hast 1x §eWeihnachtsgebäck §abekommen");
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    break;
                default:
                    ItemStack schneem = new ItemStack(Material.SNOW_BLOCK);
                    ItemMeta im6 = schneem.getItemMeta();
                    im6.setDisplayName("§bSchneemann");
                    im6.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
                    im6.setLore(Arrays.asList("","§cLass uns einen Schneemann bauen!"));
                    schneem.setItemMeta(im6);
                   
                    p.getInventory().addItem(schneem);
                    p.sendMessage(Main.pre + "§aDu hast 1x §bSchneemann §abekommen");
                    p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    break;
                }
               
               
    }
}