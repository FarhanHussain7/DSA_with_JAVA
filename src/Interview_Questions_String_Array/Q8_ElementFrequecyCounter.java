package Interview_Questions_String_Array;

import java.util.HashMap;

public class Q8_ElementFrequecyCounter {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 5, 3, 2, 4};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display results
        System.out.println("Element frequencies:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " → " + frequencyMap.get(key));
        }
    }
}