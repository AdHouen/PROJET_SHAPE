package com.shape.spring.shape.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name="EXERCICE")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_exercice")
public class Exercice implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EXERCICE_ID")
	private Long id_exercice;
	
	@Column(name = "EXERCICE_NOM")
	private String exercice_nom;
	@Column(name = "EXERCICE_DESCRIPTION")
	private String exercice_description;
	@Column(name = "EXERCICE_PHOTO")
	private String exercice_photo;
	
	// ASSOCIATION
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "exercices")
	private List<Entrainement> entrainements = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="id_muscle")
	private Muscle muscle;
	
	//GETTER
	
	public Long getId_exercice() {
		return id_exercice;
	}

	public String getExercice_nom() {
		return exercice_nom;
	}

	public String getExercice_description() {
		return exercice_description;
	}

	public String getExercice_photo() {
		return exercice_photo;
	}

	public List<Entrainement> getEntrainements() {
		return entrainements;
	}

	public Muscle getMuscle() {
		return muscle;
	}

	//SETTER
	
	public void setId_exercice(Long id_exercice) {
		this.id_exercice = id_exercice;
	}

	public void setExercice_nom(String exercice_nom) {
		this.exercice_nom = exercice_nom;
	}

	public void setExercice_description(String exercice_description) {
		this.exercice_description = exercice_description;
	}

	public void setExercice_photo(String exercice_photo) {
		this.exercice_photo = exercice_photo;
	}

	public void setEntrainements(List<Entrainement> entrainements) {
		this.entrainements = entrainements;
	}

	public void setMuscle(Muscle muscle) {
		this.muscle = muscle;
	}

	//CONSTRUTEUR

	public Exercice() {
		super();
	}

	public Exercice(Long id_exercice, String exercice_nom, String exercice_description, String exercice_photo,
			List<Entrainement> entrainements, Muscle muscle) {
		super();
		this.id_exercice = id_exercice;
		this.exercice_nom = exercice_nom;
		this.exercice_description = exercice_description;
		this.exercice_photo = exercice_photo;
		this.entrainements = entrainements;
		this.muscle = muscle;
	}
	
	

	
	
	
	

}
