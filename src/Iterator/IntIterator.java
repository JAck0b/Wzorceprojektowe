package Iterator;

public class IntIterator implements Iterator {
  private int position;
  private int[] table;

  public IntIterator(int[] table) {
    this.table = table;
  }
  @Override
  public void getFirst() {
    position = 0;
  }

  @Override
  public int getNext() {
    int tmp = table[position];
    position++;
    return tmp;
  }

  @Override
  public boolean hasNext() {
    if (position >= table.length) {
      return false;
    }
    return true;
  }
}
