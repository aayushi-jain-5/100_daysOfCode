
public class Solution {
    public static void getNumberPattern(int n) {
        int k = 2 * n - 1;
        
        // Calculating the values in each cell and printing.
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                int x = Math.abs(i - n + 1);
                int y = Math.abs(j - n + 1);
                int currCell = (int)Math.max(x, y) + 1;
                System.out.print(currCell);
            }
            System.out.println();
        }
    }
}
