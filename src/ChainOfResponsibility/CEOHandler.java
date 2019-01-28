package ChainOfResponsibility;

public class CEOHandler extends AbstractHandler {
  @Override
  void handler(int amount) {
    if (amount >= 2500) {
      System.out.println("CEO");
    } else if(next != null) {
      next.handler(amount);
    }
  }
}
