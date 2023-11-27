package assistedpracticeprograms;

public class ImplicitAndExplicit {

	public static void main(String[] args) {
		 // Implicit type casting
	    byte b = 10;
	    int i = b; // byte to int
	    long l = i; // int to long
	    float f = l; // long to float
	    double d = f; // float to double

	    // Explicit type casting
	    int x = 100;
	    byte y = (byte) x; // int to byte
	    short z = (short) y; // byte to short

	    System.out.println("byte value: " + b);
	    System.out.println("int value: " + i);
	    System.out.println("long value: " + l);
	    System.out.println("float value: " + f);
	    System.out.println("double value: " + d);
	    System.out.println("byte value: " + y);
	    System.out.println("short value: " + z);

	}

}
