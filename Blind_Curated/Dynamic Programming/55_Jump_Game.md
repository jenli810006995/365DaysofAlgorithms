Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Determine if you are able to reach the last index.

Solution(Python3):
Going Forward
```
class Solution:
    def canJump(self, nums: List[int]) -> bool:
        m = 0
        for i, n = enumerate(nums):
            if i > m:
                return False
            m = max(m, i + n)
        return True
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/jump-game/
```
