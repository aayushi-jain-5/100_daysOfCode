import java.util.*;
public class Solution {
    public static int[] nextGreaterElement(int[] nums, int n) {
        // Write your code here.
        
        int nge[] = new int[n];
        Stack < Integer > st = new Stack < > ();
        for (int i = n-1;i>=0;i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(nums[i]);
        }
        return nge;
        
    }
}
