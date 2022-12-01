package com.devops.examen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devops.examen.entities.Operateur;

@Repository
public interface OperateurRepository extends CrudRepository<Operateur, Long> {

}
