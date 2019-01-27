package Singleton;

public class SingletonKsiazki {
  private static SingletonKsiazki singletonKsiazki;
  private String wiadomosc;

  private SingletonKsiazki() {
    System.out.println("Jestem w konstruktorze.");
  }

  public static SingletonKsiazki wezInstancje() {
    if (singletonKsiazki == null) {
      singletonKsiazki = new SingletonKsiazki();
    }
    return singletonKsiazki;
  }
}
