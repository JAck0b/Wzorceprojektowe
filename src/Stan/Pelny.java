package Stan;

public class Pelny implements CzajnikStan {
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
    return this;
  }

  @Override
  public String pobierzStan() {
    return "Pelny";
  }
}
