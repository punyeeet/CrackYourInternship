class Solution {
    public int maxProfit(int[] prices) {
        int ans = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        if(prices.length==1)return 0;
        for(int i = 0; i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            int sell = prices[i]-min;
            if(ans<sell)
                ans = sell;


        }

        return ans > 0 ? ans : 0;
    }
}
