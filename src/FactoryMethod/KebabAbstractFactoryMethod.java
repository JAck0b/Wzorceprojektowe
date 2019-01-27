package FactoryMethod;

public abstract class KebabAbstractFactoryMethod {
  Produkt dajKebaba(String typ, String sos) {
    Produkt produkt = stworzKebaba(typ);
    produkt.setSos(sos);
    return produkt;
  }

  abstract Produkt stworzKebaba(String typ);
}
