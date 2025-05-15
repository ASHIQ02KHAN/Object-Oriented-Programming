package interface_example; // Declares that this class is part of the 'interface_example' package

public class Bkash implements Payment { // Defines a public class named 'Bkash' that implements the 'Payment' interface

    public void pay(double amount) { // Overrides the 'pay' method defined in the Payment interface, taking a double amount as argument
        System.out.println("Paying " + amount + " via Bkash."); // Prints the payment method and amount to the console
    }
}
