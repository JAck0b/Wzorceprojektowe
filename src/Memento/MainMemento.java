package Memento;

public class MainMemento {
  public static void main(String[] args) {
    Originator creatingSandwich = new Originator();
    Caretaker caretaker = new Caretaker();

    creatingSandwich.setState("Preparing bread.");
    System.out.println(creatingSandwich.getState());
    creatingSandwich.setState("Adding ham.");
    caretaker.addMemento(creatingSandwich.createMemento());
    creatingSandwich.setState("Throwing away sandwich.");
    System.out.println(creatingSandwich.getState());
    creatingSandwich.restore(caretaker.getMemento(0));
    System.out.println(creatingSandwich.getState());
  }
}
