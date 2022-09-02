package com.Portfolio.crud.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String apellido;
    private String comentario;
    private int edad;
    private String telefono;
    private String ciudad;
    private String web;
    private String email;
    private String titulo;

    //(si o si tiene que habe run ManyToOne en la otra entidad relacionada)
    //@OneToMany(mappedBy = "persona") //persona xq en la entidad relacionada el atrib de ManyToOne se llama así
    //List<Experiencia> experienciasList; //una List xq 1 persona puede tener varias Experiencias

}
