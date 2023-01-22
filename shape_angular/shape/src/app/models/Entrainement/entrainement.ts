export class Entrainement {

  public id_entrainement : number;
  public entrainement_date : Date;
  public entrainement_nom : string;

  constructor(){
    this.id_entrainement = 0;
    this.entrainement_date = new Date('January 01, 1989');
    this.entrainement_nom = "";
  }

}
