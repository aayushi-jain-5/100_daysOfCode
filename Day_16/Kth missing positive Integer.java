/*
    Time complexity : O(N)
    Space complexity : O(1)

    Where 'N' is the number of elements in the vecay.
*/

public class Solution {

    public static int missingK(int[] arr, int n, int k) {
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int missing = (arr[mid]-(mid+1));
            if(missing<k)
            low=mid+1;
            else high=mid-1;

        }   
        return high+1+k;
    }
}
