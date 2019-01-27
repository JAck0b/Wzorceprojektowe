package Proxy;

public class Proxy implements Logowanie {
  private String haslo;
  private Konto konto;

  public Proxy (String haslo) {
    this.haslo = haslo;
  }

  private void zalogujDoKonta() {
    konto = new Konto();
  }
  @Override
  public void zaloguj() {
    if (haslo.equals("root")) {
      zalogujDoKonta();
      konto.zaloguj();
    } else {
      System.out.println("Złe hasło");
    }
  }
}
