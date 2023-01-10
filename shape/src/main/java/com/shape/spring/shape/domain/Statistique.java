package com.shape.spring.shape.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="STATISTIQUE")
public class Statistique implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STATISTIQUE_ID")
	private Long id_statistique;
	
	@Column(name = "STATISTIQUE_DATE") 
	private LocalDate statistique_date;
	@Column(name = "STATISTIQUE_VALEUR")
	private float statistique_valeur;
	@Column(name = "STATISTIQUE_UNITE")
	private float statistique_unite;
	
	//ASSOCAITION
	
	@ManyToMany (fetch = FetchType.LAZY, mappedBy = "produitAppros")
	private List<Mensuration> mensurations = new ArrayList<>();

	public Long getId_statistique() {
		return id_statistique;
	}
	
	//GETTER
	
	public LocalDate getStatistique_date() {
		return statistique_date;
	}

	public float getStatistique_valeur() {
		return statistique_valeur;
	}

	public float getStatistique_unite() {
		return statistique_unite;
	}

	public List<Mensuration> getMensurations() {
		return mensurations;
	}
	
	//SETTER
	
	public void setId_statistique(Long id_statistique) {
		this.id_statistique = id_statistique;
	}

	public void setStatistique_date(LocalDate statistique_date) {
		this.statistique_date = statistique_date;
	}

	public void setStatistique_valeur(float statistique_valeur) {
		this.statistique_valeur = statistique_valeur;
	}

	public void setStatistique_unite(float statistique_unite) {
		this.statistique_unite = statistique_unite;
	}

	public void setMensurations(List<Mensuration> mensurations) {
		this.mensurations = mensurations;
	}
		
	//CONSTRUCTEUR
	
	public Statistique() {
		super();
	}

	public Statistique(Long id_statistique, LocalDate statistique_date, float statistique_valeur,
			float statistique_unite, List<Mensuration> mensurations) {
		super();
		this.id_statistique = id_statistique;
		this.statistique_date = statistique_date;
		this.statistique_valeur = statistique_valeur;
		this.statistique_unite = statistique_unite;
		this.mensurations = mensurations;
	}
	
	
	
	
	
	
	
	

}
