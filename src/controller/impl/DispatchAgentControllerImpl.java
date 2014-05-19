/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.impl;

import controller.DispatchAgentConroller;
import db_utilities.AuthenticationHelper;
import db_utilities.JobDBHandle;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import model.DispatchAgent;
import model.Job;

/**
 * Implementation of DispatchAgentController with RemoteMethods, 
 * May use different helper classes.
 * @author Dinesh
 */
public class DispatchAgentControllerImpl extends UnicastRemoteObject implements DispatchAgentConroller{
    
    public DispatchAgentControllerImpl() throws RemoteException{
        
    }

    @Override
    public boolean login(DispatchAgent agent) throws RemoteException, SQLException {
        
        return new AuthenticationHelper().checkAuthentication(agent, "dispatch_agent");
    
    }
    
    public Job viewJob(int jobNo){
        
        return new JobDBHandle().getJobDetail(jobNo);
        
    }
    
}
