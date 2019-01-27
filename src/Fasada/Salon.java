package Fasada;

public class Salon extends Light {
  @Override
  public void wylacz() {
    System.out.println("Salon wyłączam.");
    setWlaczone(false);
  }

  @Override
  public void wlacz() {
    System.out.println("Salon włączam.");
    setWlaczone(true);
  }
}
