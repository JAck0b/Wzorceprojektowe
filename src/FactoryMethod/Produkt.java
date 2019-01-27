package FactoryMethod;

public abstract class Produkt {
  private String sos;
  private String typ;
  private String wielkosc;


  public String getSos() {
    return sos;
  }

  public void setSos(String sos) {
    this.sos = sos;
  }

  public String getTyp() {
    return typ;
  }

  public void setTyp(String typ) {
    this.typ = typ;
  }

  public String getWielkosc() {
    return wielkosc;
  }

  public void setWielkosc(String wielkosc) {
    this.wielkosc = wielkosc;
  }

  void wypiszInfo() {
    System.out.println("Kebab: " + typ + ", wielkość: " + wielkosc + ", sos: " + sos);
  }
}
