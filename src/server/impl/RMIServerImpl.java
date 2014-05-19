/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.impl;

import controller.AdminController;
import controller.DispatchAgentConroller;
import controller.impl.AdminControllerImpl;
import controller.impl.DispatchAgentControllerImpl;
import controller.server.RMIServer;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Dinesh
 */
public class RMIServerImpl extends UnicastRemoteObject implements RMIServer{

    public RMIServerImpl() throws RemoteException {
    }

    
    
    @Override
    public DispatchAgentConroller getDispatchAgentController() throws RemoteException {
        return new DispatchAgentControllerImpl();
    }

    @Override
    public AdminController getAdminController() throws RemoteException {
        return new AdminControllerImpl();
    }
    
}
