package com.shape.spring.shape.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shape.spring.shape.domain.Entrainement;
import com.shape.spring.shape.repository.IEntrainementRepository;

@Service
public class EntrainementDao {
	@Autowired
	IEntrainementRepository entrainementRepository;
	
	// Liste de Entrainements
	public List<Entrainement> getEntrainements() {
		return entrainementRepository.findAll();
		
	}
	
	//Save un Entrainement 
	public Entrainement saveEntrainement(Entrainement entrainement) {
		return entrainementRepository.save(entrainement);
		
	}
	
	// get un Entrainement by ID
	public Entrainement getEntrainementByID(Long id_entrainement) {
		return entrainementRepository.findById(id_entrainement).get();
	}
	
	
	// Delete un Entrainement 
	
	public void deleteEntrainement(Entrainement entrainement) {
		entrainementRepository.delete(entrainement);
	
	}
	
	// Update un Entrainement 
	
	public Entrainement updateEntrainement(Entrainement entrainement) {
		return entrainementRepository.save(entrainement);
		
	}
	
 
}
