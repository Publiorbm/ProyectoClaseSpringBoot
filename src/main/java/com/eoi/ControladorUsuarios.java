package com.eoi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  Y ADEMAS, PREPARATE PARA RECIBIR PETICIONES HTTP (REST)
public class ControladorUsuarios {

    @RequestMapping("/")
    String hellow()
    {
        return "Hello World!";
    }

    @RequestMapping("/hola")
    String holam()
    {
        return " Hola Mundo!";
    }

    @RequestMapping("/mimedicacion")
    String mimedicacion()
    {
        return "Tomate las pastillas!";
    }
}
