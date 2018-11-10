package com.example;

public class Ur extends User{
    private String INN;
    public Ur() {
    }
    public Ur(String name, String phone,String adress, String Inn) {
        super(name,phone,adress);
        this.INN = Inn;
    }
    public String getINN() { return INN; }

    public String toCSV(){
        return (super.toCSV()+this.INN+"\n");
    }
    public void formCSV(String str){
        
        super.formCSV(str);
        this.INN=str.substring(str.lastIndexOf(";"));
    }
}