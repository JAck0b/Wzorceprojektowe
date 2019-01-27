package Fasada;

public class Kuchnia extends Light {
  @Override
  public void wylacz() {
    System.out.println("Kuchnia wyłączam.");
    setWlaczone(false);
  }

  @Override
  public void wlacz() {
    System.out.println("Kuchnia włączam.");
    setWlaczone(true);
  }
}
