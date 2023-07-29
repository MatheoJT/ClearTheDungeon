package net.altarise.game;

import org.bukkit.plugin.java.JavaPlugin;

public class ClearTheDungeon extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ClearTheDungeon has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ClearTheDungeon has been disabled!");
    }

}
