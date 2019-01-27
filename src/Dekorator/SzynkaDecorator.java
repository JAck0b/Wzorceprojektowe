package Dekorator;

public class SzynkaDecorator extends AbstractDodatekDecorator {

  public SzynkaDecorator(AbstractProduct abstractProduct) {
    super(abstractProduct);
  }

  @Override
  public double podajCene() {
    System.out.println("Szynka");
    return abstractProduct.podajCene() + 5.23;
  }

  @Override
  public String podajOpis() {
    System.out.println("Szynka");
    return abstractProduct.podajOpis() + ", szynka";
  }
}
