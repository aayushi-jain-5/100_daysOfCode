import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int arr[]) {
        int N=arr.length;
        ArrayList < Integer > sumSubset = new ArrayList < > ();
        subsetSumsHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
        // Write your code here..
    }
    public static void subsetSumsHelper(int ind, int sum, int[] arr, int N, ArrayList < Integer > sumSubset) {
        if (ind == N) {
            sumSubset.add(sum);
            return;
        }

        // pick the element 
        subsetSumsHelper(ind + 1, sum + arr[ind], arr, N, sumSubset);

        // Do-not pick the element
        subsetSumsHelper(ind + 1, sum, arr, N, sumSubset);
    }

   

}
