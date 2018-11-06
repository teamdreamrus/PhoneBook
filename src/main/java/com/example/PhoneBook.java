package com.example;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;
import java.util.*;
public class PhoneBook{
    public static void main(String[] args){
        ArrayList<Fiz> FizList = new ArrayList<Fiz>();
        ArrayList<Ur> UrList = new ArrayList<Ur>();
        // LinkedList<User> list = new LinkedList<>();
        /*FizList.add(new Fiz("Nikolay Buhaschii","88005553535","NSK, Glavnii Vokzal, 3 lavochka","+7923232323"));
        FizList.add(new Fiz("Vasya Svoi","8553535","Saint-P, Dvorec nomber 1","+784523562"));
        UrList.add(new Ur("Nikolay2 Buhaschii","88005553535","NSK, Glavnii Vokzal, 3 lavochka","11214553"));
        UrList.add(new Ur("Vasya Svoi2","8553535","Saint-P, Dvorec nomber 1","1152256"));
        for(int e=0; e < FizList.size(); e++){
            System.out.println("ID: "+ FizList.get(e).getID() + " Name: " + FizList.get(e).getName() + " PhoneNumber: "+ FizList.get(e).getNumber() + " Adress: " + FizList.get(e).getAdress() + "Mobile Phone: " + FizList.get(e).getMobilePhone());
        }
        for(int e=0; e < UrList.size(); e++){
            System.out.println("ID: "+ UrList.get(e).getID() + " Name: " + UrList.get(e).getName() + " PhoneNumber: "+ UrList.get(e).getNumber() + " Adress: " + UrList.get(e).getAdress() + "INN: " + UrList.get(e).getINN());
        }*/
        String[] strSplit;
        try{
            FileReader fr = new FileReader("C:\\Users\\alexey\\Desktop\\phonebook\\src\\main\\resources\\FizBook.csv");
            Scanner scan = new Scanner(fr);
            while(scan.hasNextLine()){
                //System.out.println(scan.nextLine());
                strSplit = scan.nextLine().split(";");
                FizList.add(new Fiz(strSplit[1],strSplit[2],strSplit[3],strSplit[4]));
            }
            fr.close();
        }catch (IOException error){
            System.out.println(error.getMessage());
        }
       
        for(int e=0; e < FizList.size(); e++){
            System.out.println("ID: "+ FizList.get(e).getID() + " Name: " + FizList.get(e).getName() + " PhoneNumber: "+ FizList.get(e).getNumber() + " Adress: " + FizList.get(e).getAdress() + "Mobile Phone: " + FizList.get(e).getMobilePhone());
        }


        String[] strSplit2;
        try{
            FileReader fr = new FileReader("C:\\Users\\alexey\\Desktop\\phonebook\\src\\main\\resources\\UrBook.csv");
            Scanner scan = new Scanner(fr);
            while(scan.hasNextLine()){
                //System.out.println(scan.nextLine());
                strSplit2 = scan.nextLine().split(";");
                UrList.add(new Ur(strSplit2[1],strSplit2[2],strSplit2[3],strSplit2[4]));
            }
            fr.close();
        }catch (IOException error){
            System.out.println(error.getMessage());
        }
       
        for(int e=0; e < UrList.size(); e++){
            System.out.println("ID: "+ UrList.get(e).getID() + " Name: " + UrList.get(e).getName() + " PhoneNumber: "+ UrList.get(e).getNumber() + " Adress: " + UrList.get(e).getAdress() + " INN: " + UrList.get(e).getINN());
        }


    }
}