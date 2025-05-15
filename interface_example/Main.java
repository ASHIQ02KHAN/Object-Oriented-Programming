package interface_example;  // Declaring the package 'interface_example'

public class Main {  // Declaring the 'Main' class
    public static void main(String[] args) {  // Main method - entry point of the program
        Payment p = new Bkash();  // Creating an object of the Bkash class, which implements the Payment interface
        p.pay(1000);  // Calling the pay method of the Bkash class with 1000 as the argument
    }  
}  
