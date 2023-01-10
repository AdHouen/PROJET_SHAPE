package com.shape.spring.shape.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shape.spring.shape.domain.Utilisateur;
import com.shape.spring.shape.repository.IUtilisateurRepository;

@Service
public class UtilisateurDao {
	@Autowired
	IUtilisateurRepository utilisateurRepository;
	
	// Liste de Utilisateurs
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurRepository.findAll();
		
	}
	
	//Save un Utilisateur 
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
		
	}
	
	// get un Utilisateur by ID
	public Utilisateur getUtilisateurByID(Long id_utilisateur) {
		return utilisateurRepository.findById(id_utilisateur).get();
	}
	
	
	// Delete un Utilisateur 
	
	public void deleteUtilisateur(Utilisateur utilisateur) {
		utilisateurRepository.delete(utilisateur);
	
	}
	
	// Update un Utilisateur 
	
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
		
	}
	
 
}
