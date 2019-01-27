package Strategy;

public class WielkieLitery implements Konwerter {
  @Override
  public String konwerteruj(String wiadomosc) {
    return wiadomosc.toUpperCase();
  }
}
