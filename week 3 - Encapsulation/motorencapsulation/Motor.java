package motorencapsulation;

public class Motor {
  private int kecepatan = 0;
  private boolean kontakOn = false;

  public void nyalakanMesin() {
    kontakOn = true;
  }

  public void matikanMesin() {
    kontakOn = false;
  }

  public void tambahKecepatan() {
    if (kontakOn) {
      if (kecepatan >= 100) {
        System.out.println("Kecepatan maksimal 100!");
        return;
      }
      kecepatan += 5;
    } else {
      System.out.println("Kecepatan tidak bisa ditambah karena Mesin Off");
    }
  }

  public void kurangiKecepatan() {
    if (kontakOn) {
      kecepatan -= 5;
    } else {
      System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off");
    }
  }

  public void printStatus() {
    if (kontakOn == true) {
      System.out.println("Kontak On");
    } else {
      System.out.println("Kontak Off");
    }
    System.out.println("Kecepatan " + kecepatan + "\n");
  }
}
