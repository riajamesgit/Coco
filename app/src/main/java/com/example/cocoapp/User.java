package com.example.cocoapp;

import java.util.ArrayList;

public class User {
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private String major;
    private String uniEmail;
    private int accountID;
    private boolean isLoggedOn;
    ArrayList<Posts> P;

    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getPassWord(){
        return this.passWord;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getMajor(){
        return this.major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getUniEmail(){
        return this.uniEmail;
    }
    public void setUniEmail(String uniEmail){
        this.uniEmail = uniEmail;
    }
    public int getAccountID(){
        return this.accountID;
    }
    public void setAccountID(int accountID){
        this.accountID = accountID;
    }
    public boolean getIsLoggedOn(){
        return this.isLoggedOn;
    }
    public void setIsLoggedOn(boolean isLoggedOn){
        this.isLoggedOn = isLoggedOn;
    }
}

