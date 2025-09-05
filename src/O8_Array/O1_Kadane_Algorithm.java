package O8_Array;

public class O1_Kadane_Algorithm {
    public static void main(String[] args) {
        //Program to create all Subarray of the array
       /* int [] arr ={1, 2, 3, 4, 5};
        int n = 5;

        for (int start = 0; start < n; start++) {

            for(int end = start; end < n; end++){
                for (int i =start; i<=end; i++){
                    System.out.print(arr[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        */
// Brute force method finding the Maximum sum of every subArray
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        int maxsum = 0;
        for (int start = 0; start < n; start++) {

            for (int end = start; end < n; end++) {
                int countSum = 0;
                for (int i = start; i <= end; i++) {
                    countSum = countSum + arr[i];
                    if (countSum>maxsum){
                        maxsum = countSum;
                    }
                }
            }
        }
        System.out.println(maxsum);

        // Now find the same sum of sub array but now the kadane's algorithm (best approach because it will decrease the complexity)


    }
}
