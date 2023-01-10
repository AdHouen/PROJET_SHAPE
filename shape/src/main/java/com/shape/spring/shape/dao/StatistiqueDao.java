package com.shape.spring.shape.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shape.spring.shape.domain.Statistique;
import com.shape.spring.shape.repository.IStatistiqueRepository;

@Service
public class StatistiqueDao {
	@Autowired
	IStatistiqueRepository statistiqueRepository;
	
	// Liste de Statistiques
	public List<Statistique> getStatistiques() {
		return statistiqueRepository.findAll();
		
	}
	
	//Save un Statistique 
	public Statistique saveStatistique(Statistique statistique) {
		return statistiqueRepository.save(statistique);
		
	}
	
	// get un Statistique by ID
	public Statistique getStatistiqueByID(Long id_statistique) {
		return statistiqueRepository.findById(id_statistique).get();
	}
	
	
	// Delete un Statistique 
	
	public void deleteStatistique(Statistique statistique) {
		statistiqueRepository.delete(statistique);
	
	}
	
	// Update un Statistique 
	
	public Statistique updateStatistique(Statistique statistique) {
		return statistiqueRepository.save(statistique);
		
	}
	
 
}
