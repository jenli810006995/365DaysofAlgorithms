You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

Solution(Python3):
```
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        total = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i - 1]: # sell it
                total += prices[i] - prices[i - 1]
        return total
```
Link: https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
