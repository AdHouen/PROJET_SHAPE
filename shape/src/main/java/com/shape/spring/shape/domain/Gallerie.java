package com.shape.spring.shape.domain;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="GALLERIE")
public class Gallerie implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GALLERIE_ID")
	private Long id_gallerie;
	
	@Column(name = "GALLERIE_PHOTO")
	private String gallerie_photo;
	@Column(name = "GALLERIE_DATE")
	private LocalDate gallerie_date;
	
	//ASSOCIATION
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;

	//GETTER
	
	public Long getId_gallerie() {
		return id_gallerie;
	}
	public String getGallerie_photo() {
		return gallerie_photo;
	}
	public LocalDate getGallerie_date() {
		return gallerie_date;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	//SETTER
	
	public void setId_gallerie(Long id_gallerie) {
		this.id_gallerie = id_gallerie;
	}
	public void setGallerie_photo(String gallerie_photo) {
		this.gallerie_photo = gallerie_photo;
	}
	public void setGallerie_date(LocalDate gallerie_date) {
		this.gallerie_date = gallerie_date;
	}
	
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	//CONSTRUCTEUR
	
	public Gallerie() {
		super();
	}
	public Gallerie(Long id_gallerie, String gallerie_photo, LocalDate gallerie_date, Utilisateur utilisateur) {
		super();
		this.id_gallerie = id_gallerie;
		this.gallerie_photo = gallerie_photo;
		this.gallerie_date = gallerie_date;
		this.utilisateur = utilisateur;
	}
	
	
	

}
