package com.eoi.springboot.controllers;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Controlador usuarios.
 */
@Log4j2
@RestController
public class ControladorUsuarios {

    @Value("${mensaje.pastillas}")
    private String mensajemiMedicacion;
    @Value("${mensaje.hola}")
    private String mensajeHola;
    @Value("${url.hola}")
    private String urlHola;
    @Value("${url.pastillas}")
    private String urlPastillas;

    /**
     * Hola string.
     *
     * @return the string
     */
    @GetMapping("${url.hola}")
    String hola() {
        log.warn(mensajeHola);
        return mensajeHola;
    }

    /**
     * Mi medicacion string.
     *
     * @return the string
     */
    @GetMapping("${url.pastillas}")
    String miMedicacion() {
        log.warn(mensajemiMedicacion);
        return mensajemiMedicacion;
    }
}
