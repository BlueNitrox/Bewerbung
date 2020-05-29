package de.Tommunity.API.TitleAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TitleAPI extends JavaPlugin implements Listener {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

    public TitleAPI() {
    }

    /** @deprecated */
    @Deprecated
    public static void sendTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String message) {
        sendTitle(player, fadeIn, stay, fadeOut, message, (String)null);
    }

    /** @deprecated */
    @Deprecated
    public static void sendSubtitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String message) {
        sendTitle(player, fadeIn, stay, fadeOut, (String)null, message);
    }

    /** @deprecated */
    @Deprecated
    public static void sendFullTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle) {
        sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
    }

    public static void sendPacket(Player player, Object packet) {
        try {
            Object handle = player.getClass().getMethod("getHandle").invoke(player);
            Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
            playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, packet);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    public static Class<?> getNMSClass(String name) {
        String version = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];

        try {
            return Class.forName("net.minecraft.server." + version + "." + name);
        } catch (ClassNotFoundException var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static void sendTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle) {
        TitleSendEvent titleSendEvent = new TitleSendEvent(player, title, subtitle);
        Bukkit.getPluginManager().callEvent(titleSendEvent);
        if (!titleSendEvent.isCancelled()) {
            try {
                Object e;
                Constructor subtitleConstructor;
                if (title != null) {
                    title = ChatColor.translateAlternateColorCodes('&', title);
                    title = title.replaceAll("%player%", player.getDisplayName());
                    e = getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0].getField("TIMES").get((Object)null);
                    Object chatTitle = getNMSClass("IChatBaseComponent").getDeclaredClasses()[0].getMethod("a", String.class).invoke((Object)null, "{\"text\":\"" + title + "\"}");
                    subtitleConstructor = getNMSClass("PacketPlayOutTitle").getConstructor(getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0], getNMSClass("IChatBaseComponent"), Integer.TYPE, Integer.TYPE, Integer.TYPE);
                    Object titlePacket = subtitleConstructor.newInstance(e, chatTitle, fadeIn, stay, fadeOut);
                    sendPacket(player, titlePacket);
                    e = getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0].getField("TITLE").get((Object)null);
                    chatTitle = getNMSClass("IChatBaseComponent").getDeclaredClasses()[0].getMethod("a", String.class).invoke((Object)null, "{\"text\":\"" + title + "\"}");
                    subtitleConstructor = getNMSClass("PacketPlayOutTitle").getConstructor(getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0], getNMSClass("IChatBaseComponent"));
                    titlePacket = subtitleConstructor.newInstance(e, chatTitle);
                    sendPacket(player, titlePacket);
                }

                if (subtitle != null) {
                    subtitle = ChatColor.translateAlternateColorCodes('&', subtitle);
                    subtitle = subtitle.replaceAll("%player%", player.getDisplayName());
                    e = getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0].getField("TIMES").get((Object)null);
                    Object chatSubtitle = getNMSClass("IChatBaseComponent").getDeclaredClasses()[0].getMethod("a", String.class).invoke((Object)null, "{\"text\":\"" + title + "\"}");
                    subtitleConstructor = getNMSClass("PacketPlayOutTitle").getConstructor(getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0], getNMSClass("IChatBaseComponent"), Integer.TYPE, Integer.TYPE, Integer.TYPE);
                    Object subtitlePacket = subtitleConstructor.newInstance(e, chatSubtitle, fadeIn, stay, fadeOut);
                    sendPacket(player, subtitlePacket);
                    e = getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0].getField("SUBTITLE").get((Object)null);
                    chatSubtitle = getNMSClass("IChatBaseComponent").getDeclaredClasses()[0].getMethod("a", String.class).invoke((Object)null, "{\"text\":\"" + subtitle + "\"}");
                    subtitleConstructor = getNMSClass("PacketPlayOutTitle").getConstructor(getNMSClass("PacketPlayOutTitle").getDeclaredClasses()[0], getNMSClass("IChatBaseComponent"), Integer.TYPE, Integer.TYPE, Integer.TYPE);
                    subtitlePacket = subtitleConstructor.newInstance(e, chatSubtitle, fadeIn, stay, fadeOut);
                    sendPacket(player, subtitlePacket);
                }
            } catch (Exception var13) {
                var13.printStackTrace();
            }

        }
    }

    public static void clearTitle(Player player) {
        sendTitle(player, 0, 0, 0, "", "");
    }

    public static void sendTabTitle(Player player, String header, String footer) {
        if (header == null) {
            header = "";
        }

        header = ChatColor.translateAlternateColorCodes('&', header);
        if (footer == null) {
            footer = "";
        }

        footer = ChatColor.translateAlternateColorCodes('&', footer);
        TabTitleSendEvent tabTitleSendEvent = new TabTitleSendEvent(player, header, footer);
        Bukkit.getPluginManager().callEvent(tabTitleSendEvent);
        if (!tabTitleSendEvent.isCancelled()) {
            header = header.replaceAll("%player%", player.getDisplayName());
            footer = footer.replaceAll("%player%", player.getDisplayName());

            try {
                Object tabHeader = getNMSClass("IChatBaseComponent").getDeclaredClasses()[0].getMethod("a", String.class).invoke((Object)null, "{\"text\":\"" + header + "\"}");
                Object tabFooter = getNMSClass("IChatBaseComponent").getDeclaredClasses()[0].getMethod("a", String.class).invoke((Object)null, "{\"text\":\"" + footer + "\"}");
                Constructor<?> titleConstructor = getNMSClass("PacketPlayOutPlayerListHeaderFooter").getConstructor();
                Object packet = titleConstructor.newInstance();

                Field aField;
                try {
                    aField = packet.getClass().getDeclaredField("a");
                    aField.setAccessible(true);
                    aField.set(packet, tabHeader);
                    aField = packet.getClass().getDeclaredField("b");
                    aField.setAccessible(true);
                    aField.set(packet, tabFooter);
                } catch (Exception var11) {
                    aField = packet.getClass().getDeclaredField("header");
                    aField.setAccessible(true);
                    aField.set(packet, tabHeader);
                    Field bField = packet.getClass().getDeclaredField("footer");
                    bField.setAccessible(true);
                    bField.set(packet, tabFooter);
                }

                sendPacket(player, packet);
            } catch (Exception var12) {
                var12.printStackTrace();
            }

        }
    }

    public void onEnable() {
        Server server = this.getServer();
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        Bukkit.getPluginManager().registerEvents(this, this);
        ConsoleCommandSender console = server.getConsoleSender();
        console.sendMessage(ChatColor.AQUA + this.getDescription().getName() + " V" + this.getDescription().getVersion() + " has been enabled!");
        CLUpdate clUpdate = new CLUpdate(this);
        Bukkit.getPluginManager().registerEvents(clUpdate, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if (this.getConfig().getBoolean("Title On Join")) {
            sendTitle(event.getPlayer(), 20, 50, 20, this.getConfig().getString("Title Message"), this.getConfig().getString("Subtitle Message"));
        }

        if (this.getConfig().getBoolean("Tab Header Enabled")) {
            sendTabTitle(event.getPlayer(), this.getConfig().getString("Tab Header Message"), this.getConfig().getString("Tab Footer Message"));
        }

    }
}