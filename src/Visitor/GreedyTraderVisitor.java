package Visitor;

public class GreedyTraderVisitor extends AbstractVisitor {
  public GreedyTraderVisitor(String name) {
    super(name);
  }

  @Override
  void visit(RichPerson person) {
    System.out.println(person.getName() + "'s paid 10000 to " + name);
  }

  @Override
  void visit(AveragePerson person) {
    System.out.println(person.getName() + "'s paid 1000 to " + name);
  }

  @Override
  void visit(PoorPerson person) {
    System.out.println(person.getName() + "'s paid 100 to " + name);
  }
}
