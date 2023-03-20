package com.eoi.springboot.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("${url.cursos}") // Hay que escribir /curos/all para conseguir el mensaje
public class ControladorCursos {

    @Value("${mensaje.hola}")
    private String mensajeHola;

    @GetMapping("/all")
    String list(){
        return null;
    }

    @GetMapping("")
    String create(@RequestParam("nombre") String valueOne){
        return valueOne;
    }


}
