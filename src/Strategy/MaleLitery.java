package Strategy;

public class MaleLitery implements Konwerter {
  @Override
  public String konwerteruj(String wiadomosc) {
    return wiadomosc.toLowerCase();
  }
}
