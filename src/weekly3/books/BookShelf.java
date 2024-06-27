package weekly3.books;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {
  private List<Book<T>> books;

  public BookShelf(List<Book<T>> books) {
    this.books = books;
  }

  public List<Book<T>> getBooks() {
    return books;
  }

  @Override
  public void addBook(Book<T> book) {
    books.add(book);
  }

  /** books 리스트에서 매개변수로 넘어온 book과 일치하는 book을 제거 */
  @Override
  public void removeBook(Book<T> book) {
    for (Book<T> picBook : books) {
      if (picBook.equals(book)) {
        books.remove(picBook);
        break;
      }
    }
  }

  /** books 리스트에서 매개변수 title 을 포함하는 도서 리스트를 반환 하는 메서드 */
  @Override
  public List<Book<T>> searchByTitle(String title) {
    return searchBook(title);
  }

  /** books 리스트에서 매개변수 author 와 일치하는 도서 리스트를 반환 하는 메서드 */
  @Override
  public List<Book<T>> searchByAuthor(String author) {
    return searchBook(author);
  }

  /** 입력받은 문자열이 title 이나 author 에 포함되어있는 책 리스트 반환 */
  private List<Book<T>> searchBook(String s) {
    List<Book<T>> resultList = new ArrayList<>();
    for (int i = 0; i < books.size(); i++) {
      String bookTitle = books.get(i).getTitle();
      if (!bookTitle.contains(s)) {
        continue;
      } else {
        resultList.add(books.get(i));
      }
    }
    return resultList;
  }
}
