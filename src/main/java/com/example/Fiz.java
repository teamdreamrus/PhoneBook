package com.example;

public class Fiz extends User{
    private String MobilePhone;

    public Fiz (){
    }
    public Fiz (String name, String tele, String adress, String mobilePhone){
        super(name,tele,adress);
        this.MobilePhone = mobilePhone;
    }
    public String getMobilePhone() { return MobilePhone; }

    public String toCSV(){
        return (super.toCSV()+this.MobilePhone+"\n");
    }
    public void formCSV(String str){
        
        super.formCSV(str);
        this.MobilePhone=str.substring(str.lastIndexOf(";"));
    }
}