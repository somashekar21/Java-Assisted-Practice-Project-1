package programs;

import java.util.Arrays;

public class Subsequence {

    public static int longestIncreasingSubsequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] lis = new int[n];
        Arrays.fill(lis, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        int maxLIS = Arrays.stream(lis).max().orElse(1);
        return maxLIS;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 10, 2, 1, 20};
        int result = longestIncreasingSubsequence(numbers);

        System.out.println("Longest Increasing Subsequence Length: " + result);
    }
}

