package Observer;

public class MainObserver {
  public static void main (String[] args) {
    Blogger blogger1 = new Blogger("Kuba");
    Blogger blogger2 = new Blogger("Maciek");

    Subscriber s1 = new Subscriber("s1");
    Subscriber s2 = new Subscriber("s2");
    Subscriber s3 = new Subscriber("s3");

    blogger1.addObserver(s1);
    blogger1.addObserver(s2);

    blogger2.addObserver(s1);
    blogger2.addObserver(s2);
    blogger2.addObserver(s3);

    blogger2.publish("Celestial Bodies.");
    blogger2.removeObserver(s1);
    blogger2.publish("Celestial Bodies1");

    blogger1.publish("Stars");
  }
}
