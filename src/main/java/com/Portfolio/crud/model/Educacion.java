
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
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String lugar;
    private String url;
    private String fecha;
    private String titulo;
    private String descripcion;
    private boolean esCurso;
}

  

