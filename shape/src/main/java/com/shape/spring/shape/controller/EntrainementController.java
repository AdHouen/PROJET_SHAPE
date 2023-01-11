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

import com.shape.spring.shape.dao.EntrainementDao;
import com.shape.spring.shape.domain.Entrainement;

@RestController
@RequestMapping
@CrossOrigin("*")
public class EntrainementController {
	
	@Autowired
	EntrainementDao entrainementDao;
	
	@GetMapping("/entrainements")
	public List<Entrainement> getAllEntrainements(@Validated @RequestBody(required = false) Entrainement entrainement) {
		return entrainementDao.getEntrainements();
		
	}
	
	@PostMapping("/entrainements")
	public Entrainement createEntrainement(@Validated @RequestBody(required = false) Entrainement entrainement) {
		return entrainementDao.saveEntrainement(entrainement);
		
	}
	
	@GetMapping("/entrainements/{id_entrainement}")
	public ResponseEntity findEntrainementById(@PathVariable(name = "id_entrainement")Long id_entrainement){
		if (id_entrainement == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas l'entrainement avec son ID");
		}
		
		Entrainement entrainement = entrainementDao.getEntrainementByID(id_entrainement);
		
		if (entrainement == null) {
			return ResponseEntity.notFound().build(); 
		}
		
		return ResponseEntity.ok().body(entrainement); 
		
	}
	
	@PutMapping("/entrainements/{id_entrainement}")
	public ResponseEntity<Entrainement> updateEntrainement (@Validated @PathVariable(name = "id_entrainement")Long id_entrainement, @RequestBody(required = false) Entrainement entrainement) {
		if (entrainement == null) {
			return ResponseEntity.notFound().build();
			
		}
		entrainement.setId_entrainement(id_entrainement);
		entrainementDao.updateEntrainement(entrainement);
		return ResponseEntity.ok().body(entrainement);
	}
	
	@DeleteMapping("/entrainements/{id_entrainement}")
	public ResponseEntity<Entrainement> deleteEntrainement (@Validated @PathVariable(name = "id_entrainement")Long id_entrainement) {
		
		Entrainement entrainement = entrainementDao.getEntrainementByID(id_entrainement);
		
		if (entrainement == null) {
			return ResponseEntity.notFound().build();
		
	}
		entrainementDao.deleteEntrainement(entrainement);
		return ResponseEntity.ok().body(entrainement); 
	
	}
	

}
