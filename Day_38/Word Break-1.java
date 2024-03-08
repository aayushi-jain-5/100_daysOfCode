import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static List<String> getAllValidSentences(String s, String[] dict) {
        List<String> str = new ArrayList<>();
        HashSet<String> dict1 = new HashSet<>();
        for (String word : dict) {
            dict1.add(word);
        }
        word(s, str, "", dict1);
        return str;
    }

    public static void word(String s, List<String> str, String ans, HashSet<String> dict1) {
        if (s.length() == 0) {
            str.add(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String left = s.substring(0, i + 1);
            if (dict1.contains(left)) {
                String right = s.substring(i + 1);
                word(right, str, ans + left + " ", dict1);
            }
        }
    }
}
