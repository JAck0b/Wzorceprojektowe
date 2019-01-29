package Dekorator.DanceSchool;

public class PercenDecorator extends AbstractPriceDecorator {
  public PercenDecorator(AbstractDance abstractDance) {
    super(abstractDance);
  }

  @Override
  float getPrice() {
    return abstractDance.getPrice()*0.9f;
  }

  @Override
  String getDescription() {
    return abstractDance.getDescription();
  }
}
