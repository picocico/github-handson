package org.example;

public class Animal {

    private String name;

    private int age;

    private boolean isHungry;

    public Animal(String name, int age, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void feed() {
        isHungry = false;
    }
}