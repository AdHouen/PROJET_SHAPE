export class Gallerie {

  public id_gallerie : number;
  public gallerie_photo : string;
  public gallerie_date : Date;

  constructor() {
    this.id_gallerie = 0;
    this.gallerie_photo = "";
    this.gallerie_date = new Date('January 01, 1989');

  }
}
