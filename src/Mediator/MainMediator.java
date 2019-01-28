package Mediator;

public class MainMediator {
  public static void main (String[] args) {
    AbstractMediator mediator = new Mediator();
    AbstractWorker worker1 = new Builder("Kuba", mediator, Job.builder);
    AbstractWorker worker2 = new Builder("Maciek", mediator, Job.builder);
    AbstractWorker worker3 = new Builder("Andrzej", mediator, Job.builder);

    mediator.addWorker(worker1);
    mediator.addWorker(worker2);
    mediator.addWorker(worker3);

    worker1.sendMessage("Hejka!");

    mediator.removeWorker(worker1);

    worker1.sendMessage("Hejka2");

  }
}
