package Builder;

public class Zarzadca {
  public static Jedzonko stworzPizza(AbstractPizzaBuilder abstractPizzaBuilder) {
    abstractPizzaBuilder.pierwszyDodatek();
    abstractPizzaBuilder.drugiDodatek();
    abstractPizzaBuilder.trzeciDodatek();
    abstractPizzaBuilder.seroweBrzegi();
    abstractPizzaBuilder.sos();
    return abstractPizzaBuilder.wezPizze();
  }
}