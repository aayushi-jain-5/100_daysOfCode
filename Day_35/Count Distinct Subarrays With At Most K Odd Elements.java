public class Solution {
    public static int distinctSubKOdds(int []nums, int k) {
        // Write your code here
        
        int i=0;
        int j=0;
        int oddCount=0;
        int count=0;
        int temp=0;
        
        while(j<nums.length){
            if(nums[j]%2==1){
                oddCount++;
                temp=0;
            }
            while(oddCount==k){
                temp++;
                if(nums[i]%2==1){
                    oddCount--;
                }
                i++;
            }
            count+=temp;
            j++;
        }
        return count;
    }
}
    
