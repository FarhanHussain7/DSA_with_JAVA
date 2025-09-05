package O8_Array;

import java.util.Vector;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Practice {
    //22) power of the value
    static double MyPow(double x , int n){
        if (n == 0 ) return 1.0;
        if (x == 0 ) return 0.0;
        if (x == 1 ) return 1.0;
        if (x == -1 && n%2 ==0) return 1.0;
        if (x == -1 && n%2 !=0) return -1.0;


        long binform = n;
        if (n<0){
            x = 1/x;
            binform = -binform;
        }
        double ans = 1;
          while (binform>0){
              if (binform%2 ==1){
                  ans *= x;
              }
              x *= x;
              binform /= 2;
          }
          return ans;
    }


    // 6) stock buy and sell
     static int Stock(int [] price){
        int maxProfit = 0, bestBuy = price[0];
        for (int i = 1; i< price.length; i++){
            if (price[i]> bestBuy){
                maxProfit = max(maxProfit, price[i]- bestBuy);
            }
            bestBuy = min(bestBuy, price[i]);
        }
        return maxProfit;
     }
    public static void main(String[] args) {

        // Question no- 22
       double Power =  MyPow(3,5);
        System.out.println(Power);

        // 6
        int [] price = {7, 1, 5, 3, 6, 4};
        System.out.println(Stock(price));

//Question 1- Give the time complexity of this array and also add 40 on 4th position?
        int[] Myarray = {1,3,4,5,7};

        //Ans- We cannot add any value to this array because size in not mention , so it will throw an exception arrayIndexOutOfBound(AIO)

        // Code to check length of array
       /* int postion = 7;
         if (postion>Myarray.length){
             System.out.println("Array is full ");
         }else {
             System.out.println("Array is empty, Add more");
         }
         // Complexity is O(1) order of constant
        */

        // Question 3-  Write an array with given 3 values in array lenth is 5  than put new values
        //          at the position of 1 and shift all element to back position?


        /*
        1) Wave Array - Given a sorted array arr[] of distinct
         2) Subarray with given sum-
         3) Moves all zeroes to end of array
         4) Find second largest elements
         5) Coin change
         6) Stock buy and sell
         7) Find duplicate elements from sorted array
         8) Remove duplicae elements form sorted array
         9) Rotate an array
         10) Merge without Extra space (hard)
         11) Trapping Rain water
         12) Sort an array of 0s, 1s and 2s.
         13) kth smallest element/kth largest element in an array
         14) kadane's Alagorithm
          15) Move all the negative elements to one side of the array
          16) Missing number in an array
          170 Duplicate zeroes
          18) Valid Mountain array(wave array version)
          19) Swapping elements in array
          20) Reverse an array
          21) Find Min and Max in an array
          22) Power(x^n)
          
* */
        // Initialize an array
        int[] arr = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array:");
        printArray(arr);

        // Reverse the array
        reverseArray(arr);

        // Print the reversed array
        System.out.println("\nReversed Array:");
        printArray(arr);
    }

    // Method to reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers
            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }








//        int [] array = {1, 2, 3, 4, 5, 6, 7};
//        int end = array.length-1;
//        int start = 0;
//        while (start<end){
//            int value = array[start];
//            array[start] = array[end];
//            array[end] = value;
//            start++;
//            end--;
//        }
//        for (int i = 0; i <array.length ; i++) {
//            System.out.print(array[i]+",");
//        }

    }

}
