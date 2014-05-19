/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;

/**
 *
 * @author KDSL
 */
public class Job implements Serializable{
    
    private String job_id;
    private String status;
    private String driver_id;
    private String order_id;

    public Job() {
    }

    public Job(String job_id, String status, String driver_id, String order_id) {
        this.job_id = job_id;
        this.status = status;
        this.driver_id = driver_id;
        this.order_id = order_id;
    }
    /* getter mothods */
    public String getJob_id() {
        return job_id;
    }

    public String getStatus() {
        return status;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    
    /* setter methods */
    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
    
    
    
}
