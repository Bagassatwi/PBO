package Example;

public class Manusia {
  public void makanBuah(Buah x) {
    if (x instanceof Apel) {
      System.out.println("Apel langsung dimakan");
      ((Apel) x).tampilkanBiji();
    } else if (x instanceof Pisang) {
      System.out.println("Pisang dikupas terlebih dahulu");
      ((Pisang) x).tampilkanKulit();
    } else if (x instanceof Durian) {
      System.out.println("Durian dibelah terlebih dahulu");
      ((Durian) x).belahDurian();
    }
    System.out.println("Rasanya: " + x.Rasa);
    System.out.println("Kadar Air: " + x.WaterContent);
  }
}
