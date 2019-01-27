package FactoryMethod;

public class MainFactoryMethod {
  public static void main(String[] args) {
    KebabAbstractFactoryMethod fabryka = new DuzyKebabFabryka();
    Produkt produkt = fabryka.dajKebaba("Mięsny", "Ketchup");
    produkt.wypiszInfo();
    fabryka = new MalyKebabFabryka();
    produkt = fabryka.dajKebaba("Wege", "Sos czosnkowy");
    produkt.wypiszInfo();
  }
}
