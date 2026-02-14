package Interview_Questions_String_Array;

public class Q7_MissingNumberFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing number is 3
        int n = arr.length + 1;      // Total numbers should be 6

        // Formula: Sum of first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Actual sum of array elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number is: " + missingNumber);
    }
}