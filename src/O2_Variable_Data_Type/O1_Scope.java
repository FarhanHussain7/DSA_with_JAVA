package O2_Variable_Data_Type;
/*
* scope - it will define the vriable accessabilty from different places
* there are two type - 1 local variable  , 2 - global variable
* 1 - local variable - which is declare inside the loop, condition , function
* 2 - Global variable - it will
* 3 - Instance Variable - An instance variable is a type of variable that belongs to an object in object-oriented programming.
 * 4 - static variable - A static variable in Java is a variable that belongs to the class itself, not to any specific object. It is shared by all instances of that class
* */
public class O1_Scope {
    static int c = 12; // static variable
        int instance = 3 ; // Instance variable
    public static void main(String[] args) {
        int v = 10; // global variable
        if (3>0){
            int x = 10 ; // local variable

        }
        O1_Scope Iv = new O1_Scope();
        System.out.println(Iv.instance);
        Iv.instance = 300;
        System.out.println(Iv.instance);

        O1_Scope Iv1 = new O1_Scope();
        Iv1.instance = 40;
        System.out.println(Iv1.instance);


        System.out.println(c);
        System.out.println(c +=14);
        System.out.println(c);

       // System.out.println(x);

        System.out.println(v);
    }
}
