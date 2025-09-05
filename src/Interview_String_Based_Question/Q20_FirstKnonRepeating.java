package Interview_String_Based_Question;

import java.util.*;

public class Q20_FirstKnonRepeating {

    public static List<Character> firstKNonRepeating(String str, int k) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        List<Character> result = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

            // Check if this character is non-repeating and not already in result
            if (freqMap.get(ch) == 1 && result.size() < k) {
                result.add(ch);
            }

            // If this character becomes repeating, remove it from result
            if (freqMap.get(ch) == 2) {
                result.remove((Character) ch);
            }
        }

        // Trim result to k elements
        while (result.size() > k) {
            result.remove(result.size() - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "geeksforgeeks";
        int k = 3;
        List<Character> output = firstKNonRepeating(input, k);
        System.out.println("First " + k + " non-repeating characters: " + output);
    }
}