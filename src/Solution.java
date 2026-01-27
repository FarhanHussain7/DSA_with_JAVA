class Solution {
    public int[] plusOne(int[] digits) {
        // Traverse from the last digit backwards
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add 1 and return
                return digits;
            }
            digits[i] = 0;     // set to 0 and carry over
        }

        // If all digits were 9, we need a new array
        int[] result = new int[digits.length + 1];
        result[0] = 1;  // e.g. 999 + 1 = 1000
        return result;
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
//
//        int[] ex1 = {1,2,3};
//        int[] ex2 = {4,3,2,1};
        int[] ex3 = {9,9,9};

//        System.out.println(java.util.Arrays.toString(sol.plusOne(ex1))); // [1,2,4]
//        System.out.println(java.util.Arrays.toString(sol.plusOne(ex2))); // [4,3,2,2]
        System.out.println(java.util.Arrays.toString(sol.plusOne(ex3))); // [1,0]
    }
}