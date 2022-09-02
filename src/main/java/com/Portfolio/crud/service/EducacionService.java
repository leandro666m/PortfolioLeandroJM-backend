
package com.Portfolio.crud.service;

import com.Portfolio.crud.model.Educacion;
import com.Portfolio.crud.repository.iEducacionRepository_JPA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    @Autowired
    public iEducacionRepository_JPA educRepository;
    
    public List<Educacion> getEducacion(){
        return educRepository.findAll();
    }  
        
    public void saveEducacion(Educacion educEditar){
        educRepository.save(educEditar);
    }

    public Educacion findExp(int id){
        return educRepository.findById(id).orElse(null);
    }
    
    public void delete(int id){
        educRepository.deleteById(id);
    }
    
}