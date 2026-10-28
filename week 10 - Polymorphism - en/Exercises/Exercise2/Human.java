package Exercises.Exercise2;

public class Human {
  public void turnOnDevice(Electronics device) {
    if (device instanceof ClassicTelevision)
      System.out.println("Turning on TV with input: " + ((ClassicTelevision) device).getInputMode());
    else if (device instanceof ModernTelevision)
      System.out.println("Turning on TV with input: " + ((ModernTelevision) device).getInputMode());
    System.out.println("Television Voltage: " + device.getVoltage());
  }
}