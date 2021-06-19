Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
```
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
```
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.

Constraints:
```
n == nums.length
1 <= n <= 5000
-5000 <= nums[i] <= 5000
```
All the integers of nums are unique.
nums is sorted and rotated between 1 and n times.

Solution(Python3):
```
class Solution:
    def def findMin(self, nums: List[int]) -> int:
        # define left and right bounds
        left, right = 0, len(nums) - 1
        
        # left and right both coverge to the minimun index
        while left < right: # do not use left <= right, that would loop forever
            mid = (left + right) //2
            
            # since we do not have a specific target here, we just use if/else
            if nums[mid] > nums[right]:
                left = mid + 1
            else:
                right = mid
        return nums[left]
                
# TC: O(logn)
# SC: O(1)

```
```
Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
```
