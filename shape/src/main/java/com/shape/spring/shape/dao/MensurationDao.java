package com.shape.spring.shape.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shape.spring.shape.domain.Mensuration;
import com.shape.spring.shape.repository.IMensurationRepository;

@Service
public class MensurationDao {
	@Autowired
	IMensurationRepository mensurationRepository;
	
	// Liste de Mensurations
	public List<Mensuration> getMensurations() {
		return mensurationRepository.findAll();
		
	}
	
	//Save une Mensuration 
	public Mensuration saveMensuration(Mensuration mensuration) {
		return mensurationRepository.save(mensuration);
		
	}
	
	// get une Mensuration by ID
	public Mensuration getMensurationByID(Long id_mensuration) {
		return mensurationRepository.findById(id_mensuration).get();
	}
	
	
	// Delete une Mensuration 
	
	public void deleteMensuration(Mensuration mensuration) {
		mensurationRepository.delete(mensuration);
	
	}
	
	// Update une Mensuration 
	
	public Mensuration updateMensuration(Mensuration mensuration) {
		return mensurationRepository.save(mensuration);
		
	}
	
 
}
