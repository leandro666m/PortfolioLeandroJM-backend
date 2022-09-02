package com.Portfolio.crud.service;
import com.Portfolio.crud.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.Portfolio.crud.repository.iPersonaRepository_JPA;


@Service
@Transactional
public class PersonaService {
    
    @Autowired
    public iPersonaRepository_JPA personaRepository;

    public Persona getPersona(int id) {
        return personaRepository.findById(id).orElse(null);
    }
   
    public void  savePersona(Persona persona){
        personaRepository.save(persona);
    }

    public Persona findPersona(int id){
        return personaRepository.findById(id).orElse(null);
    }

}
