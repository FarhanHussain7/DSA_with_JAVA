package Interview_String_Based_Question;

import java.util.HashSet;

public class Q2_Duplicate {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 4, 5, 2, 3, 6};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements:");
            for (int dup : duplicates) {
                System.out.println(dup);
            }
        }
    }
}