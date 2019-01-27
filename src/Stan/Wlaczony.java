package Stan;

public class Wlaczony implements CzajnikStan {
  @Override
  public CzajnikStan wlacz() {
    return this;
  }

  @Override
  public CzajnikStan wylacz() {
    return new Wylaczony();
  }

  @Override
  public CzajnikStan wylejWode() {
    return this;
  }

  @Override
  public CzajnikStan wlejWode() {
    return this;
  }

  @Override
  public String pobierzStan() {
    return "Właczony";
  }
}
