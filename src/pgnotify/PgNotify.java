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
        String url = "jdbc:postgresql://ip/BD";
        Connection conn = DriverManager.getConnection(url,"pegaso","clave");
        //Listener listener =  new Listener(conn).start();
    }
    
}
