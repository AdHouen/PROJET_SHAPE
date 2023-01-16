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

import com.shape.spring.shape.dao.ExercicePersoDao;
import com.shape.spring.shape.domain.ExercicePerso;


@RestController
@RequestMapping
@CrossOrigin("*")
public class ExercicePersoController {
	
	@Autowired
	ExercicePersoDao exercicePersoDao;
	
	@GetMapping("/exercicePersos")
	public List<ExercicePerso> getAllExercicePersos(@Validated @RequestBody(required = false) ExercicePerso exercicePerso) {
		return exercicePersoDao.getExercicePersos();
		
	}
	
	@PostMapping("/exercicePersos")
	public ExercicePerso createExercicePerso(@Validated @RequestBody(required = false) ExercicePerso exercicePerso) {
		return exercicePersoDao.saveExercicePerso(exercicePerso);
		
	}
	
	@GetMapping("/exercicePersos/{id_exercice_perso}")
	public ResponseEntity findExercicePersoById(@PathVariable(name = "id_exercice_perso")Long id_exercice_perso){
		if (id_exercice_perso == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas l'exercicePerso avec son ID");
		}
		
		ExercicePerso exercicePerso = exercicePersoDao.getExercicePersoByID(id_exercice_perso);
		
		if (exercicePerso == null) {
			return ResponseEntity.notFound().build(); 
		}
		
		return ResponseEntity.ok().body(exercicePerso); 
		
	}
	
	@PutMapping("/exercicePersos/{id_exercicePerso}")
	public ResponseEntity<ExercicePerso> updateExercicePerso (@Validated @PathVariable(name = "id_exercice_perso")Long id_exercice_perso, @RequestBody(required = false) ExercicePerso exercicePerso) {
		if (exercicePerso == null) {
			return ResponseEntity.notFound().build();
			
		}
		exercicePerso.setId_exercice_perso(id_exercice_perso);
		exercicePersoDao.updateExercicePerso(exercicePerso);
		return ResponseEntity.ok().body(exercicePerso);
	}
	
	@DeleteMapping("/exercicePersos/{id_exercicePerso}")
	public ResponseEntity<ExercicePerso> deleteExercicePerso (@Validated @PathVariable(name = "id_exercicePerso")Long id_exercice_perso) {
		
		ExercicePerso exercicePerso = exercicePersoDao.getExercicePersoByID(id_exercice_perso);
		
		if (exercicePerso == null) {
			return ResponseEntity.notFound().build();
		
	}
		exercicePersoDao.deleteExercicePerso(exercicePerso);
		return ResponseEntity.ok().body(exercicePerso); 
	
	}
	

}
