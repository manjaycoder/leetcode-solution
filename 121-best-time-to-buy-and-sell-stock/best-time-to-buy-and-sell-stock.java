class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profits=0;
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
               buy=prices[i];
               
            }
            profits=Math.max(profits,prices[i]-buy); 
        }
        return profits;
    }
}