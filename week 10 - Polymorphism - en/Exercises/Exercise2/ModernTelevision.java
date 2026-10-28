package Exercises.Exercise2;

public class ModernTelevision extends Electronics {
  private String inputMode;

  public ModernTelevision() {
    inputMode = "HDMI";
    voltage = 220;
  }

  public String getInputMode() {
    return inputMode;
  }
}