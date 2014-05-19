/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connection_pool;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Dinesh
 */
public class PoolTest {
    
    public static void main(String[] args) throws Exception{
        
        //
        System.out.println("Running");
        new JDCConnectionDriver("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/msd", "root", "dinesh");
        
        Connection con = DriverManager.getConnection("jdbc:jdc:");
        System.out.println(con);
        System.out.println(DriverManager.getConnection("jdbc:jdc:"));
        
        String query = "SELECT name FROM user";
        Statement createStatement = con.createStatement();
        ResultSet executeQuery = createStatement.executeQuery(query);
        
        createStatement.closeOnCompletion();
        while(executeQuery.next()){
            String name = executeQuery.getString(1);
            System.out.println("Name : "+name);
        }
        System.out.println(con.isClosed());
        
        
        
        
    }
    
}
