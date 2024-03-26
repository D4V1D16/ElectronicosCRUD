/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBCFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class JDBCConnectionFactory {
    private static final String DB_NAME = "DATABASE";
    private static final String USERNAME = "USERNAME";
    private static final String PASSWORD = "PASSWORD";
    private static final String HOST = "HOST";
    private static final String PORT = "PORT";
    private static final String DRIVER = "DRIVER";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            String connectionURL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME + "?useSSL=false";
            connection = DriverManager.getConnection(connectionURL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
    public static void cerrarConexion(Connection conexion){
        if ( conexion != null){
            try{
                conexion.close();
            } catch(SQLException e){
                Logger.getLogger(JDBCConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    
    
     }
}
