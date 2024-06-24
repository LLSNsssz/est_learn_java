package weekly3;

import java.util.Stack;

public class BookStack<T> {
  private Stack<Book<T>> books;

  public BookStack(Stack<Book<T>> books) {
    this.books = books;
  }

  public void pushBook(Book<T> book) {}

  public Book<T> popBook() {
    return books.pop();
  }

  public Book<T> peekBook() {
    if (books.isEmpty()) {
      throw new EmptyStackException("북스택이 비어있습니다.");
    }
    return books.peek();
  }

  public boolean isEmpty() {
    return books.isEmpty();
  }
}
