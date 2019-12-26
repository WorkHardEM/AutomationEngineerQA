package cycles;

public class TestClass2 {

  public static void main(String[] args) {
    Object object = new Object();
    Object object2 = new Object();
    int hCode;
    int hCode2;
    hCode = object.hashCode();
    hCode2 = object2.hashCode();
    System.out.println(hCode);
    System.out.println(hCode2);

  }

}

