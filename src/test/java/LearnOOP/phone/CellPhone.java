package LearnOOP.phone;

public class CellPhone extends AbstractPhone {

  private int hour;

  public CellPhone(int year, int hour) {
    super(year);
    this.hour = hour;
  }

  @Override
  public void call(int outputNumber) {

  }

  @Override
  public void ring(int inputNumber) {

  }
}
