import java.util.*;
public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        ArrayList<Integer>arr=new ArrayList<>();
        // Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                arr.add(a[i]);
            }
        }
        int[] ar=new int[n];
        for(int i=0;i<arr.size();i++){
            ar[i]=arr.get(i);
        }
        return ar;
    }
}
