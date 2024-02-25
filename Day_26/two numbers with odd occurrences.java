// import java.util.*;

// public class Solution {
//     public static int[] twoOddNum(int []arr){
//         // Write your code here.
//         HashMap<Integer,Integer> mp= new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
//         }
//         int[] a = new int[2];
//         int j=1;
//         for(Integer mpp:mp.keySet()){
//             if(mp.get(mpp)%2!=0){
//                 a[j--]=mpp;
//             }
//         }
//          if (a[0] < a[1])
//         {
//             int x = a[0];
//             a[0] = a[1];
//             a[1] = x;
//         }

//         // Return the vector containing the two odd numbers.
//         return a;
        
//     }
// }


/*
    Time Complexity: O(n)

    Space Complexity: O(1)

    Where 'n' is the size of array 'arr'.
*/
public class Solution {
    public static int[] twoOddNum(int []arr){
        // Initialize a variable to hold the XOR result of all elements in 'arr'.
        int xorResult = 0;

        // Get the size of the 'arr' vector.
        int n = arr.length;

        // Create a vector to hold the two odd numbers that are found.
        int []ans = new int[2];
        int count = 0;

        // Calculate the XOR of all elements in 'arr'.
        for (int value : arr) {
            xorResult = xorResult ^ value;
        }

        // Find the rightmost set bit in the XOR result.
        int k = xorResult & (-xorResult);

        // Initialize variables to hold the XOR of the two groups of numbers.
        int group1XOR = 0;
        int group2XOR = 0;

        // Divide the elements of 'arr' into two groups based on the 'kth' bit.
        for (int j : arr) {
            if ((j & k) > 0) {
                group1XOR = group1XOR ^ j;
            } else {
                group2XOR = group2XOR ^ j;
            }
        }

        // Determine which of the two groups contains the smaller odd number.
        int odd1 = group1XOR;
        int odd2 = group2XOR;
        if (odd1 < odd2)
        {
            ans[count++] = odd2;
            ans[count++] = odd1;
        }
        else
        {
            ans[count++] = odd1;
            ans[count++] = odd2;
        }

        // Return the vector containing the two odd numbers.
        return ans;
    }
}
