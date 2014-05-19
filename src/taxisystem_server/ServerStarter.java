/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taxisystem_server;

import controller.server.RMIServer;
import db_low_level.DBConnection;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLException;
import server.impl.RMIServerImpl;

/**
 *
 * @author Dinesh
 */
public class ServerStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, UnknownHostException, SQLException {
        Registry registry = LocateRegistry.createRegistry(5050);
        
        DBConnection.initConnection();
        
        RMIServer server = new RMIServerImpl();
        
        
        registry.rebind("taxi_server", server);
        System.out.println("Server Started at "+ Inet4Address.getLocalHost().toString() + " : "+5050);
        
        
        
    }
    
}
