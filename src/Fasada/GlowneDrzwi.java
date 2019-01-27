package Fasada;

public class GlowneDrzwi extends Door {
  @Override
  public void zamknij() {
    System.out.println("Główne drzwi zamykam.");
    setOtwarte(false);
  }

  @Override
  public void otworz() {
    System.out.println("Główne drzwi otwieram.");
    setOtwarte(true);
  }
}
