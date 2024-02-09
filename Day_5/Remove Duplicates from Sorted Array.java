import java.util.HashSet;

public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        HashSet<Integer>set= new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}
