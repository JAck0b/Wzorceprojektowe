package AbstractFactory;

public class KanapkaWegeFabryka extends AbstrakcyjnaFabrykaKanapek {
  @Override
  public Plastry podajPlaster() {
    return new Ser();
  }

  @Override
  public Warzywa podajWarzywo() {
    return new Ogorek();
  }
}
