package com.example;

public class Fiz extends User{
    private String MobilePhone;

    public Fiz (String name, String tele, String adress, String mobilePhone){
        super(name,tele,adress);
        this.MobilePhone = mobilePhone;
    }
    public String getMobilePhone() { return MobilePhone; }
}