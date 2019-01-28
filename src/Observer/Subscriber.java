package Observer;

public class Subscriber implements Observer {
  private int articles;
  private String firstname;

  public Subscriber(String name) {
    articles = 0;
    this.firstname = name;
  }

  @Override
  public void update(String name, String title) {
    articles++;
    System.out.printf("%s   %d: New %s's article. Its title: %s\n",firstname, articles, name, title);
  }
}
