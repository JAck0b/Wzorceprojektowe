package Composite;

public class MainComposite {

  public static void inOrder(AbstrakcyjnaFigura abstrakcyjnaFigura) {
    abstrakcyjnaFigura.wypiszImieDziecka();
    if (abstrakcyjnaFigura instanceof CompositeFigura) {
      for (AbstrakcyjnaFigura x: ((CompositeFigura) abstrakcyjnaFigura).getListaFigur()) {
        inOrder(x);
      }
    }
  }

  public static void main(String[] args) {
    AbstrakcyjnaFigura figury = new CompositeFigura("Figury");
    AbstrakcyjnaFigura trapezy = new CompositeFigura("Trapezy");
    AbstrakcyjnaFigura rowlolegloboki = new CompositeFigura("Roznoległoboki");
    AbstrakcyjnaFigura prostokaty = new CompositeFigura("Prostokąty");

    prostokaty.dodajDziecko(new Figura("Kwadrat"));
    prostokaty.dodajDziecko(new Figura("Prostokąt"));

    rowlolegloboki.dodajDziecko(prostokaty);
    rowlolegloboki.dodajDziecko(new Figura("Romb"));
    rowlolegloboki.dodajDziecko(new Figura("Równoległobok"));

    trapezy.dodajDziecko(rowlolegloboki);
    trapezy.dodajDziecko(new Figura("Trapez"));

    figury.dodajDziecko(trapezy);
    figury.dodajDziecko(new Figura("Trapezoidy"));

    inOrder(figury);
  }
}
