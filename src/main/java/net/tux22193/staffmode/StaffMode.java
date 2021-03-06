package net.tux22193.staffmode;

import net.tux22193.staffmode.commands.StaffCommand;
import net.tux22193.staffmode.listeners.FreezeIce;
import net.tux22193.staffmode.listeners.RandomTeleport;
import net.tux22193.staffmode.listeners.RodAlerts;
import net.tux22193.staffmode.listeners.VanishFeather;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class StaffMode extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("staff").setExecutor(new StaffCommand());
        StaffCommand.enabled.clear();
        Bukkit.getServer().getPluginManager().registerEvents(new RandomTeleport(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new RodAlerts(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new FreezeIce(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new VanishFeather(), this);
    }
}
