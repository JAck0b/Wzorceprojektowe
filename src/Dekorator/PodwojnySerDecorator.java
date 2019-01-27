package Dekorator;

public class PodwojnySerDecorator extends AbstractDodatekDecorator {

  public PodwojnySerDecorator(AbstractProduct abstractProduct) {
    super(abstractProduct);
  }

  @Override
  public double podajCene() {
    System.out.println("PodwojnySer");
    return abstractProduct.podajCene() + 4.20;
  }

  @Override
  public String podajOpis() {
    System.out.println("PodwojnySer");
    return abstractProduct.podajOpis() + ", podwójny ser";
  }
}
