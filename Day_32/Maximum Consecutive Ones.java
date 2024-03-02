import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
        int left = 0; // Left pointer for the window
        int right = 0; // Right pointer for the window
        int maxOnesCount = 0; // Maximum count of ones encountered

        // Iterate through the array
        while (right < n) {
            if (arr.get(right) == 1) {
                right++;

                // Update maxOnesCount if necessary
                maxOnesCount = Math.max(maxOnesCount, right - left);
            } else if (k > 0) {
                // If the current element is 0 and we can still flip zeros
                k--;
                right++;
                // Update maxOnesCount if necessary
                maxOnesCount = Math.max(maxOnesCount, right - left);
            } else {
                // If we can't flip any more zeros, move the left pointer
                if (arr.get(left) == 0) {
                    // If the left pointer is pointing to a zero, move it until it's pointing to a one
                    k++;
                }
                left++;
            }
        }

        return maxOnesCount;
    }
}
