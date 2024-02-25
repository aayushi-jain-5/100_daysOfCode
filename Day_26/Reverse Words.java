/*
    Time Complexity: O(N)
    Space Complexity: O(N)

    Where 'N' is the length of the string 'str'.
*/

public class Solution {
    public static String revWords(String str) {
        // If the input string is empty, return the same string.
        if (str.length() == 0) {
            return str;
        }

        // Initialize an empty string to store the reversed words.
        StringBuilder ans = new StringBuilder();

        // If the input string has only one character, which is a space, return an empty string.
        if (str.length() == 1 && str.charAt(0) == ' ') {
            return ans.toString();
        }

        // Initialize the index 'i' to the last character of the input string.
        int i = str.length() - 1;

        // Loop through the input string from the end to the beginning.
        while (i >= 0) {

            // Skip multiple spaces by decrementing the index 'i'
            if (str.charAt(i) == ' ') {
                i--;
            } else {

                // If there is already a word in the 'ans', add a space before the next word.
                if (ans.length() > 0) {
                    ans.append(" ");
                }

                // Initialize index 'j' to the current value of 'i'.
                int j = i;

                // Loop for extracting the current word by moving 'j' to the beginning of the word.
                while (j >= 0 && str.charAt(j) != ' ') {
                    j--;
                }

                // Add the current word to the 'ans' by extracting the substring from 'j+1' to 'i'.
                ans.append(str.substring(j + 1, i + 1));

                // Update 'i' to the value of 'j' to move to the next word in the next iteration.
                i = j;
            }
        }

        // Return the final reversed string containing words separated by a single space.
        return ans.toString();
    }
}
