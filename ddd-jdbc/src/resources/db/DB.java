package resources.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection(){
        if(conn == null){
            Properties props = loadProperties();
            String url = props.getProperty("dburl");
            try {
                conn = DriverManager.getConnection(url,props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    private static Properties loadProperties() {
        try (InputStream is = DB.class.getResourceAsStream("/resources/db/db.properties")) {
            if (is == null) {
                throw new RuntimeException("Arquivo db.properties não encontrado!");
            }
            Properties props = new Properties();
            props.load(is);
            return props;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void closeConnection(){
        if(conn != null){
            try{
                conn.close();
            }catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }

}
