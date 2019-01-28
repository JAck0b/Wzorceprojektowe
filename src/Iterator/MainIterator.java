package Iterator;

public class MainIterator {
  public static void main(String[] args) {
    int[] intArray = new int[10];
    intArray[0] = 1;
    intArray[1] = 11;
    intArray[2] = 21;
    intArray[3] = 31;
    intArray[4] = 41;
    intArray[5] = 51;
    intArray[6] = 61;
    intArray[7] = 71;
    intArray[8] = 81;
    intArray[9] = 91;

    Aggregate aggregate = new IntAggregate();

    Iterator iterator = aggregate.createIterator(intArray); // można lekko inaczej rozwiązać tworzenie iterator
    // na przykłąd jeden aggregate i w createIterator(iterator, tablica);

    if (iterator != null) {
      iterator.getFirst();
      while (iterator.hasNext()) {
        System.out.println(iterator.getNext());
      }
      System.out.println();
    }
  }
}
