package Fasada;

public abstract class Door {
  private Boolean otwarte;
  public abstract void zamknij();
  public abstract void otworz();

  public Boolean getOtwarte() {
    return otwarte;
  }

  public void setOtwarte(Boolean otwarte) {
    this.otwarte = otwarte;
  }
}
