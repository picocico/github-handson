package org.example;

import java.util.List;
import java.util.Scanner;

//Cosmeticsインターフェイスで定義されているメソッドを実装。
public class Makeup implements Cosmetics {

  //メイクアップ製品のリスト。
  List<String> makeupNames = List.of("リップグロス", "リップスティック", "リップティント");

  //Cosmeticsインターフェイスのメソッドをオーバーライドしている。
  //メイクアップで使った（塗った）商品を返す。
  @Override
  public String apply() {
    return "使用したメイクアップ製品：" + makeupNames;
  }

  //Cosmeticsインターフェイスのメソッドをオーバーライドしている。
  //メイクアップ商品の使った時の感想を報告。
  @Override
  public String report() {
    String applyMessage = apply();
    System.out.println(applyMessage);
    //scannerをインスタンス作成。ユーザーからの入力内容を受け取る準備をする。
    Scanner scanner = new Scanner(System.in);
    //入力を促すための案内を出力。
    System.out.println("メイクアップの中で報告したい製品を選んでください: ");
    String selectedProduct = scanner.nextLine();
    //リップグロス, リップスティックを選んだ時は、"リップグロス,（リップスティック）は、は、つやと塗り心地が良い。。"
    //リップティントを選んだ時は”リップティントは、3つの中で最も発色と持ちが良い。”と返す。
    String report = selectedProduct + "は、つやと塗り心地が良い。";
    if (selectedProduct.equals("リップティント")) {
      report = selectedProduct + "は、3つの中で最も発色と持ちが良い。";
      System.out.println();
    }
    return report;
  }
}














