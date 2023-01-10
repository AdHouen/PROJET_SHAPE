package com.shape.spring.shape.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shape.spring.shape.domain.Entrainement;

public interface IEntrainementRepository extends JpaRepository<Entrainement, Long>{

}
