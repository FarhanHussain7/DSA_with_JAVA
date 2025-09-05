package Interview_String_Based_Question;

import java.util.HashSet;

public class Q4_PairsSumFinder {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, -1, 0, 1};
        int targetSum = 6;

        HashSet<Integer> seen = new HashSet<>();

        System.out.println("Pairs with sum " + targetSum + ":");
        for (int num : arr) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            seen.add(num);
        }
    }
}