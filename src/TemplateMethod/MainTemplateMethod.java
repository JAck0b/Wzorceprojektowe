package TemplateMethod;

public class MainTemplateMethod {
  public static void main(String[] args) {
    Samochod auto1 = new BMW();
    auto1.wypiszInfo();
    Samochod auto2 = new Audi();
    auto2.wypiszInfo();
  }
}
