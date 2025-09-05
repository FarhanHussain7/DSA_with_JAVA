package O9_Vector;

import java.util.Vector;

public class O1_Vector {
    public static void main(String[] args) {
        Vector<Integer> vec;

        Vector<Integer> vec2 = new Vector<>();
        vec2.add(2);
        vec2.add(4);
        vec2.add(4);
        vec2.add(4);
        vec2.add(4);
        vec2.add(0,5);
        System.out.println(vec2);
    }
}
