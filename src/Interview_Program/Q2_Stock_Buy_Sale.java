package Interview_Program;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Q2_Stock_Buy_Sale {
    static int Stock(int [] price){
        int maxProfit = 0, bestBuy = price[0];
        for (int i = 1; i< price.length; i++){
            if (price[i]> bestBuy){
                maxProfit = max(maxProfit, price[i]- bestBuy);
            }
            bestBuy = min(bestBuy, price[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] price = {7, 1, 5, 3, 6, 4};
        System.out.println(Stock(price));

    }
}
