package com.myandroid.recyclerviewtest;

/**
 * Created by Administrator on 2018/10/26.
 */

public class Member {
    private String name;
    private int imageId;

    public Member(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setImageId(int imageId){
        this.imageId = imageId;
    }
}
