package Arrays;

public class buyAndSellStock {
    public int maxProfit(int[] prices) {
        int price=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            // profit=Math.max(profit,prices[i]-price);
            // price=Math.min(price,prices[i]);
            if(price<prices[i]){
                profit=Math.max(profit,prices[i]-price);
            }else price=prices[i];

            //suffix array
            
            //maxArray[n-1]=arr[n-1];
            // for(i=n-2;i>0;i--){
            //     maxArray[i]=Math.max(arr[i],maxArray[i+1]);
            // } 
            // int diff=maxArray[0]-arr[0];;
            // for(i=1;i<n;i++){
            //     diff=Math.max(diff,maxArray[i]-arr[i]);   
            // }
        }
        return profit;
    }
}
