package ChainOfResponsibility;

public class BuilderHandler extends AbstractHandler {
  @Override
  void handler(int amount) {
    if (amount >= 1500 && amount <= 2000) {
      System.out.println("Builder");
    } else if(next != null) {
      next.handler(amount);
    }
  }
}
