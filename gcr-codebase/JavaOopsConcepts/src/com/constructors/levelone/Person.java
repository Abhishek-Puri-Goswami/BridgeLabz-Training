package com.constructors.levelone;

public class Person {
    String name;
    int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // method to display results
    public void display() {
        System.out.println("{ " + name + ", " + age + " }");
    }

    // main - driver method
    public static void main(String[] args) {
        Person p1 = new Person("Abhishek", 22);
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}
