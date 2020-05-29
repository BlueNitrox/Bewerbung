package de.Tommunity.Listener;
 
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.Tommunity.Clan.ClanM;
import de.Tommunity.Main.Main;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.TranslatableComponent;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import ru.tehkode.permissions.bukkit.PermissionsEx;

 
public class PlayerChatEvent implements Listener {

    /*
     * Java-Class by 1BlueNitrox ©CopyRight
     */

	@EventHandler(priority = EventPriority.HIGHEST)
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
       
        String Message = e.getMessage();

        if(e.getMessage().startsWith("7booster")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7tpo")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7tp")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7spawn")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7msg")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7money")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7exp")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7pay")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7v")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7fly")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7ec")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7invsee")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7invsee")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7levelup")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("%")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDu kannst keine %-Zeichen schreiben");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("#patty")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/starter4")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/starter3")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/starter2")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/starter1")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/plugins")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/pl")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/rank1")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/rank2")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/rank3")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/starter1")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("//calc")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("//calculate")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/me")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/?")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().contains("/help")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDas kannst du nicht schreiben!");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7kit")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7levelup")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7mine")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7plotworld")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7gm")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7ban")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        if(e.getMessage().startsWith("7kick")) {
            e.setCancelled(true);
            p.sendMessage(Main.pre + "§cDa fehlt wohl ein §6/");
            p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
        }
        
        
        
        
        
        if(ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) == null) {

            
        if(PermissionsEx.getUser(p).inGroup("Spieler")) {
        	e.setFormat("§8[§61§8] §7Spieler | " + p.getName() + "§8 » §7" + Message);
        
            if(PermissionsEx.getUser(p).has("rank.2")){
            	e.setFormat("§8[§62§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.3")){
            	e.setFormat("§8[§63§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.4")){
            	e.setFormat("§8[§64§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.5")){
            	e.setFormat("§8[§65§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.6")){
            	e.setFormat("§8[§66§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.7")){
            	e.setFormat("§8[§67§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.8")){
            	e.setFormat("§8[§68§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.9")){
            	e.setFormat("§8[§69§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.10")){
            	e.setFormat("§8[§610§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.11")) {
            	e.setFormat("§8[§611§8] §7Spieler | " + p.getName() + "§8 » §7" + Message);
            }
                if(PermissionsEx.getUser(p).has("rank.12")){
                	e.setFormat("§8[§612§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.13")){
                	e.setFormat("§8[§613§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.14")){
                	e.setFormat("§8[§614§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.15")){
                	e.setFormat("§8[§615§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.16")){
                	e.setFormat("§8[§616§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.17")){
                	e.setFormat("§8[§617§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.18")){
                	e.setFormat("§8[§618§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.19")){
                	e.setFormat("§8[§619§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.20")){
                	e.setFormat("§8[§620§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.21")) {
                	e.setFormat("§8[§621§8] §7Spieler | " + p.getName() + "§8 » §7" + Message);
                }
                    if(PermissionsEx.getUser(p).has("rank.22")){
                    	e.setFormat("§8[§622§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.23")){
                    	e.setFormat("§8[§623§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.24")){
                    	e.setFormat("§8[§624§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.25")){
                    	e.setFormat("§8[§625§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.26")){
                    	e.setFormat("§8[§626§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.27")){
                    	e.setFormat("§8[§627§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.28")){
                    	e.setFormat("§8[§628§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.29")){
                    	e.setFormat("§8[§629§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.30")){
                    	e.setFormat("§8[§c30§8] §7Spieler | " + p.getName() + "§8 » §7" + Message );
                    }
                
            
    }
    }else {
        if(PermissionsEx.getUser(p).inGroup("Spieler")) {
        	e.setFormat("§8[§61§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);
        
            if(PermissionsEx.getUser(p).has("rank.2")){
            	e.setFormat("§8[§62§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.3")){
            	e.setFormat("§8[§63§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.4")){
            	e.setFormat("§8[§64§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.5")){
            	e.setFormat("§8[§65§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.6")){
            	e.setFormat("§8[§66§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.7")){
            	e.setFormat("§8[§67§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.8")){
            	e.setFormat("§8[§68§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.9")){
            	e.setFormat("§8[§69§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.10")){
            	e.setFormat("§8[§610§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
            }
            if(PermissionsEx.getUser(p).has("rank.11")) {
            	e.setFormat("§8[§611§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);
            }
                if(PermissionsEx.getUser(p).has("rank.12")){
                	e.setFormat("§8[§612§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.13")){
                	e.setFormat("§8[§613§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.14")){
                	e.setFormat("§8[§614§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.15")){
                	e.setFormat("§8[§615§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.16")){
                	e.setFormat("§8[§616§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.17")){
                	e.setFormat("§8[§617§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.18")){
                	e.setFormat("§8[§618§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.19")){
                	e.setFormat("§8[§619§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.20")){
                	e.setFormat("§8[§620§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                }
                if(PermissionsEx.getUser(p).has("rank.21")) {
                	e.setFormat("§8[§621§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message);
                }
                    if(PermissionsEx.getUser(p).has("rank.22")){
                    	e.setFormat("§8[§622§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.23")){
                    	e.setFormat("§8[§623§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.24")){
                    	e.setFormat("§8[§624§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.25")){
                    	e.setFormat("§8[§625§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.26")){
                    	e.setFormat("§8[§626§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.27")){
                    	e.setFormat("§8[§627§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.28")){
                    	e.setFormat("§8[§628§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.29")){
                    	e.setFormat("§8[§629§8] §7Spieler | " + p.getName() +  " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
                    if(PermissionsEx.getUser(p).has("rank.30")){
                    	e.setFormat("§8[§c30§8] §7Spieler | " + p.getName() + " §7[§d" + ClanM.getPrefix(de.Tommunity.Clan.Player.getClan(p)) + "§7]" + "§8 » §7" + Message );
                    }
        }
    }
        

    }
    
    
    
    public static BaseComponent broadCastItem(ItemStack item) {
        ItemMeta meta = item.getItemMeta();
        BaseComponent name = new TranslatableComponent(CraftItemStack.asNMSCopy(item).getItem().getName() + ".name");
        if(meta.getDisplayName() != null)
            name = new TextComponent(meta.getDisplayName());

        net.minecraft.server.v1_8_R3.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound data = new NBTTagCompound();
        stack.save(data);
       
        name.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_ITEM, new BaseComponent[] {new TextComponent(data.toString())}));
        return name;
}

 
}


        
