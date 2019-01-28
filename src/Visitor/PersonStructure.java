package Visitor;

import java.util.LinkedList;
import java.util.List;

public class PersonStructure {
  private List<Person> personList;

  public PersonStructure() {
    personList = new LinkedList<>();
  }

  void addPerson(Person person) {
    personList.add(person);
  }

  void accept(AbstractVisitor visitor) {
    for (Person x: personList) {
      x.accept(visitor);
    }
  }
}
