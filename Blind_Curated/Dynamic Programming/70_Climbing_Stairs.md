You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Constraints:
```
1 <= n <= 45
```
Solution(Python3):
```
class Solution:
    def climbStairs(self, n):
        a = b = 1
        for _ in range(n):
            a, b = b, a + b
        return a
# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/climbing-stairs/
```
