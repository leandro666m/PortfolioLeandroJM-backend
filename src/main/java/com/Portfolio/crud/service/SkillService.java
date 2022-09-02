
package com.Portfolio.crud.service;

import com.Portfolio.crud.model.Skill;
import com.Portfolio.crud.repository.iSkillRepository_JPA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillService {

    @Autowired
    public iSkillRepository_JPA skillRepository;
    
    public List<Skill> getSkills(){
        return skillRepository.findAll();
    }  
        
    public void  saveSkill(Skill skillEditar){
        skillRepository.save(skillEditar);
    }

    public Skill findSkill(int id){
        return skillRepository.findById(id).orElse(null);
    }
    
    public void delete(int id){
        skillRepository.deleteById(id);
    }
}