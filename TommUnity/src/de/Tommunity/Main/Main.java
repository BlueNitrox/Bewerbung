package de.Tommunity.Main;

import de.Tommunity.Commands.*;
import de.Tommunity.Enchant.*;
import de.Tommunity.Extra.GlückWeg;
import de.Tommunity.Listener.*;
import de.Tommunity.Mobzone.*;
import de.Tommunity.MySQL.Economysystem_CMD;
import de.Tommunity.MySQL.MySQL;
import de.Tommunity.Sell.*;
import de.Tommunity.Villager.*;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;

import de.Tommunity.Booster.BoosterAPI;
import de.Tommunity.Booster.BoosterManager;
import de.Tommunity.Extra.Ah;
import de.Tommunity.Quest.Quest;
import de.Tommunity.Quest.Timo;
import de.Tommunity.Quest.Warzone;
import de.Tommunity.Rank.ChatListenerAdmin;
import de.Tommunity.Rank.ChatListenerBuilder;
import de.Tommunity.Rank.ChatListenerBusiness;
import de.Tommunity.Rank.ChatListenerDev;
import de.Tommunity.Rank.ChatListenerHero;
import de.Tommunity.Rank.ChatListenerMaster;
import de.Tommunity.Rank.ChatListenerMod;
import de.Tommunity.Rank.ChatListenerOwner;
import de.Tommunity.Rank.ChatListenerSup;
import de.Tommunity.Rank.ChatListenerYT;
import de.Tommunity.Stats.Blöcke;
import de.Tommunity.Stats.Deaths;
import de.Tommunity.Stats.KilledPlayer;
import de.Tommunity.Stats.Kisten;
import de.Tommunity.Stats.Stats;
import de.Tommunity.utils.Arena;
import de.Tommunity.utils.ArenaDeath;
import de.Tommunity.utils.ChestAPI;
import de.Tommunity.utils.Chest_Listener;
import de.Tommunity.utils.ClanAPI;
import de.Tommunity.utils.DailyReward;
import de.Tommunity.utils.GottCaseItem;
import de.Tommunity.utils.Minenreset1;
import de.Tommunity.utils.Minenreset10;
import de.Tommunity.utils.Minenreset2;
import de.Tommunity.utils.Minenreset3;
import de.Tommunity.utils.Minenreset4;
import de.Tommunity.utils.Minenreset5;
import de.Tommunity.utils.Minenreset6;
import de.Tommunity.utils.Minenreset7;
import de.Tommunity.utils.Minenreset8;
import de.Tommunity.utils.Minenreset9;
import de.Tommunity.utils.MystischCaseItem;
import de.Tommunity.utils.RareCaseItem;
import de.Tommunity.utils.Teammitglieder;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

public class Main extends JavaPlugin {

	/*
	 * Java-Class by 1BlueNitrox & 1BlauNitrox ©CopyRight
	 */

	public static String pre = "§8[§e§lTommunity.de§8] ";
	public static String kit = "§8[§e§lTommunity.de§8] ";
	public static String err = "§8[§e§lTommunity.de§8] §cDazu hast du keine Rechte!";
	public static HashMap<Player, Player> tpa = new HashMap<Player, Player>();
	public static Scoreboard sb;
	public static Plugin instance;
	private static Main plugin;

	private BoosterManager boostermanager;
	public MessageManager mM;

