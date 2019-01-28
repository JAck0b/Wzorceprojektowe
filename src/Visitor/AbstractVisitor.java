package Visitor;

public abstract class AbstractVisitor {
  String name;
  public AbstractVisitor(String name) {
    this.name = name;
  }

  abstract void visit(RichPerson person);
  abstract void visit(AveragePerson person);
  abstract void visit(PoorPerson person);
}
