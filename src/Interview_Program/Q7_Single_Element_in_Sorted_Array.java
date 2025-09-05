package Interview_Program;

public class Q7_Single_Element_in_Sorted_Array {

    public static int SingleElement(int [] array){
        int start = 0, end = array.length-1, n = array.length;
        if (n==array[0]) return array[0];

        while (start<=end){
            int mid = start + (end - start)/2;
            if (mid == 0 && array[0] != array[1]) return array[mid];
            if (mid == n-1 && array[n-1] != array[n-2]) return array[mid];

            if (array[mid-1] != array[mid] && array[mid+1] != array[mid+1]) return array[mid];

            if (mid % 2== 0 ){
                if (array[mid-1] == array[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {// odd case
                if (array[mid-1] == array[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

            int [] array = { 3, 3, 7, 7, 10, 11, 11};
        System.out.println(SingleElement(array));
    }
}
