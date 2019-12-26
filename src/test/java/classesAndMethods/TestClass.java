package classesAndMethods;

public class TestClass {

  public static void main(String[] args) {

    Car car1 = new Car("BMW");
    car1.color = "Black";
    car1.length = 5000;
    car1.height = 2000;
    car1.width = 2000;

    car1.addWeight(50);
    car1.drive(120);

    car1.addWeight(700);
    car1.drive(100);

    Car car2 = new Car("Volga");
    car2.color = "White";
    Car car3 = new Car("Mersedes");
    car3.color = "Red";

    car2.drive(100);
    car3.drive(200);

    Car car4 = new Car();
  }
}
