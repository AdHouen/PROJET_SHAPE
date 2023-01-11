package com.shape.spring.shape.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shape.spring.shape.dao.MuscleDao;
import com.shape.spring.shape.domain.Muscle;


@RestController
@RequestMapping
@CrossOrigin("*")
public class MuscleController {
	
	@Autowired
	MuscleDao muscleDao;
	
	@GetMapping("/muscles")
	public List<Muscle> getAllMuscles(@Validated @RequestBody(required = false) Muscle muscle) {
		return muscleDao.getMuscles();
		
	}
	
	@PostMapping("/muscles")
	public Muscle createMuscle(@Validated @RequestBody(required = false) Muscle muscle) {
		return muscleDao.saveMuscle(muscle);
		
	}
	
	@GetMapping("/muscles/{id_muscle}")
	public ResponseEntity findMuscleById(@PathVariable(name = "id_muscle")Long id_muscle){
		if (id_muscle == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le muscle avec son ID");
		}
		
		Muscle muscle = muscleDao.getMuscleByID(id_muscle);
		
		if (muscle == null) {
			return ResponseEntity.notFound().build(); 
		}
		
		return ResponseEntity.ok().body(muscle); 
		
	}
	
	@PutMapping("/muscles/{id_muscle}")
	public ResponseEntity<Muscle> updateMuscle (@Validated @PathVariable(name = "id_muscle")Long id_muscle, @RequestBody(required = false) Muscle muscle) {
		if (muscle == null) {
			return ResponseEntity.notFound().build();
			
		}
		muscle.setId_muscle(id_muscle);
		muscleDao.updateMuscle(muscle);
		return ResponseEntity.ok().body(muscle);
	}
	
	@DeleteMapping("/muscles/{id_muscle}")
	public ResponseEntity<Muscle> deleteMuscle (@Validated @PathVariable(name = "id_muscle")Long id_muscle) {
		
		Muscle muscle = muscleDao.getMuscleByID(id_muscle);
		
		if (muscle == null) {
			return ResponseEntity.notFound().build();
		
	}
		muscleDao.deleteMuscle(muscle);
		return ResponseEntity.ok().body(muscle); 
	
	}
	

}
