package org.example;

public record Book(String title, String author, int number) {

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", number=" + number +
        '}';
  }
}

