package weekly3.books;

import java.util.List;

public interface BookManager<T> {
  void addBook(Book<T> book); // 도서 추가 메서드

  void removeBook(Book<T> book); // 도서 삭제 메서드

  List<Book<T>> searchByTitle(String title); // 도서 제목으로 검색 메서드

  List<Book<T>> searchByAuthor(String author); // 도서 저자로 검색 메서드
}
