package net.viewdns.applecraft;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import net.gravitydevelopment.updater.Updater;

public class Main extends JavaPlugin implements CommandExecutor{
	
	
	@SuppressWarnings("unused")
	@Override
	public void onEnable() {
		System.out.println("§cTimeServer started !");
		Updater updater = new Updater(this, 286270, getFile(), Updater.UpdateType.DEFAULT, true);
		getCommand("info").setExecutor(this);
		getCommand("contact").setExecutor(this);
		
		new BukkitRunnable() {
			
			@Override
			public void run() {
				for(World w : Bukkit.getWorlds()) {
					w.setTime(getTime());
				}
			}
		}.runTaskTimer(this, 0, 1);
	}
	
	@Override
	public void onDisable() {
		System.out.println("§2TimeServer stopped !");
	}
	
	private static Integer getTime() {
		SimpleDateFormat time = new SimpleDateFormat("HH:mm");
		String[] args = time.format(new Date()).split(":");
		Integer hours = Integer.parseInt(args[0])*1000;
		Integer minutes = Integer.parseInt(args[1])*(100/60);
		return hours+minutes+18000;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("info")) {
			if(p.hasPermission("mcrealtime.info")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("__________________________________________________");
				p.sendMessage("§a" + getDescription().getName());
				p.sendMessage("");
				p.sendMessage("§6Version: " + getDescription().getVersion());
				p.sendMessage("§6Author: " + getDescription().getAuthors());
				p.sendMessage("§6Website: " + getDescription().getWebsite());
				p.sendMessage("§6You will get more infos with this command:");
				p.sendMessage("§b/contact");
				p.sendMessage("§cATTENTION: Do first /gamerule dodaylightcycle false !!!");
				p.sendMessage("§cYou can not type this command: /time set <time> !");
				p.sendMessage("§bThis plugin is an OpenSource project !");
				p.sendMessage("§bIt means, that you have all rights reserved !");
				p.sendMessage("§bYou have all rights reserved, except of the MIT License !");
				p.sendMessage("§6I wish you much fun with that. Yours Faithfuly CrashKillerYT ! :)");
				p.sendMessage("__________________________________________________");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
			}else {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("__________________________________________________");
				p.sendMessage("§a" + getDescription().getName());
				p.sendMessage("");
				p.sendMessage("§cYou do not have permissions to perform this command !");
				p.sendMessage("__________________________________________________");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
			}
		}
		
		if(cmd.getName().equalsIgnoreCase("contact")) {
			if(p.hasPermission("mcrealtime.contact")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("__________________________________________________");
				p.sendMessage("§a" + getDescription().getName());
				p.sendMessage("");
				p.sendMessage("§6You have some problems or you want post a feedback ?");
				p.sendMessage("§6No problem ! You could me send your feedback on the chat of:");
				p.sendMessage("§6https://dev.bukkit.org/projects/mcrealtime");
				p.sendMessage("");
				p.sendMessage("§6If you have some problems, you can contact me under:");
				p.sendMessage("§6E-Mail: crashkillerlps.de@gmail.com");
				p.sendMessage("§bSometimes on my teamspeak 3: applecraft.viewdns.net");
				p.sendMessage("§aTelegram: CrashKillerYT");
				p.sendMessage("§6Thanks for understanding !");
				p.sendMessage("§6See ya around :)");
				p.sendMessage("__________________________________________________");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
			}else {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("__________________________________________________");
				p.sendMessage("§a" + getDescription().getName());
				p.sendMessage("");
				p.sendMessage("§cYou do not have permissions to perform this command !");
				p.sendMessage("__________________________________________________");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
			}
			
		}
		
		if(cmd.getName().equalsIgnoreCase("deactivatetime")) {
			if(p.hasPermission("mcrealtime.deactivate")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("__________________________________________________");
				p.sendMessage("§a" + getDescription().getName());
				p.sendMessage("");
				p.sendMessage("§cPlugin was already deactivated !");
				p.sendMessage("§6IMPORTANT: If you'd like to reactivate, please reload your server !!!");
				p.sendMessage("__________________________________________________");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				
				Plugin MCRealTime = getServer().getPluginManager().getPlugin("MCRealTime");
				if(MCRealTime != null)
					getServer().getPluginManager().disablePlugin(MCRealTime);
		} else {
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("__________________________________________________");
			p.sendMessage("§a" + getDescription().getName());
			p.sendMessage("");
			p.sendMessage("§cYou do not have permissions to perform this command !");
			p.sendMessage("__________________________________________________");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
		}
		  }
		
		return true;
	}
		}
