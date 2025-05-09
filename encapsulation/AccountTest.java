package encapsulation;                           // Declares that this class belongs to the 'encapsulation' package

public class AccountTest {                       // Defines a public class named 'AccountTest'

    public static void main(String[] args) {     // Main method: program execution starts here

        Account acc = new Account();             // Creates a new Account object named 'acc'

        acc.deposit(500);                        // Calls the deposit method to add 500 to the account balance

        System.out.println("Balance: "+ acc.getBalance());  // Prints the current balance using the getBalance() method,Output will be: Balance: 1500
                             
    }
}
