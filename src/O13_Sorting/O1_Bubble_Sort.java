package O13_Sorting;

import java.util.ArrayList;
import java.util.List;

public class O1_Bubble_Sort {

    // It will be give complexity of (nlog(n))

    public static void Bubble(int [] arr ){
            boolean IsSwap = false;
        for (int i = 0; i < arr.length-1; i++) {
                 int swap = 0 ;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    swap = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = swap;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        int[] arr = {4, 1, 5, 2, 3, 9, 8, 6, 10 , 7};
        Bubble(arr);
    }
}
