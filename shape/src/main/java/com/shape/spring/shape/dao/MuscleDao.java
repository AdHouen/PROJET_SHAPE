package com.shape.spring.shape.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shape.spring.shape.domain.Muscle;
import com.shape.spring.shape.repository.IMuscleRepository;

@Service
public class MuscleDao {
	@Autowired
	IMuscleRepository muscleRepository;
	
	// Liste de Muscles
	public List<Muscle> getMuscles() {
		return muscleRepository.findAll();
		
	}
	
	//Save un Muscle 
	public Muscle saveMuscle(Muscle muscle) {
		return muscleRepository.save(muscle);
		
	}
	
	// get un Muscle by ID
	public Muscle getMuscleByID(Long id_muscle) {
		return muscleRepository.findById(id_muscle).get();
	}
	
	
	// Delete un Muscle 
	
	public void deleteMuscle(Muscle muscle) {
		muscleRepository.delete(muscle);
	
	}
	
	// Update un Muscle
	
	public Muscle updateMuscle(Muscle muscle) {
		return muscleRepository.save(muscle);
		
	}
	
 
}
