package polymorphism;                         // Declares that this class belongs to the 'polymorphism' package

public class Rectangle extends Shape {        // Defines a public class 'Rectangle' that inherits from 'Shape'

    void draw() {                             // Overrides the draw() method from the Shape class (no return type)
        System.out.println("Drawing a rectangle"); // Prints a message specific to Rectangle
    }
}
