/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let minBuyPrice = Infinity;
    let maxProfit = 0;
    
    for (let price of prices){
        if (price < minBuyPrice){
          minBuyPrice = price;
        } else if(
          price - minBuyPrice > maxProfit
        ){ 
        maxProfit = price - minBuyPrice;
        }
    }
  return maxProfit;
};

//Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
