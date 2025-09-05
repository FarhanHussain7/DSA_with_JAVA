package O7_Bitwise_Operator;
// << -   it will shift bits to left side and create empty place for other bits
/*
* ex; - 4 << 1
* (given value) << (Number of replace value)
*    100   << 1
*    ___
* all the bit move left and empty last place
*    100_   << 1 , now add a zero at that empty place
* 1000  means now value is equal to 8
*
* ex; - 10 (1010) << 2
* 1010__ << 2
* add zero at last
* 101000
*    */

public class O4_Bitwise_LeftShiftOperator {

    public static void main(String[] args) {
        System.out.println(10<<2);
    }
}
