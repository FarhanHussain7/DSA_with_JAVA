package Interview_Program;

public class Q8_Book_Allocation {

    public static boolean IsValid(int[] arr, int n , int m , int MaxallowedPages){
        int Students = 1, pages = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > MaxallowedPages){
                return false;
            }

            if (pages + arr[i] <= MaxallowedPages){
                pages += arr[i];
            }else {
                Students++;
                pages = arr[i];
            }
        }
        return Students > n ? false : true;
    }

    public static int AllocateBooks(int[] arr, int n , int m ){
        if (m > n){
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int ans = -1;
        int st = 0 , end = sum;  // Range of possible ans
        while (st <= end){
            int mid = st + (end-st)/2;

            if (IsValid(arr, n, m, mid)){
                ans = mid;
                end = mid-1;
            }else {
                st = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr= {2, 1, 3, 4};
        int n = 4, m = 5;
        System.out.println(AllocateBooks(arr,n,m));
    }
}
