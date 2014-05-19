/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dispatchagentterminal;

import client.connect.ClientConnector;
import controller.DispatchAgentConroller;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DispatchAgent;

/**
 *
 * @author Dinesh
 */
public class DispatchAgentTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        try {
            DispatchAgentConroller controller = ClientConnector.getClientConnector().getDispatchAgentConroller();
            
            
            DispatchAgent agent = new DispatchAgent("1", "dinesh", "dinesh", "abc");
            boolean b = controller.login(agent);
            System.out.println(b);
        } catch (SQLException ex) {
            Logger.getLogger(DispatchAgentTerminal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
