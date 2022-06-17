package com.github.distriful5061.antispam.antispam;

import com.github.distriful5061.antispam.antispam.Listeners.PlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public final class AntiSpam extends JavaPlugin {
    private static AntiSpam plugin;

    public static AntiSpam getPlugin(){
        return plugin;
    }

    public void loggerinfo(String content){
        getPlugin().getLogger().info(content);
    }

    @Override
    public void onEnable() {
        loggerinfo("Starting up");
        loggerinfo("Config");
        plugin = this;
        saveDefaultConfig();
        reloadConfig();
        FileConfiguration config = getConfig();
        getServer().getPluginManager().disablePlugin(this);

        loggerinfo("Command");
        Objects.requireNonNull(getCommand("menu")).setExecutor(new CommandClass());
        loggerinfo("Listeners");
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoinListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
