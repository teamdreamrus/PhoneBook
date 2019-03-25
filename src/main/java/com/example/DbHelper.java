package com.example;
import com.google.gson.Gson;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.sql.*;
import java.util.ArrayList;

public class DbHelper {
    final static Logger log = Logger.getLogger(PhoneBook.class);
    DbHelper(){

    }
    public ArrayList getFizs(){
        ArrayList<Fiz> FizList = new ArrayList<Fiz>();
        //ArrayList<Ur> UrList = new ArrayList<Ur>();
        String URL = "jdbc:mysql://localhost:3306/test"+"?serverTimezone=UTC";
        try{
            Connection con=DriverManager.getConnection(URL,"root","A.lexey99");
            Statement st = con.createStatement();
            //String query = "DELETE FROM Ur WHERE NAME = 'Batya'";
           // st.execute(query);
           String query = "SELECT * FROM Fiz";
            ResultSet rs= st.executeQuery(query);
            while(rs.next()){
                String name = rs.getString("Name");
                String tele = rs.getString("Number");
                String adress = rs.getString("Adress");
                String mobilePhone = rs.getString("MobilePhone");
                Fiz f = new Fiz ( name, tele,  adress, mobilePhone);
                FizList.add(f);
            }


        }catch(SQLException e ){
            log.error(e.getMessage());
        }

        return FizList;
    }

    public ArrayList getUrs(){
        ArrayList<Ur> UrList = new ArrayList<Ur>();
        //ArrayList<Ur> UrList = new ArrayList<Ur>();
        String URL = "jdbc:mysql://localhost:3306/test"+"?serverTimezone=UTC";
        try{
            Connection con=DriverManager.getConnection(URL,"root","A.lexey99");
            Statement st = con.createStatement();
            //String query = "DELETE FROM Ur WHERE NAME = 'Batya'";
            // st.execute(query);
            String query = "SELECT * FROM Ur";
            ResultSet rs= st.executeQuery(query);
            while(rs.next()){
                String name = rs.getString("Name");
                String tele = rs.getString("Number");
                String adress = rs.getString("Adress");
                String INN = rs.getString("INN");
                Ur u = new Ur ( name, tele,  adress, INN);
                UrList.add(u);
            }


        }catch(SQLException e ){
            log.error(e.getMessage());
        }

        return UrList;
    }

    public String getNameByID(String Table,int ID){
        String URL = "jdbc:mysql://localhost:3306/test"+"?serverTimezone=UTC";
        String name="";
        try{
            Connection con=DriverManager.getConnection(URL,"root","A.lexey99");
            Statement st = con.createStatement();
            //String query = "DELETE FROM Ur WHERE NAME = 'Batya'";
            // st.execute(query);
            String query = "SELECT * FROM "+Table+" WHERE ID="+ID;
            ResultSet rs= st.executeQuery(query);
            if (rs.next()){
                name = rs.getString("Name");
            }


        }catch(SQLException e ){
            log.error(e.getMessage());
        }

        return name;
    }


}
