package com.github.distriful5061.antispam.antispam;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandClass implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("menu")){
            sender.sendMessage(ChatColor.RED+"Hello, World!");
        }
        return false;
    }
}
