package ChainOfResponsibility;

public abstract class AbstractHandler {
  AbstractHandler next;

  public AbstractHandler() {
    next = null;
  }

  void setNext(AbstractHandler abstractHandler) {
    this.next = abstractHandler;
  }

  abstract void handler(int amount);

}
