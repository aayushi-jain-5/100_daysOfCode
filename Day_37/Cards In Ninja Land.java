/*
    Time Complexity  : O(N*LogN)
    Space Complexity : O(N)

    Where 'N' is the number of card.
*/

import java.util.Arrays;
import java.util.HashMap;
public class Solution {
    public static boolean findGroups(int []cards, int groupsize) {
        // Number of card.
        int n = cards.length;

        // Make hash map 'countMap' to count the frequency of elements of 'CARDS'.
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            countMap.put(cards[i], countMap.getOrDefault(cards[i], 0) + 1);
        }

        // Sort the 'CARDS' array.
        Arrays.sort(cards);

        // Iterate over the 'CARDS' array.
        for (int i = 0; i < n; i++)
        {
            // If no card is left, we continue to next card.
            if (countMap.get(cards[i]) == 0) {
                continue;
            }

            // For each card of current group, we update their frequencies.
            for (int x = cards[i] + groupsize - 1; i >= x; i--) {

                // If the frequency of the number is less than 'countMap[x]'',
                // return false since the desired group cannot be formed.
                if (countMap.get(cards[x]) < countMap.get(cards[i])) {
                    return false;
                }
                countMap.put(cards[x], countMap.get(cards[x])-countMap.get(cards[i]));
            }
        }

        // Return true if we have successfully established all groups.
        return true;
    }
}/*
    Time Complexity  : O(N*LogN)
    Space Complexity : O(N)

    Where 'N' is the number of card.
*/

import java.util.Arrays;
import java.util.HashMap;
public class Solution {
    public static boolean findGroups(int []cards, int groupsize) {
        // Number of card.
        int n = cards.length;

        // Make hash map 'countMap' to count the frequency of elements of 'CARDS'.
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            countMap.put(cards[i], countMap.getOrDefault(cards[i], 0) + 1);
        }

        // Sort the 'CARDS' array.
        Arrays.sort(cards);

        // Iterate over the 'CARDS' array.
        for (int i = 0; i < n; i++)
        {
            // If no card is left, we continue to next card.
            if (countMap.get(cards[i]) == 0) {
                continue;
            }

            // For each card of current group, we update their frequencies.
            for (int x = cards[i] + groupsize - 1; i >= x; i--) {

                // If the frequency of the number is less than 'countMap[x]'',
                // return false since the desired group cannot be formed.
                if (countMap.get(cards[x]) < countMap.get(cards[i])) {
                    return false;
                }
                countMap.put(cards[x], countMap.get(cards[x])-countMap.get(cards[i]));
            }
        }

        // Return true if we have successfully established all groups.
        return true;
    }
}
