import java.util.ArrayList;

public class Transaction {
  private ArrayList<TransactionDetails> transDetail = new ArrayList<>();
  private int paidAmount;
  private int total;

  public Transaction(CustomerBasket[] CustBasket, int paidAmount) {
    for (CustomerBasket te : CustBasket) {
      TransactionDetails tempTrans = new TransactionDetails(te.products, te.amount);
      transDetail.add(tempTrans);
    }
    this.paidAmount = paidAmount;
  }

  private int calculateTotal() {
    this.total = 0;
    for (TransactionDetails transactionDetails : transDetail) {
      this.total += transactionDetails.total;
    }
    return this.total;
  }

  private int calculateChange() {
    return this.paidAmount - this.total;
  }

  public void printInfo(Store store) {
    System.out.println("Store Name: " + store.name);
    System.out.println("Location: " + store.location);
    System.out.println("Admin Name: " + store.adminname);
    System.out.print("Products Bought: \n");
    for (TransactionDetails transactionDetails : transDetail) {
      transactionDetails.printInfo();
      System.out.println();
    }
    System.out.println("Total: " + calculateTotal());
    System.out.println("Change: " + calculateChange());

  }

}
