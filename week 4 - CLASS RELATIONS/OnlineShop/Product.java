public class Product {
  private String name;
  private int price;
  private int stock;

  public Product(String name, int price, int stock) {
    this.name = name;
    if (stock <= 0) {
      System.out.println(name + "'s " + "stock must be greater than 0");
    }
    if (price <= 0) {
      System.out.println(name + "'s " + "price must be greater than 0");
    }
    this.price = price;
    this.stock = stock;
  }

  public void buy(int taken) {
    if (this.stock <= 0) {
      System.out.println(this.name + " is Empty!!!");
      return;
    }
    this.stock -= taken;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }
}
