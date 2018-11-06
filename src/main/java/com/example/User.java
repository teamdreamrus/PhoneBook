package com.example;
abstract class User{
    private static int nextID=1;
    private String Name;
    private String NumberPhone;
    private String Adress;
    private int ID;

    public User(String name, String number,String adress){
        Name = name;
        NumberPhone = number;
        Adress = adress;
        ID = 0;
        setNextID();
    }

    public String getName(){
        return Name;
    }

    public String getNumber(){
        return NumberPhone;
    }

    public String getAdress(){
        return Adress;
    }

    public int getID(){
        return ID;
    }

    public void setNextID(){
        ID = nextID;
        nextID++;
    }

    public static int getNext(){
        return nextID;
    }



}