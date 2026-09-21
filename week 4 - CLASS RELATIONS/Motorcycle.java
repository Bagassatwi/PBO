public class Motorcycle {
  private String brand;
  private String color;
  private Engine engine;
  private int maxSpeed;

  public Motorcycle() {
  }

  public Motorcycle(String brand, String color, Engine engine, int maxSpeed) {
    this.brand = brand;
    this.color = color;
    this.engine = engine;
    this.maxSpeed = maxSpeed;
  }

  public String getBrand() {
    if (brand != null) {
      return brand;
    }
    return "Brand has not been set";
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getColor() {
    if (color != null) {
      return color;
    }
    return "Color has not been set";
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public void increaseSpeed() {
    // Implementation logic
  }

  public void decreaseSpeed() {
    // Implementation logic
  }
}