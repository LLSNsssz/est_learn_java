package may17.generic.ex1;

public class Car<T> {
  private T t;

  public void set(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }

  public boolean isInstance(T t) {
    return t instanceof Object;
  }
}
