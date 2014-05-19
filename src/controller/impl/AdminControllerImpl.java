/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.impl;

import controller.AdminController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

/**
 *
 * @author Dinesh
 */
public class AdminControllerImpl extends UnicastRemoteObject implements AdminController{

    public AdminControllerImpl() throws RemoteException {
    }

    
    
    @Override
    public boolean login() throws RemoteException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
