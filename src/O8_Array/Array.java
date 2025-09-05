package O8_Array;

/*
* What is Array
* It is the collection of items of the same variable type.
* Stored in contiguous memory location.
* Simple and popular data structure
* Used to implement other data structure.
* Items indexed starting from 0
* Linear data structure
* Syntax of array:-
* <data type> <variable name> [] = {<detail>, <detail>, .....<detail>};
*  int arr[] = {23,32,424};
*
* <data type> [] <variable name> = new <constructor>(parameter size)
* int [] MyArray = new MyArray(20);
*
* Why array data structure is needed?
* The idea of an array is to represent many instance in one variable.
*
* Type of array
* 1 - Fixed sized array -- stack memory (C, C++), heap memory (java)
* 2 -  Dynamic sized array -- Arraylist (java) , vector (C++), list (python)
*
* Syntax :-
*
* ArrayList< Wrapper classes > MyArraylist = new ArrayList<>();
*
*
* Advantages of Arrays:
* - Random access to elements for faster element retrieval by position.
* - Better cache locality leading to improved performance.
* - Used to implement various data structure like linked list, stack, queues, trees, graph, heap etc.
* - Store multiple data of similar types with the same name.
* - Represent multiple data items of the same type using a single name.
*
* Application of Array:
* - Arrays areUsed to implement various data structure like linked list, stack, queues, trees, graph etc.
* - Sorting algorithm like bubble sort, insertion sort, quick sort, and merge sort.
* - heaps, hash tables, Arraylist, String and Matrices.
*
* Type of operation
* - Accessing :- Retrieving the value of an element at a specific index.
* - Updating
*
*
*
* CRUD Operation
* 1 Insert
* 2 Searching
* 3 Updating
* 4 Delete
* */

import java.util.Scanner;

public class Array {
    // 01 - Simple array
    static void array( ){
        int [] IntArray = {1,2,3,4,5,5,6,};
        // Normal For loop
        for (int i = 0 ; i<IntArray.length; i++){
            System.out.print(IntArray[i]+ ",");
        }
        // For Each Loop
        for (int e: IntArray){
            System.out.println(e);
        }
    }
    // 02- Array values Provide by User
    static int[] ArrayInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Size of Array");
        System.out.println("=====================================");
        int n = scanner.nextInt();
        int [] IntArray = new int[n];
        for (int i = 0; i< n; i++){
            System.out.println("Enter "+ i + " Element of Array");
            IntArray[i]=scanner.nextInt();
        }
        scanner.close();
        return IntArray;
    }
    //03- Print Input array in console
    static void OutPutArray(int[] IntArray){
        for (int i = 0; i < IntArray.length; i++) {
            System.out.print(IntArray[i]+", ");
        }
    }

    // 04- This is a method to print 2D Array
    static void Array2D(){
        int [][] My2DArray = {{12,32,44}, {23,13,435},{10,40,50}};
        // Print the specific position array value
        System.out.println(My2DArray[2][0]);
        // Print all the array values
        for (int i =0; i< My2DArray.length; i++){
            System.out.print("{");
            for (int j = 0; j < My2DArray.length ; j++) {
                System.out.print(My2DArray[i][j] + ", ");
            }
            System.out.print("},");
        }
    }

    public static void ReverseArray(int[] arr){
        int end = arr.length-1;
        int start = 0;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = arr[start];
            start++;
            end--;
        }
        for (int i = 0 ; i<arr.length; i++){
            System.out.println(arr[0]+",");
        }
    }

    public static void main(String[] args) {
        System.out.println("Yes");
      // array();
        System.out.println("this is for 2D array");
       // Array2D();

        OutPutArray(ArrayInput());
    int[] Array3 = new int[5];
    Array3[0] = 23;
    Array3[1] = 44;


//    int [] mark; // declaration
//    mark = new int[5];  //memory allocation
//    marks[0]= 100; // array Initialization
//    marks[1]= 60;
//    marks[2]= 50;
//    marks[3]= 80;
//    marks[4]= 90;

    int [] arr = {1, 2, 3, 4, 5, 6, 7};
     //   System.out.println(SwapArray(arr));


}
}


