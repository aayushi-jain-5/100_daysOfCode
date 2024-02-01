public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] fibonacciNumbers = new int[n];
        if (n >= 1) {
            fibonacciNumbers[0] = 0;
        }
        if (n >= 2) {
            fibonacciNumbers[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        return fibonacciNumbers;
    }
}
