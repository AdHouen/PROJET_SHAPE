export class Abonnement {

  public id_abonnement : number;
  public abonnement_type : string;
  public abonnement_dateSouscription : Date;
  public abonnement_duree : number;

  constructor(){
    this.id_abonnement = 0;
    this.abonnement_type = "";
    this.abonnement_dateSouscription = new Date('January 01, 1989');
    this.abonnement_duree = 0
  }

}
