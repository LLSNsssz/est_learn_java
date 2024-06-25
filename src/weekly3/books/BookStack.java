package weekly3.books;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
  private Stack<Book<T>> books;

  public BookStack(Stack<Book<T>> books) {
    this.books = books;
  }

  public Stack<Book<T>> getBooks() {
    return books;
  }

  public void pushBook(Book<T> book) {
    this.books.push(book);
  }

  public Book<T> popBook() {
    System.out.println("꺼낼 책: " + books.peek());
    return books.pop();
  }

  public Book<T> peekBook() {
    if (books.isEmpty()) {
      throw new EmptyStackException();
    }
    return books.peek();
  }

  public boolean isEmpty() {
    return books.isEmpty();
  }
}
