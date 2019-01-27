package Adapter;

public class MainAdapter {
  public static void main (String[] args) {
    Cel c1 = new AdapterExtends();
    c1.nazwwaKlasy();

    Cel c2 = new AdapterPole();
    c2.nazwwaKlasy();;
  }
}
