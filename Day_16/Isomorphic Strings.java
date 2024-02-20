
import java.util.*;
public class Solution {
    public static boolean areIsomorphic(String s, String t) {
        // Write your code here.
        if(s.length()!= t.length()) return false;
        Set<Character> st= new HashSet<Character>();
       Set<Character> st1= new HashSet<Character>();

        for(int i=0;i<s.length()-1;i++){
            st.add(s.charAt(i));
        }
         for(int i=0;i<t.length()-1;i++){
            st1.add(t.charAt(i));
        }
        if(st.size()==st1.size()){
            return true;
        }
        return false;

    }
}
