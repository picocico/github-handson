package org.example;

public class SEVENTEEN {

  public String teamAlphabet; // SEVENTEENメンバー所属チームのアルファベット
  public String memberName;  // SEVENTEENメンバーの名前
  public int age; //　SEVENTEENメンバーの年齢
  public String teamName; // SEVENTEENメンバーの所属チーム
  public boolean commonMember; // 「ブソクスン」と共通メンバーか否か

  // すべてのクラスからアクセス可能にするため、アクセス修飾子は「public]を使用
  // SEVENTEENクラス内のどのメソッドでも使えるようにメンバ変数を使用
  // メンバ変数を使用する時は、「this.変数名」と書く
  public SEVENTEEN(String teamAlphabet, String memberName, int age, String teamName) {
    this.teamAlphabet = teamAlphabet;
    this.memberName = memberName;
    this.age = age;
    this.teamName = teamName;
  }

  // getterメソッドを使って外部からメンバ変数を戻り値として返す
  // return文を使ってメンバ変数を戻り値と呼び出し元に返す
  public String getTeamAlphabet() {
    return teamAlphabet;
  }

  public String getMemberName() {
    return memberName;
  }

  public int getAge() {
    return age;
  }

  public String getTeamName() {
    return teamName;
  }

  // if文を使って条件分岐
  public void introduce() {
    if (commonMember) {
      System.out.println("◎ 「ブソクスン」のメンバーです。");
    } else {
      System.out.println("× 「ブソクスン」のメンバーではありません。");
    }
  }
}



