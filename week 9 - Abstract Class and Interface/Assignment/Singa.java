package Assignment;

public class Singa extends Binatang implements IKarnivora {
  private String suara;
  private String warnaBulu;

  public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
    super(nama, jmlKaki);
    this.suara = suara;
    this.warnaBulu = warnaBulu;
  }

  @Override
  public void displayMakan() {
    System.out.println("Type\t\t: Carnivore");
    System.out.println("Food\t\t: Meat");
  }

  @Override
  public void displayBinatang() {
    super.displayBinatang();
    System.out.println("Sound\t\t: " + suara);
    System.out.println("Fur Colour\t: " + warnaBulu + "\n");
  }

  public void displayData() {
    displayMakan();
    displayBinatang();
  }
}