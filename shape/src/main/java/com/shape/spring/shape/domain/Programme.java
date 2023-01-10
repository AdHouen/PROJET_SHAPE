package com.shape.spring.shape.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="PROGRAMME")
public class Programme implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROGRAMME_ID")
	private Long id_programme;
	
	@Column(name = "PROGRAMME_POIDS")
	private int programme_poids;
	@Column(name = "\"PROGRAMME_SERIES")
	private int programme_series;
	@Column(name = "\"PROGRAMME_REPETITIONS")
	private int programme_repetitions;
	@Column(name = "\"PROGRAMME_PAUSE")
	private int programme_pause;
	@Column(name = "\"PROGRAMME_TEMPS_MINUTES")
	private int programme_tempsMinutes;
	@Column(name = "\"PROGRAMME_TEMPS_SECONDES")
	private int programme_tempsSecondes;
	@Column(name = "\"PROGRAMME_DISTANCE")
	private int programme_distance;
	
	//GETTER
	
	public Long getId_programme() {
		return id_programme;
	}
	public int getProgramme_poids() {
		return programme_poids;
	}
	public int getProgramme_series() {
		return programme_series;
	}
	public int getProgramme_repetitions() {
		return programme_repetitions;
	}
	public int getProgramme_pause() {
		return programme_pause;
	}
	public int getProgramme_tempsMinutes() {
		return programme_tempsMinutes;
	}
	public int getProgramme_tempsSecondes() {
		return programme_tempsSecondes;
	}
	public int getProgramme_distance() {
		return programme_distance;
	}
	
	//SETTER
	
	public void setId_programme(Long id_programme) {
		this.id_programme = id_programme;
	}
	public void setProgramme_poids(int programme_poids) {
		this.programme_poids = programme_poids;
	}
	public void setProgramme_series(int programme_series) {
		this.programme_series = programme_series;
	}
	public void setProgramme_repetitions(int programme_repetitions) {
		this.programme_repetitions = programme_repetitions;
	}
	public void setProgramme_pause(int programme_pause) {
		this.programme_pause = programme_pause;
	}
	public void setProgramme_tempsMinutes(int programme_tempsMinutes) {
		this.programme_tempsMinutes = programme_tempsMinutes;
	}
	public void setProgramme_tempsSecondes(int programme_tempsSecondes) {
		this.programme_tempsSecondes = programme_tempsSecondes;
	}
	public void setProgramme_distance(int programme_distance) {
		this.programme_distance = programme_distance;
	}
		
	//CONSTRUCTEUR
	
	public Programme() {
		super();
	}
	public Programme(Long id_programme, int programme_poids, int programme_series, int programme_repetitions,
			int programme_pause, int programme_tempsMinutes, int programme_tempsSecondes, int programme_distance) {
		super();
		this.id_programme = id_programme;
		this.programme_poids = programme_poids;
		this.programme_series = programme_series;
		this.programme_repetitions = programme_repetitions;
		this.programme_pause = programme_pause;
		this.programme_tempsMinutes = programme_tempsMinutes;
		this.programme_tempsSecondes = programme_tempsSecondes;
		this.programme_distance = programme_distance;
	}
	
	
	
}