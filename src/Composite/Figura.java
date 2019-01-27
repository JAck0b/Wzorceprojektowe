package Composite;

public class Figura extends AbstrakcyjnaFigura {

  public Figura(String nazwa) {
    setNazwa(nazwa);
  }

  @Override
  public void dodajDziecko(AbstrakcyjnaFigura abstrakcyjnaFigura) {
    System.out.println("Nie da się");
  }

  @Override
  public void usunDziecko(AbstrakcyjnaFigura abstrakcyjnaFIgura) {
    System.out.println("Nie da się");
  }
}
