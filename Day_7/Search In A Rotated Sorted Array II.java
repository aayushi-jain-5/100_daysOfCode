import java.util.*;
public class Solution {
    public static boolean searchInARotatedSortedArrayII(int []A, int key) {
        // Write your code here.
        Arrays.sort(A);
        int n = A.length;
        int start=0;int end= n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(A[mid]==key){
                return true;
            }
            if(A[mid]<key){
                start=mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return false;
    }
}
