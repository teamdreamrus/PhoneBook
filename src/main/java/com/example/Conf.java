package com.example;

class Conf extends CallsConf{
    private String[] FioArray;
    private int time;

    Conf(String[] FioAll, int t){
        this.FioArray = FioAll;
        this.time = t;
    }
    public String[] getFioArr(){
        return this.FioArray;
    }
    public int getTime(){
        return this.time;
    }
    public String getFirst(){
        return FioArray[0];
    }
}