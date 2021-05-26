You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.

Example 1:
```
Input: cost = [10,15,20]
Output: 15
Explanation: Cheapest is: start on cost[1], pay that cost, and go to the top.
```
Example 2:
```
Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: Cheapest is: start on cost[0], and only step on 1s, skipping cost[3].
``` 
Constraints:
```
2 <= cost.length <= 1000
0 <= cost[i] <= 999
```
Solution(Python3):
```
class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        # Bottom-up Dynamic Programming
        # The array's length should be 1 longer than the length of cost
        # This is becoz we can treat the "top floor" as a step tp reach
        minimum_cost = [0] * (len(cost) + 1)
        
        # Start iteration from step 2, since the minimum cost
        # of reaching step 0 and step 1 is 0
        for i in range(2, len(cost) + 1):
            take_one_step = minimum_cost[i - 1] + cost[i - 1]
            take_two_steps = minimum_cost[i - 2] + cost[i - 2]
            minimum_cost[i] = min(take_one_step, take_two_steps)
            
        # The final element in minimum_cost refers to the top floor
        return minimum_cost[-1]
        
# TC: O(n), n is the length of the cost, we iterate n - 1 times, and each iteration we apply an equation requires O(1) time
# SC: O(n)

```
```
Link: https://leetcode.com/problems/min-cost-climbing-stairs/
```
