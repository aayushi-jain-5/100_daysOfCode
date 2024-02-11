import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<String> printNtimes(int n){
        List<String> strList = new ArrayList<>();
        if (n <= 0) {
            return strList;
        }
        strList.add("Coding Ninjas");
        List<String> recursiveList = printNtimes(n - 1);
        strList.addAll(recursiveList);

        return strList;
    }
}
