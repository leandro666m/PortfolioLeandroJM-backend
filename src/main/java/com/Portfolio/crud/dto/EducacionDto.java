
package com.Portfolio.crud.dto;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class EducacionDto {
    private String lugar;
    private String url;
    private String fecha;
    private String titulo;
    private String descripcion;
    private Boolean esCurso;
}
