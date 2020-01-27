package nl.thomasix.powerbans.main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class Initializer {

    private PowerBans powerBans;

    public Initializer(PowerBans powerBans) {
        this.powerBans = powerBans;
    }

    public void registerCommands() {

    }

    public void registerListeners() {

    }

    public void registerListener(Listener event) {
        powerBans.getServer().getPluginManager().registerEvents(event, powerBans);
    }

    public void registerCommand(String command, CommandExecutor e) {
        powerBans.getCommand(command).setExecutor(e);
    }
}
