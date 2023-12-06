package programs;

public class ExponentialSearch {

    // Function to perform exponential search
    public static int exponentialSearch(int[] array, int target) {
        int n = array.length;

        // If the target is the first element
        if (array[0] == target) {
            return 0;
        }

        // Find the range for binary search
        int i = 1;
        while (i < n && array[i] <= target) {
            i *= 2;
        }

        // Perform binary search within the found range
        return binarySearch(array, target, i / 2, Math.min(i, n - 1));
    }

    // Function to perform binary search within a specific range
    private static int binarySearch(int[] array, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid; // Target found, return the index
            } else if (array[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 9, 11, 13, 15};
        int target = 9;

        int result = exponentialSearch(array, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