	public void onEnable() {
		plugin = this;
		Bukkit.getConsoleSender().sendMessage("§aPlugin Aktiviert!");
		mM = new MessageManager(this);
		setBoostermanager(new BoosterManager());

		//Register
		MainRegister();

		//Ausführung wenn Server-Start
		Ah.Ah = true;
		Eventmine.EventMine = false;


		//TODO
		/*

		Geldabfrage

		if(EconomySystem.getMoney(p.getUniqueId()){
		}

		Geldgive

		EconomySystem.update(p.getUniqueId(), amount, true, p.getName());
		true = Money remove
		false = Money add
		*/
		//TODO


		//Clan sys und APIs + MySQL
		instance = this;
		initConfig();
		de.Tommunity.Clan.Clandata.saveClanFile();
		de.Tommunity.Clan.Playerdata.savePlayerFile();
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		Server server = this.getServer();
		ConsoleCommandSender console = server.getConsoleSender();

		MySQL.connect();
		try {
			PreparedStatement ps = MySQL.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS money (UUID VARCHAR(100),Spielername VARCHAR(100),Money INT(100))");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void MainRegister(){
		ChatRegister();
		ListenerRegister2();
		ListenerRegister();
		NPCRegister();
		register();
		register2();
		ShopRegister();
		CommandRegister();
	}

	public void CommandRegister(){
		//New eco
		getCommand("moneytest").setExecutor(new Economysystem_CMD());

		//Full
		getCommand("anfang").setExecutor(new Anfang());
		getCommand("report").setExecutor(new ReportSys());
		getCommand("gaertner").setExecutor(new Gärtner());
		getCommand("spec").setExecutor(new Spec());
		getCommand("unspec").setExecutor(new UnSpec());
		getCommand("clearchat").setExecutor(new Clearchat());
		getCommand("money").setExecutor(new EconomySystem());
		getCommand("exp").setExecutor(new EXpSystem());
		getCommand("Pay").setExecutor(new Pay());
		getCommand("gm0").setExecutor(new Gm0());
		getCommand("gm1").setExecutor(new Gm1());
		getCommand("ec").setExecutor(new EnderChest());
		getCommand("fly").setExecutor(new Fly());
		getCommand("heal").setExecutor(new Heal());
		getCommand("v").setExecutor(new Vanish());
		getCommand("mine").setExecutor(new Minen());
		getCommand("kopf").setExecutor(new Kopf());
		getCommand("dc").setExecutor(new DC());
		getCommand("invsee").setExecutor(new Invsee());
		getCommand("setmine").setExecutor(new Setmine());
		getCommand("craft").setExecutor(new Werkbank());
		getCommand("i").setExecutor(new Items());
		getCommand("tpo").setExecutor(new tpo());
		getCommand("tphere").setExecutor(new Tphere());
		getCommand("tpaccept").setExecutor(new tpaccept());
		getCommand("tpa").setExecutor(new tpa());
		getCommand("Plotworld").setExecutor(new Plotworld());
		getCommand("setspawn").setExecutor(new Setspawn());
		getCommand("setPW").setExecutor(new SetPlotworld());
		getCommand("schmied").setExecutor(new Schmied());
		getCommand("koch").setExecutor(new Koch());
		getCommand("Bergmann").setExecutor(new Bergmann());
		getCommand("Shopmine1").setExecutor(new Shopmine1());
		getCommand("Shopmine2").setExecutor(new Shopmine2());
		getCommand("Shopmine3").setExecutor(new Shopmine3());
		getCommand("Shopmine4").setExecutor(new Shopmine4());
		getCommand("Shopmine5").setExecutor(new Shopmine5());
		getCommand("Shopmine6").setExecutor(new Shopmine6());
		getCommand("Shopmine7").setExecutor(new Shopmine7());
		getCommand("Shopmine8").setExecutor(new Shopmine8());
		getCommand("Shopmine9").setExecutor(new Shopmine9());
		getCommand("Shopmine10").setExecutor(new Shopmine10());
		getCommand("chatclear").setExecutor(new Chatclear());
		getCommand("Team").setExecutor(new Teammitglieder());
		getCommand("Magier").setExecutor(new Magier());
		getCommand("Handwerker").setExecutor(new Handwerker());
		getCommand("kuenstler").setExecutor(new Künstler());
		getCommand("farmer").setExecutor(new Framer());
		getCommand("hexe").setExecutor(new Hexe());
		getCommand("Sign").setExecutor(new Sign());
		getCommand("1BlueNitrox").setExecutor(new BlueNitrox());
		getCommand("zbytom").setExecutor(new ByTom());
		getCommand("booster").setExecutor(new BoosterAPI());
		getCommand("melon").setExecutor(new MelonShop());
		getCommand("levelupcase").setExecutor(new Geschenk());
		getCommand("geschenk").setExecutor(new levelupcase1());
		getCommand("clan").setExecutor(new ClanAPI());
		getCommand("paya").setExecutor(new PayA());
		getCommand("extraI").setExecutor(new getItem());
		getCommand("neustart").setExecutor(new Serverneustart());
		getCommand("minenreset1").setExecutor(new Minenreset1());
		getCommand("minenreset2").setExecutor(new Minenreset2());
		getCommand("minenreset3").setExecutor(new Minenreset3());
		getCommand("minenreset4").setExecutor(new Minenreset4());
		getCommand("minenreset5").setExecutor(new Minenreset5());
		getCommand("minenreset6").setExecutor(new Minenreset6());
		getCommand("minenreset7").setExecutor(new Minenreset7());
		getCommand("minenreset8").setExecutor(new Minenreset8());
		getCommand("minenreset9").setExecutor(new Minenreset9());
		getCommand("minenreset10").setExecutor(new Minenreset10());
		//getCommand("anvil").setExecutor(new BookLevelUp());
		getCommand("anvil").setExecutor(new LevelUp());
		getCommand("level").setExecutor(new Level());
		getCommand("spawn").setExecutor(new Spawn());
		getCommand("arena").setExecutor(new Arena());
		getCommand("buildmap").setExecutor(new BuildMap());
		getCommand("setbuildspawn").setExecutor(new setBuildMap());
		getCommand("setarena1").setExecutor(new Setarena1());
		getCommand("setarena2").setExecutor(new Setarena2());
		getCommand("chest").setExecutor(new ChestAPI());
		getCommand("token").setExecutor(new TokenSystem());
		getCommand("dailyreward").setExecutor(new DailyReward());
		getCommand("kills").setExecutor(new KilledPlayer());
		getCommand("Deaths").setExecutor(new Deaths());
		getCommand("break").setExecutor(new Blöcke());
		getCommand("Kisten").setExecutor(new Kisten());
		getCommand("stats").setExecutor(new Stats());
		getCommand("setnpc1").setExecutor(new Mobzone1());
		getCommand("zombies").setExecutor(new Zombies());
		getCommand("setmobzonespawn").setExecutor(new SetMobzone());
		getCommand("mobzone").setExecutor(new Mobzone());
		getCommand("shopzone1").setExecutor(new Shopzone1());
		getCommand("shopzone2").setExecutor(new Shopzone2());
		getCommand("shopzone3").setExecutor(new Shopzone3());
		getCommand("Kit").setExecutor(new Kit());
		getCommand("timo").setExecutor(new Timo());
		getCommand("perk").setExecutor(new Perk());
		getCommand("reportopen").setExecutor(new Teamreport());
		// getCommand("markt").setExecutor(new Ah());
		// getCommand("markttoggle").setExecutor(new AhOnOff());
		getCommand("quest").setExecutor(new Quest());
		getCommand("questwz").setExecutor(new Warzone());
		getCommand("eventmine").setExecutor(new Eventmine());
		getCommand("setzone").setExecutor(new Zone2mehr());
		getCommand("setmarkt").setExecutor(new setMarkt());
		getCommand("marktplatz").setExecutor(new markt());
		getCommand("ClanMessage").setExecutor(new de.Tommunity.Clan.ClanMessage());
		getCommand("Clan").setTabCompleter(new de.Tommunity.Clan.TabComplete());
		getCommand("Clan").setExecutor(new de.Tommunity.Clan.Clan());
	}

	public void NPCRegister(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new Hexe(), this);
		pm.registerEvents(new Gärtner(), this);
		pm.registerEvents(new Koch(), this);
		pm.registerEvents(new Framer(), this);
		pm.registerEvents(new Handwerker(), this);
		pm.registerEvents(new Bergmann(), this);
		pm.registerEvents(new Magier(), this);
		pm.registerEvents(new Künstler(), this);
	}

