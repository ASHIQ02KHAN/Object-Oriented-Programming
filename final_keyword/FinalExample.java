package final_keyword;

public class FinalExample {
    final int MAX = 100;  // final variable cannot be changed

    final void display() {  // final method cannot be overridden
        System.out.println("MAX is: " + MAX);
    }

    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        obj.display();
    }
}
