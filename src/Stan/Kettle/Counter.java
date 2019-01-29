package Stan.Kettle;

public class Counter {
  private static int counter = 0;

  public static int getCounter() {
    return counter;
  }

  public static void incCounter() {
    Counter.counter++;
  }
}
