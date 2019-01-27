package Builder;

public class MainBuilder {
  public static void main(String[] args) {
    Jedzonko pizzaHawajska = Zarzadca.stworzPizza(new HawajskaBuilder());
    Jedzonko pizzaZwykla = Zarzadca.stworzPizza(new ZwyklaBuilder());
    pizzaHawajska.wypiszOpis();
    pizzaZwykla.wypiszOpis();
  }
}
