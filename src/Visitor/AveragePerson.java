package Visitor;

public class AveragePerson extends Person {
  public AveragePerson(String name) {
    super(name);
  }

  @Override
  void accept(AbstractVisitor visitor) {
    visitor.visit(this);
  }
}
