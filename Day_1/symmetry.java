/*
    Time Complexity : O( N*N )
    Space complexity: O( N*N )

    Where N is the dimension of the square matrix.
*/
public class Solution {
    public static void symmetry(int n) {

        // Update n with 2*n
        n = 2*n ;

        // For loop 'row' in range 0 to N-2.
        for(int row = 0; row < n-1; row++) {

            // For loop 'col' in range 0 to N-1.
            for(int col = 0; col < n; col++) {

                // Condition for first half of the rows.
                if (row < n/2 && (col <= row || col >= (n-row-1))) {
                    System.out.print("*");
                }

                // Condition for the second half of the rows.
                else if (row >= n/2 && (col < (n-row-1) || col > row)) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }

                System.out.print(" ");
            }

            // End the current row of the pattern.
            System.out.println();
        }
    }
}
