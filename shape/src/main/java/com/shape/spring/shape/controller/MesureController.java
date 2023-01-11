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

import com.shape.spring.shape.dao.MesureDao;
import com.shape.spring.shape.domain.Mesure;


@RestController
@RequestMapping
@CrossOrigin("*")
public class MesureController {
	
	@Autowired
	MesureDao mesureDao;
	
	@GetMapping("/mesures")
	public List<Mesure> getAllMesures(@Validated @RequestBody(required = false) Mesure mesure) {
		return mesureDao.getMesures();
		
	}
	
	@PostMapping("/mesures")
	public Mesure createMesure(@Validated @RequestBody(required = false) Mesure mesure) {
		return mesureDao.saveMesure(mesure);
		
	}
	
	@GetMapping("/mesures/{id_mesure}")
	public ResponseEntity findMesureById(@PathVariable(name = "id_mesure")Long id_mesure){
		if (id_mesure == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas la mesure avec son ID");
		}
		
		Mesure mesure = mesureDao.getMesureByID(id_mesure);
		
		if (mesure == null) {
			return ResponseEntity.notFound().build(); 
		}
		
		return ResponseEntity.ok().body(mesure); 
		
	}
	
	@PutMapping("/mesures/{id_mesure}")
	public ResponseEntity<Mesure> updateMesure (@Validated @PathVariable(name = "id_mesure")Long id_mesure, @RequestBody(required = false) Mesure mesure) {
		if (mesure == null) {
			return ResponseEntity.notFound().build();
			
		}
		mesure.setId_mesure(id_mesure);
		mesureDao.updateMesure(mesure);
		return ResponseEntity.ok().body(mesure);
	}
	
	@DeleteMapping("/mesures/{id_mesure}")
	public ResponseEntity<Mesure> deleteMesure (@Validated @PathVariable(name = "id_mesure")Long id_mesure) {
		
		Mesure mesure = mesureDao.getMesureByID(id_mesure);
		
		if (mesure == null) {
			return ResponseEntity.notFound().build();
		
	}
		mesureDao.deleteMesure(mesure);
		return ResponseEntity.ok().body(mesure); 
	
	}
	

}
