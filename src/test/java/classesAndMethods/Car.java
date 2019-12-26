package classesAndMethods;

public class Car {

  public Car() {

  }

  public Car(String name) {
    this.name = name;
  }

  int height;
  int width;
  int length;
  int weight = 2000;
  int maxWeight = 2700;
  String color;
  int speed;
  int maxSpeed = 260;
  private String name;

  public void addWeight(int weight) {
    this.weight += weight;
    System.out.println("New weight: " + this.weight + " for car: " + name);
  }

  public void drive(int speed) {
    if (weight <= maxWeight && speed <=maxSpeed){
      this.speed = speed;
      System.out.println("We are driving! Car " + name);
    } else {
      System.out.println("Can not drive! " + name);
    }
  }

}
