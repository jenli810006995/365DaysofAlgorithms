You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete at most two transactions.

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

Constraints:
```
1 <= prices.length <= 105
0 <= prices[i] <= 105
```
Solution(Python3):
```
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
            
        # forward traversal, profits record the max profit by the ith day
        # this is the first transaction
        
        profits = []
        max_profit = 0
        current_min = prices[0]
        
        for price in prices:
            current_min = min(current_min, price)
            max_profit = max(max_profit, price - current_min)
            profits.append(max_profit)
            
        # backward traversal, max_profits record the max profit
        # after the ith day. This is the second transaction
        
        total_max = 0
        max_profit = 0
        current_max = prices[-1]
        for i in range(len(prices) - 1, -1, -1):
            current_max = max(current_max, prices[i])
            max_profit = max(max_profit, current_max - prices[i])
            total_max = max(total_max, max_profit = profits[i])
            
        return total_max
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
```
