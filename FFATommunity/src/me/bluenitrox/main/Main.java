package me.bluenitrox.main;

import me.bluenitrox.commands.*;
import me.bluenitrox.listener.*;
import me.bluenitrox.sort.MoveEvent;
import me.bluenitrox.sort.Sort_Listener;
import me.bluenitrox.stats.Deaths;
import me.bluenitrox.stats.Kills;
import me.bluenitrox.utils.Coins;
import me.bluenitrox.utils.PunkteSys;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.craftbukkit.libs.org.ibex.nestedvm.util.Sort;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Arrays;

public class Main extends JavaPlugin {

    public static String pre = "§8[§e§lTommunity.de§8] ";
    public static String err = "§8[§e§lTommunity.de§8] §cDazu hast du keine Rechte!";
    public static String keinP = "§8[§e§lTommunity.de§8] §cDazu musst du ein Spieler sein!";
    public static Plugin instance;
    private static Main plugin;
    public static ArrayList<Player> build = new ArrayList<>();

    public static ItemStack setUnbreakable(ItemStack item) {
        net.minecraft.server.v1_8_R3.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = new NBTTagCompound();
        tag.setBoolean("Unbreakable", true);
        stack.setTag(tag);
        return CraftItemStack.asCraftMirror(stack);
    }

    //ItemRegister
    public static ItemStack Helm(){
        ItemStack im = new ItemStack(Material.LEATHER_HELMET);
        setUnbreakable(im);
        return im;
    }
    public static ItemStack chestplate(){
        ItemStack im = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        setUnbreakable(im);
        return im;
    }
    public static ItemStack leggings(){
        ItemStack im = new ItemStack(Material.LEATHER_LEGGINGS);
        setUnbreakable(im);
        return im;
    }
    public static ItemStack boots(){
        ItemStack im = new ItemStack(Material.LEATHER_BOOTS);
        setUnbreakable(im);
        return im;
    }
    public static ItemStack Schwert(){
        ItemStack im = new ItemStack(Material.STONE_SWORD);
        setUnbreakable(im);
        return im;
    }
    public static ItemStack Stick(){
        ItemStack im = new ItemStack(Material.STICK);
        ItemMeta im1 = im.getItemMeta();
        im1.addEnchant(Enchantment.KNOCKBACK, 1, false);
        im.setItemMeta(im1);
        return im;
    }
    public static ItemStack Picke(){
        ItemStack im = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta im1 = im.getItemMeta();
        im1.addEnchant(org.bukkit.enchantments.Enchantment.DIG_SPEED, 2, false);
        im.setItemMeta(im1);
        setUnbreakable(im);
        return im;
    }
    public static ItemStack Blöcke(){
        ItemStack im = new ItemStack(Material.SANDSTONE);
        im.setAmount(64);
        return im;
    }
    public static ItemStack Chest(){
        ItemStack im = new ItemStack(Material.CHEST);
        ItemMeta im1 = im.getItemMeta();
        im1.setDisplayName("§9Shop");
        im1.setLore(Arrays.asList("§7Clicke auf die Kiste um den §6/ffashop §7zu öffnen!"));
        im.setItemMeta(im1);
        return im;
    }


    @Override
    public void onEnable() {
        plugin = this;
        instance = this;
        register();
    }

    @Override
    public void onDisable() {

    }

    public static Main getPlugin() {
        return plugin;
    }

    public void register(){
        getCommand("set").setExecutor(new setspawn_Command());
        getCommand("build").setExecutor(new build_Command());
        getCommand("punkte").setExecutor(new PunkteSys());
        getCommand("tode").setExecutor(new Deaths());
        getCommand("kills").setExecutor(new Kills());
        getCommand("stats").setExecutor(new stats_Command());
        getCommand("FFAshop").setExecutor(new shop_Command());
        getCommand("coins").setExecutor(new Coins());
        getCommand("neustart").setExecutor(new neustart_Command());
        getCommand("fix").setExecutor(new fix_Command());
        //getCommand("hub").setExecutor(new Hub_Command());

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new Sort_Listener(), this);
        pm.registerEvents(new join_Listener(), this);
        pm.registerEvents(new achievment_Listener(), this);
        pm.registerEvents(new neustart_Command(), this);
        pm.registerEvents(new craft_Listener(), this);
        pm.registerEvents(new Join1_Listener(), this);
        pm.registerEvents(new death_Listener(),this);
        pm.registerEvents(new hunger_Listener(),this);
        pm.registerEvents(new itemDrop_Listener(),this);
        pm.registerEvents(new move_Listener(),this);
        pm.registerEvents(new block_Listener(), this);
        pm.registerEvents(new falldamage_Listener(), this);
        pm.registerEvents(new chat_Listener(),this);
        pm.registerEvents(new quit_Listener(), this);
        pm.registerEvents(new shop_Command(),this);
        pm.registerEvents(new itemDrag_Listener(), this);
        pm.registerEvents(new click_Listener(), this);
        pm.registerEvents(new WorldManager(), this);
        pm.registerEvents(new preProcess(), this);
        pm.registerEvents(new tab_complete(), this);
        pm.registerEvents(new MoveEvent(), this);
}

}
