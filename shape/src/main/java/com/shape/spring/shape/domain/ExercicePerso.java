package com.shape.spring.shape.domain;

import java.io.Serializable;
import java.util.ArrayList;
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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="EXERCICEPERSO")
public class ExercicePerso implements Serializable {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EXERCICEPERSO_ID")
	private Long id_exercicePerso;
	
	@Column(name = "EXERCICEPERSO_NOM")
	private String exercicePerso_nom;
	
	// ASSOCIATION
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "Entrainement_ExercicePerso", joinColumns = @JoinColumn(name = "id_exercicePerso"), inverseJoinColumns = @JoinColumn(name = "id_entrainement"))
	private List<Entrainement> entrainements = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	
	//GETTER
	
	public Long getId_exercicePerso() {
		return id_exercicePerso;
	}

	public String getExercicePerso_nom() {
		return exercicePerso_nom;
	}

	public List<Entrainement> getEntrainements() {
		return entrainements;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	//SETTER
	
	public void setId_exercicePerso(Long id_exercicePerso) {
		this.id_exercicePerso = id_exercicePerso;
	}

	public void setExercicePerso_nom(String exercicePerso_nom) {
		this.exercicePerso_nom = exercicePerso_nom;
	}

	public void setEntrainements(List<Entrainement> entrainements) {
		this.entrainements = entrainements;
	}
	
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	//CONSTRUCTEUR
	
	public ExercicePerso() {
		super();
	}

	public ExercicePerso(Long id_exercicePerso, String exercicePerso_nom, List<Entrainement> entrainements,
			Utilisateur utilisateur) {
		super();
		this.id_exercicePerso = id_exercicePerso;
		this.exercicePerso_nom = exercicePerso_nom;
		this.entrainements = entrainements;
		this.utilisateur = utilisateur;
	}
	

}
