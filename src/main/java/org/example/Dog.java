package org.example;

public class Dog {

  private String name;

  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Dog(String name) {
    this.name = name;
    this.age = 0;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void bark() {
    if (age >= 5) {
      System.out.println("バウバウ！！！！！");
    } else {
      System.out.println("ワンワン");
    }
  }

  public void sit() {
    if (age == 0) {
      System.out.println("上手く座れなかった");
      bark();
    } else {
      System.out.println("座る");
    }
  }

  public void eat(String food) {
    if (food.equals("肉")) {
      System.out.println("おいしい！！！");
    } else {
      System.out.println("まずい！！");
    }
  }
}
