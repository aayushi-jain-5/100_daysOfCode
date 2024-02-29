import java.util.HashSet;

// import com.sun.tools.classfile.Opcode.Set;

public class Solution {
    public static String moreSubsequence(int n, int m, String a, String b) {
        // Write your code here
       
        HashSet<Character> st= new HashSet<>();
        HashSet<Character> s= new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(a.charAt(i));
        }
        for(int i=0;i<m;i++){
            s.add(b.charAt(i));
        }
        if(st.size()>s.size()) return a;
        else if(st.size()==s.size() && n>m)  return a;
        else if(st.size()==s.size() && n==m)  return a;
        else return b;
    }
}
