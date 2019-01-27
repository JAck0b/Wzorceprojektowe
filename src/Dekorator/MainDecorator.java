package Dekorator;

public class MainDecorator {
  public static void main (String[] args) {
    AbstractProduct abstractProduct = new Pizza();
    abstractProduct = new PodwojnySerDecorator(abstractProduct);
    abstractProduct = new PodwojnySerDecorator(abstractProduct);
    abstractProduct = new SzynkaDecorator(abstractProduct);

    System.out.println(abstractProduct.wypisz());
  }
}
