package O6_Binary_Number_System;

public class DecimalToBinary {
    public static int decimaltoBin(int DecNum){
        int ans = 0 , pow = 1;
        while (DecNum>0){  // It will check number is greater than zero or not
            int reminder = DecNum % 2 ;   // Take reminder one-by-one
            DecNum /= 2;                // It will slice value one-by-one
             ans += (reminder * pow);   // it will save values in backward by multiplying pow
             pow *= 10;             // power will increase by every value
        }
        return ans;
    }
    public static void main(String[] args) {
        int Decimal  = 30;
        System.out.println(decimaltoBin(Decimal));

        // Find Binary all the number
        for (int i = 1 ; i<= 10 ; i++){
            System.out.println(decimaltoBin(i));
        }
    }
}
