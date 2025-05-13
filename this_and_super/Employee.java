package this_and_super;

public class Employee extends Person {
    double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        // 'super' refers to the constructor of the superclass (Person)
        super(name, age);  // Calling Person constructor
        this.salary = salary;  // 'this' refers to the current object's salary
    }

    // Method to display information including salary
    public void displayInfo() {
        super.displayInfo();  // 'super' calls the superclass method
        System.out.println("Salary: " + salary);
    }
}
