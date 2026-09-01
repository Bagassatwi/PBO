package assignment;

public class KalimantanPeople extends Human {
  private int petSize;

  public void setPetSize(int petSize) {
    this.petSize = petSize;
  }

  public KalimantanPeople(String name, int height, int weight, int age) {
    super(name, height, weight, age);
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Pet Size: " + this.petSize);
  }

  public void pet() {
    System.out.println("maw");
  }

  public void fly() {
    System.out.println("Pterodactyl");
  }
}
