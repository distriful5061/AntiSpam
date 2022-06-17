package com.github.distriful5061.antispam.antispam.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e){

    }

    @EventHandler
    public void onAsyncPlayerJoin(AsyncPlayerPreLoginEvent e){//できるだけ軽量にしないとログインが遅くなる可能性あり

    }
}
