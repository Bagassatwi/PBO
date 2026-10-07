package tasks.overriding;

public class Mahasiswa extends Manusia {
  @Override
  public void makan() {
    System.out.println("Mahasiswa makan");
  }

  public void lembur() {
    System.out.println("Mahasiswa lembur");
  }
}
