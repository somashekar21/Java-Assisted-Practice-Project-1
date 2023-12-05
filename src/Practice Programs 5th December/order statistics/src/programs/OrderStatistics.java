package programs;

import java.util.Arrays;

public class OrderStatistics {

    public static void main(String[] args) {
        int[] unsortedList = {10, 5, 8, 3, 7, 1, 9, 4, 2, 6};

        int fourthSmallest = findFourthSmallestElement(unsortedList);

        System.out.println("The fourth smallest element is: " + fourthSmallest);
    }

    static int findFourthSmallestElement(int[] arr) {
        if (arr.length < 4) {
            System.out.println("The array does not have at least four elements.");
            return -1; 
        }

       
        int k = 4; 
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        return sortedArr[k - 1];  
    }
}
