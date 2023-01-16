package com.shape.spring.shape.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	//CONSTRUCTEUR
	
	public Mensuration() {
		super();
	}

	public Mensuration(Long id_mensuration, String mensuration_nom, String mensuration_unite) {
		super();
		this.id_mensuration = id_mensuration;
		this.mensuration_nom = mensuration_nom;
		this.mensuration_unite = mensuration_unite;
	}

	
	

	

	

	
	
	
	
	
	

}
