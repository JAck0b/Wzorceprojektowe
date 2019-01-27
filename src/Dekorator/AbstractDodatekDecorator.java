package Dekorator;

public abstract class AbstractDodatekDecorator extends AbstractProduct {
  AbstractProduct abstractProduct;
  public AbstractDodatekDecorator(AbstractProduct abstractProduct) {
    this.abstractProduct = abstractProduct;
  }

  @Override
  public abstract double podajCene();

  @Override
  public abstract String podajOpis();

}
