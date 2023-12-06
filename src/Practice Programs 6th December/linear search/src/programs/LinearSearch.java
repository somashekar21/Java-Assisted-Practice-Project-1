package programs;

import java.util.Scanner;

public class LinearSearch {

    // Function to perform linear search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found, return the index
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        int[] array = {1, 5, 7, 9, 11, 13, 15};

        // Get the number to be searched from the user
        System.out.print("Enter the number to be searched: ");
        int target = scanner.nextInt();

        // Perform linear search
        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

        // Close the scanner
        scanner.close();
    }
}
