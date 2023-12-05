package programs;

public class RangeQueries {
    static int k = 16;
    static int N = 100000;
    static long table[][] = new long[N][k + 1];

    static void buildSparseTable(int arr[], int n) {
        for (int i = 0; i < n; i++)
            table[i][0] = arr[i];
        for (int j = 1; j <= k; j++)
            for (int i = 0; i <= n - (1 << j); i++)
                table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1];
    }

    static long query(int L, int R) {
        long answer = 0;
        for (int j = k; j >= 0; j--) {
            if (L + (1 << j) - 1 <= R) {
                answer = answer + table[L][j];
                L += 1 << j;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        buildSparseTable(arr, n);

        // Example range queries
        System.out.println(query(0, 4)); // Sum of elements in range [0, 4]
        System.out.println(query(2, 6)); // Sum of elements in range [2, 6]
        System.out.println(query(1, 9)); // Sum of elements in range [1, 9]
    }
}
