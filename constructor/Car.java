package constructor;                         // Declares that this class belongs to the 'constructor' package

public class Car {                           // Defines a public class named 'Car'

    String model;                            // Declares a string variable 'model' to store the car's model
    int year;                                // Declares an integer variable 'year' to store the car's manufacturing year

    public Car(String model, int year) {     // Constructor with parameters to initialize the object
        this.model = model;                  // 'this.model' refers to the current object's model; assigns input to it
        this.year = year;                    // 'this.year' refers to the current object's year; assigns input to it
    }

    public void display() {                  // Method to print car details
        System.out.println("Model: " + model // Prints the model
                           + ", Year: " + year); // Prints the year
    }
}
