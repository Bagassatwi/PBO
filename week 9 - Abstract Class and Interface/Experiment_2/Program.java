package Experiment_2;

public class Program {
  public static void main(String[] args) {
    Rektor pakRektor = new Rektor();
    Sarjana mhsBiasa = new Sarjana("Charlie");
    Sarjana sarjanaCumlaude = new Sarjana("Dini");
    PascaSarjana masterCumlaude = new PascaSarjana("Elok");
    pakRektor.beriSertifikatCumlaude(mhsBiasa);
    pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
    pakRektor.beriSertifikatCumlaude(masterCumlaude);
  }
}