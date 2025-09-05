package O5_Functions;

public class O1_BasicFunction {

    //1- Normal function only print some kind of string in console.
    // Public - this keyword state that this function can access by another package.
    // static - state that no need of creating object of function for calling.
    // void - state that there is no value is return only string print
    public static void PrintString(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world");
        }
    }


    // Function in Memory
    // Heap memory is used in java to store our function or main method.
    public static void main(String[] args) {
        // 1- function
        PrintString();

    }
}
