package Observer;

import java.util.LinkedList;

public class Observable {
  LinkedList<Observer> observers;

  public Observable() {
    this.observers = new LinkedList<>();
  }

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  void notifyObservers(String name, String title) {
    for (Observer x: observers) {
      x.update(name, title);
    }
  }

}
