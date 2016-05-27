package com.example.eriks_000.utunes;

/**
 * Created by Victor on 2016-05-27.
 */
public class DummyUser {

    String username;
    String password;
    String email;
    int userID;

    String shippingAdress;

    //ShoppingCart shoppingCart;

    void setUsername(String username){
        this.username = username;
    }
    void setPassword(String password){
        this.password = password;
    }
    void setEmail(String email){
        this.email = email;
    }
    void setUserID(int userID){
        this.userID = userID;
    }
    void setShippingAdress(String shippingAdress){
        this.shippingAdress = shippingAdress;
    }

    String getUsername(){
        return username;
    }
    String getEmail(){
        return email;
    }
    int getUserID(){
        return userID;
    }
    String getShippingAdress(){
        return shippingAdress;
    }

    DummyUser(){

    }

    DummyUser(String username,String password, String email, int userID){
        this.username = username;
        this.password = password;
        this.email = email;
        this.userID = userID;

        this.shippingAdress = null;
    }

}
