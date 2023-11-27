package assistedpracticeprograms;

public class JavaMethods {
	    // Method with no parameters and no return value
	    public void printMessage() {
	        System.out.println("This is a simple message.");
	    }

	    // Method with parameters and return value
	    public int addNumbers(int a, int b) {
	        return a + b;
	    }

	    // Static method
	    public static void staticMethod() {
	        System.out.println("This is a static method.");
	    }

	    public static void main(String[] args) {
	        // Creating an instance of Java Methods
	    	JavaMethods example = new JavaMethods();

	        // Calling a method with no parameters and no return value
	        example.printMessage();

	        // Calling a method with parameters and return value
	        int sum = example.addNumbers(5, 7);
	        System.out.println("Sum of numbers: " + sum);

	        // Calling a static method
	        staticMethod();

	        // Calling a static method using the class name
	        JavaMethods.staticMethod();

	        // Creating an instance to call a method
	        JavaMethods anotherExample = new JavaMethods();
	        anotherExample.printMessage();
	    }
	}