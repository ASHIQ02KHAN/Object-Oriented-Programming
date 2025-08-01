package exception_handling;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        
        try {
            // Trying to access an invalid index (this will cause an exception)
            System.out.println("Accessing element: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // This block will execute if an exception occurs
            System.out.println("Exception caught: " + e);
        } finally {
            // This block always executes regardless of an exception
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
