import java.util.*;
public class Solution{
    public static int missingNumber(int n, int []arr){
        // Write your code here.
        HashMap < Integer, Integer > mp = new HashMap < > ();
    for (int i = 0; i < n; i++) {
      if (mp.containsKey(arr[i]))
        
        mp.put(arr[i], mp.get(arr[i]) + 1);
 
      else
        mp.put(arr[i], 1);
 
    }
    for (Integer it: mp.keySet()) {
      if (mp.get(it) % 2 != 0)
        return it;
    }
    return -1;

    }
}
