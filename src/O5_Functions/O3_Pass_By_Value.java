package O5_Functions;

public class O3_Pass_By_Value {
    static int ChangeX(int x){
        x = 2*x;
        return x;
    }

    public static void main(String[] args) {
        int x = 5;
        // ChangeX function will store this X in his memory and change it according to properties
        System.out.println(ChangeX(x));

        // But Actual X value is declared in main method and main has own memory to store its actual value
        System.out.println("value of X  in main method is " + x);









    }
}
