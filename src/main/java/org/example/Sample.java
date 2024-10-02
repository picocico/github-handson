package org.example;

//Skincareクラスを継承。
public class Sample extends Skincare {

  //サンプルで使った（塗った）商品を返す。
  @Override
  public String apply() {
    return "サンプルで使用した製品：" + skincareNames;
  }

  //サンプルで試したことを返す。
  public String test() {
    return "スキンケア３品ともサンプルで試しました。";
  }

  //サンプルで使用した商品についての感想を報告する。
  @Override
  public String report() {
    return "どれも使用感はさっぱりなのに肌内部はもっちりとなりました。";
  }
}

