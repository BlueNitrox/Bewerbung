package de.Tommunity.Sell;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Booster.Moneybooster;
import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;

public class Ticket7 implements Listener {





    @EventHandler
    public void OnRightClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Moneybooster money = new Moneybooster();
        if(!(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK))return;
        if(!(e.getItem().getItemMeta().getDisplayName().equals("§a550$")))return;
        EconomySystem es = new EconomySystem();
        ItemStack i = p.getItemInHand();

        if(i.getAmount() > 1 && i.getAmount() <= 63) {
            p.getItemInHand().setAmount(i.getAmount() -1);
        }else if(i.getAmount() == 1) {
            ItemStack air = new ItemStack(Material.AIR);
            p.setItemInHand(air);
        }else if(i.getAmount() == 64){
            ItemStack air = new ItemStack(Material.AIR);
            p.setItemInHand(air);

            if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money.getName())))) {
                e.getPlayer().sendMessage(Main.pre + "§3Du hast §a33000$ §3bekommen!");
                e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.LEVEL_UP, 1, 1);
                es.addMoney(e.getPlayer().getUniqueId(), 33000);
            }else {
                e.getPlayer().sendMessage(Main.pre + "§dMoney-Booster -> §3Du hast §a41220$ §3bekommen!");
                e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.LEVEL_UP, 1, 1);
                es.addMoney(e.getPlayer().getUniqueId(), 41220);
            }

            return;
        }
        if(!Main.getPlugin().getBoostermanager().getAktivboost().stream().anyMatch((b -> b.getName().equals(money.getName())))) {
            e.getPlayer().sendMessage(Main.pre + "§3Du hast §a550$ §3bekommen!");
            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.LEVEL_UP, 1, 1);
            es.addMoney(e.getPlayer().getUniqueId(), 550);
        }else {
            e.getPlayer().sendMessage(Main.pre + "§dMoney-Booster -> §3Du hast §a687$ §3bekommen!");
            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.LEVEL_UP, 1, 1);
            es.addMoney(e.getPlayer().getUniqueId(), 687);


        }

    }
}
