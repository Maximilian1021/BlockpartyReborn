package me.maximilian1021.l4zs.blockpartyreborn;

import me.maximilian1021.l4zs.utils.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        int pluginId = 11868; // <-- Replace with the id of your plugin!
        Metrics metrics = new Metrics(this, pluginId);
        Bukkit.getConsoleSender().sendMessage("§b-------------");
        Bukkit.getConsoleSender().sendMessage("§aPlugin-Name:§6 " + getDescription().getName());
        Bukkit.getConsoleSender().sendMessage("§aVersion: §6" + getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage("§aAuthor: §6" + getDescription().getAuthors());
        Bukkit.getConsoleSender().sendMessage("§aWebsite: §6" + getDescription().getWebsite());
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§6" + getDescription()  + "§a is loading");


        registerCommands();
        registerEvents();

        Bukkit.getConsoleSender().sendMessage("§6" + getDescription()  + "§a is successfully loading");

        Bukkit.getConsoleSender().sendMessage("§b-------------");



    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage("§b-------------");
        Bukkit.getConsoleSender().sendMessage("§6" + getDescription().getName() + "§a was successfully unloaded");
        Bukkit.getConsoleSender().sendMessage("§b-------------");


        // Plugin shutdown logic
    }


    private void registerCommands() {
    }

    private void registerEvents() {
        PluginManager pm = Bukkit.getServer().getPluginManager();
    }

/*
#TODO
- Tool zum festlegen von der Arena ( Stick )
- Arena Floor Setup
- Lobby / Game setSpawn Command
-
- Block change Event ( Floor )
- Der Block auf dem gestanden werden soll, soll im Inventar bis auf den Mittleren Block eingeblentet werden
- Bossbar integration
- Gewinner wird der Head im Chat angezeigt
- MySQL Statistics
- /bp start
-
- GamePhase for more Games (LobbyPhase, GamePhase, WinnerPhase)
- Integration von bStats
- Integration von Noteblock API
- Einbauen von Events während des Spiels (erhalt Srpungkraft // Doppelsprung // etc)
 */

}
