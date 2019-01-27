package Strategy;

public class ZmianaWielkosciLiter {
  private Konwerter konwerter;

  public void setKonwerter(Konwerter konwerter) {
    this.konwerter = konwerter;
  }
  public void wypisz(String wiadomosc) {
    System.out.println(konwerter.konwerteruj(wiadomosc));
  }
}
