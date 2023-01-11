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

import com.shape.spring.shape.dao.GallerieDao;
import com.shape.spring.shape.domain.Gallerie;


@RestController
@RequestMapping
@CrossOrigin("*")
public class GallerieController {
	
	@Autowired
	GallerieDao gallerieDao;
	
	@GetMapping("/galleries") 
	public List<Gallerie> getAllGalleries(@Validated @RequestBody(required = false) Gallerie gallerie) {
		return gallerieDao.getGalleries();
		
	}
	
	@PostMapping("/galleries")
	public Gallerie createGallerie(@Validated @RequestBody(required = false) Gallerie gallerie) {
		return gallerieDao.saveGallerie(gallerie);
		
	}
	
	@GetMapping("/galleries/{id_gallerie}")
	public ResponseEntity findGallerieById(@PathVariable(name = "id_gallerie")Long id_gallerie){
		if (id_gallerie == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas la gallerie avec son ID");
		}
		
		Gallerie gallerie = gallerieDao.getGallerieByID(id_gallerie);
		
		if (gallerie == null) {
			return ResponseEntity.notFound().build(); 
		}
		
		return ResponseEntity.ok().body(gallerie); 
		
	}
	
	@PutMapping("/galleries/{id_gallerie}")
	public ResponseEntity<Gallerie> updateGallerie (@Validated @PathVariable(name = "id_gallerie")Long id_gallerie, @RequestBody(required = false) Gallerie gallerie) {
		if (gallerie == null) {
			return ResponseEntity.notFound().build();
			
		}
		gallerie.setId_gallerie(id_gallerie);
		gallerieDao.updateGallerie(gallerie);
		return ResponseEntity.ok().body(gallerie);
	}
	
	@DeleteMapping("/galleries/{id_gallerie}")
	public ResponseEntity<Gallerie> deleteGallerie (@Validated @PathVariable(name = "id_gallerie")Long id_gallerie) {
		
		Gallerie gallerie = gallerieDao.getGallerieByID(id_gallerie);
		
		if (gallerie == null) {
			return ResponseEntity.notFound().build();
		
	}
		gallerieDao.deleteGallerie(gallerie);
		return ResponseEntity.ok().body(gallerie); 
	
	}
	

}
