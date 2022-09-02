package com.Portfolio.crud.repository;

import com.Portfolio.crud.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iEducacionRepository_JPA extends JpaRepository<Educacion, Integer> {
    
}