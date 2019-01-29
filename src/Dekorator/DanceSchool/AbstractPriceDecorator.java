package Dekorator.DanceSchool;

public abstract class AbstractPriceDecorator extends AbstractDance {
  AbstractDance abstractDance;
  public AbstractPriceDecorator(AbstractDance abstractDance) {
    this.abstractDance = abstractDance;
  }

  abstract float getPrice();
  abstract String getDescription();
}
