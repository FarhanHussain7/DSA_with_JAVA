package O12_Searching;
/*
* Step 1- find the Mid of array
* step 2- check Mid is equal to target or not
* step 3- check */
public class BinarySearch {
    public static int BinaryI(int[] array, int target){
        int start = 0, mid = 0, end = array.length-1;
        while (start<=end) {
            // find Mid of array
            mid = (start + end) / 2;
            // target found at the mid Index
            if (array[mid] == target) return mid;
            // search in Right half
            else if (array[mid]<target) start = mid + 1;
            // Search in left half
            else end = mid - 1;
        }
        // When target not found in the array
        return -1;
    }
    // Recursive Approach
    public static int BinaryR(int[] array, int target, int start, int end){

        while (start<=end) {
            // find Mid of array
            int mid = (start + end) / 2;
            // target found at the mid Index
            if (array[mid] == target) return mid;
            // search in Right half
            else if (array[mid]<target)return BinaryR(array,target,mid+1,end);
            // Search in left half
            else return BinaryR(array,target,start,mid-1);
        }
        // When target not found in the array
        return -1;
    }
    //Question 01- Find the peak element in number of arrays
     public static int PeekElement(int[] num){
        int start = 0, end = num.length-1, mid = 0;
        while (start<=end){
            mid = start+ (end+start)/2;
            if (num[mid]>num[mid+1]) end = mid;
            else start = mid+1;
        }
        return start;
     }

    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};
        int target = 20;
      //  int result = BinaryI(array,target);
     //   int result = BinaryR(array,target,0, array.length-1);
//       // if(result!=-1){
//            System.out.println("Element found at the index of "+ result);
//        }else {
//            System.out.println("Element not found in the Array ");
//        }

        int [] num = {1,2,3,4,5};
        PeekElement(num);


    }
}
