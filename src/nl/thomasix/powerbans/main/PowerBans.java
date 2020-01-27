package nl.thomasix.powerbans.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PowerBans extends JavaPlugin {

    private Logger logger;
    private Initializer initializer;

    @Override
    public void onEnable() {
        this.logger = new Logger(Bukkit.getConsoleSender());
        logger.sendInfo("Status", "PowerBans is starting up");

        this.initializer = new Initializer(this);
        this.initializer.registerCommands();
        this.initializer.registerListeners();

        this.saveDefaultConfig();

        logger.sendInfo("Status", "PowerBans is started up");
    }

    @Override
    public void onDisable() {
    }
}
