public class Car5 {
    private String brand;
    private Engine5 engine;

    public Car5(String brand) {
        this.brand = brand;
        this.engine = new Engine5();
    }

    public void displayInfo() {
        System.out.println("Car: " + brand);
        System.out.println("Engine: " + engine.getType());
    }
}