package O5_Functions;

import java.util.Scanner;

public class O2_Parameter_Function {
    // 2- Parameter function - they always take some input and process on it after that function return output
    // return keyword - this is use when function return integer value ,

    // Program - 1 Sum of the two value
    public static int Sumof(int a, int b) {
        int c = a + b;
        return c;
        //after return keyword no line will be executed
        //    System.out.println("not executed beacuse return already dealcare");
    }

    // Program - 2 Find Minimum number
    static int Minimum(int a, int b) {
        if (a > b) {
            System.out.print("B is minimum : ");
            return b;

        } else {
            System.out.print("A is minimum : ");
            return a;
        }
    }

    // Program - 3 Sum of the input number
    static int SumOfnum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Program - 4 Find the factorial of the given number
    static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }


    // Program -5 Calculate the sum of digits of a number
    static int Calculate(int num) {
        int digitSum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            digitSum = digitSum + lastDigit;
        }
        return digitSum;
    }

    //Program - 6  Calculate the nCr binomial coefficient for n & r
    static int nCrBinomial(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nMr = Factorial(n - r);
        return fact_n / (fact_r * fact_nMr);
    }

    // Program 7 - WAF to check if a number is prime or not
    public static boolean PrimeNumber(int n) {
        boolean flag = false;
        if (n <= 0) {
            System.out.println("Please enter the valid number");
        }

        for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("Number is not prime");
                    return flag = false;
                } else {
                    System.out.println("Number is Prime ");
                    return flag = true;
                }
            }
        return flag;
    }
    // Program 8 - WAF to print all prime number from 2 to n

        // Function to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            if (num == 2) {
                return true;
            }
            if (num % 2 == 0) {
                return false;
            }
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }


    // Program 9 - WAF to print nth Fibonacci.
   public static int fibonacci(int n) {
       if (n <= 1) {
           System.out.println("Please enter valid value " + n);
       } else {
           return fibonacci(n - 1) + fibonacci(n - 2);
       }

       return n;
   }

    public static void main(String[] args) {
        // 2- parameter function
//        System.out.println(Sumof(2,4));
//        int result = Sumof(10,20);
//        System.out.println(result);
//
//        int result1 = Minimum(10,20);
//        System.out.println(result1);
//
//
//        System.out.println("the sum of the input value : "+ SumOfnum(10));
//
//
//        System.out.println("Factorial is "+Factorial(4));
//
//
//        System.out.println("The sum of each digit : "+ Calculate(5643));
//
//
//        System.out.println("The Binomial value is : "+ nCrBinomial(8,3));
//
//        System.out.print(PrimeNumber(11));

      //  System.out.println(AllPrimeNum(10));
//
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Enter the upper limit (n): ");
//                int n = scanner.nextInt();
//
//                System.out.println("Prime numbers between 2 and " + n + " are:");
//
//                for (int i = 2; i <= n; i++) {
//                    if (isPrime(i)) {
//                        System.out.print(i + " ");
//                    }
//                }
//
//                scanner.close();

        int v = 4;

        System.out.println(fibonacci(v));
            }
        }


