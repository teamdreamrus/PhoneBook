package com.example;
class User implements Csv{
    private static int nextID=1;
    private String Name;
    private String NumberPhone;
    private String Adress;
    private int ID;

   

    public User (String name, String number,String adress){
        this.Name = name;
        this.NumberPhone = number;
        this.Adress = adress;
        this.ID = 0;
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

    String toCSV(){
        return (ID+";"+Name+";"+NumberPhone+";"+Adress+";");
    }
    void formCSV(String str){
        String[] arr = str.split(";"); 
        this.ID=Integer.valueOf(arr[0]);
        this.Name = arr[1];
        this.NumberPhone = arr[2];
        this.Adress = arr[3];
    }



}