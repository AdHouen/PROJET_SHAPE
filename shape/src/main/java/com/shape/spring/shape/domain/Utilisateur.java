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
	
	@Column(name = "NOM_UTILISATEUR")
	private String utilisateur_nom;
	@Column(name = "PRENOM_UTILISATEUR")
	private String utilisateur_prenom;
	@Column(name = "PSEUDO_UTILISATEUR")
	private String utilisateur_pseudo;
	@Column(name = "EMAIL_UTILISATEUR")
	private String utilisateur_email;
	@Column(name = "DATEDENAISSANCE_UTILISATEUR")
	private LocalDate utilisateur_dateDeNaissance;
	@Column(name = "PASSWORD_UTILISATEUR")
	private String utilisateur_password;
	@Column(name = "PHOTO_Utilisateur")
	private String utilisateur_photo;
	@Column(name = "GENRE_UTILISATEUR")
	private String utilisateur_genre;
	
	
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
	
	// CONSTRUCTEUR
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(Long id_utilisateur, String utilisateur_nom, String utilisateur_prenom,
			String utilisateur_pseudo, String utilisateur_email, LocalDate utilisateur_dateDeNaissance,
			String utilisateur_password, String utilisateur_photo, String utilisateur_genre) {
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
	}

	
	
	
	
	

	

	

	

	

	

	
	
	
	
	
	

}
