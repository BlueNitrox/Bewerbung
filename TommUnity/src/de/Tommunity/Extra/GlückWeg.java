package de.Tommunity.Extra;

import de.Tommunity.Commands.EconomySystem;
import de.Tommunity.Main.Main;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class GlückWeg implements Listener {

    @EventHandler
    public void onJoin(final BlockBreakEvent e){
        Player p = (Player)e.getPlayer();
        ItemStack i = p.getInventory().getItemInHand();
        if(i.getEnchantments().containsKey(Enchantment.LOOT_BONUS_BLOCKS)){
            i.removeEnchantment(Enchantment.LOOT_BONUS_BLOCKS);
            EconomySystem es = new EconomySystem();
            es.addMoney(p.getUniqueId(), 280000);
            p.sendMessage(Main.pre +"§aDu hast 280.000 Dollar bekommen da Glück deaktiviert wurde!");
        }
    }

}
