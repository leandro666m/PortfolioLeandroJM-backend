package com.Portfolio.crud.repository;

import com.Portfolio.crud.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iPersonaRepository_JPA extends JpaRepository<Persona, Integer> {
   

    
}
