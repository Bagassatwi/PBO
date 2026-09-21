public class OnlineShopMain {

  static Product[] products = new Product[5];
  static Store store;

  public static void main(String[] args) {
    initializeData();
    CustomerBasket[] customer1 = {
        new CustomerBasket(products[0], 15),
        new CustomerBasket(products[1], 15),
        new CustomerBasket(products[2], 15),
        new CustomerBasket(products[3], 15),
        new CustomerBasket(products[4], 15),
    };
    Transaction transDawg = new Transaction(customer1, 1_000_000);
    transDawg.printInfo(store);
  }

  static void initializeProduct() {
    products[0] = new Product("Barang 1", 409, 100);
    products[1] = new Product("Barang 2", 207, 100);
    products[2] = new Product("Barang 3", 1033, 100);
    products[3] = new Product("Barang 4", 5030, 100);
    products[4] = new Product("Barang 5", 105, 100);
  }

  static void initializeStore() {
    store = new Store("Bintang Zero", "Malang", "Budi");
  }

  static void initializeData() {
    initializeProduct();
    initializeStore();
  }
}