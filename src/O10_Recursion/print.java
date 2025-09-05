package O10_Recursion;

import java.util.Scanner;

public class print {
    public static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
//
//        for (int i = 0; i <n; i++) {
//            System.out.println(i);
//        }
        pattern(n);
    }
}
