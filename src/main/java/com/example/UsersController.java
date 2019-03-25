package com.example;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    /* private static final String template = "Hello, %s!";
     private final AtomicLong counter = new AtomicLong();

     @RequestMapping("/Ur")
     public Ur ur(@RequestParam(value = "name", defaultValue = "")String Name ){

         return new Ur();
     }
     @RequestMapping("/Fiz")
     public  Fiz fiz(@RequestParam(value = "name", defaultValue = "") String Name ){

         return new Fiz(Name,);
     }*/
    // public List<fiz> с bd считать
   @RequestMapping("/get_fizs")
   public  String Fizs(@RequestParam( defaultValue = "") String Name ){
        DbHelper db = new DbHelper();
        Gson gson = new Gson();
       return gson.toJson(db.getFizs());

   }
    @RequestMapping("/get_urs")
    public  String Urs(@RequestParam( defaultValue = "") String Name ){
        DbHelper db = new DbHelper();
        Gson gson = new Gson();
        return gson.toJson(db.getUrs());

    }



}
