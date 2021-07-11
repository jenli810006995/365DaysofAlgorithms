You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

Constraints:
```
1 <= prices.length <= 3 * 104
0 <= prices[i] <= 104
```
Solution(Python3):
```
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # it is impossible to sell stock on the first day, set -infinity as the initial value for cur_hold
        cur_hold, cur_not_hold = -float('inf'), 0
        for stock_price in prices:
            prev_hold, prev_not_hold = cur_hold, cur_not_hold
            
        # either keep hold, or buy in stock today at stock_price
            cur_hold = max(prev_hold, prev_not_hold - stock_price)
            
        # either keep it not hold, or sell out stock today at stock_price
            cur_not_hold = max(prev_not_hold, prev_hold + stock_price)
            
        return cur_not_hold if prices else 0
        
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
```
