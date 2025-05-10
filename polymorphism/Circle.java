package polymorphism;                         // Declares that this class belongs to the 'polymorphism' package

public class Circle extends Shape {           // Defines a public class 'Circle' that inherits from 'Shape'

    void draw() {                             // Overrides the draw() method from the Shape class
        System.out.println("Drawing a circle"); // Prints a message specific to Circle
    }
}
