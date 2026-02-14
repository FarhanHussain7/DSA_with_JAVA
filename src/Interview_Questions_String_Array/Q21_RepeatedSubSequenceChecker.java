package Interview_Questions_String_Array;

import java.util.*;

public class Q21_RepeatedSubSequenceChecker {

    public static boolean hasRepeatedSubsequence(String str) {
        int[] freq = new int[256];

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            freq[ch]++;
            if (freq[ch] >= 3) return true;  // Guaranteed repeat
        }

        // Check for any two-character subsequence that repeats
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String pair = "" + str.charAt(i) + str.charAt(j);
                if (seen.contains(pair)) return true;
                seen.add(pair);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String input = "aab";
        System.out.println("Has repeated subsequence: " + hasRepeatedSubsequence(input));  // Output: true
    }
}