package Visitor;

public class MainVisitor {
  public static void main(String[] args) {
    PersonStructure personStructure = new PersonStructure();
    personStructure.addPerson(new RichPerson("Scrooge McDuck"));
    personStructure.addPerson(new AveragePerson("Jack"));
    personStructure.addPerson(new PoorPerson("Student"));

    AbstractVisitor v1 = new GenerousTraderVisitor("Generous");
    AbstractVisitor v2 = new GreedyTraderVisitor("Greedy");

    personStructure.accept(v1);
    System.out.println();
    personStructure.accept(v2);
  }
}
