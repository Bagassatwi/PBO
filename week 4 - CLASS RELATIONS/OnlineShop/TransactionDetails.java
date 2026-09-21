public class TransactionDetails {
  private Product products;
  public int total;
  private int amount;

  public TransactionDetails(Product products, int amount) {
    this.products = products;
    this.amount = amount;
  }

  private int calculateTotal() {
    return this.total = this.products.getPrice() * this.amount;
  }

  public void printInfo() {
    System.out.printf("     %-25s%s%s\n", "Product Name", ": ", products.getName());
    System.out.printf("     %-25s%s%d\n", "Product price (per item)", ": ", products.getPrice());
    System.out.printf("     %-25s%s%d\n", "Quantity", ": ", this.amount);
    System.out.printf("     %-25s%s%d\n", "Total", ": ", calculateTotal());
  }
}
