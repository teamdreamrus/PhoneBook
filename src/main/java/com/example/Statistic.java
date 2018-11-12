package com.example;
class Statistic <T>{
    T object;
    Statistic(T o){
        this.object  = o;
    }
    
    T getObject(){
        return this.object;
    }
//вызов в phoneBook Statistic <Calls> = 
    ArrayList <T> lst;
     private int alltime;
     private int timeForOneUser;
     public int getMax(T ... array){

      //  if(array.length >2){
        int maximum = array[0];

        for (int i = 0; i < array.length; i++)
            if (maximum < array[0].timeForOneUser) maximum = array[i];
        return maximum;
      //  }
        //else 
    }

}
