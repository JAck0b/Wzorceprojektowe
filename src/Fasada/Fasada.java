package Fasada;

public class Fasada {
  private Door garaz;
  private Door glowneDrzwi;
  private Light salon;
  private Light kuchnia;

  public Fasada() {
    garaz = new Garaz();
    glowneDrzwi = new GlowneDrzwi();
    salon = new Salon();
    kuchnia = new Kuchnia();
  }
  void otworzDom() {
    System.out.println("Otwieram dom.");
    garaz.otworz();
    glowneDrzwi.otworz();
    salon.wlacz();
    kuchnia.wlacz();
  }

  void zamknijDom() {
    System.out.println("Zamykam dom");
    garaz.zamknij();
    glowneDrzwi.zamknij();
    salon.wylacz();
    kuchnia.wylacz();
  }

  void zamknijDrzwi() {
    System.out.println("Zamykam drzwi w domu");
    garaz.zamknij();
    glowneDrzwi.zamknij();
  }

  void otworzDrzwi() {
    System.out.println("Otwieram drzwi w domu.");
    garaz.otworz();
    glowneDrzwi.otworz();
  }

  void stanSwiatel() {
    System.out.println("Salon: " + salon.getWlaczone() + ", Garaż: " + kuchnia.getWlaczone());
  }
}
