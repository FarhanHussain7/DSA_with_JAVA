package Interview_Questions_String_Array;

import java.util.*;

public class Q11_DistinctElementsInWindow {

    public static void countDistinct(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int n = arr.length;

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Window 0: " + freqMap.size());

        // Slide the window
        for (int i = k; i < n; i++) {
            // Remove the element going out of the window
            int outgoing = arr[i - k];
            freqMap.put(outgoing, freqMap.get(outgoing) - 1);
            if (freqMap.get(outgoing) == 0) {
                freqMap.remove(outgoing);
            }

            // Add the new element coming into the window
            int incoming = arr[i];
            freqMap.put(incoming, freqMap.getOrDefault(incoming, 0) + 1);

            System.out.println("Window " + (i - k + 1) + ": " + freqMap.size());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        countDistinct(arr, k);
    }
}