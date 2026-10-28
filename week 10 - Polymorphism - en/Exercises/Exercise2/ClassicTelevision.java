package Exercises.Exercise2;

public class ClassicTelevision extends Electronics {
  private String inputMode;

  public ClassicTelevision() {
    inputMode = "DVI";
    voltage = 220;
  }

  public String getInputMode() {
    return inputMode;
  }
}