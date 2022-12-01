package com.devops.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devops.examen.entities.Fournisseur;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {

}
