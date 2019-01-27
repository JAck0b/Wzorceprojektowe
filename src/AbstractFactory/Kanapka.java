package AbstractFactory;

public class Kanapka {
  private Plastry plaser; // ser lub szynka
  private Warzywa warzywo; // ogórek lub pomodor
  private String opis;

  public Kanapka (AbstrakcyjnaFabrykaKanapek abstrakcyjnaFabrykaKanapek) {
    plaser = abstrakcyjnaFabrykaKanapek.podajPlaster();
    warzywo = abstrakcyjnaFabrykaKanapek.podajWarzywo();
    opis = "Plaster: " + plaser.getOpis() + ", warzywo: " + warzywo.getOpis();
  }

  public String getOpis() {
    return opis;
  }
}
