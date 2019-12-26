package LearnOOP;

public class Animal {

  protected String name;
  protected String color;

  public void walk(String place) {
    System.out.println("We are walking here: " + place);
  }

  public void sleep() {
    System.out.println("Zzzz");
  }

  public void sound() {
    System.out.println("Hello!");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Animal animal = (Animal) o;

    if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
    return color != null ? color.equals(animal.color) : animal.color == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (color != null ? color.hashCode() : 0);
    return result;
  }
}
