package se.dsve;

public class Person {
    String name;
    int age;
    String email;

    // Konstruktor 1
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Konstruktor 2
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = "Example2@gmail.com";
    }

    // Konstruktor 3
    public Person() {
        this.name = "Anton";
        this.age = 25;
        this.email = "Standard@gmail.com";
    }

    // Skriver ut information
    void personInfo(){
        System.out.println("Name: " + name + " Age: " + age + " Email: " + email);
    }
}
