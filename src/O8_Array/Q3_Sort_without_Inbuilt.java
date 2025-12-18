package O8_Array;

public class Q3_Sort_without_Inbuilt {
    public static void main(String[] args) {
        int[] array = {5,2,9,1,6};

        SelectionSort(array);
    }

    public static void SelectionSort(int[] array){

        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            int MinIndex = i;
            for (int j = i+1 ; j < n; j++) {
                if (array[j]<array[MinIndex]){
                    MinIndex=j;
                }
            }
            int temp=array[i];
            array[i]=array[MinIndex];
            array[MinIndex] = temp;
        }

    }
}
