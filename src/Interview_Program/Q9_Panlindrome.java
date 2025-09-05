package Interview_Program;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Scanner;

public class Q9_Panlindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string :");

        String Str = sc.next();

        String Org_str = Str;

        String rev = " ";

        int len = Str.length();
        for (int i = len-1; i>=0; i--){
            rev=rev+Str.charAt(i);
        }
        // Reverse print
        //System.out.println(rev);

        if (Org_str.equals(rev)){
            System.out.println(Org_str+" is Palindrome string");
        }else {
            System.out.println(Org_str+ " is not a palindrome string");
        }

    }
}

/*    Scanner scanner = new Scanner(System.in);

        // Input: Getting the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Removing spaces and converting to lowercase for uniformity
        String cleanedString = inputString.replaceAll("\\s+", "").toLowerCase();

        // Checking if the string is a palindrome
        boolean isPalindrome = checkPalindrome(cleanedString);

        // Output: Displaying the result
        if (isPalindrome) {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
        */

