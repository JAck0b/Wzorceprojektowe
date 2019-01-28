package Flyweight;

public class MainFlyweight {
  public static void main (String[] args) {
    MessageFactory messageFactory = new MessageFactory();
    Message m1 = messageFactory.createMessage("Wiadomość 1");
    System.out.println(m1.getMessage());
    m1 = messageFactory.createMessage("Wiadomość 2");
    System.out.println(m1.getMessage());
    m1 = messageFactory.createMessage("Wiadomość 1");
    System.out.println(m1.getMessage());
  }
}
