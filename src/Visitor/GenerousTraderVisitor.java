package Visitor;

public class GenerousTraderVisitor extends AbstractVisitor {
  public GenerousTraderVisitor(String name) {
    super(name);
  }

  @Override
  void visit(RichPerson person) {
    System.out.println(person.getName() + "'s paid 100 to " + name);
  }

  @Override
  void visit(AveragePerson person) {
    System.out.println(person.getName() + "'s paid 10 to " + name);
  }

  @Override
  void visit(PoorPerson person) {
    System.out.println(person.getName() + "'s been given by " + name);
  }
}
