package Proxy;

public class Konto implements Logowanie {
  @Override
  public void zaloguj() {
    System.out.println("Logowanie zakończyło się sukcesem.");
  }
}
