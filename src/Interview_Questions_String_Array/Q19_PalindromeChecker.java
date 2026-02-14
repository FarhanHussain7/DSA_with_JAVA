package Interview_Questions_String_Array;

public class Q19_PalindromeChecker {

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is palindrome: " + isPalindrome(input));  // Output: true
    }
}