Given an array of integers nums which is sorted in ascending order, 
and an integer target, write a function to search target in nums. 
If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Constraints:
```
1 <= nums.length <= 104
-9999 <= nums[i], target <= 9999
All the integers in nums are unique.
nums is sorted in an ascending order.
```

Solution(Python3):
```
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        # Use binary search. pivot is the middle point. if nums[pivot] == target, return pivot
        # if target < nums[pivot], continue searching on the left, otherwise, continue searching on the right
        left, right = 0, len(nums) - 1
        #pivot = left + (right - left) // 2
        
        while left <= right:
            pivot = left + (right - left) // 2 # pivot has to put inside the function becoz it is composed of left and right
            if target == nums[pivot]:
                return pivot
            if target < nums[pivot]: # continue searching on the left
                right = pivot - 1
            else:
                left = pivot + 1
        return -1
        
# TC: O(longn), becoz of sorting
# SC: O(1)

```
```
Link: https://leetcode.com/problems/binary-search/

```
