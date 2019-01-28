package ChainOfResponsibility;

public class MainChainOfResponsibility { // Znajduje pierwszą osobę,która może type zarabiać
  public static void main(String[] args) {
    AbstractHandler a1 = new ArchitectHandler();
    AbstractHandler a2 = new BuilderHandler();
    AbstractHandler a3 = new CEOHandler();

    a1.setNext(a2);
    a2.setNext(a3);

    a1.handler(2700);
    System.out.println();
    a1.handler(1700);
  }
}
