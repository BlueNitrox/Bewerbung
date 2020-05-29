package de.Tommunity.Rank;
 
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.Tommunity.Clan.ClanM;
import ru.tehkode.permissions.bukkit.PermissionsEx;




 
public class ChatListenerDev implements Listener {
   
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
       
        String Message = e.getMessage();
        Message.replace("%", "Prozent");
        
        if(ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) == null) {

        
        if(PermissionsEx.getUser(p).inGroup("Developer")) {
        	e.setFormat("§8[§61§8] §b§lDev | " + p.getName() + "§8 » §7" + Message);
        
            if(PermissionsEx.getUser(p).has("Dev.rank.2")){
            	e.setFormat("§8[§62§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.3")){
            	e.setFormat("§8[§63§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.4")){
            	e.setFormat("§8[§64§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.5")){
            	e.setFormat("§8[§65§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.6")){
            	e.setFormat("§8[§66§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.7")){
            	e.setFormat("§8[§67§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.8")){
            	e.setFormat("§8[§68§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.9")){
            	e.setFormat("§8[§69§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.10")){
            	e.setFormat("§8[§610§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.11")) {
            	e.setFormat("§8[§611§8] §b§lDev | " + p.getName() + "§8 » §7" + Message);
            }
                if(PermissionsEx.getUser(p).has("Dev.rank.12")){
                	e.setFormat("§8[§612§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.13")){
                	e.setFormat("§8[§613§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.14")){
                	e.setFormat("§8[§614§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.15")){
                	e.setFormat("§8[§615§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.16")){
                	e.setFormat("§8[§616§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.17")){
                	e.setFormat("§8[§617§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.18")){
                	e.setFormat("§8[§618§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.19")){
                	e.setFormat("§8[§619§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.20")){
                	e.setFormat("§8[§620§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.21")) {
                	e.setFormat("§8[§621§8] §b§lDev | " + p.getName() + "§8 » §7" + Message);
                }
                    if(PermissionsEx.getUser(p).has("Dev.rank.22")){
                    	e.setFormat("§8[§622§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.23")){
                    	e.setFormat("§8[§623§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.24")){
                    	e.setFormat("§8[§624§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.25")){
                    	e.setFormat("§8[§625§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.26")){
                    	e.setFormat("§8[§626§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.27")){
                    	e.setFormat("§8[§627§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.28")){
                    	e.setFormat("§8[§628§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.29")){
                    	e.setFormat("§8[§629§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.30")){
                    	e.setFormat("§8[§c30§8] §b§lDev | " + p.getName() + "§8 » §7" + Message );
                    }
                
            
    }
    }else {
        if(PermissionsEx.getUser(p).inGroup("Developer")) {
        	e.setFormat("§8[§61§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);
        
            if(PermissionsEx.getUser(p).has("Dev.rank.2")){
            	e.setFormat("§8[§62§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.3")){
            	e.setFormat("§8[§63§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.4")){
            	e.setFormat("§8[§64§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.5")){
            	e.setFormat("§8[§65§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.6")){
            	e.setFormat("§8[§66§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.7")){
            	e.setFormat("§8[§67§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.8")){
            	e.setFormat("§8[§68§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.9")){
            	e.setFormat("§8[§69§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.10")){
            	e.setFormat("§8[§610§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("Dev.rank.11")) {
            	e.setFormat("§8[§611§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);
            }
                if(PermissionsEx.getUser(p).has("Dev.rank.12")){
                	e.setFormat("§8[§612§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.13")){
                	e.setFormat("§8[§613§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.14")){
                	e.setFormat("§8[§614§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.15")){
                	e.setFormat("§8[§615§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.16")){
                	e.setFormat("§8[§616§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.17")){
                	e.setFormat("§8[§617§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.18")){
                	e.setFormat("§8[§618§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.19")){
                	e.setFormat("§8[§619§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.20")){
                	e.setFormat("§8[§620§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("Dev.rank.21")) {
                	e.setFormat("§8[§621§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);
                }
                    if(PermissionsEx.getUser(p).has("Dev.rank.22")){
                    	e.setFormat("§8[§622§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.23")){
                    	e.setFormat("§8[§623§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.24")){
                    	e.setFormat("§8[§624§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.25")){
                    	e.setFormat("§8[§625§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.26")){
                    	e.setFormat("§8[§626§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.27")){
                    	e.setFormat("§8[§627§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.28")){
                    	e.setFormat("§8[§628§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.29")){
                    	e.setFormat("§8[§629§8] §b§lDev | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("Dev.rank.30")){
                    	e.setFormat("§8[§c30§8] §b§lDev | " + p.getName() + " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
        }
    }
    }
}