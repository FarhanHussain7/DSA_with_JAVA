package Interview_String_Based_Question;

import java.util.*;

public class Q13_KAnagramChecker {

    public static boolean areKAnagrams(String str1, String str2, int k) {
        // Step 1: Check if lengths are equal
        if (str1.length() != str2.length()) return false;

        // Step 2: Count character frequencies
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for (char c : str1.toCharArray())
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);

        for (char c : str2.toCharArray())
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);

        // Step 3: Count extra characters in str1
        int changesNeeded = 0;
        for (char c : freq1.keySet()) {
            int count1 = freq1.get(c);
            int count2 = freq2.getOrDefault(c, 0);
            if (count1 > count2)
                changesNeeded += count1 - count2;
        }

        // Step 4: Compare with k
        return changesNeeded <= k;
    }

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "grammar";
        int k = 3;

        System.out.println(areKAnagrams(str1, str2, k)); // Output: true
    }
}