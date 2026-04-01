package Arrays;

class bestTimeToBuyAndSellStock{
    public static void main(String[] args) {
        bestTimeToBuyAndSellStock sc = new bestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = sc.maxProfit(prices);
        System.out.println(result);
    }
    public int maxProfit(int[] prices) {

       // Time	O(n²) ❌ (nested loops)
       // Space	O(1) ✅
        int profit =0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j< prices.length;j++){
                if((prices[j]-prices[i])>profit){
                    profit = prices[j] - prices[i];
                }

            }

        }

//        TC = O(n)
//        SC = 0(1)
//        int minPrice = Integer.MAX_VALUE;
//        int maxProfit=0;
//
//        for(int i = 0 ; i < prices.length ; i++){
//            if (prices[i] < minPrice) {  //for buying date
//                minPrice= prices[i];
//            }else if(prices[i] - minPrice > maxProfit){  for selling
//                maxProfit = prices[i] - minPrice;
//            }
//        }
//        return maxProfit;


        //TC = O(n)
        //SC = 0(1)
        int min = prices[0];
        int maxProfit= 0;
        for(int i =1;i<prices.length;i++){

            int profit=prices[i]-min;
            maxProfit = Math.max(maxProfit,profit);
            min=Math.min(min,prices[i]);
        }
        return maxProfit;

    }
}






