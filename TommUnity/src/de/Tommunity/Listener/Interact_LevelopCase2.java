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

import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;

public class Interact_LevelopCase2 implements Listener{

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if(!(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK))return;
        if(!(e.getItem().getItemMeta().getDisplayName().equals("§cLevelupcase §fLvl. 10-30")))return;

        ItemStack i = p.getItemInHand();

        if(i.getAmount() > 1) {
            p.getItemInHand().setAmount(i.getAmount() -1);
        }else if(i.getAmount() == 1) {
            ItemStack air = new ItemStack(Material.AIR);
            p.setItemInHand(air);
        }

        Random r = new Random();
        int z = r.nextInt(31);

        switch (z) {
            case 1:
                ItemStack stiefel = new ItemStack(Material.DIAMOND_HELMET);
                ItemMeta im = stiefel.getItemMeta();
                im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, false);
                im.addEnchant(Enchantment.DURABILITY, 6, false);
                im.setDisplayName("§b§lMagierhelm");
                im.setLore(Arrays.asList("§a§lTank I"));
                stiefel.setItemMeta(im);

                p.getInventory().addItem(stiefel);
                p.sendMessage(Main.pre + "§aDu hast 1x §b§lMagierhelm §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 2:
                ItemStack mutze = new ItemStack(Material.DIAMOND_CHESTPLATE);
                ItemMeta im1 = mutze.getItemMeta();
                im1.setDisplayName("§b§lMagierchestplate");
                im1.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, false);
                im1.addEnchant(Enchantment.DURABILITY, 6, false);
                im1.setLore(Arrays.asList("§a§lTank II"));
                mutze.setItemMeta(im1);

                p.getInventory().addItem(mutze);
                p.sendMessage(Main.pre + "§aDu hast 1x §b§lMagierchestplate §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 3:
                ItemStack jacke = new ItemStack(Material.DIAMOND_LEGGINGS);
                ItemMeta im2 = jacke.getItemMeta();
                im2.setDisplayName("§b§lMagierhose");
                im2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, false);
                im2.addEnchant(Enchantment.DURABILITY, 6, false);
                im2.setLore(Arrays.asList("§a§lTank II"));
                jacke.setItemMeta(im2);

                p.getInventory().addItem(jacke);
                p.sendMessage(Main.pre + "§aDu hast 1x §b§lMagierhose §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 4:
                ItemStack schnnem = new ItemStack(Material.DIAMOND_BOOTS);
                ItemMeta im3 = schnnem.getItemMeta();
                im3.setDisplayName("§b§lMagierschuhe");
                im3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, false);
                im3.addEnchant(Enchantment.DURABILITY, 6, false);
                im3.setLore(Arrays.asList("§a§lTank I"));
                schnnem.setItemMeta(im3);

