/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pgnotify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.postgresql.PGConnection;
import org.postgresql.PGNotification;

/**
 *
 * @author PROFE DEVITECH
 */
public class Listener extends Thread {
    
    private Connection conn;
    private PGConnection pgconn;

    Listener(Connection conn) throws SQLException {
        this.conn = conn;
        this.pgconn = (PGConnection)conn;
        Statement stmt = conn.createStatement();
        stmt.execute("listen events;");
        stmt.close();
    }
    
    
    public void run() {
        while (true) {
            try {
                PGNotification notifications[] = pgconn.getNotifications();
                if (notifications != null) {
                    for (int i=0; i<notifications.length; i++) {
                        System.out.println(notifications[i].getName()+" "+notifications[i].getParameter());
                    }
                }
                Thread.sleep(500);
            } catch (SQLException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
