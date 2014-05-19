/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client.connect;

import com.sun.org.apache.bcel.internal.generic.InstructionConstants;
import controller.AdminController;
import controller.DispatchAgentConroller;
import controller.server.RMIServer;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dinesh
 */
public class ClientConnector {
    
    //Singleton reference
    private static ClientConnector connector;
    
    public static ClientConnector getClientConnector() throws RemoteException{
        if(connector == null){
            connector = new ClientConnector();
        }
        return connector;
    }
    
    
    //Class instance Members
    private DispatchAgentConroller dispatchAgentController;

    private AdminController adminController;
    
    
    
    
    
    private RMIServer server;
    private ClientConnector() throws RemoteException{
        try {        
            server = (RMIServer) Naming.lookup("rmi://localhost:5050/taxi_server");
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientConnector.class.getName()).log(Level.SEVERE, null, ex);
            throw new RemoteException("Server is not running yet.\n",ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientConnector.class.getName()).log(Level.SEVERE, null, ex);
            throw new RemoteException("Malformed URL for server, ", ex);
        } 
        
    }
    
    //Methods for accessing controller objects
    public DispatchAgentConroller getDispatchAgentConroller() throws RemoteException{
        if(dispatchAgentController == null){
            dispatchAgentController = server.getDispatchAgentController();
        }
        return dispatchAgentController;
    }
    
    public AdminController getAdminController() throws RemoteException {
        if(adminController == null){
           adminController = server.getAdminController();
            
        }
        return adminController;
        
        
    }
    
    // other methods.
    
    
    
}
