package Interview_String_Based_Question;

public class Q16_RotatedPalindromeChecker {

    // Check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--))
                return false;
        }
        return true;
    }

    // Check all rotations
    public static boolean isRotatedPalindrome(String str) {
        int n = str.length();
        String doubled = str + str;  // Concatenate to simulate rotations

        for (int i = 0; i < n; i++) {
            String rotation = doubled.substring(i, i + n);
            if (isPalindrome(rotation)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "aab";
        System.out.println(isRotatedPalindrome(input));  // Output: true
    }
}