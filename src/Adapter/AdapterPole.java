package Adapter;

public class AdapterPole implements Cel {
  private ObiektAdaptowany obiektAdaptowany;
  public AdapterPole() {
    obiektAdaptowany = new ObiektAdaptowany();
  }
  @Override
  public void nazwwaKlasy() {
    obiektAdaptowany.wypisujeNazwe();;
  }
}
