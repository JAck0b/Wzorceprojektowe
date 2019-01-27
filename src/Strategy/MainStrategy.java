package Strategy;

public class MainStrategy {
  public static void main(String[] args) {
    String tekst = "jesTEM SUPER tekStEm.";
    ZmianaWielkosciLiter zmianaWielkosciLiter = new ZmianaWielkosciLiter();

    zmianaWielkosciLiter.setKonwerter(new MaleLitery());
    zmianaWielkosciLiter.wypisz(tekst);

    zmianaWielkosciLiter.setKonwerter(new WielkieLitery());
    zmianaWielkosciLiter.wypisz(tekst);

    zmianaWielkosciLiter.setKonwerter(new Ladnie());
    zmianaWielkosciLiter.wypisz(tekst);
  }
}
