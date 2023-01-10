package com.shape.spring.shape.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shape.spring.shape.domain.Mesure;

public interface IMesureRepository extends JpaRepository<Mesure, Long>{

}
