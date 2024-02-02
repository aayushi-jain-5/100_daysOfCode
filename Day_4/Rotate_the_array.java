import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer>ar = new ArrayList<>();
        for(int i=0;i<k;i++){
            a.add(arr.get(i));

        }
        for(int i=k;i<arr.size();i++){
            ar.add(arr.get(i));
            
        }
        for(int i=0;i<k;i++){
            ar.add(a.get(i));
            
        }
        return ar;
    }
}
