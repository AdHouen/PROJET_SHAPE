package com.shape.spring.shape.domain;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ABONNEMENT")
public class Abonnement implements Serializable {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ABONNEMENT_ID")
	private Long id_abonnement;
	@Column(name = "ABONNEMENT_TYPE")
	private String abonnement_type;
	
	//ASSOCIATION
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	
	// GETTER
	
	public Long getId_abonnement() {
		return id_abonnement;
	}
	public String getAbonnement_type() {
		return abonnement_type;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	// SETTER
	
	public void setId_abonnement(Long id_abonnement) {
		this.id_abonnement = id_abonnement;
	}
	public void setAbonnement_type(String abonnement_type) {
		this.abonnement_type = abonnement_type;
	}
	
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	// CONSTRUCTEUR
	
	public Abonnement() {
		super();
	}
	public Abonnement(Long id_abonnement, String abonnement_type, Utilisateur utilisateur) {
		super();
		this.id_abonnement = id_abonnement;
		this.abonnement_type = abonnement_type;
		this.utilisateur = utilisateur;
	}
	
	
	
	
	
	

}
