package com.shape.spring.shape.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ENTRAINEMENT")
public class Entrainement implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ENTRAINEMENT_ID")
	private Long id_entrainement;
	
	@Column(name = "ENTRAINEMENT_DATE")
	private LocalDate entrainement_date;
	@Column(name = "ENTRAINEMENT_NOM")
	private String entrainement_nom;
	
	// ASSOCIATION
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "Entrainement_Exercice", joinColumns = @JoinColumn(name = "id_entrainement"), inverseJoinColumns = @JoinColumn(name = "id_exercice"))
	private List<Exercice> exercices;
	
	//GETTER

	public Long getId_entrainement() {
		return id_entrainement;
	}

	public LocalDate getEntrainement_date() {
		return entrainement_date;
	}

	public String getEntrainement_nom() {
		return entrainement_nom;
	}

	public List<Exercice> getExercices() {
		return exercices;
	}
	
	//SETTER

	public void setId_entrainement(Long id_entrainement) {
		this.id_entrainement = id_entrainement;
	}

	public void setEntrainement_date(LocalDate entrainement_date) {
		this.entrainement_date = entrainement_date;
	}

	public void setEntrainement_nom(String entrainement_nom) {
		this.entrainement_nom = entrainement_nom;
	}

	public void setExercices(List<Exercice> exercices) {
		this.exercices = exercices;
	}
	
	// CONSTRUCTEUR

	public Entrainement() {
		super();
	}

	public Entrainement(Long id_entrainement, LocalDate entrainement_date, String entrainement_nom,
			List<Exercice> exercices) {
		super();
		this.id_entrainement = id_entrainement;
		this.entrainement_date = entrainement_date;
		this.entrainement_nom = entrainement_nom;
		this.exercices = exercices;
	}
	
	
	
	
	

}
