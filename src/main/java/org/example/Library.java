package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private final List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public List<Book> searchByTitle(String title) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.title().toLowerCase().contains(title.toLowerCase())) {
        result.add(book);
      }
    }
    return result;
  }

  public List<Book> searchByAuthor(String author) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.author().toLowerCase().contains(author.toLowerCase())) {
        result.add(book);
      }
    }
    return result;
  }

  public Book searchByNumber(int number) {
    for (Book book : books) {
      if (book.number() == number) {
        return book;
      }
    }
    return null;
  }
}



