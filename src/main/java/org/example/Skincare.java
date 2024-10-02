package org.example;

import java.util.List;
import java.util.Scanner;

//Cosmeticsインターフェイスで定義されているメソッドを実装。
public class Skincare implements Cosmetics {

  //スキンケア製品のリスト。
  List<String> skincareNames = List.of("ローション", "シートマスク", "水分クリーム");

  //Cosmeticsインターフェイスのメソッドをオーバーライドしている。
  //スキンケアで使った（塗った）商品を返す。
  @Override
  public String apply() {
    return "使用したスキンケア製品：" + skincareNames;
  }

  //Cosmeticsインターフェイスのメソッドをオーバーライドしている。
  //スキンケア商品の使った時の感想を報告。
  @Override
  public String report() {
    String applyMessage = apply();
    System.out.println(applyMessage);
    //scannerをインスタンス作成。ユーザーからの入力内容を受け取る準備をする。
    Scanner scanner = new Scanner(System.in);
    //入力を促すための案内を出力。
    System.out.println("スキンケアの中で報告したい製品を入力してください: ");
    //入力内容をselectedProductの文字列変数に格納。
    String selectedProduct = scanner.nextLine();
    //ローション, シートマスクを選んだ時は、"ローション（シートマスク）は、みずみずしさとつけ心地が良い。"
    //水分クリームを選んだ時は”水分クリームは、3つの中で最も水分を肌に留めてくれる。”と返す。
    String report = selectedProduct + "は、みずみずしさとつけ心地が良い。";
    if (selectedProduct.equals("水分クリーム")) {
      report = selectedProduct + "は、3つの中で最も水分を肌に留めてくれる。";
      System.out.println();
    }
    return report;
  }
}


