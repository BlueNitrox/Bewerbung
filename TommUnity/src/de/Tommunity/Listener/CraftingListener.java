package de.Tommunity.Listener;

import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import de.Tommunity.Main.Main;

public class CraftingListener implements Listener {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

   @EventHandler
   public void onCraftItem(PrepareItemCraftEvent e) {
       Material itemType = e.getRecipe().getResult().getType();
       if (itemType == Material.FISHING_ROD) {
           e.getInventory().setResult(new ItemStack(Material.AIR));
           for(HumanEntity he:e.getViewers()) {
               if(he instanceof Player) {
                   he.closeInventory();
                   he.sendMessage(Main.pre + "§cDieses Item darfst du nicht herstellen");
               }
           }
       }
       Material itemType1 = e.getRecipe().getResult().getType();
       if (itemType1 == Material.PAPER) {
           e.getInventory().setResult(new ItemStack(Material.AIR));
           for(HumanEntity he:e.getViewers()) {
               if(he instanceof Player) {
                   he.closeInventory();
                   he.sendMessage(Main.pre + "§cDieses Item darfst du nicht herstellen");
               }
           }
       }
       Material itemType12 = e.getRecipe().getResult().getType();
       if (itemType12 == Material.TRAPPED_CHEST) {
           e.getInventory().setResult(new ItemStack(Material.AIR));
           for(HumanEntity he:e.getViewers()) {
               if(he instanceof Player) {
                   he.closeInventory();
                   he.sendMessage(Main.pre + "§cDieses Item darfst du nicht herstellen");
               }
           }
           
       }
       Material itemType13 = e.getRecipe().getResult().getType();
       if (itemType13 == Material.HOPPER_MINECART) {
           e.getInventory().setResult(new ItemStack(Material.AIR));
           for(HumanEntity he:e.getViewers()) {
               if(he instanceof Player) {
                   he.closeInventory();
                   he.sendMessage(Main.pre + "§cDieses Item darfst du nicht herstellen");
               }
           }
           
       }
       Material itemType14 = e.getRecipe().getResult().getType();
       if (itemType14 == Material.EXPLOSIVE_MINECART) {
           e.getInventory().setResult(new ItemStack(Material.AIR));
           for(HumanEntity he:e.getViewers()) {
               if(he instanceof Player) {
                   he.closeInventory();
                   he.sendMessage(Main.pre + "§cDieses Item darfst du nicht herstellen");
               }
           }

           Material itemType146 = e.getRecipe().getResult().getType();
           if (itemType146 == Material.GOLDEN_APPLE) {
               e.getInventory().setResult(new ItemStack(Material.AIR));
               for(HumanEntity he:e.getViewers()) {
                   if(he instanceof Player) {
                       he.closeInventory();
                       he.sendMessage(Main.pre + "§cDieses Item darfst du nicht herstellen");
                   }
               }
           
       }
   }

}
}

