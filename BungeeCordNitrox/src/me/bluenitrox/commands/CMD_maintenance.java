package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import me.bluenitrox.manager.messagesmanager;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class CMD_maintenance extends Command {
    final String[] hilfe = new String[]{"§c/maintenance on/off", "§c/maintenance list", "§c/maintenance add <Player>", "§c/maintenance remove <Player>"};

    public CMD_maintenance(String name) {
        super(name);
    }

    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("System.Maintenance")) {
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("an")) {
                    if (Main.MAINTENANCE) {
                        sender.sendMessage(messagesmanager.getMessage("Maintenance.isEnable", ""));
                    } else {
                        Main.cfg.set("Maintenance.enable", true);
                        Main.saveCfg();
                        Main.load();
                        sender.sendMessage(messagesmanager.getMessage("Maintenance.Enable", ""));
                        BungeeCord.getInstance().getPlayers().forEach((all) -> {
                            if (Main.whitelist.contains(all.getName())) {
                                all.disconnect(Main.MAINTENANCEMESSAGE);
                            }

                        });
                    }
                } else if (args[0].equalsIgnoreCase("aus")) {
                    if (!Main.MAINTENANCE) {
                        sender.sendMessage(messagesmanager.getMessage("Maintenance.isDisable", ""));
                    } else {
                        Main.cfg.set("Maintenance.enable", false);
                        Main.saveCfg();
                        Main.load();
                        sender.sendMessage(messagesmanager.getMessage("Maintenance.Disable", ""));
                    }
                } else if (args[0].equalsIgnoreCase("list")) {
                    Main.whitelist.forEach((list) -> {
                        sender.sendMessage("§8- §e" + list);
                    });
                }
            } else if (args.length == 2) {
                String playername;
                if (args[0].equalsIgnoreCase("add")) {
                    playername = String.valueOf(args[1]);
                    if (!Main.whitelist.contains(playername)) {
                        Main.whitelist.add(playername);
                        Main.cfg.set("Whitelist", Main.whitelist);
                        Main.saveCfg();
                        Main.load();
                        sender.sendMessage(messagesmanager.getMessage("Maintenance.Whitelist.add", playername));
                    } else {
                        sender.sendMessage(messagesmanager.getMessage("Maintenance.Whitelist.IS_ON_WHITELIST", ""));
                    }
                } else if (args[0].equalsIgnoreCase("remove")) {
                    playername = String.valueOf(args[1]);
                    if (Main.whitelist.contains(playername)) {
                        Main.whitelist.remove(playername);
                        Main.cfg.set("Whitelist", Main.whitelist);
                        Main.saveCfg();
                        Main.load();
                        sender.sendMessage(messagesmanager.getMessage("Maintenance.Whitelist.remove", playername));
                    } else {
                        sender.sendMessage(messagesmanager.getMessage("Maintenance.Whitelist.IS_NOT_ON_WHITELIST", ""));
                    }
                }
            } else {
                sender.sendMessages(this.hilfe);
            }
        } else {
            sender.sendMessage(messagesmanager.getMessage("NO_PERMS"));
        }

    }
}