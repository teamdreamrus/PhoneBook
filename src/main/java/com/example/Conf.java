package com.example;

class Conf{
    private String[] FioArray;
    private int time;
    Calls(String[] FioAll, int t){
        this.FioArray = FioAll;
        this.time = t;
    }
    public String[] getFioArr(){
        return this.FioArray;
    }
    public int getTime(){
        return this.time;
    }
}