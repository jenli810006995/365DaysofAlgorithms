There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Solution(Python):
Binary Search
```
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if not nums:
            return -1 # this means the target index is not in nums
            
        low, high = 0, len(nums) - 1
        
        while low <= high:
            # since it is binary search, we have to create a mid pointer
            mid = (low + high) //2
            if target == nums[mid]:
                return mid # this means, we found it
                
            # below we are going to search from the left, and from the right, becoz the mid point is not the target
            if nums[low] <= nums[mid]: 
                if nums[low] <= target <= nums[mid]: # means target is to the left of the mid
                    high = mid - 1
                else: # means low, mid, target
                    low = mid + 1
            else: # nums[low] > nums[mid], mid, low
                if nums[mid] <= target <= nums[high]: # mid, target, high
                    low = mid + 1 # search to the right
                else:
                    high = mid - 1
        return -1
                    
 # TC: O(logn)
 # SC: O(1)
```
```
Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
```
