package Interview_Program;

import O8_Array.Array;

/*
*     In this question we take a Array and target the value one-by-one and the do Product of value which are present in the
*               array but withOut the targeted value
*  Ex; -
*    Array = {1, 2, 3, 4} ;
*
*  Product  = { 2X3X4, 1X3X4, 1X2X4, 1X2X3};
*           = {24, 12, 8, 6}
*
* */
public class Q4_Product_of_Array_Except_Self {

    // BruteForce method
    public static void Product(int [] value){
        int n = value.length;
        int[] array = new int[value.length];

        for (int i = 0 ; i<value.length; i++){
            int product = 1;
            for (int j = 0; j < value.length; j++) {
                if (i != j){
                    product *= value[j];
                }
                array[i] = product;
            }
        }

        for (int k = 0 ; k< array.length; k++) {
            System.out.print(array[k] + " , ");
        }
    }

    public static void main(String[] args) {
        int [] value = {1, 2, 3, 4};
       //int result  = Product(value);
       // System.out.println(result);

        int[] array = new int[value.length];

        for (int i = 0 ; i<value.length; i++){
            int product = 1;
            for (int j = 0; j < value.length; j++) {
                if (i != j){
                    product *= value[j];
                }
                array[i] = product;
            }
        }

        for (int k = 0 ; k< array.length; k++){
            System.out.print( array[k] + " , ");
        }
    }
}
