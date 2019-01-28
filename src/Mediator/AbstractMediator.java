package Mediator;

import java.util.ArrayList;

public abstract class AbstractMediator {
  ArrayList<AbstractWorker> workers;

  public AbstractMediator() {
    workers = new ArrayList<>();
  }

  public void addWorker(AbstractWorker abstractWorker) {
    workers.add(abstractWorker);
  }

  public void removeWorker(AbstractWorker abstractWorker) {
    workers.remove(abstractWorker);
  }

  public abstract void sendMessage(String message);
}
