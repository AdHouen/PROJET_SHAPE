package com.shape.spring.shape.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="EXERCICEPERSO")
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_exercice_perso")
public class ExercicePerso implements Serializable {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EXERCICE_PERSO_ID")
	private Long id_exercice_perso;
	
	@Column(name = "EXERCICEPERSO_NOM")
	private String exercicePerso_nom;
	
	// ASSOCIATION
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "exercicePersos")
	private List<Entrainement> entrainements = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	//GETTER
	
	

	public String getExercicePerso_nom() {
		return exercicePerso_nom;
	}

	public Long getId_exercice_perso() {
		return id_exercice_perso;
	}

	

	public List<Entrainement> getEntrainements() {
		return entrainements;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	//SETTER
	
	

	public void setExercicePerso_nom(String exercicePerso_nom) {
		this.exercicePerso_nom = exercicePerso_nom;
	}

	public void setEntrainements(List<Entrainement> entrainements) {
		this.entrainements = entrainements;
	}
	
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public void setId_exercice_perso(Long id_exercice_perso) {
		this.id_exercice_perso = id_exercice_perso;
	}

	//CONSTRUCTEUR
	
	public ExercicePerso() {
		super();
	}

	public ExercicePerso(Long id_exercice_perso, String exercicePerso_nom, List<Entrainement> entrainements,
			Utilisateur utilisateur) {
		super();
		this.id_exercice_perso = id_exercice_perso;
		this.exercicePerso_nom = exercicePerso_nom;
		this.entrainements = entrainements;
		this.utilisateur = utilisateur;
	}

	

	

	

	
	

}
