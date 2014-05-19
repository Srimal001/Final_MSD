/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import model.DispatchAgent;
import model.User;

/**
 * All use cases of DispatchAgent must be listed here,
 * @author Dinesh
 */
public interface DispatchAgentConroller extends Remote {
    
    
    public boolean login(DispatchAgent agent) throws RemoteException, SQLException;
    
    
    
}
