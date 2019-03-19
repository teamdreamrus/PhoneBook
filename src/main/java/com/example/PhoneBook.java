package com.example;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;
import java.util.*;
import java.sql.*;
//import org.apache.log4j.Logger;
//import com.google.gson.Gson;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*




    */

@SpringBootApplication
@ComponentScan
public class PhoneBook{
  //  final static Logger Log = Logger.getLogger(PhoneBook.class);
    public static void main(String[] args){
        SpringApplication.run(PhoneBook.class, args);
       /* ArrayList<Fiz> FizList = new ArrayList<Fiz>();
        ArrayList<Ur> UrList = new ArrayList<Ur>();
        String URL = "jdbc:mysql://localhost:3306/test"+"?serverTimezone=UTC";
        try{
            Connection con=DriverManager.getConnection(URL,"root","A.lexey99");
            Statement st = con.createStatement();
           String query = "DELETE FROM Ur WHERE NAME = 'Batya'";
            st.execute(query);
            query = "SELECT * FROM Ur";
            ResultSet rs= st.executeQuery(query);
            while(rs.next()){
                String fio = rs.getString("Name");
                Log.info(fio);
            }
            
        }catch(SQLException e ){
            Log.error(e.getMessage());
        }

        Ur u = new Ur("Alexey","88888","Tolostogo street","454466");
        Gson gson = new Gson();
        String json = gson.toJson(u);
        System.out.println(json);


        Ur res = gson.fromJson(json,Ur.class);
        System.out.println(res.getName());

        Statistic<Calls> call = new Statistic <Calls> ();
        call.array.add(new Calls("I","WHO",10));
        call.array.add(new Calls("you","me",50));
        System.out.println(call.getMax().getFirst());
        System.out.println(call.alltime());


        Statistic<Conf>  conf = new Statistic<>();
        String[]  confa = {"I","you","we"};
        conf.array.add(new Conf(confa,20));
        System.out.println(conf.getMax().getFirst());


*/


    }
}