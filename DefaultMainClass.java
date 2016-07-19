package net.some.package.lmao;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	
	public static Plugin plugin;
	public static Plugin instance;
	
	public void onEnable() {
		
		plugin = this;
		instance = this;
		
		System.out.println(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "--------------------");
		System.out.println(ChatColor.RED + "Plugin has been enabled");
		System.out.println(ChatColor.GREEN + "Version: 1.0 / Unlicensed Copy - Developer Copy");
		System.out.println(ChatColor.AQUA + "Author: Someone");
		System.out.println(ChatColor.GOLD + "Plugin is a great something.");
		System.out.println(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "--------------------");
		
		
		
	}
	
	public void onDisable() {
		
		plugin = null;
		instance = null;
		
		System.out.println(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "--------------------");
		System.out.println(ChatColor.RED + "Plugin has been disabled");
		System.out.println(ChatColor.GREEN + "Version: 1.0 / Unlicensed Copy - Developer Copy");
		System.out.println(ChatColor.AQUA + "Author: Someone");
		System.out.println(ChatColor.GOLD + "Plugin is a great something.");
		System.out.println(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "--------------------");
		
		
	}
	
	public void registerCommands() {
		
		// Register your commands
		
	}
	
	
	public void registerListeners() {
		
		// Register your listeners.
		
	}
	
	public Pompeii getInstance() {
		
		return Pompeii.instance;
		
	}

}
