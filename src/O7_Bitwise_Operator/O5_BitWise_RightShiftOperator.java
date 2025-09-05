package O7_Bitwise_Operator;
/*
*   >> - it will shift bit to right side -> and remove them from actual bits , remaining will be the answer
* - step 1 - it will suggest the number of removing value after the forward icon
*                   10 >> 2 (remove 2 bit from 10)
*       10 in binary is  - 1010
*    step 2 -   remove 2 values -   __10      - [10] will delete from the actual value
*  step 3 - read the remaining part __10 in binary is equal to 4
*
* */
public class O5_BitWise_RightShiftOperator {
    public static void main(String[] args) {
        System.out.println(10>>2);
    }
}
