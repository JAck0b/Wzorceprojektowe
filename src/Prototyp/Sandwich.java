package Prototyp;

public class Sandwich implements Clone {
  private Ingredients first;
  private Ingredients second;

  public Sandwich(Ingredients first, Ingredients second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public Object clone() {
    return new Sandwich(first, second);
  }

  public void getInfo() {
    System.out.println("First: " + first + ", Second: " + second);
  }
}
