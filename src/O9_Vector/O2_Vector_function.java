package O9_Vector;

//

import java.util.Vector;

public class O2_Vector_function {
    public static void main(String[] args) {
        Vector<Integer> vec2 = new Vector<>();
        vec2.add(2);
        vec2.add(4);
        vec2.add(4);

        // 1 Size() function -
        System.out.println(vec2.size());

        //2 Push_back() function - add the new value at the end of list

        //3 add() function -

        //4 remove(index no) -

        //5

        System.out.println( vec2.elementAt(1));
        //6
        System.out.println(vec2.capacity());

        //7
        vec2.setElementAt(7,1);
        System.out.println(vec2);
    }
}
