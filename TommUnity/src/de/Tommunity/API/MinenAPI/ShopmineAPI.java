package de.Tommunity.API.MinenAPI;

import de.Tommunity.Sell.Merchant;
import de.Tommunity.Sell.MerchantOffer;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ShopmineAPI {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    public void shopmine(Player p,int preis, int mine, Material material){
        Merchant m = new Merchant();
        m.setTitle("§aVerkaufe die Erze aus Mine " + mine);

        ItemStack stein = new ItemStack(material);
        stein.setAmount(64);
        ItemStack ticket = new ItemStack(Material.PAPER);
        ItemMeta im = ticket.getItemMeta();
        im.setDisplayName("§a"+ preis +"$");
        im.addEnchant(Enchantment.DURABILITY, 10, false);
        im.setLore(Arrays.asList("§7Rechtsklicken zum Geld abholen"));
        ticket.setItemMeta(im);

        m.addOffer(new MerchantOffer(stein, ticket));

        m.setCustomer(p);
        m.openTrading(p);
    }

}
