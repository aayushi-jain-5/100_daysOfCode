import java.util.*;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int[] ar=new int[2];
        Arrays.sort(a);
        ar[0]=a[n-2];
        ar[1]=a[1];

        return ar;
    }
}
