package Composite;

public abstract class AbstrakcyjnaFigura {
  private String nazwa;

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public abstract void dodajDziecko(AbstrakcyjnaFigura abstrakcyjnaFigura);
  public abstract void usunDziecko(AbstrakcyjnaFigura abstrakcyjnaFIgura);
  public void wypiszImieDziecka() {
    System.out.println("Imie: " + getNazwa());
  }
}
