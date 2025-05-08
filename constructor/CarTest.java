package constructor;                           // Declares that this class belongs to the 'constructor' package

public class CarTest {                         // Defines a public class named 'CarTest'

    public static void main(String[] args) {   // Main method: the program's entry point

        Car car1 = new Car("Toyota", 2025);    // Creates a new Car object with model "Toyota" and year 2020
                                               // Calls the constructor of the Car class with these values

        car1.display();                        // Calls the display() method to print the car's details
    }
}
