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
public class DispatchAgent implements Serializable, Authenticable{
    
    private String id;
    private String name;
    private String userName;
    private String password;
    private String tele_number;

    public DispatchAgent() {
    }

    
    public DispatchAgent(String id, String name, String userName, String passward) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = passward;
    }

    public DispatchAgent(String id, String name, String userName, String passward, String tele_number) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = passward;
        this.tele_number = tele_number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passward) {
        this.password = passward;
    }

    public String getTele_number() {
        return tele_number;
    }

    public void setTele_number(String tele_number) {
        this.tele_number = tele_number;
    }
    
    
    
}
