public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int start = 0;
        int end= n-1;
        int ans=n;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid] >= x) {
                ans = mid;
                //look for smaller index on the left
                end = mid - 1;
            } else {
                start = mid + 1; // look on the right
            }
        }
        return ans;
    }
}
