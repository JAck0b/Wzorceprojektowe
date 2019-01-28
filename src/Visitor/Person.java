package Visitor;

public abstract class Person {
  String name;

  public Person(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  abstract void accept(AbstractVisitor visitor);
}
