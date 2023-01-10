package com.shape.spring.shape.domain;

import java.io.Serializable;
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
@Table(name="MENSURATION")
public class Mensuration implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MENSURATION_ID")
	private Long id_mensuration;
	
	@Column(name = "MENSURATION_NOM") 
	private String mensuration_nom;
	@Column(name = "MENSURATION_UNITE")
	private String mensuration_unite;
	
	//ASSOCIATION
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "Mensuration_Statistique", joinColumns = @JoinColumn(name = "id_mensuration"), inverseJoinColumns = @JoinColumn(name ="id_statistique"))
	private List<Statistique> statistiques;
	
	//GETTER 
	
	public Long getId_mensuration() {
		return id_mensuration;
	}

	public String getMensuration_nom() {
		return mensuration_nom;
	}

	public String getMensuration_unite() {
		return mensuration_unite;
	}

	public List<Statistique> getStatistiques() {
		return statistiques;
	}
	
	//SETTER
	
	public void setId_mensuration(Long id_mensuration) {
		this.id_mensuration = id_mensuration;
	}

	public void setMensuration_nom(String mensuration_nom) {
		this.mensuration_nom = mensuration_nom;
	}

	public void setMensuration_unite(String mensuration_unite) {
		this.mensuration_unite = mensuration_unite;
	}

	public void setStatistiques(List<Statistique> statistiques) {
		this.statistiques = statistiques;
	}
	
	//CONSTRUCTEUR
	
	public Mensuration() {
		super();
	}

	public Mensuration(Long id_mensuration, String mensuration_nom, String mensuration_unite,
			List<Statistique> statistiques) {
		super();
		this.id_mensuration = id_mensuration;
		this.mensuration_nom = mensuration_nom;
		this.mensuration_unite = mensuration_unite;
		this.statistiques = statistiques;
	}
	
	
	
	
	

}
