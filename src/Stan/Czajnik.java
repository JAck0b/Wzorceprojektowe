package Stan;

public class Czajnik {
  private CzajnikStan czajnikStan;
  public Czajnik() {
    czajnikStan = new Pusty();
  }

  public void wlaczCzajnik() {
    czajnikStan = czajnikStan.wlacz();
  }

  public void wylaczCzajnik() {
    czajnikStan = czajnikStan.wylacz();
  }

  public void napelnijCzajnik() {
    czajnikStan = czajnikStan.wlejWode();
  }

  public void oproznijCzajnik() {
     czajnikStan = czajnikStan.wylejWode();
  }

  public void info() {
    System.out.println("Stan: " + czajnikStan.pobierzStan());
  }
}
