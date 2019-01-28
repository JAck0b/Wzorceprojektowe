package Prototyp;

public class MainPrototyp {
  public static void main(String[] args) {
    Sandwich s1 = new Sandwich(Ingredients.Ham, Ingredients.Tomatoe);
    s1.getInfo();
    Sandwich s2 = (Sandwich) s1.clone();
    s2.getInfo();
    s1 = new Sandwich(Ingredients.Cheese, Ingredients.Jam);
    s1.getInfo();
    s2.getInfo();
  }
}
