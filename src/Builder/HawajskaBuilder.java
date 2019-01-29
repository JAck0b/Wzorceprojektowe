package Builder;

import java.util.ArrayList;

public class HawajskaBuilder implements AbstractPizzaBuilder {
  private Pizza pizza;
  private ArrayList<String> arrayList;
  private boolean seroweBrzegi;
  private String sos;

  public HawajskaBuilder() {
    pizza = new Pizza();
    pizza.setNazwa("Hawajska");
    arrayList = new ArrayList<>();
  }

  @Override
  public void pierwszyDodatek() {
    arrayList.add("Ser");
  }

  @Override
  public void drugiDodatek() {
    arrayList.add("Szynka");
  }

  @Override
  public void trzeciDodatek() {
    arrayList.add("Ananas");
  }

  @Override
  public void seroweBrzegi() {
    seroweBrzegi = false;
  }

  @Override
  public void sos() {
    sos = "Pomodorowy";
  }

  @Override
  public Pizza wezPizze() {
    pizza.setDodatki(arrayList);
    pizza.setSeroweBrzegi(seroweBrzegi);
    pizza.setSos(sos);
    pizza.zbudujOpis();
    return pizza;
  }
}
