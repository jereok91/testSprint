package com.mrbono.pqrsf.controller;

import com.mrbono.pqrsf.model.Trasporte;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class Test {
    /*@GetMapping
    public List<String> test(){
        List <String> lista = new ArrayList<>();
        lista.add("Hola Mucndo");
        lista.add("Casa");
        lista.add("Casdad");

        return lista;
    }*/

    @GetMapping
    public List<Trasporte> test(){
        List <Trasporte> lista = new ArrayList<>();
        lista.add(new Trasporte("Terrestre", "HYT","2323"));
        lista.add(new Trasporte("Acuatico", "UNETS","2323"));
        lista.add(new Trasporte("Aereo", "HYT","2323"));

        return lista;
    }

}
