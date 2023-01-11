package com.shape.spring.shape.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shape.spring.shape.domain.ExercicePerso;
import com.shape.spring.shape.repository.IExercicePersoRepository;

@Service
public class ExercicePersoDao {
	@Autowired
	IExercicePersoRepository exercicePersoRepository;
	
	// Liste de ExercicePersos
	public List<ExercicePerso> getExercicePersos() {
		return exercicePersoRepository.findAll();
		
	}
	
	//Save un ExercicePerso 
	public ExercicePerso saveExercicePerso(ExercicePerso exercicePerso) {
		return exercicePersoRepository.save(exercicePerso);
		
	}
	
	// get un ExercicePerso by ID
	public ExercicePerso getExercicePersoByID(Long id_exercicePerso) {
		return exercicePersoRepository.findById(id_exercicePerso).get();
	}
	
	
	// Delete un ExercicePerso 
	
	public void deleteExercicePerso(ExercicePerso exercicePerso) {
		exercicePersoRepository.delete(exercicePerso);
	
	}
	
	// Update un ExercicePerso
	
	public ExercicePerso updateExercicePerso(ExercicePerso exercicePerso) {
		return exercicePersoRepository.save(exercicePerso);
		
	}
	
 
}
