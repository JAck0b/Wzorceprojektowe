package FactoryMethod;

public class DuzyKebabFabryka extends KebabAbstractFactoryMethod {
  @Override
  Produkt stworzKebaba(String typ) {
    if (typ.equals("Mięsny")) {
      return new DuzyMiesny();
    }
    return new DuzyWege();
  }
}
