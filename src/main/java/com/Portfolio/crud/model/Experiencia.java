package com.Portfolio.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String lugar;
    private String url;
    private String fecha;
    private String puesto;
    private String descripcion;
/*
    @ManyToOne
    @JoinColumn(name = "experiencia_persona")
    Persona persona;
*/
}
