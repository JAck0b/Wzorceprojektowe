package Dekorator.DanceSchool;

public class MainDanceSchool {
  public static void main (String[] args) {
    AbstractDance dance = new ZumbaDance();
    dance = new ValueDecorator(dance);
    dance.getInfo();
    dance = new ValueDecorator(dance);
    dance = new ValueDecorator(dance);
    dance.getInfo();
  }
}
