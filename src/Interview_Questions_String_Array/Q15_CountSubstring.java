package Interview_Questions_String_Array;

public class Q15_CountSubstring {

    public static int countSubstrings(String str) {
        int n = str.length();
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        String input = "abcde";
        System.out.println("Total substrings: " + countSubstrings(input));  // Output: 15
    }
}