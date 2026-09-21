public class MainExperiment6 {
  public static void main(String[] args) {
    Laptop6 laptop = new Laptop6("Thinkpad");
    Printer printer = new Printer("Epson L3110");
    laptop.printDocument(printer, "Report.pdf");
  }
}