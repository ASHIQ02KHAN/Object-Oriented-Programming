package encapsulation;                       // Declares that this class is part of the 'encapsulation' package

public class Account {                       // Defines a public class named 'Account'

    private int balance = 1000;              // Declares a private integer field 'balance' initialized to 1000
                                             // 'private' means it can't be accessed directly from outside the class

    public int getBalance() {                // Public getter method to access the private 'balance' value
        return balance;                      // Returns the current balance
    }

    public void deposit(int amount) {        // Public method to add money to the balance
        if(amount > 0) balance += amount;    // Only adds if the deposit amount is positive
    }
}
