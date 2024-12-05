// Superclass (Parent class)
class Animal {
    void eat() {
        System.out.println("The animal eat.");
    }
}

// Subclass (Child class) for Dog
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass (Child class) for Cat
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// Main class to demonstrate the hierarchical inheritance
public class Animal_test {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat classes
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        // Calling the sound method for both objects
        dog.eat();  // Output: The dog barks.
        cat.meow();  // Output: The cat meows.
    }
}
