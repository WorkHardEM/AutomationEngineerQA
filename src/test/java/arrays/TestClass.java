package arrays;

public class TestClass {

  public static void main(String[] args) {

    String[] names;
    names = new String[3];

    String[] name = new String[3];
    int[] arr = new int[10];

    name[0] = "Vasya";
    name[1] = "Petya";
    name[2] = "Vanya";

    System.out.println(name[0]);
    System.out.println(name[2]);

    arr[3] = 15;
    arr[3] = 10;
    System.out.println(arr[3]);

    System.out.println("=============================");

    int[] array = {15, 10, 100, 9, 44};

    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);

    System.out.println("=============================");

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);

    }

    System.out.println("=============================");

    int[] arr2 = new int[15];

    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = i * 10 + 3 * 2;
      System.out.println(arr2[i]);
    }

    System.out.println("=============================");

    System.out.println(arr2.length);

    System.out.println("=============================");

    System.out.println(arr2[arr2.length-1]);



  }

}
