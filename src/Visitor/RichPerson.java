package Visitor;

public class RichPerson extends Person {
  public RichPerson(String name) {
    super(name);
  }

  @Override
  void accept(AbstractVisitor visitor) {
    visitor.visit(this);
  }
}
