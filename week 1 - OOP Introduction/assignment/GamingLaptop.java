package assignment;

public class GamingLaptop extends Laptop {
  int fanSpeed;

  public void setFanSpeed(int fanSpeed) {
    this.fanSpeed = fanSpeed;
  }

  public GamingLaptop(String brand, float size, String screenResolution, String keyboardType) {
    super(brand, size, screenResolution, keyboardType);
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Fan Speed: " + this.fanSpeed);
  }

  public void switchGPU() {
    System.out.println("GPU Switched");
  }

  public void turnOnRGB() {
    System.out.println("RGB Turned On");
  }

}
