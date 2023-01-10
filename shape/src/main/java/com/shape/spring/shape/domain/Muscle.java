package com.shape.spring.shape.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="MUSCLE")
public class Muscle implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MUSCLE_ID")
	private Long id_muscle;
	
	@Column(name = "MUSCLE_NOM")
	private String muscle_nom;
	@Column(name = "MUSCLE_IMAGE")
	private String  muscle_image;
	
	//GETTER
	
	public Long getId_muscle() {
		return id_muscle;
	}
	public String getMuscle_nom() {
		return muscle_nom;
	}
	public String getMuscle_image() {
		return muscle_image;
	}
	
	//SETTER
	
	public void setId_muscle(Long id_muscle) {
		this.id_muscle = id_muscle;
	}
	public void setMuscle_nom(String muscle_nom) {
		this.muscle_nom = muscle_nom;
	}
	public void setMuscle_image(String muscle_image) {
		this.muscle_image = muscle_image;
	}
		
	//CONSTRUCTEUR
	
	public Muscle() {
		super();
	}
	public Muscle(Long id_muscle, String muscle_nom, String muscle_image) {
		super();
		this.id_muscle = id_muscle;
		this.muscle_nom = muscle_nom;
		this.muscle_image = muscle_image;
	}
	
	
	

}
