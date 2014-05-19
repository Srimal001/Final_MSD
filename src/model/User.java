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
public class User implements Serializable, Authenticable{
    
    /*  */ 
    private String id;
    private String name;
    private String userName;
    private String password;
    private String address;
    private String tele_numb;
    private int rating;
    private String usertype;

    /* Constructors */
    
    public User() {
    }

    
    public User(String id, String name, String userName, String passward, String usertype) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = passward;
        this.usertype = usertype;
    }

    public User(String id, String name, String userName, String passward, String address, String tele_numb, int rating, String usertype) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = passward;
        this.address = address;
        this.tele_numb = tele_numb;
        this.rating = rating;
        this.usertype = usertype;
    }

    public User(String name, String userName, String passward) {
        this.name = name;
        this.userName = userName;
        this.password = passward;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTele_numb() {
        return tele_numb;
    }

    public void setTele_numb(String tele_numb) {
        this.tele_numb = tele_numb;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    
    
    
}
