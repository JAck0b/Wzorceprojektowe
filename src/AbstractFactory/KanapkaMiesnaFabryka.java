package AbstractFactory;

public class KanapkaMiesnaFabryka extends AbstrakcyjnaFabrykaKanapek {
  @Override
  public Plastry podajPlaster() {
    return new Szynka();
  }

  @Override
  public Warzywa podajWarzywo() {
    return new Pomidor();
  }
}
