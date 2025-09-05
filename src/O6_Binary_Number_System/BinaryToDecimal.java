package O6_Binary_Number_System;

public class BinaryToDecimal {
    public static int BinToDec(int Binary){
        int ans = 0 , pow = 1;
        while (Binary>0){  // It will check number is greater than zero or not
            int reminder = Binary % 10 ;   // Take reminder one-by-one
            ans += reminder * pow;   // it will save values in backward by multiplying pow
            Binary /= 10;                // It will slice value one-by-one
            pow *= 2;             // power will increase by every value
        }
        return ans;
    }

    public static void main(String[] args) {
        int Binary = 110011;
        System.out.println(BinToDec(Binary));
        System.out.println(BinToDec(1100110));
    }
}
