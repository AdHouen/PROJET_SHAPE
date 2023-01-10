package com.shape.spring.shape.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shape.spring.shape.domain.Gallerie;
import com.shape.spring.shape.repository.IGallerieRepository;

@Service
public class GallerieDao {
	@Autowired
	IGallerieRepository gallerieRepository;
	
	// Liste de Galleries
	public List<Gallerie> getGalleries() {
		return gallerieRepository.findAll();
		
	}
	
	//Save une Gallerie 
	public Gallerie saveGallerie(Gallerie gallerie) {
		return gallerieRepository.save(gallerie);
		
	}
	
	// get une Gallerie by ID
	public Gallerie getGallerieByID(Long id_gallerie) {
		return gallerieRepository.findById(id_gallerie).get();
	}
	
	
	// Delete une Gallerie 
	
	public void deleteGallerie(Gallerie gallerie) {
		gallerieRepository.delete(gallerie);
	
	}
	
	// Update une Gallerie
	
	public Gallerie updateGallerie(Gallerie gallerie) {
		return gallerieRepository.save(gallerie);
		
	}
	
 
}
