package me.bluenitrox.commands;

import me.bluenitrox.main.Main;
import me.bluenitrox.manager.messagesmanager;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class CMD_motd extends Command {
    final String[] hilfe = new String[]{"§c/motd maintenance 1/2 <text>", "§c/motd default 1/2 <text>"};

    public CMD_motd(String name) {
        super(name);
    }

    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("System.editMOTD")) {
            if (args.length == 0) {
                sender.sendMessages(this.hilfe);
            } else {
                StringBuilder sb;
                int i;
                String st;
                if (args[0].equalsIgnoreCase("default") && args[1].equalsIgnoreCase("1")) {
                    sb = new StringBuilder();

                    for(i = 2; i < args.length; ++i) {
                        sb.append(String.valueOf(args[i]) + " ");
                    }

                    st = sb.toString();
                    Main.cfg.set("MOTD.Layout.FirstLine", st);
                    Main.saveCfg();
                    Main.load();
                    sender.sendMessage(messagesmanager.getMessage("MOTD.default.edit.1"));
                } else if (args[0].equalsIgnoreCase("default") && args[1].equalsIgnoreCase("2")) {
                    sb = new StringBuilder();

                    for(i = 2; i < args.length; ++i) {
                        sb.append(String.valueOf(args[i]) + " ");
                    }

                    st = sb.toString();
                    Main.cfg.set("MOTD.Layout.SecondLine", st);
                    Main.saveCfg();
                    Main.load();
                    sender.sendMessage(messagesmanager.getMessage("MOTD.default.edit.2"));
                } else if (args[0].equalsIgnoreCase("maintenance") && args[1].equalsIgnoreCase("1")) {
                    sb = new StringBuilder();

                    for(i = 2; i < args.length; ++i) {
                        sb.append(String.valueOf(args[i]) + " ");
                    }

                    st = sb.toString();
                    Main.cfg.set("Maintenance.Layout.FirstLine", st);
                    Main.saveCfg();
                    Main.load();
                    sender.sendMessage(messagesmanager.getMessage("MOTD.maintenance.edit.1"));
                } else if (args[0].equalsIgnoreCase("maintenance") && args[1].equalsIgnoreCase("2")) {
                    sb = new StringBuilder();

                    for(i = 2; i < args.length; ++i) {
                        sb.append(String.valueOf(args[i]) + " ");
                    }

                    st = sb.toString();
                    Main.cfg.set("Maintenance.Layout.SecondLine", st);
                    Main.saveCfg();
                    Main.load();
                    sender.sendMessage(messagesmanager.getMessage("MOTD.maintenance.edit.2"));
                } else {
                    sender.sendMessages(this.hilfe);
                }
            }
        } else {
            sender.sendMessage(messagesmanager.getMessage("NO_PERMS"));
        }

    }
}