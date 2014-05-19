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
public class Driver implements Serializable, Authenticable{
    private String id;
    private String name;
    private String userName;
    private String password; 
    private String address;
    private String tele_numb;

    public Driver() {
        /* empty constructor */
    }

    
    
    public Driver(String id, String name, String userName, String passward) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = passward;
    }

    public Driver(String id, String name, String userName, String passward, String address, String tele_numb) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = passward;
        this.address = address;
        this.tele_numb = tele_numb;
    }
    /************************ get methods ****************************/
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getTele_numb() {
        return tele_numb;
    }
    
    /****************** set methods  ****************************/
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String passward) {
        this.password = passward;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTele_numb(String tele_numb) {
        this.tele_numb = tele_numb;
    }
    
    
    
}
