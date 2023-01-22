package com.shape.spring.shape.domain;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UTILISATEUR")
public class Utilisateur  implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UTILISATEUR_ID")
	private Long id_utilisateur;
	
	@Column(name = "UTILISATEUR_NOM")
	private String utilisateur_nom;
	@Column(name = "UTILISATEUR_PRENOM")
	private String utilisateur_prenom;
	@Column(name = "UTILISATEUR_PSEUDO")
	private String utilisateur_pseudo;
	@Column(name = "UTILISATEUR_EMAIL")
	private String utilisateur_email;
	@Column(name = "UTILISATEUR_DATEDENAISSANCE")
	private LocalDate utilisateur_dateDeNaissance;
	@Column(name = "UTILISATEUR_PASSWORD")
	private String utilisateur_password;
	@Column(name = "Utilisateur_PHOTO")
	private String utilisateur_photo;
	@Column(name = "UTILISATEUR_GENRE")
	private String utilisateur_genre;
	@Column(name = "UTILISATEUR_DATESOUSCRIPTION_FIN")
	private LocalDate utilisateur_dateSouscriptionFin;
	
	
	
	
	//GETTER
	
	public Long getId_utilisateur() {
		return id_utilisateur;
	}

	public String getUtilisateur_nom() {
		return utilisateur_nom;
	}

	public String getUtilisateur_prenom() {
		return utilisateur_prenom;
	}

	public String getUtilisateur_pseudo() {
		return utilisateur_pseudo;
	}

	public String getUtilisateur_email() {
		return utilisateur_email;
	}

	public LocalDate getUtilisateur_dateDeNaissance() {
		return utilisateur_dateDeNaissance;
	}

	public String getUtilisateur_password() {
		return utilisateur_password;
	}

	public String getUtilisateur_photo() {
		return utilisateur_photo;
	}
	
	public String getUtilisateur_genre() {
		return utilisateur_genre;
	}

	public LocalDate getUtilisateur_dateSouscriptionFin() {
		return utilisateur_dateSouscriptionFin;
	}

	
	
	// SETTER
	
	public void setId_utilisateur(Long id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}

	public void setUtilisateur_nom(String utilisateur_nom) {
		this.utilisateur_nom = utilisateur_nom;
	}

	public void setUtilisateur_prenom(String utilisateur_prenom) {
		this.utilisateur_prenom = utilisateur_prenom;
	}

	public void setUtilisateur_pseudo(String utilisateur_pseudo) {
		this.utilisateur_pseudo = utilisateur_pseudo;
	}

	public void setUtilisateur_email(String utilisateur_email) {
		this.utilisateur_email = utilisateur_email;
	}

	public void setUtilisateur_dateDeNaissance(LocalDate utilisateur_dateDeNaissance) {
		this.utilisateur_dateDeNaissance = utilisateur_dateDeNaissance;
	}

	public void setUtilisateur_password(String utilisateur_password) {
		this.utilisateur_password = utilisateur_password;
	}

	public void setUtilisateur_photo(String utilisateur_photo) {
		this.utilisateur_photo = utilisateur_photo;
	}
	
	public void setUtilisateur_genre(String utilisateur_genre) {
		this.utilisateur_genre = utilisateur_genre;
	}

	public void setUtilisateur_dateSouscriptionFin(LocalDate utilisateur_dateSouscriptionFin) {
		this.utilisateur_dateSouscriptionFin = utilisateur_dateSouscriptionFin;
	}

	
	
	// CONSTRUCTEUR
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(Long id_utilisateur, String utilisateur_nom, String utilisateur_prenom,
			String utilisateur_pseudo, String utilisateur_email, LocalDate utilisateur_dateDeNaissance,
			String utilisateur_password, String utilisateur_photo, String utilisateur_genre,
			LocalDate utilisateur_dateSouscriptionFin) {
		super();
		this.id_utilisateur = id_utilisateur;
		this.utilisateur_nom = utilisateur_nom;
		this.utilisateur_prenom = utilisateur_prenom;
		this.utilisateur_pseudo = utilisateur_pseudo;
		this.utilisateur_email = utilisateur_email;
		this.utilisateur_dateDeNaissance = utilisateur_dateDeNaissance;
		this.utilisateur_password = utilisateur_password;
		this.utilisateur_photo = utilisateur_photo;
		this.utilisateur_genre = utilisateur_genre;
		this.utilisateur_dateSouscriptionFin = utilisateur_dateSouscriptionFin;
	}

	

	

	

	
	
	
	
	

	

	

	

	

	

	
	
	
	
	
	

}
