package com.shape.spring.shape.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shape.spring.shape.domain.Mensuration;

public interface IMensurationRepository extends JpaRepository<Mensuration, Long>{

}
