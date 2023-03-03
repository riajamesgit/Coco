package com.example.cocoapp;


//import java.time package
public class Posts {
    /*                  Ex:        010720030830*/
    private int idNum; /*Format of MMDDYYYY0000*/
    private String post;
    public Posts(String post, int idNum){
        this.idNum = idNum;
        this.post = post;
    }
    public String getPost(){
        return this.post;
    }
    public void setPost(String post){
        this.post = post;
    }
    public int getIDNum(){
        return this.idNum;
    }
    public void setIDNum(int idNum){
        this.idNum = idNum;
    }

}