package com.example;
import java.io.FileReader;
import java.io.FileWriter;
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
            scan.nextLine();
            while(scan.hasNextLine()){
              Fiz f = new Fiz();
               f.formCSV(scan.nextLine());
                FizList.add(f);
            }
            fr.close();
        }catch (IOException error){
            System.out.println(error.getMessage());
        }
       
        


        String[] strSplit2;
       try{
            FileReader fr = new FileReader("C:\\Users\\alexey\\Desktop\\phonebook\\src\\main\\resources\\UrBook.csv");
            Scanner scan = new Scanner(fr);
            scan.nextLine();
            while(scan.hasNextLine()){
                Ur u = new Ur();
               u.formCSV(scan.nextLine());
                UrList.add(u);
            }
            fr.close();
        }catch (IOException error){
            System.out.println(error.getMessage());
        }
       
        


        //UrList.add(new Ur("Vasyaaaaa","4954954","MOYA XATA","4458642"));


        //String strAllUnityUr = new String();
        try{
            FileWriter fw = new FileWriter("C:\\Users\\alexey\\Desktop\\phonebook\\src\\main\\resources\\UrBook.csv",true);
            
            int e = UrList.size()-1;
            //strAllUnityUr=UrList.get(e).getID()+";"+UrList.get(e).getName() +";"+UrList.get(e).getNumber()+";"+UrList.get(e).getAdress()+";"+UrList.get(e).getINN()+"\n";
            fw.write(UrList.get(e).toCSV());
            fw.flush();
            fw.close();
        }catch (IOException error){
            System.out.println(error.getMessage());
        }

       // FizList.add(new Fiz("POTAPENKO","888888","RUBLYOVKA","4758654"));

       // String strAllUnityFiz = new String();
        try{
            FileWriter fw = new FileWriter("C:\\Users\\alexey\\Desktop\\phonebook\\src\\main\\resources\\FizBook.csv",true);
            
            int e = FizList.size()-1;
           // strAllUnityFiz=FizList.get(e).getID()+";"+FizList.get(e).getName() +";"+FizList.get(e).getNumber()+";"+FizList.get(e).getAdress()+";"+FizList.get(e).getMobilePhone()+"\n";
            fw.write(FizList.get(e).toCSV());
            fw.flush();
            fw.close();
        }catch (IOException error){
            System.out.println(error.getMessage());
        }
        



        for(int e=0; e < FizList.size(); e++){
            System.out.println("ID: "+ FizList.get(e).getID() + " Name: " + FizList.get(e).getName() + " PhoneNumber: "+ FizList.get(e).getNumber() + " Adress: " + FizList.get(e).getAdress() + "Mobile Phone: " + FizList.get(e).getMobilePhone());
        }

        for(int e=0; e < UrList.size(); e++){
            System.out.println("ID: "+ UrList.get(e).getID() + " Name: " + UrList.get(e).getName() + " PhoneNumber: "+ UrList.get(e).getNumber() + " Adress: " + UrList.get(e).getAdress() + " INN: " + UrList.get(e).getINN());
        }



    }
}