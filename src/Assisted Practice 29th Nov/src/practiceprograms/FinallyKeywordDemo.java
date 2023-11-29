package practiceprograms;

public class FinallyKeywordDemo {

    public static void main(String[] args) {
        try {
            performOperation();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    private static void performOperation() {
        // Simulating an exception during the operation
        throw new RuntimeException("Error during operation.");
    }
}
