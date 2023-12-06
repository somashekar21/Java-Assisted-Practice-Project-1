package programs;

public class QuickSort {

    // Function to perform quick sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the partition index such that elements smaller than pivot are on the left, and elements greater are on the right
            int partitionIndex = partition(array, low, high);

            // Recursively sort the sub-arrays
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Function to partition the array and return the partition index
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(array);

        // Perform quick sort
        quickSort(array, 0, array.length - 1);

        System.out.println("\nArray after Quick Sort:");
        printArray(array);
    }

    // Helper function to print an array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
