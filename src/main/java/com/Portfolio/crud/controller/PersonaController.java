package com.Portfolio.crud.controller;

import com.Portfolio.crud.dto.EducacionDto;
import com.Portfolio.crud.dto.ExperienciaDto;
import com.Portfolio.crud.dto.Mensaje;
import com.Portfolio.crud.dto.PersonaDto;
import com.Portfolio.crud.dto.SkillDto;
import com.Portfolio.crud.model.Educacion;
import com.Portfolio.crud.model.Experiencia;
import com.Portfolio.crud.service.PersonaService;
import com.Portfolio.crud.model.Persona;
import com.Portfolio.crud.model.Skill;
import com.Portfolio.crud.service.EducacionService;
import com.Portfolio.crud.service.ExperienciaService;
import com.Portfolio.crud.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class PersonaController {

    @Autowired 
    private PersonaService personaService;

    @GetMapping("/getPersona/{id}")
    //@ResponseBody
    public ResponseEntity< Persona > getPersona(@PathVariable("id") int id){
        Persona pers = personaService.getPersona(id);
        return new ResponseEntity( pers, HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarPersona( @PathVariable("id")int id, @RequestBody PersonaDto personaDto){
      Persona persEditar = personaService.findPersona(id);
              persEditar.setComentario( personaDto.getComentario() );
        persEditar.setEdad( personaDto.getEdad() );
        persEditar.setTelefono( personaDto.getTelefono() );
        persEditar.setCiudad( personaDto.getCiudad() );
        persEditar.setWeb( personaDto.getWeb() );
        persEditar.setEmail( personaDto.getEmail() );
        persEditar.setTitulo( personaDto.getTitulo() );
      personaService.savePersona(persEditar);
     return new ResponseEntity( new Mensaje("Datos actualizados"), HttpStatus.CREATED);
    }

    
//--------------------- 
    @Autowired 
    private ExperienciaService experienciaService;
     
    @GetMapping("/getExperiencias")
    public ResponseEntity< List<Experiencia> > getExperiencias(){
        return new ResponseEntity( experienciaService.getExperiencias(), HttpStatus.OK);
    }
    
   @PutMapping("/editarExp/{id}")
    public ResponseEntity<?> editarExperiencia( @PathVariable("id")int id, @RequestBody ExperienciaDto experienciaDto){
      
        Experiencia expEditar = experienciaService.findExp(id);
      
              expEditar.setLugar(experienciaDto.getLugar() );
              expEditar.setUrl(experienciaDto.getUrl() );
              expEditar.setFecha(experienciaDto.getFecha() );
              expEditar.setPuesto(experienciaDto.getPuesto() );
              expEditar.setDescripcion(experienciaDto.getDescripcion() );
              
      experienciaService.saveExp(expEditar);
     return new ResponseEntity( new Mensaje("Datos actualizados"), HttpStatus.CREATED);
    }

      @DeleteMapping("/borrarExp/{id}")
    public ResponseEntity<?> borrarExp( @PathVariable("id")int id ){
        experienciaService.delete(id);
        return new ResponseEntity( new Mensaje("Eliminado"), HttpStatus.OK);
    }
    
//--------------------- 
    @Autowired 
    private SkillService skillService;
     
    @GetMapping("/getSkills")
    public ResponseEntity< List<Skill> > getSkills(){
        return new ResponseEntity( skillService.getSkills(), HttpStatus.OK);
    }
    
   @PutMapping("/editarSkill/{id}")
    public ResponseEntity<?> editarSkill( @PathVariable("id")int id, @RequestBody SkillDto SkillDto){
      
        Skill skillEditar = skillService.findSkill(id);
      
              skillEditar.setNombreSkill(SkillDto.getNombreSkill());
              skillEditar.setNivel(SkillDto.getNivel());
              
      skillService.saveSkill(skillEditar);
     return new ResponseEntity( new Mensaje("Datos actualizados"), HttpStatus.CREATED);
    }

 @DeleteMapping("/borrarSkill/{id}")
    public ResponseEntity<?> borrarSkill( @PathVariable("id")int id ){
        skillService.delete(id);
        return new ResponseEntity( new Mensaje("Eliminado"), HttpStatus.OK);
    }
    
    //--------------------- 
    @Autowired 
    private EducacionService educService;
     
    @GetMapping("/getEducacion")
    public ResponseEntity< List<Educacion> > getEducacion(){
        return new ResponseEntity( educService.getEducacion(), HttpStatus.OK);
    }
    
   @PutMapping("/editarEduc/{id}")
    public ResponseEntity<?> editarEducacion( @PathVariable("id")int id, 
            @RequestBody EducacionDto educDto){
      
        Educacion educEditar = educService.findExp(id);
      
              educEditar.setLugar( educDto.getLugar() );
              educEditar.setUrl( educDto.getUrl() );
              educEditar.setFecha( educDto.getFecha() );
              educEditar.setTitulo( educDto.getTitulo() );
              educEditar.setDescripcion( educDto.getDescripcion() );
              
      educService.saveEducacion( educEditar );
     return new ResponseEntity( new Mensaje("Datos actualizados"), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/borrarEduc/{id}")
    public ResponseEntity<?> borrarEduc( @PathVariable("id")int id ){
        educService.delete(id);
        return new ResponseEntity( new Mensaje("Eliminado"), HttpStatus.OK);
    }

}