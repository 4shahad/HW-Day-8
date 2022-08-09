package com.example.hwq1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @GetMapping("/hey")
    public  String massege (){
        return "Hey from spring";

    }
   @GetMapping("/bye")
   public String Bye(){
        return "bye";
   }
    @GetMapping("/check/status")
    public String Status(){
        return "Everything OK";
    }
    @GetMapping("/health")
    public String Health(){
        return "Server health is up and running";
    }

}

