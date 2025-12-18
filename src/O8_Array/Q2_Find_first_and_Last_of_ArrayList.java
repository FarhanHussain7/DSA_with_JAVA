package O8_Array;

import java.util.ArrayList;

public class Q2_Find_first_and_Last_of_ArrayList {
    public static void main(String[] args){

        ArrayList<String> listFruit = new ArrayList<>();
        listFruit.add("Banana");
        listFruit.add("Mango");
        listFruit.add("Grapes");
        listFruit.add("Guava");
        listFruit.add("Apple");

        if (!listFruit.isEmpty()){
            String FirstElement = listFruit.get(0);
            String lastElement = listFruit.get(listFruit.size()-1);

            System.out.println("First element of Array list "+ FirstElement);
            System.out.println("First element of Array list "+ lastElement);
        }else{
            System.out.println("Array List is Empty");
        }
    }
}
