package com.example.hwq3grades.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GradesController {
    ArrayList<String> Grade=new ArrayList<>();
    @GetMapping("/grade")
    public ArrayList getGrade(){
        return Grade ;
    }
    @PostMapping("/grade")
    public String addGrade(@RequestBody String grade){
        Grade.add(grade);
        return "New grade added ";
    }

    @PutMapping("/grade")
    public String updatesGrade(@PathVariable int index ,@RequestBody String grade){
        Grade.set(index,grade);
        return "New grade set ";
    }

    @DeleteMapping("/name")
    public String deleteGrade(@PathVariable int index){
        Grade.remove(index);
        return "Name deleted";
    }
}
