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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="MESURE")
public class Mesure implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MESURE_ID")
	private Long id_mesure;
	
	@Column(name = "MESURE_DATE")
	private LocalDate mesure_date;
	@Column(name = "MESURE_VALEUR")
	private float mesure_valeur;
	
	// ASSOCIATION
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_mensuration")
	private Mensuration mensuration;
	
	//GETTER

	public Long getId_mesure() {
		return id_mesure;
	}

	public LocalDate getMesure_date() {
		return mesure_date;
	}

	public float getMesure_valeur() {
		return mesure_valeur;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	public Mensuration getMensuration() {
		return mensuration;
	}
			
	//SETTER
	
	public void setId_mesure(Long id_mesure) {
		this.id_mesure = id_mesure;
	}

	public void setMesure_date(LocalDate mesure_date) {
		this.mesure_date = mesure_date;
	}

	public void setMesure_valeur(float mesure_valeur) {
		this.mesure_valeur = mesure_valeur;
	}
	
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public void setMensuration(Mensuration mensuration) {
		this.mensuration = mensuration;
	}
	
	//CONSTRUCTEUR
	
	public Mesure() {
		super();
	}

	public Mesure(Long id_mesure, LocalDate mesure_date, float mesure_valeur, Utilisateur utilisateur,
			Mensuration mensuration) {
		super();
		this.id_mesure = id_mesure;
		this.mesure_date = mesure_date;
		this.mesure_valeur = mesure_valeur;
		this.utilisateur = utilisateur;
		this.mensuration = mensuration;
	}

	

	

	
	
	

	

	

	
	

}
