package Interview_String_Based_Question;

import java.util.*;

public class Q12_DuplicateCharacter {

    public static void printDuplicates(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        String input = "programming";
        printDuplicates(input);
    }
}