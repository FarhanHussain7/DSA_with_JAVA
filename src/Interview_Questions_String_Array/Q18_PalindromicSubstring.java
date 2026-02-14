package Interview_Questions_String_Array;

import java.util.*;

public class Q18_PalindromicSubstring {

    public static List<String> findAllPalindromicSubstrings(String str) {
        Set<String> result = new HashSet<>();  // Use Set to avoid duplicates

        for (int center = 0; center < str.length(); center++) {
            // Odd-length palindromes
            expandAroundCenter(str, center, center, result);
            // Even-length palindromes
            expandAroundCenter(str, center, center + 1, result);
        }

        return new ArrayList<>(result);
    }

    private static void expandAroundCenter(String str, int left, int right, Set<String> result) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            result.add(str.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String input = "ababa";
        List<String> palindromes = findAllPalindromicSubstrings(input);
        System.out.println("Palindromic substrings: " + palindromes);
    }
}