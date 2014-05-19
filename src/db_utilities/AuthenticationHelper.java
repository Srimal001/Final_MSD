/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db_utilities;

import db_low_level.DBHandle;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Authenticable;

/**
 *
 * @author Dinesh
 */
public class AuthenticationHelper {
    
    
    public boolean checkAuthentication(Authenticable user, String tableName) throws SQLException{
        
        String query = "SELECT password from "+tableName+" where userName = ?";
        ResultSet data = DBHandle.getData(query, new Object[]{ user.getUserName()});
        
        if(data.next()){
            String pw = data.getString(1);
            return user.getPassword().equals(pw);
        }else{
            return false;
        }
        
    }


    
}
