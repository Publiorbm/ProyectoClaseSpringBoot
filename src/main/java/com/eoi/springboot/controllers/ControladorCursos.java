package com.eoi.springboot.controllers;

import com.eoi.paradigmaspoospringboot.PataStandar;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
    @ResponseBody
    //String create(@RequestParam("nombre") String valueOne){
    PataStandar create(@RequestParam("nombre") String valueOne){
        //return "<html><body><h1>Bienvenido "+valueOne+"</h1><p>Este es un párrafo de ejemplo</p></body></html>"; // dándole un formato html para enviarlo a la página
        //return valueOne;
        return new PataStandar();
    }


}
