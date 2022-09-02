
package com.Portfolio.crud.repository;

import com.Portfolio.crud.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iExperienciaRepository_JPA extends JpaRepository<Experiencia, Integer> {

    
}
