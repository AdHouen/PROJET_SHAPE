package com.shape.spring.shape.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shape.spring.shape.domain.Programme;
import com.shape.spring.shape.repository.IProgrammeRepository;

@Service
public class ProgrammeDao {
	@Autowired
	IProgrammeRepository programmeRepository;
	
	// Liste de Programmes
	public List<Programme> getProgrammes() {
		return programmeRepository.findAll();
		
	}
	
	//Save un Programme 
	public Programme saveProgramme(Programme programme) {
		return programmeRepository.save(programme);
		
	}
	
	// get un Programme by ID
	public Programme getProgrammeByID(Long id_programme) {
		return programmeRepository.findById(id_programme).get();
	}
	
	
	// Delete un Programme 
	
	public void deleteProgramme(Programme programme) {
		programmeRepository.delete(programme);
	
	}
	
	// Update un Programme 
	
	public Programme updateProgramme(Programme programme) {
		return programmeRepository.save(programme);
		
	}
	
 
}
