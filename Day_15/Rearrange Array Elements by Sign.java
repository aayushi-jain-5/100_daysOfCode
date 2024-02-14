class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int[]arr=new int[n/2];
        int[]arr1=new int[n/2];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[j++]=nums[i];
            }
            else{
                arr1[k++]=nums[i];
            }
        }
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=arr[x++];
            }
            else {
                nums[i]=arr1[y++];
            }
        }
        return nums;
    }
}
