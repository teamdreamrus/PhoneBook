package com.example;
import java.util.*;

class Statistic <T extends CallsConf>{
    
    ArrayList <T> array = new ArrayList <T>();

   
     public int alltime(){
        int all = 0;
		for(T var: this.array)
		{
			all += var.getTime();
		}	
		return all;
     };
     
     public int timeForOneUser(String name){

        for (T var: this.array)
		{
			if (name.equals(var.getFirst()))
			{
				return var.getTime();
			}
		}
		return 0;

     };
     T getMax(){
        T temp = array.get(0);

        for(T var: array)
		{
			if (var.getTime() > temp.getTime())
			{
				temp = var;
			}
		}
		return temp; 
    }

}
