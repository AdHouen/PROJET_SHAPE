export class Utilisateur {

  public id_utilisateur : number;
  public utilisateur_nom : string;
  public utilisateur_prenom : string;
  public utilisateur_pseudo : string;
  public utilisateur_email : string;
  public utilisateur_dateDeNaissance : Date;
  public utilisateur_password : string;
  public utilisateur_photo : string;
  public utilisateur_genre : string;
  public utilisateur_dateSouscriptionFin : Date;

  constructor() {
    this.id_utilisateur = 0;
    this.utilisateur_nom = "";
    this.utilisateur_prenom = "";
    this.utilisateur_pseudo = "";
    this.utilisateur_email = "";
    this.utilisateur_dateDeNaissance = new Date('January 01, 1989');
    this.utilisateur_password = "";
    this.utilisateur_photo = "";
    this.utilisateur_genre = "";
    this.utilisateur_dateSouscriptionFin = new Date('January 01, 1989');

  }

}
