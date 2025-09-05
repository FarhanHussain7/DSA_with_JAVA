package Interview_Program;

public class Q6_Peek_Index_Mountain_Array {
    public static int PeekElement(int[] num) {
        int start = 0, end = num.length-1;
        while (start <= end) {
           int mid = start + (end - start) / 2;
            if (num[mid-1] < num[mid] && num[mid] > num[mid + 1]) {
                return mid;
            } else if (num[mid-1]< num[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
        int [] arr = {0, 3, 8, 9 , 5, 2};
            System.out.println(PeekElement(arr));
    }
}
