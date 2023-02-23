class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int len_prices =  prices.length;
        if(len_prices == 1 || len_prices == 0 || prices == null) {
            return 0;
        }

        int buy = 0;
        int sell = 1;
        int max_profit = 0;
        while (sell < len_prices) {
            if(prices[sell] > prices[buy]) {
                if(prices[sell] - prices[buy] > max_profit){
                    max_profit = prices[sell] - prices[buy];
                }
            }
            else {
                buy = sell;
            }
            sell++;
        }
        return max_profit;
    }
}
