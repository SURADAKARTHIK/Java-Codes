// Parent class
class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

// Main class to test inheritance
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();  // Creating object of child class

        // Child class can access parent class methods
        d.eat();   // Inherited method from Animal
        d.bark();  // Method of Dog
    }
}
