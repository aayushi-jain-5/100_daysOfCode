public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
