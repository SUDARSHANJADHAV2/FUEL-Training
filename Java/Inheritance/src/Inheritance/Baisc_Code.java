package Inheritance;
import java.util.*;

class Animal {
    String name;
    int age;

    // Parent constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age); // initialize parent variables
        System.out.println(this.name + "'s Age is " + this.age + " is a Dog.");
    }
}

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    void display() {
        System.out.println(this.name + "'s Age is " + this.age + " is a Cat.");
    }
}

public class Baisc_Code {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        Dog d = new Dog(name, age);
        Cat c = new Cat("Kitty", 3);
        c.display();
    }
}
