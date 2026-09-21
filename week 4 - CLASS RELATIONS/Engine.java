public class Engine {
  private int capacity;
  private int fuel;

  public Engine() {
  }

  public Engine(int capacity, int fuel) {
    this.capacity = capacity;
    this.fuel = fuel;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
}