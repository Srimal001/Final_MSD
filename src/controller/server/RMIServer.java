/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.server;

import controller.AdminController;
import controller.DispatchAgentConroller;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Define Factory methods for main controller classes, to be used by clients.
 * @author Dinesh
 */
public interface RMIServer  extends Remote{
    
    
    public DispatchAgentConroller getDispatchAgentController() throws RemoteException;
    
    public AdminController getAdminController() throws RemoteException;
    
    
}
