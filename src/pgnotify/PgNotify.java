/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pgnotify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PROFE DEVITECH
 */
public class PgNotify {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://ws.desarrollo.eds.terpel.sclbox.com:12015/andromeda";
        Connection conn = DriverManager.getConnection(url,"pegaso","NEdweV1qJCZ4Zj1Lc0tKLVVEQXt3flk7ICY+Z19lfkVgcjw2L05VeW0tMm4neyVTPlo9clV2TjR0Xns0");
        //Listener listener =  new Listener(conn).start();
    }
    
}
