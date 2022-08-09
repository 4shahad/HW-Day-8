package com.example.hwq2.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping
public class PeopleController {
    ArrayList<String> Name=new ArrayList<>();
    @GetMapping("/name")
    public ArrayList getNames(){
        return Name ;
    }
    @PostMapping("/name")
    public String addName(@RequestBody String name){
        Name.add(name);
        return "New Name added ";
    }

    @PutMapping("/name")
    public String updatesName(@PathVariable int index ,@RequestBody String name){
        Name.set(index,name);
        return "New Name set ";
    }

    @DeleteMapping("/name")
    public String deleteName(@PathVariable int index){
        Name.remove(index);
        return "Name deleted";
    }
}
