package FactoryMethod;

public class MalyKebabFabryka extends KebabAbstractFactoryMethod {
  @Override
  Produkt stworzKebaba(String typ) {
    if (typ.equals("Mięsny")) {
      return new MalyMiesny();
    }
    return new MalyWege();
  }
}
