package com.eoi.springboot.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name= "curso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EntidadCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String nombreProfesor;

    private Integer numeroAlumnos;

    private Date fechaInicio;

    private Date fechaFin;

}
