package Iterator;

public class IntAggregate implements Aggregate {
  @Override
  public Iterator createIterator(int[] table) {
    return (Iterator) new IntIterator(table);
  }
}
