public class SumOfDigits{
    public static void main(String[] args) {
        int number = 6849;
        int sum = 0;

        // Loop through digits
        while (number > 0) {
            int digit = number % 10;  // get last digit
            sum += digit;             // add to sum
            number /= 10;             // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
    }
}