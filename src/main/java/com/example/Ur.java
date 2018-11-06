package com.example;

public class Ur extends User{
    private String INN;
    public Ur(String name, String phone,String adress, String Inn) {
        super(name,phone,adress);
        this.INN = Inn;
    }
    public String getINN() { return INN; }
}