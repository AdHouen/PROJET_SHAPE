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

import com.shape.spring.shape.dao.ProgrammeDao;
import com.shape.spring.shape.domain.Programme;

@RestController
@RequestMapping
@CrossOrigin("*")
public class ProgrammeController {
	
	@Autowired
	ProgrammeDao programmeDao;
	
	@GetMapping("/programmes")
	public List<Programme> getAllProgrammes(@Validated @RequestBody(required = false) Programme programme) {
		return programmeDao.getProgrammes();
		
	}
	
	@PostMapping("/programmes")
	public Programme createProgramme(@Validated @RequestBody(required = false) Programme programme) {
		return programmeDao.saveProgramme(programme);
		
	}
	
	@GetMapping("/programmes/{id_programme}")
	public ResponseEntity findProgrammeById(@PathVariable(name = "id_programme")Long id_programme){
		if (id_programme == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le programme avec son ID");
		}
		
		Programme programme = programmeDao.getProgrammeByID(id_programme);
		
		if (programme == null) {
			return ResponseEntity.notFound().build(); 
		}
		
		return ResponseEntity.ok().body(programme); 
		
	}
	
	@PutMapping("/programmes/{id_programme}")
	public ResponseEntity<Programme> updateProgramme (@Validated @PathVariable(name = "id_programme")Long id_programme, @RequestBody(required = false) Programme programme) {
		if (programme == null) {
			return ResponseEntity.notFound().build();
			
		}
		programme.setId_programme(id_programme);
		programmeDao.updateProgramme(programme);
		return ResponseEntity.ok().body(programme);
	}
	
	@DeleteMapping("/programmes/{id_programme}")
	public ResponseEntity<Programme> deleteProgramme (@Validated @PathVariable(name = "id_programme")Long id_programme) {
		
		Programme programme = programmeDao.getProgrammeByID(id_programme);
		
		if (programme == null) {
			return ResponseEntity.notFound().build();
		
	}
		programmeDao.deleteProgramme(programme);
		return ResponseEntity.ok().body(programme); 
	
	}
	

}
