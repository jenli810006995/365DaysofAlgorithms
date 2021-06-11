Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Solution(Python):
```
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {} # create an empty set
        for i, num in enumerate(nums):
            n = target - num
            if n not in d:
                d[num] = i
            else:
                return [d[n], i]
# TC: O(n)
# SC: O(n)
```
```
Link: https://leetcode.com/problems/two-sum/
```
