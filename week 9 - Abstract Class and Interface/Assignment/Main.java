package Assignment;

public class Main {
  public static void main(String[] args) {
    Singa singa = new Singa("CingaCing", 4, "Roaaar", "Brown");
    Keledai keledai = new Keledai("Keledai", 4, "Hehehehe", "Grey");
    Gorilla gorilla = new Gorilla("Gulali", 2, "Haaum Hauum", "Black");

    keledai.displayData();
    gorilla.displayData();
    singa.displayData();
  }
}