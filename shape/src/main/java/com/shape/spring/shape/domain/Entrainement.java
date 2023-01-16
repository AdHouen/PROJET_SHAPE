package com.shape.spring.shape.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ENTRAINEMENT")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_entrainement")
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
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_programme")
	private Programme programme;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "entrainement_exercice", joinColumns = @JoinColumn(name = "id_entrainement"), inverseJoinColumns = @JoinColumn(name = "id_exercice"))
	private List<Exercice> exercices;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "entrainement_exercice_perso", joinColumns = @JoinColumn(name = "id_entrainement"), inverseJoinColumns = @JoinColumn(name = "id_exercice_perso"))
	private List<ExercicePerso> exercicePersos;
	
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
	
	public List<ExercicePerso> getExercicePersos() {
		return exercicePersos;
	}
	
	public Programme getProgramme() {
		return programme;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
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
	
	public void setExercicePersos(List<ExercicePerso> exercicePersos) {
		this.exercicePersos = exercicePersos;
	}
	
	public void setProgramme(Programme programme) {
		this.programme = programme;
	}
	
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	// CONSTRUCTEUR

	public Entrainement() {
		super();
	}

	public Entrainement(Long id_entrainement, LocalDate entrainement_date, String entrainement_nom,
			Utilisateur utilisateur, Programme programme, List<Exercice> exercices,
			List<ExercicePerso> exercicePersos) {
		super();
		this.id_entrainement = id_entrainement;
		this.entrainement_date = entrainement_date;
		this.entrainement_nom = entrainement_nom;
		this.utilisateur = utilisateur;
		this.programme = programme;
		this.exercices = exercices;
		this.exercicePersos = exercicePersos;
	}

	

	
	

	

	

	

	

	

	

	
	
	
	
	

}
