/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_low_level;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dinesh
 */
public class DBHandle {

    public final static String DRIVER_URL = "jdbc:jdc:";

    public static int setData(String query) throws SQLException {

        Connection con = null;
        try {

            con = DriverManager.getConnection(DRIVER_URL);
            Statement stm = con.createStatement();
            stm.closeOnCompletion();

            System.out.println("[INFO] Updating data : " + query);

            return stm.executeUpdate(query);

        } finally {
            if (con != null) {
                con.close();
            }
        }

    }

    public static int setData(String prepareQuery, Object[] columnValues) throws SQLException {

        Connection con = null;
        try {
            con = DriverManager.getConnection(DRIVER_URL);
            PreparedStatement pstm = con.prepareStatement(prepareQuery);

            for (int i = 0; i < columnValues.length; i++) {
                pstm.setObject(i + 1, columnValues[i]);
            }
            System.out.println("[INFO] Updating DB " + prepareQuery);

            pstm.closeOnCompletion();

            return pstm.executeUpdate();
        } finally {
            if(con != null)    
                con.close();
        }
    }

    public static ResultSet getData(String query) throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection(DRIVER_URL);
            Statement stm = con.createStatement();
            
            stm.closeOnCompletion();
            System.out.println("[INFO] Retriving data : " + query);
            return stm.executeQuery(query);
        } finally {
            if(con != null)
                con.close();
        }

    }

    public static  ResultSet getData(String prepareQuery, Object[] columnValues) throws SQLException {

        Connection con = null;
        try{
        con = DriverManager.getConnection(DRIVER_URL);
        PreparedStatement pstm = con.prepareStatement(prepareQuery);

        for (int i = 0; i < columnValues.length; i++) {
            pstm.setObject(i + 1, columnValues[i]);
        }
        System.out.println("[INFO] Updating DB " + prepareQuery);

        pstm.closeOnCompletion();

        return pstm.executeQuery();
        }finally{
            if(con != null)
                con.close();
        }
    }

}
