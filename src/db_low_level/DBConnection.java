/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db_low_level;

import connection_pool.JDCConnectionDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dinesh
 */
public class DBConnection {
    
    public static void initConnection() throws SQLException{
        try{
            new JDCConnectionDriver("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/msd", "root", "dinesh");   
   
        }catch(Exception ex){
            throw new SQLException(ex);
        }
    }
   public static Connection getConnection() throws SQLException{
       return DriverManager.getConnection("jdbc:jdc:");
   } 
   
}
