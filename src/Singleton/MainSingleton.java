package Singleton;

public class MainSingleton {
  public static void main(String[] args) {
    SingletonKsiazki singletonKsiazki = SingletonKsiazki.wezInstancje();
    singletonKsiazki = SingletonKsiazki.wezInstancje();
  }
}
