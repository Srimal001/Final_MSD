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
public class Shift implements Serializable{
    
    private String id;
    private String start;
    private String end;
    private float milage;
    private String driver_id;

    public Shift() {
    }

    public Shift(String id, String start, float milage, String driver_id) {
        this.id = id;
        this.start = start;
        this.milage = milage;
        this.driver_id = driver_id;
    }

    public String getId() {
        return id;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public float getMilage() {
        return milage;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setMilage(float milage) {
        this.milage = milage;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }
    
    
    
}
