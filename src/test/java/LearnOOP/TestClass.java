package LearnOOP;

public class TestClass {

  public static void main(String[] args) {

    Cat cat = new Cat();
    cat.name = "Vasya";
    cat.color = "Black";

    Cat cat2 = new Cat();
    cat2.name = "Vasya";
    cat2.color = "Black";

    Cat cat3 = new Cat();
    cat3.name = "Vasya";
    cat3.color = "Black";

    System.out.println(cat);
    System.out.println(cat2);
    System.out.println(cat3);

    System.out.println(cat.equals(cat2));
    System.out.println(cat.equals(cat3));
    int hCode1 = cat.hashCode();
    int hCode2 = cat2.hashCode();
    int hCode3 = cat3.hashCode();
    System.out.println(hCode1);
    System.out.println(hCode2);
    System.out.println(hCode3);
    System.out.println(hCode1 == hCode2);
    System.out.println(hCode2 == hCode3);

//    cat.name = "Vasya";
//    dog.name = "Barsik";
//
//    cat.color = "White";
//    dog.color = "Black";
//
//    cat.walk("Backyard");
//    dog.walk("Park");
//
//    cat.feed("Milk");
//    dog.sit();
//
//    System.out.println("Cat name is: " + cat.name);
//    System.out.println("Dog name is: " + dog.name);
//
//    cat.sound();
//    dog.sound();

  }
}
