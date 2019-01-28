package Observer;

public class Blogger extends Observable {
  private final String name;

  public Blogger(String name) {
    super();
    this.name = name;
  }

  public void publish(String title) {
    System.out.printf("%s is publishing article %s\n", name, title);
    notifyObservers(name, title);
  }
}
