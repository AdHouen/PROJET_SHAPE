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
	private Integer programme_poids;
	@Column(name = "PROGRAMME_SERIES")
	private Integer programme_series;
	@Column(name = "PROGRAMME_REPETITIONS")
	private Integer programme_repetitions;
	@Column(name = "PROGRAMME_PAUSE")
	private Integer programme_pause;
	@Column(name = "PROGRAMME_TEMPS_SECONDES")
	private Integer programme_tempsSecondes;
	@Column(name = "PROGRAMME_DISTANCE")
	private Integer programme_distance;
	
	//GETTER
	
	public Long getId_programme() {
		return id_programme;
	}

	public Integer getProgramme_poids() {
		return programme_poids;
	}

	public Integer getProgramme_series() {
		return programme_series;
	}

	public Integer getProgramme_repetitions() {
		return programme_repetitions;
	}

	public Integer getProgramme_pause() {
		return programme_pause;
	}

	public Integer getProgramme_tempsSecondes() {
		return programme_tempsSecondes;
	}

	public Integer getProgramme_distance() {
		return programme_distance;
	}
		
	//SETTER
	
	public void setId_programme(Long id_programme) {
		this.id_programme = id_programme;
	}

	public void setProgramme_poids(Integer programme_poids) {
		this.programme_poids = programme_poids;
	}

	public void setProgramme_series(Integer programme_series) {
		this.programme_series = programme_series;
	}

	public void setProgramme_repetitions(Integer programme_repetitions) {
		this.programme_repetitions = programme_repetitions;
	}

	public void setProgramme_pause(Integer programme_pause) {
		this.programme_pause = programme_pause;
	}

	public void setProgramme_tempsSecondes(Integer programme_tempsSecondes) {
		this.programme_tempsSecondes = programme_tempsSecondes;
	}

	public void setProgramme_distance(Integer programme_distance) {
		this.programme_distance = programme_distance;
	}
		
	//CONSTRUCTEUR
	
	public Programme() {
		super();
	}

	public Programme(Long id_programme, Integer programme_poids, Integer programme_series,
			Integer programme_repetitions, Integer programme_pause, Integer programme_tempsSecondes,
			Integer programme_distance) {
		super();
		this.id_programme = id_programme;
		this.programme_poids = programme_poids;
		this.programme_series = programme_series;
		this.programme_repetitions = programme_repetitions;
		this.programme_pause = programme_pause;
		this.programme_tempsSecondes = programme_tempsSecondes;
		this.programme_distance = programme_distance;
	}

	

	
	
	
	
	
	
}