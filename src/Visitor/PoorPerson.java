package Visitor;

public class PoorPerson extends Person {
  public PoorPerson(String name) {
    super(name);
  }

  @Override
  void accept(AbstractVisitor visitor) {
    visitor.visit(this);
  }
}
