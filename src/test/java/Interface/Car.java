package Interface;

public class Car implements Transport, InterfaceTest {

  public void go() {
    System.out.println("We are driving!");
  }

  public void stop() {
    System.out.println("We are driving slower!");

  }

  public void method1() {
    System.out.println("test1");
  }

  public void method2() {
    System.out.println("test2");
  }
}

