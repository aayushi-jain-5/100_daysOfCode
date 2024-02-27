/*
    Time Complexity : O(1)
    Space Complexity : O(1)
*/
public class Solution {
    public static int[] bitManipulation(int num, int i){
        
        int []ans = new int[3];
        int get = 0, set = 0, clear = 0;

        // Create a mask with a 1 in the 'i'th position and 0s in all other positions.
        int mask = (1 << (i-1));
        if((num & mask) != 0) {
            get = 1;
        }
        set = (num | mask);
        clear = (num & (~mask));
        ans[0] = get;
        ans[1] = set;
        ans[2] = clear;

        // Return the vector containing the results.
        return ans;
    }
}
