public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        if(arr.length==1)return arr[0];
        int n= arr.length;
        if(arr[n-1]!=arr[n-2])return arr[n-1];
        if(arr[0]!=arr[1])return arr[0];
        int i=0;
        for(i=1;i<arr.length - 1;i++){
            if(arr[i-1]!=arr[i] && arr[i]!=arr[i+1]){
                return arr[i];
            }

        }
        
        return 0;
    }
}
