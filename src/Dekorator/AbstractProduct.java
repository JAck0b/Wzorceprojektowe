package Dekorator;

public abstract class AbstractProduct {
  protected String opis;
  protected double cena;


  public String podajOpis() {
    System.out.println("AbstractProduct");
    return opis;
  }

  public double podajCene() {
    System.out.println("AbstractProduct");
    return cena;
  }

  public String wypisz () {
    System.out.println(this.getClass());
    return "cena = "+podajCene()+", opis: (" + podajOpis() + ")";
  }

}
