package Composite;

import java.util.ArrayList;

public class CompositeFigura extends AbstrakcyjnaFigura {
  private ArrayList<AbstrakcyjnaFigura> listaFigur;

  public CompositeFigura(String nazwa) {
    setNazwa(nazwa);
    listaFigur = new ArrayList<>();
  }

  @Override
  public void dodajDziecko(AbstrakcyjnaFigura abstrakcyjnaFigura) {
    listaFigur.add(abstrakcyjnaFigura);
  }

  @Override
  public void usunDziecko(AbstrakcyjnaFigura abstrakcyjnaFIgura) {
    listaFigur.remove(abstrakcyjnaFIgura);
  }

  public ArrayList<AbstrakcyjnaFigura> getListaFigur() {
    return listaFigur;
  }
}
