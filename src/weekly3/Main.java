package weekly3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import weekly3.books.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BookShelf<String> bookShelf = new BookShelf<>(new ArrayList<>());
    BookStack<Integer> bookStack = new BookStack<>(new Stack<>());

    /** 책 추가 */
    System.out.println("책 추가");
    while (!sc.nextLine().equals("exit")) {
      Book<String> book = addBook(sc);
      bookShelf.addBook(book);
      Book<Integer> stackBook =
          new Book<>(book.getTitle(), book.getAuthor(), Integer.parseInt(book.getIdentifier()));
      bookStack.pushBook(stackBook);
    }
    System.out.println("bookShelf의 bookList : " + bookShelf.getBooks());
    System.out.println("bookStack의 bookStack: " + bookStack.getBooks());

    /** 책 제거 */
    System.out.println("책 제거");
    while (!sc.nextLine().equals("exit")) {
      if (sc.nextLine().equals("popBook")) {
        bookStack.popBook();
        System.out.println("bookStack의 bookStack: " + bookStack.getBooks());
      }
      Book<String> book = addBook(sc);
      bookShelf.removeBook(book);
    }
    System.out.println("bookShelf.getBooks: " + bookShelf.getBooks());

    /** 도서를 꺼내고 꺼낸 정보 출력 */
    System.out.println("도서 정보 출력");
    while (!sc.nextLine().equals("exit")) {
      try {
        bookStack.peekBook();
        System.out.println("bookShelf.getBooks: " + bookShelf.getBooks());

      } catch (EmptyStackException e) {
        System.out.println("북스택이 비어있습니다");
      }
    }

    /** 도서 검색 */
    System.out.println("도서 검색");
    while (!sc.nextLine().equals("exit")) {
      System.out.print("title: ");
      String title = sc.nextLine();
      System.out.println(bookShelf.searchByTitle(title));
      System.out.print("author: ");
      String author = sc.nextLine();
      System.out.println(bookShelf.searchByAuthor(author));
    }
  }

  /** 도서 입력 메서드 */
  private static Book<String> addBook(Scanner sc) {
    System.out.println("도서 정보 입력");
    System.out.print("title: ");
    String title = sc.nextLine();
    System.out.print("author: ");
    String author = sc.nextLine();
    System.out.print("identifier: ");
    String identifier = sc.nextLine();
    return new Book<>(title, author, identifier);
  }
}
