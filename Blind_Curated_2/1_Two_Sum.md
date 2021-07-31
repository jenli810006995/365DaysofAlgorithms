Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Constraints:
```
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
```
Only one valid answer exists.
Follow-up: Can you come up with an algorithm that is less than O(n^2) time complexity?

Solution:
```
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Use hash table
        d = {}
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
