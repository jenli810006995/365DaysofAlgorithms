Given n non-negative integers a1, a2, ..., an , 
where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, 
together with the x-axis forms a container, 
such that the container contains the most water.

Notice that you may not slant the container.

Constraints:
```
n == height.length
2 <= n <= 105
0 <= height[i] <= 104
```
Solution(Python3):
```
class Solution:
    def maxArea(self, height: List[int]) -> int:
        i, j = 0, len(height)- 1
        water = 0
        while i < j:
            water = max(water, (j - i)*min(height[i], height[j]))
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return water
# TC: O(n), single pass
# SC: O(1)
```
```
Link: https://leetcode.com/problems/container-with-most-water/
```
