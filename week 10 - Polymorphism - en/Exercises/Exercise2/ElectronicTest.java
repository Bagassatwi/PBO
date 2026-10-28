package Exercises.Exercise2;

public class ElectronicTest {
  public static void main(String[] args) {
    Human indro = new Human();
    ClassicTelevision tvjadul = new ClassicTelevision();
    ModernTelevision tvmodern = new ModernTelevision();

    indro.turnOnDevice(tvjadul);
    indro.turnOnDevice(tvmodern);
  }
}
