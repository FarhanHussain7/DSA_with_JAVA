package Interview_String_Based_Question;

import java.util.*;

public class Q17_LongestUniqueSubstring {

    public static int longestUniqueSubstr(String str) {
        int maxLength = 0;
        int left = 0;
        Set<Character> seen = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            char current = str.charAt(right);

            // Shrink window if character is repeated
            while (seen.contains(current)) {
                seen.remove(str.charAt(left));
                left++;
            }

            seen.add(current);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest substring length: " + longestUniqueSubstr(input));  // Output: 3
    }
}