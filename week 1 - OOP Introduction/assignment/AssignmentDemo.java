package assignment;

public class AssignmentDemo {
  public static void main(String[] args) {
    KalimantanPeople Atha = new KalimantanPeople("Atha", 170, 69, 20);
    BatuPeople Rayyan = new BatuPeople("Rayyan", 167, 67, 19);

    Atha.setPetSize(3);
    Rayyan.setGardenSize(25);

    GamingLaptop lenovoLegion = new GamingLaptop("Lenovo", 15.6F, "3840 x 2160", "Mechanical");
    WorkLaptop lenovoIdeapad = new WorkLaptop("Lenovo", 12.4F, "1920 x 1080", "Chiclet");

    lenovoLegion.setFanSpeed(4200);
    lenovoIdeapad.setSDCardReadingSpeed(95);

    System.out.println("--- Humans ---");
    Atha.printInfo();
    Atha.pet();
    Atha.fly();

    System.out.println();
    Rayyan.printInfo();
    Rayyan.harvest();
    Rayyan.plant();

    System.out.println();
    System.out.println("--- Laptops ---");
    lenovoLegion.printInfo();
    lenovoLegion.switchGPU();
    lenovoLegion.turnOnRGB();

    System.out.println();
    lenovoIdeapad.printInfo();
    lenovoIdeapad.insertSDCard();
    lenovoIdeapad.takeOutSDCard();
  }
}
