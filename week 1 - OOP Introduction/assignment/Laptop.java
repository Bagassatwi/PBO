package assignment;

public class Laptop {
  String brand;
  float size;
  String screenResolution;
  String keyboardType;

  public Laptop(String brand, float size, String screenResolution, String keyboardType) {
    this.brand = brand;
    this.size = size;
    this.screenResolution = screenResolution;
    this.keyboardType = keyboardType;
  }

  public void printInfo() {
    System.out.println("Brand: " + this.brand);
    System.out.println("Size: " + this.size + "\"");
    System.out.println("Screen Resolution (px): " + this.screenResolution);
    System.out.println("Keyboard Type: " + this.keyboardType);
  }
}
