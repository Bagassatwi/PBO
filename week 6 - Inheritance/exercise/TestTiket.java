package exercise;

public class TestTiket {
  public static void main(String[] args) {
    TiketKereta tk = new TiketKereta("KA-001", "Andi", "Malang", "Jakarta", 350000, 3, "12A");
    tk.tampilKereta();

    TiketDomestik td = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25,
        75000);
    td.tampilDomestik();

    TiketInternasional ti = new TiketInternasional();
    ti.kodeTiket = "SQ-205";
    ti.namaPenumpang = "Budi";
    ti.asal = "Jakarta";
    ti.tujuan = "Singapura";
    ti.setHargaDasar(2500000);
    ti.maskapai = "Singapore Airlines";
    ti.beratBagasi = 20;
    ti.nomorPaspor = "C1234567";
    ti.asuransi = 150000;
    ti.tampilInternasional();
  }
}