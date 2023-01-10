package com.shape.spring.shape.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shape.spring.shape.domain.Utilisateur;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
