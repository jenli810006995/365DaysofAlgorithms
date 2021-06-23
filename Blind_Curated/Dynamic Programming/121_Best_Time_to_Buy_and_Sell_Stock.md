You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Constraints:
```
1 <= prices.length <= 105
0 <= prices[i] <= 104
```

Solution(Python3):
```
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit, min_price = 0, float('inf')
        for price in prices:
            # define min_price
            min_price = min(min_price, price)
            profit = price - min_price
            max_profit = max(max_profit, profit)
        return max_profit
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
```
