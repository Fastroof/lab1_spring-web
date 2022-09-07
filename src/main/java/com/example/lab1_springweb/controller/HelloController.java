package com.example.lab1_springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/")
    @ResponseBody
    String helloWorld(){
        return "Hello, World!!!";
    }

    @GetMapping("/Yura")
    String helloYura(){
        return "Yura.html";
    }

    @GetMapping("/Oleksandr")
    String helloOleksandr(){
        return "Oleksandr.html";
    }


    @GetMapping("/Danylo")
    String helloDanylo(){
        return "Danylo.html";
    }


    @GetMapping("/Team")
    String helloTeam(){
        return "team.html";
    }

}

