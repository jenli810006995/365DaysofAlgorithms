Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.

Example 1:
```
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```
Example 2:
```
Input: nums = [1]
Output: 1
```
Example 3:
```
Input: nums = [5,4,-1,7,8]
Output: 23
``` 
Constraints:
```
1 <= nums.length <= 3 * 104
-105 <= nums[i] <= 105
``` 
Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

Solution(Brute Force):
```
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # initialize a current_array, and a max_subarray
        max_subarray = -math.inf # bc we are likely to have all negative elements in the list
        for i in range(len(nums)):
            current_subarray = 0
            for j in range(i, len(nums)):
                current_subarray += nums[j]
                max_subarray = max(current_subarray, max_subarray)
        return max_subarray
        
# TC: O(n^2), this would time out
# SC: O(n)
```

Solution(Dynamic Programming): When seeing seeking the max or the min, think about using DM, Kadane's Algorithm.
```
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        cur_subarray = max_subarray = nums[0]
        # the range starts from the index 1, bc we initialize the variables with nums[0]
        for num in numx[1:]:
            # if the cur element is negative, throw it away. Otherwise, add it in
            if num > 0:
                cur_subarray = max(cur_subarray + num, num)
                max_subarray = max(cur_subarray, max_subarray)
        return max_subarray
# TC: O(n), n is the length of nums. We iterate every element in the list nums exactly once
# SC: O(1)
```
```
Link: https://leetcode.com/problems/maximum-subarray/
```
