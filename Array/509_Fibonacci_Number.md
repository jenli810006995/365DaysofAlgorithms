The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
```
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
```
Given n, calculate F(n).

Solution(Python3):
```
class Solution:
    def fib(self, n: int) -> int:
        # Bottom-up Approach with memoization
        if n <= 1:
            return n
        return self.memoization(n) # recursive
        
    def memoization(self, n: int) -> {}:
        cache = {0:0, 1:1}
        
        # Since range is exclusive and we want to include n, we need to put n + 1
        for i in range(2, n + 1):
            cache[i] = cache[i - 1] + cache[i - 2]
            
        return cache[n]
        
# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/fibonacci-number/

```
