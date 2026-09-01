package assignment;

public class Human {
  int height;
  int weight;
  String name;
  int age;

  public Human(String name, int height, int weight, int age) {
    this.height = height;
    this.weight = weight;
    this.name = name;
    this.age = age;
  }

  public void printInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Height: " + this.height);
    System.out.println("Weight: " + this.weight);
  }
}
