package O12_Searching;
/*
//Searching - Find the target in Data structure
// 1- linear search -is simple but less efficient, especially for large database.
        - It works with both sorted and unsorted data.
        - It is sequential searching means one-by-one checking.
        - complexity must be o(1) or O(n)
// 2- Binary search - used 2 pointer and follow
        - It is efficient but required sorted data. It can significantly reduce search time for large datasets.
        - Two-Pointer-Approach - is a technique used to efficiently solve problem that involve arrays,
           and linked list , It often result in linear time complexity and constant space complexity.
        - the two-pointer approach is a technique to use two pointer to traverse the data structure simultaneously
           from different position and directions.

 *  The choice of the search appropriate search approach depends on the nature of the problem and the data.for
   Sorted data,binary search is the most efficient for Unsorted Data, linear searched is the simplest, while the
    two-pointer approach can be very useful for certain array and linked list problems.
// 3-
 */
public class LinearSearching {
    //Iterative approach complexity is o(n)
    public static int linearSearchI(int[] array, int target){
        //If the target found at the current index, return index number
        for (int i=0; i< array.length;i++){
            if (array[i]==target) return i;
        }
        // If the target doesn't found then return -1
        return -1;
    }

    // Recursive Approach complexity is O(n)
    public static int linearSearchR(int[] array, int target,int index){
        //Base case- If the current index is out of bound return -1 number
        if (index>= array.length) return -1;
        //Base case- If the target found at the current index, return index number
        if (array[index]==target) return index;
        // Recursive case - Search the next element at the array
        return linearSearchR(array,target,index+1);
    }
    public static void main(String[] args) {
        int[] array = {12,24,53,53,11,45};
        int target = 24;
        //int result = linearSearchI(array,target);
        int result = linearSearchR(array,target,0);
        if(result!=-1){
            System.out.println("Element found at the index of "+ result);
        }else {
            System.out.println("Element not found in the Array ");
        }
    }
}


