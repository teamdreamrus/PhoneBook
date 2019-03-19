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
    public String getFiz(){
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
        Gson gson = new Gson();
        String json_fiz = gson.toJson(FizList);
        return json_fiz;
    }

}
