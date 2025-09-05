package Interview_Program;
// When we solve any problem than may be you get the answer but the time of complexity is high
// so we use different approach to reduce time of complexity.

// There are many type of approach
// 1 - Brute force -
// 2 - Optimize solution - first sorted the array than find
// 3 - Moore's voting algorithm - if follow different way to find major frequency element
public class O1_Majority_Element {
    public static void PairSum(int [] array,int target){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i]+array[j] == target){
                    System.out.println(array[j]+ " and " + array[i] + " sum is equal to " + target);
                }
               // break;
            }
        }
    }

    public static void PrintMajorityElement(int [] arr){
        for (int val: arr){
            int frequecy = 0;
            for (int ele: arr){
                if (val==ele){
                    frequecy ++;
                }
            }
            if (frequecy > arr.length/2){
                System.out.println(val + " value has high frequency of " + frequecy);
                break;
            }
        }

    }
    public static int Moores(int []arr){
        int freq =0, ans = 0;
        for (int i = 0; i< arr.length; i++){
            if (freq==0){
                ans = arr[i];
            }
            if (ans == arr[i]){
                freq++;
            }
            else {
                freq--;
            }

        }
        System.out.print(" value has the Highest frequency is hole array ");
        return ans;
    }


    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6};
        int target = 8;

       PairSum(array,target);

        int [] a1 = {1,2,2,2,1};

        PrintMajorityElement(a1);

        System.out.println(Moores(a1));

    }
}
