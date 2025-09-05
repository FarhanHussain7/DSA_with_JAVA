package O8_Array;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Let's ");
        a1.add("Do ");
        a1.add("It");
        System.out.println(a1);

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(34);
        arrayList.add(56);
        arrayList.add(73);
        System.out.println(arrayList);


        // Operation in the arraylist
        //1- Insert Element on o position
        // It will add on 0 position and other elements will shift itself
        a1.add(0,"Yes ");
        System.out.println(a1);

        // 2 - remove methods
        a1.remove(2);
        System.out.println(a1);


    }
}
