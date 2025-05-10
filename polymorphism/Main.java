package polymorphism;                       // Declares that this class is part of the 'polymorphism' package

public class Main {                         // Defines the main class named 'Main'

    public static void main(String[] args) {  // Main method: the program starts from here

        Shape s;                             // Declares a reference variable 's' of type 'Shape' (superclass)

        s = new Circle();                    // 's' refers to a new Circle object (subclass of Shape)
        s.draw();                            // Calls the overridden draw() method in Circle class

        s = new Rectangle();                 // Now 's' refers to a new Rectangle object
        s.draw();                            // Calls the overridden draw() method in Rectangle class
    }
}
