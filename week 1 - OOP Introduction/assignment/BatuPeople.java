package assignment;

public class BatuPeople extends Human {
  private int gardenSize;

  public void setGardenSize(int gardenSize) {
    this.gardenSize = gardenSize;
  }

  public BatuPeople(String name, int height, int weight, int age) {
    super(name, height, weight, age);
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Garden Size: " + this.gardenSize);
  }

  public void harvest() {
    System.out.println("I got apples!");
  }

  public void plant() {
    System.out.println("I plant trees");
  }
}
