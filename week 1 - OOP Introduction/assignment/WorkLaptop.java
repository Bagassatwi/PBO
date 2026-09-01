package assignment;

public class WorkLaptop extends Laptop {
  int SDCardReadingSpeed;

  public void setSDCardReadingSpeed(int sDCardReadingSpeed) {
    SDCardReadingSpeed = sDCardReadingSpeed;
  }

  public WorkLaptop(String brand, float size, String screenResolution, String keyboardType) {
    super(brand, size, screenResolution, keyboardType);
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("SD Card Reading Speed (MB): " + this.SDCardReadingSpeed);
  }

  public void insertSDCard() {
    System.out.println("SD Card Inserted");
  }

  public void takeOutSDCard() {
    System.out.println("SD Card Taken Out");
  }
}
