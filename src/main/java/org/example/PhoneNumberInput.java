package org.example;

import java.util.Scanner;

public class PhoneNumberInput {

  private final Scanner scanner;

  public PhoneNumberInput() {
    this.scanner = new Scanner(System.in);
  }

  public String getPhoneNumber() {
    System.out.println("携帯電話番号を入力してください（例：090-1234-5678）：");
    return scanner.nextLine();
  }

  public void closeScanner() {
    scanner.close();
  }
}
