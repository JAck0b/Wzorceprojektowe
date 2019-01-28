package Flyweight;

import java.util.HashMap;

public class MessageFactory {
  private HashMap<String, Message> messages;

  public MessageFactory() {
    this.messages = new HashMap<>();
  }

  public synchronized Message createMessage(String message) {
    Message m = messages.get(message);
    if (m == null) {
      m = new Message(message);
      messages.put(message, m);
      System.out.println("I've created new message.");
    }
    return m;
  }
}
