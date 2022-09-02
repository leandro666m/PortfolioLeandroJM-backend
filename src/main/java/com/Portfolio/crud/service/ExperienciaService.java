
package com.Portfolio.crud.service;
import com.Portfolio.crud.model.Experiencia;
import com.Portfolio.crud.repository.iExperienciaRepository_JPA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {

    @Autowired
    public iExperienciaRepository_JPA expRepository;
    
    public List<Experiencia> getExperiencias(){
        return expRepository.findAll();
    }  
        
    public void  saveExp(Experiencia expEditar){
        expRepository.save(expEditar);
    }

    public Experiencia findExp(int id){
        return expRepository.findById(id).orElse(null);
    }
    
     public void delete(int id){
        expRepository.deleteById(id);
    }
}
