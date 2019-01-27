package TemplateMethod;

public abstract class Samochod {
  public String rodzajPojazdu() {
    return "Samochod";
  }
  public abstract String markaSamochodu();

  public void wypiszInfo() {
    System.out.println("Pojazd: " + rodzajPojazdu() + ", Marka: " + markaSamochodu());
  }
}
