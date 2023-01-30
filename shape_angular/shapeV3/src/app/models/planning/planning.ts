export class Planning {

  public id_programme: number;

	public programme_poids: number;

	public programme_series: number;

	public programme_repetitions: number;

	public programme_pause: number;

	public programme_tempsSecondes: number;

	public programme_distance: number;

  // public id_entrainement:number;

  constructor() {
    this.id_programme = 0;
    this.programme_poids = 0;
    this.programme_series = 0;
    this.programme_repetitions = 0;
    this.programme_pause = 0;
    this.programme_tempsSecondes = 0;
    this.programme_distance = 0;
    // this.id_entrainement = 0;
  }

}
