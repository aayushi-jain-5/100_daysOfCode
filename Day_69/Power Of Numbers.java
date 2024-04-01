import java.util.*;
/*
    Time Complexity: O(R)

    Space Complexity: O(1)

    Where 'R' is the number obtained by reversing 'N'.
*/
/*
    Time Complexity: O(LogR)

    Space Complexity: O(1)

    Where 'R' is the number obtained by reversing 'N'.
*/
public class Solution {
    public static int power(int N, int R){
        int mod = 1000000007;

        // Initialising 'ans' to 1.
        int ans = 1;

        // Initialising 'num' to 'N'.
        int num = N;

        while (R != 0)
        {

            // If bit is set.
            if (R % 2 == 1)
            {

                // Checking for overflow.
                ans = (int)((ans *(1L)* num) % mod);
            }
            num = (int)((num *(1L)* num) % mod);
            R = R / 2;
        }
        return ans;
    }
}