                p.getInventory().addItem(schnnem);
                p.sendMessage(Main.pre + "§aDu hast 1x §b§lMagierschuhe §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 5:
                ItemStack ski = new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta im4 = ski.getItemMeta();
                im4.setDisplayName("§6Schwert des Magiers");
                im4.addEnchant(Enchantment.DAMAGE_ALL, 5, false);
                im4.addEnchant(Enchantment.DURABILITY, 4, false);
                ski.setItemMeta(im4);

                p.getInventory().addItem(ski);
                p.sendMessage(Main.pre + "§aDu hast 1x §6Schwert des Magiers §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 6:
                ItemStack geback = new ItemStack(Material.DIAMOND_PICKAXE);
                ItemMeta im5 = geback.getItemMeta();
                im5.setDisplayName("§ePicke des Magiers");
                im5.addEnchant(Enchantment.DIG_SPEED, 5, false);
                im5.addEnchant(Enchantment.DURABILITY, 6, false);
                geback.setItemMeta(im5);

                p.getInventory().addItem(geback);
                p.sendMessage(Main.pre + "§aDu hast 1x §ePicke des Magiers §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 7:
                ItemStack geback1 = new ItemStack(Material.GOLDEN_APPLE);
                ItemMeta im51 = geback1.getItemMeta();
                im51.setDisplayName("§dApfel des Magiers");
                geback1.setAmount(15);
                geback1.setItemMeta(im51);

                p.getInventory().addItem(geback1);
                p.sendMessage(Main.pre + "§aDu hast 1x §dApfel des Magiers §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 8:
                ItemStack geback2 = new ItemStack(Material.BANNER);
                ItemMeta im52 = geback2.getItemMeta();
                im52.setDisplayName("§eBanner des Magiers");
                im52.addEnchant(Enchantment.DIG_SPEED, 10, false);
                geback2.setItemMeta(im52);

                p.getInventory().addItem(geback2);
                p.sendMessage(Main.pre + "§aDu hast 1x §eBanner des Magiers §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 9:
                ItemStack geback3 = new ItemStack(Material.CAKE);
                ItemMeta im53 = geback3.getItemMeta();
                im53.setDisplayName("§3Kuchen des Magiers");
                im53.addEnchant(Enchantment.DIG_SPEED, 10, false);
                im53.addEnchant(Enchantment.DURABILITY, 6, false);
                geback3.setItemMeta(im53);

                p.getInventory().addItem(geback3);
                p.sendMessage(Main.pre + "§aDu hast 1x §3Kuchen des Magiers §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 10:
                EconomySystem es = new EconomySystem();
                es.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 11:
                EconomySystem es1 = new EconomySystem();
                es1.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 12:
                EconomySystem es12 = new EconomySystem();
                es12.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 13:
                EconomySystem es124 = new EconomySystem();
                es124.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 14:
                EconomySystem es122 = new EconomySystem();
                es122.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 15:
                ItemStack item13 = new ItemStack(Material.EXP_BOTTLE);
                ItemMeta im37 = item13.getItemMeta();
                im37.setDisplayName("§6§l2000 Tommunity XP");
                im37.addEnchant(Enchantment.KNOCKBACK, 2, false);
                item13.setItemMeta(im37);

                p.getInventory().addItem(item13);

                p.sendMessage(Main.pre + "§aDu hast 1x §6§l2000 Tommunity XP §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 16:
                ItemStack item1366 = new ItemStack(Material.BOOK);
                ItemMeta im3766 = item1366.getItemMeta();
                im3766.setDisplayName("§7Verzaubertes Buch");
                im3766.setLore(Arrays.asList("§a§lTank II"));
                item1366.setItemMeta(im3766);

                p.getInventory().addItem(item1366);

                p.sendMessage(Main.pre + "§aDu hast 1x §7Verzaubertes §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            default:
                ItemStack schneem = new ItemStack(Material.BOW);
                ItemMeta im6 = schneem.getItemMeta();
                im6.setDisplayName("§bBogen des Magiers");
                im6.addEnchant(Enchantment.ARROW_DAMAGE, 4, false);
                im6.addEnchant(Enchantment.DURABILITY, 4, false);
                schneem.setItemMeta(im6);

                p.getInventory().addItem(schneem);
                p.sendMessage(Main.pre + "§aDu hast 1x §bBogen des Magiers §abekommen");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 17:
                EconomySystem es67 = new EconomySystem();
                es67.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 18:
                EconomySystem es14 = new EconomySystem();
                es14.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 19:
                EconomySystem es123 = new EconomySystem();
                es123.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 20:
                EconomySystem es12427 = new EconomySystem();
                es12427.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 21:
                EconomySystem es12216 = new EconomySystem();
                es12216.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 22:
                EconomySystem es675 = new EconomySystem();
                es675.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 23:
                EconomySystem es144 = new EconomySystem();
                es144.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 24:
                EconomySystem es1233 = new EconomySystem();
                es1233.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 25:
                EconomySystem es12422 = new EconomySystem();
                es12422.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 26:
                EconomySystem es122117 = new EconomySystem();
                es122117.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 27:
                EconomySystem es677 = new EconomySystem();
                es677.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 28:
                EconomySystem es147 = new EconomySystem();
                es147.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 29:
                EconomySystem es1237 = new EconomySystem();
                es1237.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 30:
                EconomySystem es124273 = new EconomySystem();
                es124273.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
            case 31:
                EconomySystem es12217 = new EconomySystem();
                es12217.addMoney(p.getUniqueId(), 10000);

                p.sendMessage(Main.pre + "§aDu hast 1x §4Trostpreis §abekommen");
                p.sendMessage(Main.pre + "§3Du hast §a10000$ §3bekommen!");
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                break;
        }



    }

}