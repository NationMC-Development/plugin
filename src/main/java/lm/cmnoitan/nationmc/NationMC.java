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
}

public class MessageDao {
    //接続に必要な変数を宣言
    private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
    private static final String JDBC_URL  = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private static final String USER_ID   = "imuser";
    private static final String USER_PASS = "impass";

    MessageDao (){
        // JDBCドライバのロード
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<MessageDto> select() {
    ArrayList<MessageDto> list = new ArrayList<>();

        // コネクションクラスの宣言
        Connection con = null;
        // ステートメントクラスの宣言
        PreparedStatement ps = null;
        // リザルトセットクラスの宣言
        ResultSet rs = null;

        // データベースにアクセス
        try {
            // データベースとの接続の確立を行う。
            con = DriverManager.getConnection(JDBC_URL, USER_ID, USER_PASS);

　  }
    }
}

public class  BeakEventClass implements Listener{
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        if
    }
        int event.getPlayer().getName();
    //}
    //public void  onBlockBreakEvent(BlockBreakEvent event){

    //}
//}
