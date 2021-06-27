Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Your goal is to reach the last index in the minimum number of jumps.
You can assume that you can always reach the last index.

Constraints:
```
1 <= nums.length <= 104
0 <= nums[i] <= 1000
```
Solution(Python3):
```
class Solution:
    def jump(self, nums: List[int]) -> int:
        if len(nums) < 1:
            return 0
        l, r = 0, nums[0]
        times = 1
        while r < len(nums) - 1:
            times += 1
            nxt = max(i + nums[i] for i in (l, r + 1))
            l, r = r, nxt
        return times
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/jump-game-ii/
```
