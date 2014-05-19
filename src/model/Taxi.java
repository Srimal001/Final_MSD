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
public class Taxi implements Serializable{
    
    private String id;    // taxi id number
    private String registration_number;  // taxi reg number
    private String driver_id;   // taxi driver id if available

    public Taxi() {
    }

    
    public Taxi(String id, String registration_number) {
        this.id = id;
        this.registration_number = registration_number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }
   
    
}
