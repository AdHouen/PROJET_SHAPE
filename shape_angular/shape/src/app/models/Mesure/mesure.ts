export class Mesure {

  public id_mesure : number;
  public mesure_date : Date;
  public mesure_valeur : number;

  constructor() {
    this.id_mesure = 0;
    this.mesure_date = new Date('January 01, 1989');
    this.mesure_valeur = 0;

  }
}
