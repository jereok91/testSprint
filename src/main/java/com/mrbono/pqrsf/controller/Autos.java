package com.mrbono.pqrsf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("autos")
public class Autos {
    @GetMapping
    public String autos(){
        return "Hola Mundo";
    }
    @GetMapping
    @RequestMapping("lujo")
    public String autos2(){
        return "Hola Lujo";
    }


}
