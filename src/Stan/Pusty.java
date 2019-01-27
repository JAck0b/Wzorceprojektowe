package Stan;

public class Pusty implements CzajnikStan {
  @Override
  public CzajnikStan wlacz() {
    return this;
  }

  @Override
  public CzajnikStan wylacz() {
    return this;
  }

  @Override
  public CzajnikStan wylejWode() {
    return this;
  }

  @Override
  public CzajnikStan wlejWode() {
    return new Pelny();
  }

  @Override
  public String pobierzStan() {
    return "Pusty";
  }
}
