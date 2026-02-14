package Interview_Questions_String_Array;

import java.util.HashSet;

public class Q6_ArrayIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 5, 6};
        int[] array2 = {2, 3, 5, 7};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Add elements of array1 to set1
        for (int num : array1) {
            set1.add(num);
        }

        // Check which elements of array2 are in set1
        for (int num : array2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Print the intersection
        System.out.println("Intersection of the two arrays:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}