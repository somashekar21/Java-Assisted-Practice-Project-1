package assistedpracticeprograms;

public class AccessModifiers {

    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Protected method accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default (package-private) method accessible within the same package
    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    public static void main(String[] args) {
        // Creating an instance of PrivateAccessModifier
        AccessModifiers example = new AccessModifiers();

        // Accessing public method
        example.publicMethod();

        // Accessing private method (within the same class)
        example.privateMethod();

        // Accessing protected method
        example.protectedMethod();

        // Accessing default method
        example.defaultMethod();
    }
}