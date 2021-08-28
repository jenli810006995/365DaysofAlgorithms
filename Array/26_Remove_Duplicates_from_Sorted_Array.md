Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Constraints:
```
0 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
```
nums is sorted in non-decreasing order.

Solution:
```
class Solution:
    removeDuplicates(self, nums: List[int]) -> int:
        count = 0 # initiate the length of the sorted array as 0
        # Loop for all the elements in the array
        for i in range(len(nums)):
            # if the current element is equal to the next, we skip
            if i < len(nums) - 2 and nums[i] == nums[i + 1]: # i < len(nums) - 2 to prevent we loop outside of the boudary of the array
                continue
            # otherwise, we will update the array in place
            nums[count] = nums[i]
            count += 1
        return count
# TC: O(n)
# SC: O(1)
```
```
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
```
