package Interview_Program;

public class Q5_Search_In_Rotated_Sorted_Array {
        public static int Rotated_Array(int[] num , int target){
            int start = 0, end = num.length-1;
            while (start<=end){
                int mid = start + (end-start)/2;
                if (num[mid]==target){
                    return mid;
                }
                if (num[start]<=num[mid]){                      //left half
                    if (num[start] <= target && target<=num[mid]){
                        end = mid-1;
                    }else {
                        start = mid+1;
                    }
                }else {
                    if (num[start]<= target && target <= num[end]){     // right half
                        start = mid+1;
                    }else {
                        end = mid-1;
                    }
                }
            }
            return -1;
        }


    public static void main(String[] args) {
         int [] array = {3, 4, 5, 6, 7, 0, 1, 2};
        System.out.println(Rotated_Array(array, 1));
    }
}
