package Fasada;

public class Garaz extends Door {
  @Override
  public void zamknij() {
    System.out.println("Garaż zamykam.");
    setOtwarte(false);
  }

  @Override
  public void otworz() {
    System.out.println("Garaż otwieram.");
    setOtwarte(true);
  }
}
