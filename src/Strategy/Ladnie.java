package Strategy;

public class Ladnie implements Konwerter {
  @Override
  public String konwerteruj(String wiadomosc) {
    return wiadomosc.substring(0, 1).toUpperCase() + wiadomosc.substring(1).toLowerCase();
  }
}
