import { Muscle } from './../muscle/muscle';
export class Exercice {

  public id_exercice: number;
  public exercice_nom: string;
  public exercice_description: string;
  public exercice_photo:string;
  public listMuscle:[];

  constructor(Exericie: any) {
    this.id_exercice = 0;
    this.exercice_nom = "";
    this.exercice_description = "";
    this.exercice_photo = "";
    this.listMuscle = [];

    // this.muscle={
    //  id_muscle=0, muscle_nom="", muscle_image=""
    // }


  }

}
