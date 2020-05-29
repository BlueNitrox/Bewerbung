package de.Tommunity.Rank;
 
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.Tommunity.Clan.ClanM;
import ru.tehkode.permissions.bukkit.PermissionsEx;




 
public class ChatListenerYT implements Listener {
   
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
       
        String Message = e.getMessage();
        Message.replace("%", "Prozent");
        if(ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) == null) {

            
        if(PermissionsEx.getUser(p).inGroup("YouTuber")) {
        	e.setFormat("§8[§61§8] §5YT | " + p.getName() + "§8 » §7" + Message);
        
            if(PermissionsEx.getUser(p).has("YT.rank.2")){
            	e.setFormat("§8[§62§8] §5YT | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.3")){
            	e.setFormat("§8[§63§8] §5YT | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.4")){
            	e.setFormat("§8[§64§8] §5YT | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.5")){
            	e.setFormat("§8[§65§8] §5YT | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.6")){
            	e.setFormat("§8[§66§8] §5YT | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.7")){
            	e.setFormat("§8[§67§8] §5YT | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.8")){
            	e.setFormat("§8[§68§8] §5YT | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.9")){
            	e.setFormat("§8[§69§8] §5YT | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.10")){
            	e.setFormat("§8[§610§8] §5YT | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.11")) {
            	e.setFormat("§8[§611§8] §5YT | " + p.getName() + "§8 » §7" + Message);
            }
                if(PermissionsEx.getUser(p).has("YT.rank.12")){
                	e.setFormat("§8[§612§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.13")){
                	e.setFormat("§8[§613§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.14")){
                	e.setFormat("§8[§614§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.15")){
                	e.setFormat("§8[§615§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.16")){
                	e.setFormat("§8[§616§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.17")){
                	e.setFormat("§8[§617§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.18")){
                	e.setFormat("§8[§618§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.19")){
                	e.setFormat("§8[§619§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.20")){
                	e.setFormat("§8[§620§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.21")) {
                	e.setFormat("§8[§621§8] §5YT | " + p.getName() + "§8 » §7" + Message);
                }
                    if(PermissionsEx.getUser(p).has("YT.rank.22")){
                    	e.setFormat("§8[§622§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.23")){
                    	e.setFormat("§8[§623§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.24")){
                    	e.setFormat("§8[§624§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.25")){
                    	e.setFormat("§8[§625§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.26")){
                    	e.setFormat("§8[§626§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.27")){
                    	e.setFormat("§8[§627§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.28")){
                    	e.setFormat("§8[§628§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.29")){
                    	e.setFormat("§8[§629§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.30")){
                    	e.setFormat("§8[§c30§8] §5YT | " + p.getName() + "§8 » §7" + Message );
                    }
                
            
    }
    }else {
        if(PermissionsEx.getUser(p).inGroup("YouTuber")) {
        	e.setFormat("§8[§61§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);
        
            if(PermissionsEx.getUser(p).has("YT.rank.2")){
            	e.setFormat("§8[§62§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.3")){
            	e.setFormat("§8[§63§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.4")){
            	e.setFormat("§8[§64§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.5")){
            	e.setFormat("§8[§65§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.6")){
            	e.setFormat("§8[§66§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.7")){
            	e.setFormat("§8[§67§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.8")){
            	e.setFormat("§8[§68§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.9")){
            	e.setFormat("§8[§69§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.10")){
            	e.setFormat("§8[§610§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("YT.rank.11")) {
            	e.setFormat("§8[§611§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);
            }
                if(PermissionsEx.getUser(p).has("YT.rank.12")){
                	e.setFormat("§8[§612§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.13")){
                	e.setFormat("§8[§613§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.14")){
                	e.setFormat("§8[§614§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.15")){
                	e.setFormat("§8[§615§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.16")){
                	e.setFormat("§8[§616§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.17")){
                	e.setFormat("§8[§617§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.18")){
                	e.setFormat("§8[§618§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.19")){
                	e.setFormat("§8[§619§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.20")){
                	e.setFormat("§8[§620§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("YT.rank.21")) {
                	e.setFormat("§8[§621§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);
                }
                    if(PermissionsEx.getUser(p).has("YT.rank.22")){
                    	e.setFormat("§8[§622§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.23")){
                    	e.setFormat("§8[§623§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.24")){
                    	e.setFormat("§8[§624§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.25")){
                    	e.setFormat("§8[§625§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.26")){
                    	e.setFormat("§8[§626§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.27")){
                    	e.setFormat("§8[§627§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.28")){
                    	e.setFormat("§8[§628§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.29")){
                    	e.setFormat("§8[§629§8] §5YT | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("YT.rank.30")){
                    	e.setFormat("§8[§c30§8] §5YT | " + p.getName() + " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
        }
    }
    }
}