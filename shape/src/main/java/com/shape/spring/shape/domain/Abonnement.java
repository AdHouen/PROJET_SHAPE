package com.shape.spring.shape.domain;

import java.io.Serializable;
import java.time.LocalDate;

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
	private Long abonnement_id;
	@Column(name = "ABONNEMENT_TYPE")
	private String abonnement_type;
	@Column(name = "ABONNEMENT_dateSouscription")
	private LocalDate abonnement_dateSouscription;
	@Column(name = "ABONNEMENT_DUREE")
	private Long abonnement_duree;
	
	//ASSOCIATION
		//Avec Utilisateur
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_utilisateur")
	private Long utilisateur_id;


	
	// GETTER
	
	public Long getAbonnement_id() {
		return abonnement_id;
	}

	public String getAbonnement_type() {
		return abonnement_type;
	}

	public LocalDate getAbonnement_dateSouscription() {
		return abonnement_dateSouscription;
	}

	public Long getAbonnement_duree() {
		return abonnement_duree;
	}

	public Long getUtilisateur_id() {
		return utilisateur_id;
	}
	
	
	// SETTER
	
	public void setAbonnement_id(Long abonnement_id) {
		this.abonnement_id = abonnement_id;
	}

	public void setAbonnement_type(String abonnement_type) {
		this.abonnement_type = abonnement_type;
	}

	public void setAbonnement_dateSouscription(LocalDate abonnement_dateSouscription) {
		this.abonnement_dateSouscription = abonnement_dateSouscription;
	}

	public void setAbonnement_duree(Long abonnement_duree) {
		this.abonnement_duree = abonnement_duree;
	}

	public void setUtilisateur_id(Long utilisateur_id) {
		this.utilisateur_id = utilisateur_id;
	}
	
	
	
	
	// CONSTRUCTEUR
	
	public Abonnement() {
		super();
	}

	public Abonnement(Long abonnement_id, String abonnement_type, LocalDate abonnement_dateSouscription,
			Long abonnement_duree, Long utilisateur_id) {
		super();
		this.abonnement_id = abonnement_id;
		this.abonnement_type = abonnement_type;
		this.abonnement_dateSouscription = abonnement_dateSouscription;
		this.abonnement_duree = abonnement_duree;
		this.utilisateur_id = utilisateur_id;
	}
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	

}
