package org.rsfa.fx_mmm.xingchengcraft;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;

public final class XingChengCraft extends JavaPlugin implements SlimefunAddon {

    public static XingChengCraft instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/ReloadSlimefunAddons/XingChengCraft-Java/issues";
    }
}
