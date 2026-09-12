import java.util.Scanner;

public class TestLogistik {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Nomor Resi: ");
    String resi = sc.nextLine();

    System.out.print("Masukkan Nama Pemilik: ");
    String pemilik = sc.nextLine();

    System.out.print("Masukkan Kapasitas Maksimal (kg): ");
    double kapasitas = sc.nextDouble();

    Kontainer kontainerAlfa = new Kontainer(resi, pemilik, kapasitas);

    System.out.println("\n--- Status Kontainer ---");
    System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
    System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

    System.out.print("\nMasukkan berat muatan yang ingin ditambahkan (kg): ");
    double muatanTambah = sc.nextDouble();
    kontainerAlfa.tambahMuatan(muatanTambah);
    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

    System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
    double muatanTurun = sc.nextDouble();
    kontainerAlfa.turunkanMuatan(muatanTurun);
    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

    sc.close();
  }
}