package Fasada;

public abstract class Light {
  private Boolean wlaczone;
  public abstract void wylacz();
  public abstract void wlacz();

  public Boolean getWlaczone() {
    return wlaczone;
  }

  public void setWlaczone(Boolean wlaczone) {
    this.wlaczone = wlaczone;
  }
}
