package de.Tommunity.Rank;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.Tommunity.Clan.ClanM;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class ChatListenerBuilder implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();

        String Message = e.getMessage();
        Message.replace("%", "Prozent");
        if(ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) == null) {


            if(PermissionsEx.getUser(p).inGroup("Builder")) {
                e.setFormat("§8[§61§8] §eBuilder | " + p.getName() + "§8 » §7" + Message);

                if(PermissionsEx.getUser(p).has("Builder.rank.2")){
                    e.setFormat("§8[§62§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.3")){
                    e.setFormat("§8[§63§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.4")){
                    e.setFormat("§8[§64§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.5")){
                    e.setFormat("§8[§65§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.6")){
                    e.setFormat("§8[§66§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.7")){
                    e.setFormat("§8[§67§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.8")){
                    e.setFormat("§8[§68§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.9")){
                    e.setFormat("§8[§69§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.10")){
                    e.setFormat("§8[§610§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.11")) {
                    e.setFormat("§8[§611§8] §eBuilder | " + p.getName() + "§8 » §7" + Message);
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.12")){
                    e.setFormat("§8[§612§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.13")){
                    e.setFormat("§8[§613§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.14")){
                    e.setFormat("§8[§614§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.15")){
                    e.setFormat("§8[§615§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.16")){
                    e.setFormat("§8[§616§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.17")){
                    e.setFormat("§8[§617§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.18")){
                    e.setFormat("§8[§618§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.19")){
                    e.setFormat("§8[§619§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.20")){
                    e.setFormat("§8[§620§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.21")) {
                    e.setFormat("§8[§621§8] §eBuilder | " + p.getName() + "§8 » §7" + Message);
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.22")){
                    e.setFormat("§8[§622§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.23")){
                    e.setFormat("§8[§623§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.24")){
                    e.setFormat("§8[§624§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.25")){
                    e.setFormat("§8[§625§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.26")){
                    e.setFormat("§8[§626§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.27")){
                    e.setFormat("§8[§627§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.28")){
                    e.setFormat("§8[§628§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.29")){
                    e.setFormat("§8[§629§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Builder.rank.30")){
                    e.setFormat("§8[§c30§8] §eBuilder | " + p.getName() + "§8 » §7" + Message );
                }


            }
        }else if(PermissionsEx.getUser(p).inGroup("Builder")) {
            e.setFormat("§8[§61§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);

            if(PermissionsEx.getUser(p).has("Builder.rank.2")){
                e.setFormat("§8[§62§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.3")){
                e.setFormat("§8[§63§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.4")){
                e.setFormat("§8[§64§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.5")){
                e.setFormat("§8[§65§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.6")){
                e.setFormat("§8[§66§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.7")){
                e.setFormat("§8[§67§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.8")){
                e.setFormat("§8[§68§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.9")){
                e.setFormat("§8[§69§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.10")){
                e.setFormat("§8[§610§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.11")) {
                e.setFormat("§8[§611§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.12")){
                e.setFormat("§8[§612§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.13")){
                e.setFormat("§8[§613§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.14")){
                e.setFormat("§8[§614§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.15")){
                e.setFormat("§8[§615§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.16")){
                e.setFormat("§8[§616§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.17")){
                e.setFormat("§8[§617§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.18")){
                e.setFormat("§8[§618§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.19")){
                e.setFormat("§8[§619§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.20")){
                e.setFormat("§8[§620§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.21")) {
                e.setFormat("§8[§621§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.22")){
                e.setFormat("§8[§622§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.23")){
                e.setFormat("§8[§623§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.24")){
                e.setFormat("§8[§624§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.25")){
                e.setFormat("§8[§625§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.26")){
                e.setFormat("§8[§626§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.27")){
                e.setFormat("§8[§627§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.28")){
                e.setFormat("§8[§628§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.29")){
                e.setFormat("§8[§629§8] §eBuilder | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Builder.rank.30")){
                e.setFormat("§8[§c30§8] §eBuilder | " + p.getName() + " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }

        }
    }
}