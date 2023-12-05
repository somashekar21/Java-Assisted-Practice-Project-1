package programs;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int positionsToRotate = 2;

        System.out.println("Original Array: ");
        printArray(arr);

        rotateArray(arr, positionsToRotate);

        System.out.println("\nArray after rotation: ");
        printArray(arr);
    }

    // Function to rotate an array to the right by 'positions' positions
    static void rotateArray(int[] arr, int positions) {
        int n = arr.length;
        int[] temp = new int[positions];

        // Store the last 'positions' elements in a temporary array
        for (int i = 0; i < positions; i++) {
            temp[i] = arr[n - positions + i];
        }

        // Shift the remaining elements to the right
        for (int i = n - 1; i >= positions; i--) {
            arr[i] = arr[i - positions];
        }

        // Copy the elements from the temporary array to the beginning of the array
        for (int i = 0; i < positions; i++) {
            arr[i] = temp[i];
        }
    }

    // Function to print the elements of an array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
