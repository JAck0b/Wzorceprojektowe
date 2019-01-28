package Mediator;

public abstract class AbstractWorker {
  String name;
  Job job; // tylko po to, by się pobawic enumami xD (builder, architect)
  AbstractMediator mediator;

  public AbstractWorker(String name, AbstractMediator mediator, Job job) {
    this.name = name;
    this.mediator = mediator;
    this.job = job;
  }

  public abstract void receiveMessage(String message);
  public abstract void sendMessage(String message);
}
