// import java.util.*;
public class BuyAndSellStocks {

    public static int buyAndSellStocks(int prices[]){
        int n=prices.length;

        int buyPrices=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(buyPrices < prices[i]){
                int profit= prices[i]-buyPrices;
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyPrices=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,2,3,6,9};
        System.out.println("The maximum profit is: "+  buyAndSellStocks(prices));

    }
    
}
