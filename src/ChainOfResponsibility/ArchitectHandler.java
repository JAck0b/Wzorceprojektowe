package ChainOfResponsibility;

public class ArchitectHandler extends AbstractHandler {
  @Override
  void handler(int amount) {
    if (amount > 2000 && amount <= 3000) {
      System.out.println("Architect");
    } else if(next != null) {
      next.handler(amount);
    }
  }
}
