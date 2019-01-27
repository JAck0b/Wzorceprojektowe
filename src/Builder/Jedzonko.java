package Builder;

public abstract class Jedzonko {
  protected String nazwa;
  protected String opis;

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public abstract void zbudujOpis();

  public abstract void wypiszOpis();
}
