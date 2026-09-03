public class Transaction {
  public int id;
  public String memberName;
  public String gameName;
  private int pricePerDay;
  public int rentDuration;
  public int total;

  public void setPricePerDay(int pricePerDay) {
    this.pricePerDay = pricePerDay;
  }

  public void printInfo() {
    System.out.println("Transaction ID : " + id);
    System.out.println("Member Name    : " + memberName);
    System.out.println("Game Name      : " + gameName);
    System.out.println("Price Per Day  : " + pricePerDay);
    System.out.println("Rent Duration  : " + rentDuration + " day(s)");
  }

  public void printTotal() {
    this.total = this.rentDuration * this.pricePerDay;
    System.out.println("Total Price    : " + this.total);
  }
}