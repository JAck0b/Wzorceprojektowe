package Dekorator.DanceSchool;

public class ValueDecorator extends AbstractPriceDecorator {
  public ValueDecorator(AbstractDance abstractDance) {
    super(abstractDance);
  }

  @Override
  float getPrice() {
    return abstractDance.getPrice() - 10;
  }

  @Override
  String getDescription() {
    return abstractDance.getDescription();
  }
}
