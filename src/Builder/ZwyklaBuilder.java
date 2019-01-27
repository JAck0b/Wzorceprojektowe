package Builder;

import java.util.ArrayList;

public class ZwyklaBuilder implements AbstractPizzaBuilder {
  private Pizza pizza;
  private ArrayList<String> arrayList;
  private boolean seroweBrzegi;
  private String sos;

  public ZwyklaBuilder() {
    pizza = new Pizza();
    pizza.setNazwa("Zwykla");
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
    arrayList.add("Pieczarki");
  }

  @Override
  public void seroweBrzegi() {
    seroweBrzegi = true;
  }

  @Override
  public void sos() {
    sos = "Pomidorowy";
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
