package com.shape.spring.shape.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shape.spring.shape.domain.Programme;

public interface IProgrammeRepository extends JpaRepository<Programme, Long>{

}
