package Mediator;

public class Builder extends AbstractWorker {
  public Builder(String name, AbstractMediator mediator, Job job) {
    super(name, mediator, job);
  }

  @Override
  public void receiveMessage(String message) {
    System.out.println(name + "'ve received message: " + message);
  }

  @Override
  public void sendMessage(String message) {
    System.out.println(name + "'ve sent message: " + message);
    mediator.sendMessage(message);
  }
}
