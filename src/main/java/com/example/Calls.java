package com.example;

class Calls{
    private String FioFirst;
    private String FioSec;
    private int time;
    Calls(String First, String Second, int t){
        this.FioFirst = First;
        this.FioSec = Second;
        this.time = t;
    }
    public String getFirst(){
        return this.FioFirst;
    }
    public String getSecond(){
        return this.FioSec;
    }
    public int getTime(){
        return this.time;
    }
}