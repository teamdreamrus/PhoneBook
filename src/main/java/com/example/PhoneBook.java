package com.example;
import java.util.*;
public class PhoneBook{
    public static void main(String[] args){
        ArrayList<Fiz> FizList = new ArrayList<Fiz>();
        ArrayList<Ur> UrList = new ArrayList<Ur>();
        // LinkedList<User> list = new LinkedList<>();
        FizList.add(new Fiz("Nikolay Buhaschii","88005553535","NSK, Glavnii Vokzal, 3 lavochka","+7923232323"));
        FizList.add(new Fiz("Vasya Svoi","8553535","Saint-P, Dvorec nomber 1","+784523562"));
        UrList.add(new Ur("Nikolay2 Buhaschii","88005553535","NSK, Glavnii Vokzal, 3 lavochka","11214553"));
        UrList.add(new Ur("Vasya Svoi2","8553535","Saint-P, Dvorec nomber 1","1152256"));
        for(int e=0; e < FizList.size(); e++){
            System.out.println("ID: "+ FizList.get(e).getID() + " Name: " + FizList.get(e).getName() + " PhoneNumber: "+ FizList.get(e).getNumber() + " Adress: " + FizList.get(e).getAdress() + "Mobile Phone: " + FizList.get(e).getMobilePhone());
        }
        for(int e=0; e < UrList.size(); e++){
            System.out.println("ID: "+ UrList.get(e).getID() + " Name: " + UrList.get(e).getName() + " PhoneNumber: "+ UrList.get(e).getNumber() + " Adress: " + UrList.get(e).getAdress() + "INN: " + UrList.get(e).getINN());
        }
    }


}