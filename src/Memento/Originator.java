package Memento;

public class Originator {
  private String state;

  public Originator() {
    state = "Initial state";
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  Memento createMemento() {
    return new Memento(state);
  }

  void restore(Memento memento) {
    state = memento.getState();
  }
}
