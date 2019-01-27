package Stan;

public class Wylaczony implements CzajnikStan {
  @Override
  public CzajnikStan wlacz() {
    return new Wlaczony();
  }

  @Override
  public CzajnikStan wylacz() {
    return this;
  }

  @Override
  public CzajnikStan wylejWode() {
    return new Pusty();
  }

  @Override
  public CzajnikStan wlejWode() {
    return new Pelny();
  }

  @Override
  public String pobierzStan() {
    return "Wyłączony";
  }
}
