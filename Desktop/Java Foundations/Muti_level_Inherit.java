// Parent class
class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dogs can bark");
    }
}

// Grandchild class inheriting from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppies can weep");
    }
}

// Main class to test multi-level inheritance
public class Muti_level_Inherit {
    public static void main(String[] args) {
        Puppy p = new Puppy();  // Creating object of grandchild class

        // Access methods from all levels
        p.eat();   // From Animal
        p.bark();  // From Dog
        p.weep();  // From Puppy
    }
}
