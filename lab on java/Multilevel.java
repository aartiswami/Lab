// Superclass (Parent class)
class Shape {
    // Method to display the type of shape
    void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass (Child class) for Rectangle
class Rectangle extends Shape {
    // Method to display the dimensions of a rectangle
    void displayRectangle() {
        System.out.println("This is a rectangle.");
    }
}

// Subclass (Child class) for Square, which inherits from Rectangle
class Square extends Rectangle {
    // Method to display the type of square
    void displaySquare() {
        System.out.println("This is a square.");
    }
}

// Main class to demonstrate the multilevel inheritance
public class Multilevel {
    public static void main(String[] args) {
        // Creating an object of Square class
        Square square = new Square();
        
        // Calling methods from Shape, Rectangle, and Square classes
        square.display();       // Inherited from Shape class
        square.displayRectangle();   // Inherited from Rectangle class
        square.displaySquare();      // Defined in Square class
    }
}
