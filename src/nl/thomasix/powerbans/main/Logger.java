package nl.thomasix.powerbans.main;

import org.bukkit.command.CommandSender;

public class Logger {

    private CommandSender console;

    public Logger(CommandSender console) {
        this.console = console;
    }

    public void sendInfo(String caption, String message) {
        send("INFO", caption, message);
    }

    public void sendWarning(String caption, String message) {
        send("WARN", caption, message);
    }

    public void sendError(String caption, String message) {
        send("ERROR", caption, message);
    }

    public void send(String level, String caption, String message) {
        this.console.sendMessage("PowerBans >> " + level + " >> " + caption + " >> " + message);
    }
}
