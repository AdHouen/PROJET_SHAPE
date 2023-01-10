package com.shape.spring.shape.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shape.spring.shape.domain.Mesure;
import com.shape.spring.shape.repository.IMesureRepository;

@Service
public class MesureDao {
	@Autowired
	IMesureRepository mesureRepository;
	
	// Liste de Mesures
	public List<Mesure> getMesures() {
		return mesureRepository.findAll();
		
	}
	
	//Save une Mesure 
	public Mesure saveMesure(Mesure mesure) {
		return mesureRepository.save(mesure);
		
	}
	
	// get une Mesure by ID
	public Mesure getMesureByID(Long id_mesure) {
		return mesureRepository.findById(id_mesure).get();
	}
	
	
	// Delete une Mesure 
	
	public void deleteMesure(Mesure mesure) {
		mesureRepository.delete(mesure);
	
	}
	
	// Update une Mesure 
	
	public Mesure updateMesure(Mesure mesure) {
		return mesureRepository.save(mesure);
		
	}
	
 
}
