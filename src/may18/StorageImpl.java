package may18;

public class StorageImpl<T> implements Storage<T> {

  private final T[] array;

  public StorageImpl(int capacity) {
    //noinspection unchecked
    this.array = (T[]) new Object[capacity];
  }

  @Override
  public void add(T item, int index) {
    if (array[index] == null) {
      array[index] = item;
    } else System.out.println("다른 인덱스 선택");
  }

  @Override
  public T get(int index) {
    return array[index];
  }
}
