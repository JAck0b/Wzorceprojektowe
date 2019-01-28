package Mediator;

public class Mediator extends AbstractMediator {
  public Mediator() {
    super();
  }

  @Override
  public void sendMessage(String message) {
    for (AbstractWorker x: workers) {
      x.receiveMessage(message);
    }
  }
}
