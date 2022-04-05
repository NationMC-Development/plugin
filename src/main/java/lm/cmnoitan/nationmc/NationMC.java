package lm.cmnoitan.nationmc;

import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public final class NationMC extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("プラグインが開始しました");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("プラグインが停止しました");
        // Plugin shutdown logic
    }



public class  BeakEventClass implements Listener{
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
    }
    public void  onBlockBreakEvent(BlockBreakEvent event){
    }
}
