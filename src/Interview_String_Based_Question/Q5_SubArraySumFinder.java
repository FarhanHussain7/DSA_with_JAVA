package Interview_String_Based_Question;

public class Q5_SubArraySumFinder {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > targetSum && start < end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == targetSum) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray with given sum found.");
    }
}