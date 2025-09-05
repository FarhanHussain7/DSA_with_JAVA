package Interview_Program;
/*
* Creating an Cotainer with Maximum capicity of the all value*/
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Header1_1Impl;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Q3_Container_With_Most_Water {

    // Brute force method with the complexity of O(n^2)
    public static int Container(int [] height){
        int maxWater = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j< height.length; j++){
                int width = j - i;
                int h1 = min(height[i],height[j]);
                int Capacity = width*h1;

                maxWater = max(maxWater, Capacity );
            }
        }
        return maxWater;
    }
    // Optimal Solution with the time complexity of O(n)
    public static int ContainWater(int [] height){
        int MaxWater = 0; //
        int LeftPole = 0, RightPole = height.length-1;
        while (LeftPole < RightPole){
            int Width = RightPole-LeftPole;
            int H1 = min(height[LeftPole],height[RightPole]);
            int CurrentCapicity = Width * H1;
            MaxWater = max(MaxWater, CurrentCapicity);

            if (height[LeftPole] < height[RightPole])
            {
                LeftPole++;
            }
            else {
                RightPole--;
            }
        }
        return MaxWater;
    }
    public static void main(String[] args) {
        int [] height = {1, 5, 6, 2, 6, 8, 3, 9, 3, 2, 7};
        System.out.println("With Brute force method " + Container(height));


        System.out.println("With the Optimal Solution "+ ContainWater(height));
    }
}
