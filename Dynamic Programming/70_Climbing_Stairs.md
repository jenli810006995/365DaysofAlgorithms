You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
```
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
```
Example 2:
```
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
``` 
Constraints:
```
1 <= n <= 45
```
Solution(Python3):
```
class Solution:
  def climbStairs(self, n: int) -> int:
      a = b = 1 # initialize to 1 as 1 step is the min
      for _ in range(n):
          a, b = b, a + b
      return a 
# TC: O(n)
# SC: O(n)
```

Solution(JC):
```
/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    a = b = 1
    while (n--){
        a = (b += a) - a
    return a
};

```
```
Link: https://leetcode.com/problems/climbing-stairs/
Credit: https://leetcode.com/problems/climbing-stairs/discuss/25296/3-4-short-lines-in-every-language
```
