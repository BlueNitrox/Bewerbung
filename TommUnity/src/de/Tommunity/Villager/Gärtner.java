package de.Tommunity.Villager;

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
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import de.Tommunity.utils.ItemBuilder;

public class Gärtner implements CommandExecutor, Listener {

    private final String GUI_NAME = "§2§lGärtner";

    EconomySystem es = new EconomySystem();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Main.pre + "§cDazu musst du ein Spieler sein!");
        }
        Player p = (Player) sender;

        if (!p.hasPermission("Tom.Koch")) {
            p.sendMessage(Main.pre + "§cDazu hast du keine Rechte!");
            return true;
        }
        if (args.length == 0) {
            Inventory inventory = Bukkit.createInventory(null, 9 * 7, GUI_NAME);

            ItemStack item1 = new ItemBuilder(Material.STAINED_GLASS_PANE).setDisplayname("§7Glasscheibe").build();

            inventory.setItem(0, item1);
            inventory.setItem(1, item1);
            inventory.setItem(2, item1);
            inventory.setItem(3, item1);

            ArrayList<String> info = new ArrayList<>();
            ItemStack item2 = new ItemStack(Material.PAPER);
            ItemMeta im1 = item2.getItemMeta();
            im1.setDisplayName("§7Hier ist das Gärtner-Menü");
            info.add("§7Hier kannst du nicht verkaufen");
            im1.setLore(info);
            item2.setItemMeta(im1);

            inventory.setItem(4, item2);

            inventory.setItem(5, item1);
            inventory.setItem(6, item1);
            inventory.setItem(7, item1);
            inventory.setItem(8, item1);
            inventory.setItem(9, item1);
            inventory.setItem(17, item1);
            inventory.setItem(18, item1);
            inventory.setItem(26, item1);
            inventory.setItem(27, item1);
            inventory.setItem(35, item1);
            inventory.setItem(36, item1);
            inventory.setItem(44, item1);
            inventory.setItem(45, item1);
            inventory.setItem(53, item1);
            inventory.setItem(54, item1);
            inventory.setItem(55, item1);
            inventory.setItem(56, item1);
            inventory.setItem(57, item1);
            inventory.setItem(58, item1);
            inventory.setItem(59, item1);
            inventory.setItem(60, item1);
            inventory.setItem(61, item1);
            inventory.setItem(62, item1);


            ArrayList<String> Emerald = new ArrayList<String>();
            ItemStack Emerald1 = new ItemStack(Material.SAPLING);
            ItemMeta im = Emerald1.getItemMeta();
            im.setDisplayName("§bEichen Setzling");
            Emerald.add("§7Preis: §a800$");
            im.setLore(Emerald);
            Emerald1.setItemMeta(im);

            inventory.setItem(10, Emerald1);


            ArrayList<String> Dia = new ArrayList<String>();
            ItemStack Dia1 = new ItemStack(Material.SAPLING, 1, (short) 1);
            ItemMeta im2 = Dia1.getItemMeta();
            im2.setDisplayName("§bFichten Setzling");
            Dia.add("§7Preis: §a50$");
            im2.setLore(Dia);
            Dia1.setItemMeta(im2);

            inventory.setItem(11, Dia1);


            ArrayList<String> Eisen = new ArrayList<String>();
            ItemStack Eisen1 = new ItemStack(Material.SAPLING, 1, (short) 2);
            ItemMeta im3 = Eisen1.getItemMeta();
            im.setDisplayName("§bBirken Setzling");
            Eisen.add("§7Preis: §a50$");
            im3.setLore(Eisen);
            Eisen1.setItemMeta(im3);

            inventory.setItem(12, Eisen1);


            ArrayList<String> Gold = new ArrayList<String>();
            ItemStack Gold1 = new ItemStack(Material.SAPLING, 1, (short) 3);
            ItemMeta im4 = Gold1.getItemMeta();
            im4.setDisplayName("§bJungel Setzling");
            Gold.add("§7Preis: §a50$");
            im4.setLore(Gold);
            Gold1.setItemMeta(im4);

            inventory.setItem(13, Gold1);


            ArrayList<String> Kohle = new ArrayList<String>();
            ItemStack Kohle1 = new ItemStack(Material.SAPLING, 1, (short) 4);
            ItemMeta im5 = Kohle1.getItemMeta();
            im5.setDisplayName("§bAkazien Setzling");
            Kohle.add("§7Preis: §a50$");
            im5.setLore(Kohle);
            Kohle1.setItemMeta(im5);

            inventory.setItem(14, Kohle1);


            ArrayList<String> STONE = new ArrayList<String>();
            ItemStack STONE1 = new ItemStack(Material.SAPLING, 1, (short) 5);
            ItemMeta im6 = STONE1.getItemMeta();
            im6.setDisplayName("§bSchwarzeichen Setzling");
            STONE.add("§7Preis: §a50$");
            im6.setLore(STONE);
            STONE1.setItemMeta(im6);

            inventory.setItem(15, STONE1);


            ArrayList<String> COBBLESTONE = new ArrayList<String>();
            ItemStack COBBLESTONE1 = new ItemStack(Material.VINE);
            ItemMeta im7 = COBBLESTONE1.getItemMeta();
            im7.setDisplayName("§bRanken");
            COBBLESTONE.add("§7Preis: §a50$");
            im7.setLore(COBBLESTONE);
            COBBLESTONE1.setItemMeta(im7);

            inventory.setItem(16, COBBLESTONE1);


            ArrayList<String> EMERALD_ORE = new ArrayList<String>();
            ItemStack EMERALD_ORE1 = new ItemStack(Material.RED_ROSE);
            ItemMeta im8 = EMERALD_ORE1.getItemMeta();
            im8.setDisplayName("§bRote Rose");
            EMERALD_ORE.add("§7Preis: §a5$");
            im8.setLore(EMERALD_ORE);
            EMERALD_ORE1.setItemMeta(im8);

            inventory.setItem(19, EMERALD_ORE1);


            ArrayList<String> DIAMOND_ORE = new ArrayList<String>();
            ItemStack DIAMOND_ORE1 = new ItemStack(Material.RED_ROSE, 1, (short) 1);
            ItemMeta im9 = DIAMOND_ORE1.getItemMeta();
            im9.setDisplayName("§bBlaue Orchidee");
            DIAMOND_ORE.add("§7Preis: §a5$");
            im9.setLore(DIAMOND_ORE);
            DIAMOND_ORE1.setItemMeta(im9);

            inventory.setItem(20, DIAMOND_ORE1);


            ArrayList<String> IRON_INGOT = new ArrayList<String>();
            ItemStack IRON_INGOT1 = new ItemStack(Material.YELLOW_FLOWER);
            ItemMeta im10 = IRON_INGOT1.getItemMeta();
            im10.setDisplayName("§bGelbe Blume");
            IRON_INGOT.add("§7Preis: §a10$");
            im10.setLore(IRON_INGOT);
            IRON_INGOT1.setItemMeta(im10);

            inventory.setItem(21, IRON_INGOT1);

            ArrayList<String> GOLD_ORE = new ArrayList<String>();
            ItemStack GOLD_ORE1 = new ItemStack(Material.RED_ROSE, 1, (short) 2);
            ItemMeta im11 = GOLD_ORE1.getItemMeta();
            im11.setDisplayName("§bLila Blume");
            GOLD_ORE.add("§7Preis: §a5$");
            im11.setLore(GOLD_ORE);
            GOLD_ORE1.setItemMeta(im11);

            inventory.setItem(22, GOLD_ORE1);


            ArrayList<String> COAL_ORE = new ArrayList<String>();
            ItemStack COAL_ORE1 = new ItemStack(Material.RED_ROSE, 1, (short) 3);
            ItemMeta im12 = COAL_ORE1.getItemMeta();
            im12.setDisplayName("§bWeiße Blume");
            COAL_ORE.add("§7Preis: §a5$");
            im12.setLore(COAL_ORE);
            COAL_ORE1.setItemMeta(im12);

            inventory.setItem(23, COAL_ORE1);


            p.openInventory(inventory);

            p.sendMessage(Main.pre + "§3Du hast den §e§lGärtner §3geöffnet");
        }
        return true;
    }


    @EventHandler
    public void handleKochMenuClick(InventoryClickEvent e) {
        if (!(e.getWhoClicked() instanceof Player))
            return;
        Player p = (Player) e.getWhoClicked();
        if (e.getClickedInventory().getTitle().equals(GUI_NAME)) {
            e.setCancelled(true);
            switch (e.getCurrentItem().getType()) {
                case YELLOW_FLOWER:

                    if (e.getClick().isLeftClick()) {
                        if (es.hasEnoughMoney(p.getUniqueId(), 5)) {

                            ItemStack item = new ItemStack(Material.YELLOW_FLOWER);

                            p.getInventory().addItem(item);
                            es.removeMoney(p.getUniqueId(), 5);
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                        } else {
                            p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                        }
                        break;
                    }


                case VINE:

                    if (e.getClick().isLeftClick()) {
                        if (es.hasEnoughMoney(p.getUniqueId(), 50)) {

                            ItemStack item = new ItemStack(Material.VINE);

                            p.getInventory().addItem(item);
                            es.removeMoney(p.getUniqueId(), 50);
                            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                        } else {
                            p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                        }
                        break;
                    }
                case SAPLING:

                    if (e.getClick().isLeftClick()) {
                        if (es.hasEnoughMoney(p.getUniqueId(), 800)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bEichen Setzling")) {
                                ItemStack item = new ItemStack(Material.SAPLING);

                                p.getInventory().addItem(item);
                                es.removeMoney(p.getUniqueId(), 800);
                                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                            }
                        } else if (es.hasEnoughMoney(p.getUniqueId(), 50)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bSchwarzeichen Setzling")) {
                                ItemStack item = new ItemStack(Material.SAPLING, 1, (short) 5);

                                p.getInventory().addItem(item);
                                es.removeMoney(p.getUniqueId(), 50);
                                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bAkazien Setzling")) {
                                ItemStack item = new ItemStack(Material.SAPLING, 1, (short) 4);

                                p.getInventory().addItem(item);
                                es.removeMoney(p.getUniqueId(), 50);
                                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bJungel Setzling")) {
                                ItemStack item = new ItemStack(Material.SAPLING, 1, (short) 3);

                                p.getInventory().addItem(item);
                                es.removeMoney(p.getUniqueId(), 50);
                                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bBirken Setzling")) {
                                ItemStack item = new ItemStack(Material.SAPLING, 1, (short) 2);

                                p.getInventory().addItem(item);
                                es.removeMoney(p.getUniqueId(), 50);
                                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bFichten Setzling")) {
                                ItemStack item = new ItemStack(Material.SAPLING, 1, (short) 1);

                                p.getInventory().addItem(item);
                                es.removeMoney(p.getUniqueId(), 50);
                                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                            }
                        }
                        break;
                    }
                case RED_ROSE:

                    if (e.getClick().isLeftClick()) {
                        if (es.hasEnoughMoney(p.getUniqueId(), 5)) {
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bRote Rose")) {
                                ItemStack item = new ItemStack(Material.RED_ROSE);

                                p.getInventory().addItem(item);
                                es.removeMoney(p.getUniqueId(), 5);
                                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bBlaue Orchidee")) {
                                ItemStack item = new ItemStack(Material.RED_ROSE, 1, (short) 1);

                                p.getInventory().addItem(item);
                                es.removeMoney(p.getUniqueId(), 5);
                                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bLila Blume")) {
                                ItemStack item = new ItemStack(Material.RED_ROSE, 1, (short) 2);

                                p.getInventory().addItem(item);
                                es.removeMoney(p.getUniqueId(), 5);
                                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bWeiße Blume")) {
                                ItemStack item = new ItemStack(Material.RED_ROSE, 1, (short) 3);

                                p.getInventory().addItem(item);
                                es.removeMoney(p.getUniqueId(), 5);
                                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                            }

                        } else {
                            p.sendMessage(Main.pre + "§cDu hast nicht genug Geld");
                        }
                        break;
                    }
            }
        }
    }
}