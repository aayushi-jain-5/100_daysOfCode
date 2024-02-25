import java.util.ArrayList;
import java.util.List;
public class Solution{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        return arr;
    }
}
