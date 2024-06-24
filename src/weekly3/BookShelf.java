package weekly3;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager {
  private List<Book<T>> books;

  public BookShelf(List<Book<T>> books) {
    this.books = books;
  }

  @Override
  public void addBook(Book book) {
    books.add(book);
  }

  @Override
  public void removeBook(Book book) {
    if (!books.isEmpty()) {
      books.remove(book);
    }
  }

  /**
   * books 리스트에서 매개변수 title 을 포함하는 도서 리스트를 반환 하는 메서드
   *
   * @param title
   * @return
   */
  @Override
  public List<Book<T>> searchByTitle(String title) {
    for (int i = 0; i < books.size(); i++) {
      String bookTitle = books.get(i).getTitle();
      if (!bookTitle.contains(title)) {
        break;
      } else {
        return books;
      }
    }
    return List.of();
  }

  @Override
  public List<Book> searchByAuthor(String author) {
    return List.of();
  }
}
