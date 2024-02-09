public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
        int l=0;
        int r= nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(nums[mid]<target){
                l= mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
}
