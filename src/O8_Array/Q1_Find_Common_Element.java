package O8_Array;

import java.util.HashSet;
import java.util.Set;

public class Q1_Find_Common_Element {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> CommanElements = findCommonElement(array1, array2);

        System.out.println(CommanElements);

    }
        public static Set<Integer> findCommonElement(int[] array1,int[] array2){

        Set<Integer> setArray = new HashSet<>();
        Set<Integer> CommonSet = new HashSet<>();

            for (int nums: array1) {
                setArray.add(nums);
            }

            for (int nums: array2){
                if (setArray.contains(nums)){
                    CommonSet.add(nums);
                }
            }

            return CommonSet;
    }
}
