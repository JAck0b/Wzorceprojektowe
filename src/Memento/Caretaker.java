package Memento;

import java.util.LinkedList;

public class Caretaker {
  LinkedList<Memento> mementos;

  public Caretaker() {
    mementos = new LinkedList<>();
  }

  Memento getMemento(int index) {
    return mementos.get(index);
  }

  void addMemento(Memento memento) {
    mementos.add(memento);
  }
}