	public void ShopRegister(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new InteractShopListener(), this);
		pm.registerEvents(new InteractShopListener2(), this);
		pm.registerEvents(new InteractShopListener3(), this);
		pm.registerEvents(new InteractShopListener4(), this);
		pm.registerEvents(new InteractShopListener5(), this);
		pm.registerEvents(new InteractShopListener6(), this);
		pm.registerEvents(new InteractShopListener7(), this);
		pm.registerEvents(new InteractShopListener8(), this);
		pm.registerEvents(new InteractShopListener10(), this);
		pm.registerEvents(new InteractMobListener(), this);
		pm.registerEvents(new InteractMobListener2(), this);
		pm.registerEvents(new InteractMobListener3(), this);
		pm.registerEvents(new Ticket1(), this);
		pm.registerEvents(new Ticket2(), this);
		pm.registerEvents(new Ticket3(), this);
		pm.registerEvents(new Ticket4(), this);
		pm.registerEvents(new Ticket5(), this);
		pm.registerEvents(new Ticket6(), this);
		pm.registerEvents(new Ticket7(), this);
		pm.registerEvents(new Ticket8(), this);
	}

	public void ChatRegister(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new JoinEventTab(), this);
		pm.registerEvents(new PlayerChatEvent(), this);
		pm.registerEvents(new ChatListenerOwner(), this);
		pm.registerEvents(new ChatListenerAdmin(), this);
		pm.registerEvents(new ChatListenerDev(), this);
		pm.registerEvents(new ChatListenerMod(), this);
		pm.registerEvents(new ChatListenerSup(), this);
		pm.registerEvents(new ChatListenerBuilder(), this);
		pm.registerEvents(new ChatListenerYT(), this);
		pm.registerEvents(new ChatListenerHero(), this);
		pm.registerEvents(new ChatListenerMaster(), this);
		pm.registerEvents(new ChatListenerBusiness(), this);
	}

	public void ListenerRegister2(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new Anfang(), this);
		pm.registerEvents(new tab_complete(), this);
		pm.registerEvents(new JoinOPNitrox(), this);
		pm.registerEvents(new Arena(), this);
		pm.registerEvents(new Nick(), this);
		pm.registerEvents(new Laser(), this);
		pm.registerEvents(new ArenaDeath(), this);
		pm.registerEvents(new Creaturespawn(), this);
		pm.registerEvents(new Perk(), this);
		pm.registerEvents(new Kit(), this);
		pm.registerEvents(new Quest(), this);
		pm.registerEvents(new ReportSys(), this);
		pm.registerEvents(new LevelUp(), this);
		pm.registerEvents(new Rauch(), this);
		pm.registerEvents(new Segen(), this);
		pm.registerEvents(new Level1(), this);
		pm.registerEvents(new Kistenopen(), this);
		pm.registerEvents(new onJoinStart(), this);
	}

	public void ListenerRegister(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new LootInteract5(), this);
		pm.registerEvents(new LootInteract6(), this);
		pm.registerEvents(new LootInteract7(), this);
		pm.registerEvents(new LootInteract8(), this);
		pm.registerEvents(new TommunityXP(), this);
		pm.registerEvents(new PlayerProcessEvent(), this);
		pm.registerEvents(new Sign(), this);
		pm.registerEvents(new LevelListener(), this);
		pm.registerEvents(new Interact_WeihnachtsGeschenk(), this);
		pm.registerEvents(new Interact_LevelopCase(), this);
		pm.registerEvents(new Interact_LevelopCase1(), this);
		pm.registerEvents(new Interact_LevelopCase2(), this);
		pm.registerEvents(new Interact_XP(), this);
		pm.registerEvents(new PlayerMoveE(), this);
		pm.registerEvents(new Serverneustart(), this);
		pm.registerEvents(new Shopzone1(), this);
		pm.registerEvents(new Shopzone2(), this);
		pm.registerEvents(new Shopzone3(), this);
		pm.registerEvents(new ZombieMove(), this);
	}

	private void initConfig() {
		reloadConfig();
		getConfig().addDefault("prefix", Main.pre);
		getConfig().addDefault("max players in clan", 50);
		getConfig().addDefault("noperm", "&cDazu hast Du keine Rechte!");
		getConfig().addDefault("message.Du bist in keinem Clan", "&cDu bist in keinem Clan");
		getConfig().addDefault("message.Clan verlassen", "&cDu hast den Clan verlassen!");
		getConfig().addDefault("message.Clan Einladung nicht angenommen", "&7Der Spieler &e%player& &7hat die &cClan &7Anfrage abgelehnt&8.");
		getConfig().addDefault("message.Spieler war noch nie online", "&7Der &eSpieler &7war noch nie auf dem Server&8.");
		getConfig().addDefault("message.Folgende Clans wollen einladen", "&eFolgende Clans wollen dich einladen:");
		getConfig().addDefault("message.clan Einladung erhalten", "&7Du hast eine Einladung zum Clan &e%clan% &7erhalten&8.");
		getConfig().addDefault("message.clan Einladung annehmen/ablehnen", "&7Nutze &e/clan join &7oder &c/clan deny&8.");
		getConfig().addDefault("message.Spieler eingeladen", "&2Der Spieler wurde eingeladen");
		getConfig().addDefault("message.Spieler bereits in Clan", "&cDer Spieler ist bereits in einem Clan!");
		getConfig().addDefault("message.Spieler aus Clan gekickt", "&cDer Spieler wurde aus dem Clan gekickt!");
		getConfig().addDefault("message.Du wurdest aus dem Clan gekickt", "&4Du wurdest aus dem Clan gekickt!");
		getConfig().addDefault("message.Spieler promotet", "&aDer Spieler wurde zum Clanadmin gemacht!");
		getConfig().addDefault("message.in Clan gejoint", "&aDu bist dem Clan beigetreten!");
		getConfig().addDefault("message.Spieler in Clan beigetreten", "&7Der Spieler &e%player% &7ist dem Clan beigetreten&8.");
		getConfig().addDefault("message.Einladung nicht angenommen", "&cDu hast die Einladung nicht angenommen!");
		getConfig().addDefault("message.clan erstellt", "&aDer Clan wurde erstellt!");
		getConfig().addDefault("message.Clan gibt es schon", "&4Der Clan existiert bereits!");
		getConfig().addDefault("message.Du bist schon in einem Clan", "&4Du bist schon in einem Clan!");
		getConfig().addDefault("message.Clan gibt es schon", "&4Der Clan existiert bereits!");
		getConfig().addDefault("message.Clan wurde aufgelost", "&4Der Clan wurde aufgelï¿½st!");
		getConfig().addDefault("message.Clan gibt es schon", "&4Der Clan existiert bereits!");
		getConfig().addDefault("message.Spieler geht online", "&aDer Spieler &e%player%&a kommt online!");
		getConfig().addDefault("message.Spieler geht offline", "&cDer Spieler &e%player% &cgeht offline!");
		getConfig().options().copyDefaults(true);
		saveConfig();
	}

	public void register(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new Haste(), this);
		//pm.registerEvents(new eat_Listener(),this);
		pm.registerEvents(new Mining(), this);
		pm.registerEvents(new WorldListener(), this);
		pm.registerEvents(new Armor_Listener(),this);
		pm.registerEvents(new Chest_Listener(this), this);
		pm.registerEvents(new RareCaseItem(this), this);
		pm.registerEvents(new GottCaseItem(this), this);
		pm.registerEvents(new MystischCaseItem(this), this);
		pm.registerEvents(new Schaden(), this);
		pm.registerEvents(new GlückWeg(), this);
		pm.registerEvents(new Vampir(), this);
		pm.registerEvents(new SilentJoin(), this);
	}

	public void register2(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new de.Tommunity.Clan.onJoin(), this);
		pm.registerEvents(new de.Tommunity.Clan.onQuit(), this);
		pm.registerEvents(new de.Tommunity.Clan.onDeaths(), this);
		pm.registerEvents(new DailyReward(), this);
		pm.registerEvents(new JoinListener(), this);
		pm.registerEvents(new PlayerJoin_Vanish(), this);
		pm.registerEvents(new PlayerQuitEvent_Vanish(), this);
		pm.registerEvents(new CraftingListener(), this);
		pm.registerEvents(new Minen(), this);
		pm.registerEvents(new DeathEvent(), this);
		pm.registerEvents(new DamageEvent(), this);
		pm.registerEvents(new BreakListener(), this);
		pm.registerEvents(new LootInteract1(), this);
		pm.registerEvents(new LootInteract2(), this);
		pm.registerEvents(new LootInteract3(), this);
		pm.registerEvents(new LootInteract4(), this);
	}


	public void onDisable() {
		MySQL.disconnect();
		Bukkit.getConsoleSender().sendMessage("§cPlugin wurde deaktiviert!");

	}
	public static Main getPlugin() {
		return plugin;
	}

	public BoosterManager getBoostermanager() {
		return boostermanager;
	}

	public void setBoostermanager(BoosterManager boostermanager) {
		this.boostermanager = boostermanager;
	}
}
